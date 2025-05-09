package com.runfit.runnerz.run;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class RunNotFoundException extends RuntimeException{
    public RunNotFoundException() {
        super("Run Not Found");
    }
}
