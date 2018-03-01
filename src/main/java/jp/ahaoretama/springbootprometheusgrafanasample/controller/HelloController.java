package jp.ahaoretama.springbootprometheusgrafanasample.controller;

import org.springframework.metrics.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sekineyasufumi on 2018/02/21.
 */
@RestController
@Timed
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
