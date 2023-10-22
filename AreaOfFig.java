package com.edu.Blocks;


class AreaOfFigmain1{
	 int area(int l) {
	  return l*l;
	 }
	 int area(int l,int b) {
	  return l*b;
	 }
	 float area(int base , float height) {
	  return 0.5f*base*height;
	 }
	 double area(double radius) {
	  return 3.14*radius*radius;
	 }
	}
	public class AreaOfFig {

	 public static void main(String[] args) {
	  AreaOfFigmain1 a = new AreaOfFigmain1();
	  System.out.println( a.area(2));
	  System.out.println( a.area(2, 4));
	  System.out.println( a.area(2, 6.5f));
	  System.out.println( a.area(6));
	 }

	}