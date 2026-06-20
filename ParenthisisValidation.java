package com.tka;

import java.util.Stack;

public class ParenthisisValidation {
	public static void main(String[] args) {
//	Check if a string containing only ()[]{} is valid.
		String str = "()[]{}";
		Stack<Character> stack = new Stack<>();
		for (Character c : str.toCharArray()) {
			if(c=='('||c=='['||c=='{') {
				stack.push(c);
				
			}else if(c==')'||c==']'||c=='}'){
				if(stack.isEmpty()) {
					System.out.println("invalid");
					return;
				}
				char top=stack.pop();
				if(c==')'&&top!='('||c==']'&&top!='['||c=='}'&&top!='{') {
					System.out.println("Invalid.");
					return;
				}
			}
		}
		if(!stack.empty()) {
			System.out.println("Invalid..");
			
		}else {
			System.out.println("valid");
		}
	}
}
