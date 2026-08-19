package javamethods;

import java.util.Scanner;

public class Areasofmany {
	//rectangle
	//formula = length+breadth
	
	double findAreaOfRectangle(double lenght,double breadth) {
		double arRec = lenght*breadth;
		return arRec;
		
		
	}
	double findaAreaOfTriagle(float base,float height) {
		double arTri = 0.5*base*height;
		return arTri;
		
	}
	int findAreaOfSquare(double side) {
		double arsq = side*side;
		return (int) arsq;
		
	}
	double findAreaOfCircle(double radius) {
		double arCir = Math.PI*radius*radius;
		return arCir;
		
	}
	
	   void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lenght :");
		double l = sc.nextDouble();
		
		System.out.println("enter breadth :");
		double b = sc.nextDouble();
		
		double arRec = findAreaOfRectangle(l,b);
		System.out.println("AreaOfRectangle is :" +arRec);
		
		System.out.println("enter radius :");
		double r = sc.nextDouble();
		double arCir = findAreaOfCircle(r);
		System.out.println("AreaOfcircle is :" +arCir);
		
		System.out.println("enter base :");
		float a = sc.nextFloat();
	
		System.out.println("enter height :");
		float h = sc.nextFloat();
		double arTri = findaAreaOfTriagle(a,h);
		System.out.println("AreaOfTriangle :" +arTri);
		
		System.out.println("enter side");
		double s = sc.nextDouble();
		double arSq = findAreaOfSquare(s);
		System.out.println("AreaOfSquare :" +arSq);
		sc.close();
		
		}

}
