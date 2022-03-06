package org.cloudfoundry.samples.music.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/errors")
public class ErrorController {
    private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);

    @RequestMapping(value = "/kill")
    public void kill() {
        logger.info("Forcing application exit");
        System.exit(1);
    }

    @RequestMapping(value = "/throw")
    public String throwException() {
        logger.info("Forcing an exception to be thrown");
        Exception npe = new NullPointerException("Forcing an exception to be thrown");
        logger.error("Forcing an exception to be thrown and sent to logging framework",npe);
        return "exception thrown";
    }
}