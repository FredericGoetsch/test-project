/**
 * 
 */
package com.fredericgoetsch.test;

import java.util.Scanner;

/**
 * @author Lorenzo Berti
 *
 */
public class MainClass2 {
// comment
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Hi! I am Java " + System.getProperty("java.version") + ". What's your name?");

		Scanner in = new Scanner(System.in);

		String answer1 = in.nextLine();

		System.out.println("Hello " + answer1 + ", nice to meet you! What is the capital of Germany?");

		String answer2 = in.nextLine();
		
		while (true) {
			if (answer2.equals("Berlin")) {
				System.out.println("That's correct!");
				break;
			}
			System.out.println("Wrong! Please try again!");
			answer2 = in.nextLine();
		}

		in.close();
	}

}
