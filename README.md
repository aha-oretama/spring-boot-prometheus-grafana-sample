# spring-boot-prometheus-grafana-sample

This is a sample for monitoring spring boot web application by using [Prometheus](https://prometheus.io/) and [Grafana](https://grafana.com/).  
This is based spring boot 1.5.  
If you use spring boot 2.0 or more, you should see [spring-boot-2.0-prometheus-metrics](https://github.com/aha-oretama/spring-boot-2.0-prometheus-metrics) sample.   

## How to run

You must intall [docker](https://www.docker.com/), and use docker-compose command.

Run application as follows.

```bash
$ git clone https://github.com/aha-oretama/spring-boot-prometheus-grafana-sample.git
$ cd spring-boot-prometheus-grafana-sample
$ docker-compose up -d
``` 

Three applications are going to start.
(Spring boot web application takes a little time to start up.)

| Application | URL |
|-------------|------|
|spring boot web application | http://localhost:8080 |
|Prometheus | http://localhost:9090 |
|Grafana | http://localhost:3000 |

Prometheus monitors spring boot application.
Grafana visualizes prometheus data source.

# Set up Grafana's data source

You can login to Grafana by `admin/admin`.
You set up prometheus data source as follows.

|item| value |
|---|-----|
|Type|Prometheus|
|URL|http://localhost:9090|
|Access|direct|
|Scrap interval|5s|

![スクリーンショット 2018-02-26 12.21.27.png](https://qiita-image-store.s3.amazonaws.com/0/110216/3e577ff2-3d72-77e2-8667-ac25810794b9.png)

# Set up graph

I don't explain here.
Refer to [Prometheus documenatation](https://prometheus.io/docs/introduction/overview/) and [Grafana documentation](http://docs.grafana.org/). 


# Spring boot web application's API

|item| value |
|---|-----|
|`/prometheus`| Display metrics for prometheus. |
|`/hello`| Return `hello`. The durations of process are collected as metrics named `hello_controller_say_hello_duration_seconds_count`,`hello_controller_say_hello_duration_seconds_sum`. |
|`/count`| Return count of requests. The count of request is collected as metrics named `count_requests_total`.|
