package com.yan.bai_tap_nop.controller;

import org.slf4j.*;
import org.springframework.web.bind.annotation.*;

import static org.slf4j.LoggerFactory.*;

@RestController
public class HelloController {
    private Logger mLogger = getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello() {
        mLogger.trace("A Trace message");
        mLogger.debug("A Debug message");
        mLogger.info("A Info message");
        mLogger.warn("A Warning message");
        mLogger.error("A Error message");
        return "Hello World";
    }
}
