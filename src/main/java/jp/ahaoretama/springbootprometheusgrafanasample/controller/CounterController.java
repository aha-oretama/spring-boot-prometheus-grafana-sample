package jp.ahaoretama.springbootprometheusgrafanasample.controller;

import io.prometheus.client.Counter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sekineyasufumi on 2018/02/26.
 */
@RestController
public class CounterController {
    private static int num = 0;
    private static final Counter requests = Counter.build().name("count_requests_total").help("Total count requests.").register();

    @GetMapping("count")
    public int count() {
        requests.inc();
        return ++num;
    }
}
