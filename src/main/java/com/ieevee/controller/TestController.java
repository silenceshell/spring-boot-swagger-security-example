package com.ieevee.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * logo controller
 */
@RestController
@Api(tags = "API - TEST", description = "TEST服务器")
public class TestController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/api/v1/test", method = RequestMethod.GET)
    public String get() {
        return "hello test";
    }

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

}
