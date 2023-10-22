package com.edu.Switchcase;

import java.util.Scanner;

class AreaFigures{
	
	
	public void areaSquare(double side){//method with argument and no return type
		double area;
		area=side*side;
		System.out.println("Area of square="+area);
		
	}
	public void areaRectangle(double l,double b){
		double area;
		area=l*b;
			
	}
	
	public void areaCircle(double radius) {
		double area;
		area =3.14159f* radius* radius;
		System.out.println("Area of circle="+area);
	}
	public void areaTraingle(double base, double height) {

		double area = (base*height)/2; //0.5f*base*height

		System.out.println("Area of Triangle ="+area);

		}
	}


public class AreaMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaFigures areaob=new AreaFigures();
		double l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("MENU area diffrent areafigures");
		System.out.println("Enter your choice");
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.circle");
		System.out.println("4.Triangle");
		
		int choice = sc.nextInt();
		
		  
		  double arearect;
		switch(choice) {
		  
		  case 1: System.out.println("Enter length and breadth of Reactangle");
		           l=sc.nextDouble();
		           b=sc.nextDouble();
		           arearect=sc.nextDouble();
		           areaob.areaRectangle(l, b); //actual parameters
		          System.out.println("Area of Reactangle="+arearect);
		          break;
		  case 2: System.out.println("Enter side of square");
		          double side=sc.nextDouble();
		          areaob.areaSquare(side);
		  case 3: //area of Circle
		        System.out.println("Enter radius");
		        double radius = sc.nextDouble();
		         areaob.areaCircle(radius);
		        break;
		  case 4: //area of Triangle
		         System.out.println("Enter base and height of a triangle");
		         double base = sc.nextDouble();
		         double height = sc.nextDouble();
		         areaob.areaTraingle(base,height);
		         break;
		     default: System.out.println("Invalid input");
		       
		  
		  }
		 }

	}


