package com.yan.bai_tap_nop.controller;

import org.slf4j.*;
import org.springframework.web.bind.annotation.*;

import static org.slf4j.LoggerFactory.*;

@RestController
public class HelloController {
    private Logger logger = getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello() {
        logger.trace("A Trace message");
        logger.debug("A Debug message");
        logger.info("A Info message");
        logger.warn("A Warning message");
        logger.error("A Error message");
        return "Hello World";
    }
}
