package com.runfit.runnerz.run;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    //  // 2 mapping this method home() to an endpoint
    // @GetMapping("/hello")
    //String home(){                     //1 create the method
    //   return "Hello , Runnerz!";
    //  }

    private final RunRepository runRepository;

    @Autowired
    public RunController(RunRepository runRepository){
        this.runRepository=runRepository;
    }
    ////3 write a method that will return a list of runs
    @GetMapping("") //@GetMapping("/api/runs")before adding annotation @RequestMapping("/api/runs")
    List<Run> findAll(){
        return runRepository.findAll();
    }

//    @GetMapping("/{id}")
//    Optional<Run> findById(@PathVariable Integer id){   // if any id is searched which is not available ,null will be returned in this case
//       return runRepository.findById(id);
//    }

    @GetMapping("/{id}")
    Run findById(@PathVariable Integer id){
        Optional<Run> run = runRepository.findById(id);
        if(run.isEmpty()){
            throw new RunNotFoundException();
        }
        return run.get();
    }

    //post
   @ResponseStatus(HttpStatus.CREATED)//this notifies the sender that something is created without this , you get 405 not allowed
    @PostMapping("")//  the only methods which are allowed by default are et and options.so for post , we have to use the annotation
    void create(@Valid @RequestBody  Run run){  // this Run will a part of request body so adding the annotation there
        runRepository.create(run);
    }

    //put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update (@Valid @RequestBody Run run, @PathVariable Integer id){
        runRepository.update(run,id);

    }

    //delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id){
        runRepository.delete(id);
    }

}
