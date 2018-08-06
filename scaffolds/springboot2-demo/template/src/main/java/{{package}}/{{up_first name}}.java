package {{package}};

import {{package}}.biz.test.TestConfig;
import {{package}}.context.ContextConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackageClasses = {
        ContextConfig.class,
        TestConfig.class,
    }
)
@Slf4j
public class {{up_first name}} {

  public static void main(String[] args) {
    log.info("starting...");
    SpringApplication.run({{up_first name}}.class, args);
    log.info("end...");
  }
}