package com.assignment.day2.q1;
import static java.lang.Math.*;
class Circle{
	private double radius=1.0;
	private String color="red";
	public Circle() {}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return PI*radius * radius;
	}

	@Override
	public String toString() {
		return "radius : "+ radius +" color: "+ color;
	}
}