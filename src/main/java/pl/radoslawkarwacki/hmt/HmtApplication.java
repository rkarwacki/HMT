package pl.radoslawkarwacki.hmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"pl.radoslawkarwacki.hmt.controller", "pl.radoslawkarwacki.hmt.repository", "pl.radoslawkarwacki.hmt.service", "pl.radoslawkarwacki.hmt.facade"})
public class HmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmtApplication.class, args);
	}

}
