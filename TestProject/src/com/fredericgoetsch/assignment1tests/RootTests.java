package com.fredericgoetsch.assignment1tests;

public class RootTests {

	public static void main(String[] args) {
		// x^2+p*x+q=0
		
		double p = 50.0;
		double q = 4.0;
		
		double minMethod1 = Math.min(-p/2+Math.sqrt(p*p/4-q), -p/2-Math.sqrt(p*p/4-q));
		double minMethod2 = Math.min(q/(-p/2-Math.sqrt(p*p/4-q)), q/(-p/2+Math.sqrt(p*p/4-q)));
		
		System.out.println("For p = " + p + " and q = " + q + " the smallest root of the quadratic equation x^2+px+=0 is given by:");
		System.out.println("Method 1: " + minMethod1 + "\n" + "Method 2: " + minMethod2);
		System.out.println("Putting the values back in the quadratic equation we get (answer should be close to 0): ");
		
		double answer1 = minMethod1*minMethod1+p*minMethod1+q;
		double answer2 = minMethod2*minMethod2+p*minMethod2+q;
		
		System.out.println("Method 1: " + answer1 + "\n" + "Method 2: " + answer2);


	}

}
