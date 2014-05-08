package com.jads;

import org.junit.Test;

import java.util.Stack;

/**
	* @author Adelin Ghanayem adelin.ghanaem@effortel.com
	*/
public class Stacks {


	@Test
	public void balancingSymbols() throws Exception {

		Stack<Character> stringStack = new Stack<Character>();
		String programs = "public static void main(String[] args){" +


										"byte[1] bytes = new byte[1]" +

										"System.out.println(\" This is a simple program\")" +

										"}";


		for (char c : programs.toCharArray()) {

			if (c == '{' || c == '(' || c == '[') {
				stringStack.add(c);
			}

			if (c == '}') {

				Character character = stringStack.pop();
				if (character == null) {
					throw new RuntimeException("Ops !");
				} else {
					if (character == '{') {
						continue;
					}	else {
						throw new RuntimeException("Ops !");

					}
				}

			}
			if (c == ')') {

				Character character = stringStack.pop();
				if (character == null) {
					throw new RuntimeException("Ops !");
				} else {
					if (character == '(') {
						continue;
					}	else {
						throw new RuntimeException("Ops !");

					}
				}

			}

			if (c == ']') {

				Character character = stringStack.pop();
				if (character == null) {
					throw new RuntimeException("Ops !");
				} else {
					if (character != '[') {
						throw new RuntimeException("Ops !");
					}
				}



			}



			}

		}


}
