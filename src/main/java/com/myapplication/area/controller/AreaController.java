package com.myapplication.area.controller;

import com.myapplication.area.model.AreaResponse;
import com.myapplication.area.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * // TODO Comment
 */
@RestController
public class AreaController {
  @Autowired
  Circle circle;

  @GetMapping("/area")
  public AreaResponse getArea() {
    return new AreaResponse(circle.getArea());
  }
}
