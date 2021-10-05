package com.myapplication.area.model;

/**
 * // TODO Comment
 */
public class Circle {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * radius * radius;
  }
}
