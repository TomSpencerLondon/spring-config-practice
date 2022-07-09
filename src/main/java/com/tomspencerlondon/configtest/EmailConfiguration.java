package com.tomspencerlondon.configtest;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties(prefix = "config-test.email")
@Validated
public class EmailConfiguration {

  @NotBlank
  private String serverName;

  @Email
  private String email;

  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "EmailConfiguration{" + "serverName='" + serverName + '\'' + ", email='" + email + '\'' + '}';
  }
}
