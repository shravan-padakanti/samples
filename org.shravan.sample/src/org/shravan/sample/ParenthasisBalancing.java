package org.shravan.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthasisBalancing {

	public static Map<Character, Character> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParenthasisBalancing pb = new ParenthasisBalancing();
		System.out.println(pb.isBalanced("[[{()}]]"));

	}

	public boolean isBalanced(String brackets) {

		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');

		if (brackets.length() % 2 != 0) {
			return false;
		}

		char[] braces = brackets.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < braces.length; i++) {
			Character character = braces[i];

			if (!(map.containsKey(character) || map.containsValue(character))) {
				return false;
			}

			if (character == '{' || character == '[' || character == '(')
				stack.push(character);
			else if ((character == '}' || character == ']' || character == ')') && !stack.isEmpty()) {
				if (stack.pop() != map.get(character))
					return false;
			} else if (stack.isEmpty())
				return false;
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

}
