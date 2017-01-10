package com.infosys;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw() {
		System.out.println("Drawing triangle:");
		System.out.println("point A : ("+this.pointA.getX()+","+this.pointA.getY()+")");
		System.out.println("point B : ("+this.pointB.getX()+","+this.pointB.getY()+")");
		System.out.println("point C : ("+this.pointC.getX()+","+this.pointC.getY()+")");
	}
	/*private String type;
	private int height;

	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public void draw() {
		System.out.println("Drawing triangle of type " + type + " and height = "+height);
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}*/


	/*
	 * public void setType(String type) { this.type = type; }
	 */

}
