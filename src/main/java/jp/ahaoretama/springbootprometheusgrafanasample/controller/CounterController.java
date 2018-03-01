package jp.ahaoretama.springbootprometheusgrafanasample.controller;

import org.springframework.metrics.instrument.Counter;
import org.springframework.metrics.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sekineyasufumi on 2018/02/26.
 */
@RestController
public class CounterController {
    private static int num = 0;
    private final Counter counter;

    public CounterController(MeterRegistry registry) {
        counter = registry.counter("count_requests_total");
    }

    @GetMapping("count")
    public int count() {
        counter.increment();
        return ++num;
    }
}
