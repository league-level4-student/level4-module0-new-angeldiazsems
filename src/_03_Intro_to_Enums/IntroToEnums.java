package _03_Intro_to_Enums;

import java.awt.Taskbar.State;
import java.util.Random;

import javax.swing.JOptionPane;

enum Elements {

	/*
	 * enums (short for enumerated type) are a class-like structure that can contain
	 * a set of specific data values.
	 */

	// Note: Every entry must be unique.
	AIR, EARTH, FIRE, METAL, WATER, WOOD
}

public class IntroToEnums {

	public static void main(String[] args) {

		// 1. In your package explorer, create a new enum file called StatesOfMatter.
		// Hint: This is very similar to how you create a new class file.

		// 2. Give the enum the following values:
		// SOLID, LIQUID, GAS

		// 3. Create an array of StatesOfMatter with all the values using .values().
		// Hint: Use "StatesOfMatter." as if it were a static method.
		StatesOfMatter[] s = new StatesOfMatter[3];
		int count = 0;
		for(StatesOfMatter state : StatesOfMatter.values()) {
			s[count] = state;
			count++;
		}
		//NOT DONE!!!!!!^^^^^.values

		// 4. Ask the user for a state of matter.
		String input = JOptionPane.showInputDialog("type a state of matter (all caps)");
		// 5. Iterate through the array and find what the user entered.
		// Hint: .name() or .toString
		for (int i = 0; i < s.length; i++) {
			if (input.equals(s[i].toString())) {
				System.out.println(s[i]+"'s order in the enum list is : "+s[i].ordinal());

			}

		}
		// 6. Print outs its ordinal(order in the enum list)
		// Hint: .ordinal()

		// 7. Add a celsiusTemp member variable to StatesOfMatter.
		// Note: Make sure to encapsulate it.

		// 8. Give it a default value of the temperature each state occurs in water.
		// Hint: Gas = 100, Liquid(room temp) = 25.55, Solid = 0
		StatesOfMatter.GAS.setTemp(100);
		StatesOfMatter.SOLID.setTemp(0);
		StatesOfMatter.LIQUID.setTemp(25.55);

		// Example
		// enum Months{
		//
		// JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),SEP(30),
		// OCT(31),NOV(30),DEC(31);
		//
		// int daysInMonth;
		//
		// private Months(int daysInMonth) {
		// this.daysInMonth = daysInMonth;
		// }

		// 9. Add a convertToFahrenheit method to StatesOfMatter
		// Hint: Return the conversion: F = (C * 9/5) + 32

		// 10. Create a variable of the StatesOfMatter type and initialize it randomly.
		Random ran = new Random();
		int r = ran.nextInt(s.length);
		StatesOfMatter state = s[r];
		// 11. Print outs both of its temperatures.
		double temp = state.getCelsiusTemp();
		
		System.out.println(
				state + ", occurs in water at: " + temp + " degrees celsius, and " + state.convertToFahrenheit(temp)+" degrees farenheit");
		// 11. Create a switch statement that switches on the variable you created.
		// Note: When creating the cases, you can omit the "StatesOfMatter."
		System.out.println("My favorite food/drink from "+state+" is: ");
		switch (state) {
		case GAS:
			System.out.println("SODA");
			break;
		case LIQUID:
			System.out.println("APPLE JUICE");
			break;
		case SOLID:
			System.out.println("MEAT");
			break;
		default:
			System.out.println("something went wrong");
			break;
		}

		// 12. For each case, print your favorite food or drink that uses that state.
		// e.g. Gas/Boiling for Pasta, Solid/Ice for Popsicles, Liquid for Soda

	}

}
