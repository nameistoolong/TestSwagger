package com.test.rooming;

import com.test.rooming.utils.SpringContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RoomingApplication {

    private static Logger log = LoggerFactory.getLogger(RoomingApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RoomingApplication.class, args);
        printVisitUrl();
    }

    private static void printVisitUrl() {
        ServerProperties serverProperties = SpringContextHolder.getBean(ServerProperties.class);
        log.info("==================> run at http://localhost:" + serverProperties.getPort() + "/swagger-ui.html <==================");
    }
}
