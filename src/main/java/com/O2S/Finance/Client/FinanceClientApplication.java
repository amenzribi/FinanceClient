package com.O2S.Finance.Client;

import com.O2S.Finance.Client.role.Role;
import com.O2S.Finance.Client.role.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableAsync
@SpringBootApplication
public class FinanceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceClientApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(RoleRepository repository) {
		return args -> {
			if (repository.findByName("USER").isEmpty()) {
				repository.save(Role.builder().name("USER").build());
			}
		};
	}
}
