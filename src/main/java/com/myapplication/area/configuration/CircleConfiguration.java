package com.myapplication.area.configuration;

import com.myapplication.area.model.Circle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * // TODO Comment
 */
@Configuration
public class CircleConfiguration {

  @Value("${circle.radius}")
  private double radius;

  @Bean
  public Circle circle() {
    return new Circle(radius);
  }
}
