package com.tomspencerlondon.configtest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

  private final EmailConfiguration emailConfiguration;

  public ConfigController(EmailConfiguration emailConfiguration) {
    this.emailConfiguration = emailConfiguration;
  }

  @GetMapping("/")
  public String propertiesConfig() {
    return emailConfiguration.toString();
  }
}
