package {{package}}.biz.test.view;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("{{name}}/")
@Slf4j
public class TestApi {

  @GetMapping("ping/")
  public String ping(@RequestParam String input) {
    return input;
  }

  @PostMapping("pong/")
  public String pong(@RequestParam String input) {
    return input;
  }
}