package jp.ahaoretama.springbootprometheusgrafanasample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.metrics.export.prometheus.EnablePrometheusMetrics;

@SpringBootApplication
@EnablePrometheusMetrics
public class SpringBootPrometheusGrafanaSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrometheusGrafanaSampleApplication.class, args);
	}
}
