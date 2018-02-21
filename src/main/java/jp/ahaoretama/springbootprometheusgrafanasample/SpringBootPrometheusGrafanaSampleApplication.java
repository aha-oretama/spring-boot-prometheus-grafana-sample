package jp.ahaoretama.springbootprometheusgrafanasample;

import io.prometheus.client.hotspot.DefaultExports;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import io.prometheus.client.spring.web.EnablePrometheusTiming;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
@EnablePrometheusTiming
public class SpringBootPrometheusGrafanaSampleApplication {

	public static void main(String[] args) {
		DefaultExports.initialize();
		SpringApplication.run(SpringBootPrometheusGrafanaSampleApplication.class, args);
	}
}
