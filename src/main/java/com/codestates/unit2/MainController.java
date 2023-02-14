package com.codestates.unit2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/")
  public String getMethod() {
    return "To-do Application";
  }

}
