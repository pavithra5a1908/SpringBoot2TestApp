package in.nareshit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
     System.out.println("From runner");
     System.out.println("From runner22222");

	}

}
