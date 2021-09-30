package com.openbeats.openbeatsdaw;

import com.openbeats.openbeatsdaw.Repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class OpenbeatsDawApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenbeatsDawApplication.class, args);
    }

}
