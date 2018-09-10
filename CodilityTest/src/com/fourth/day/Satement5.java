package com.fourth.day;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Satement5 {
	
public static void main(String[] args) {
		
		stackProblem("13 DUP 4 POP 5 DUP + DUP + -");
	}


	public static boolean isNumeric(String str) {
		
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	

	public static void stackProblem(String s) {
		
		String[] splitStringBySpace = s.split(" ");

		Deque<String> stack = new ArrayDeque<String>();

		for (String str : splitStringBySpace) {
			
			if (isNumeric(str)) {
				
				stack.push(str);
				
			} else if ("DUP".equals(str)) {
				
				stack.push(stack.getFirst());

			} else if ("POP".equals(str)) {
				stack.pop();

			} else if ("+".equals(str)) {
				String first = stack.pop();
				stack.push(stack.pop() + first);

			} else if ("-".equals(str)) {

			}
		}

		for (String number : stack) {
			System.out.println(number);
		}
	}

	

	
}