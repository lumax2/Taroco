package cn.taroco.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * taroco 服务治理service
 *
 * @author liuht
 * @date 2017/11/18 20:24
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulServer
public class CloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudAdminApplication.class, args);
    }
}
