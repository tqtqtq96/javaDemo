package jsu.ljt.javademo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class MainController {
  @GetMapping("/")
  public RedirectView homePage() {
    return new RedirectView("/index.html");
  }
}
