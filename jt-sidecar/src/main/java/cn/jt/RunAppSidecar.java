package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar		//启动异构系统支持
public class RunAppSidecar {

	public static void main(String[] args) {
		SpringApplication.run(RunAppSidecar.class, args);
	}

}
