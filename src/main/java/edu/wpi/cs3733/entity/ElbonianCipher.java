package edu.wpi.cs3733.entity;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {
	private static final int MAX_LENGTH = 420;
	private String text;

	public ElbonianCipher() {
		this.text = "";
	}

	public String getText(){
		return text;
	}

	@Override
	public void notify(Object object){
		String s = (String) object;
		this.text = convert(s);
	}

	private String convert(String s) {
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < s.length() && sb.length() < MAX_LENGTH; i++) {
			char temp = s.charAt(i);
			if(Character.isAlphabetic(temp) && Character.isLowerCase(temp))
				sb.append("L").append(String.format("%02d", temp - 96));

			else if(Character.isAlphabetic(temp) && Character.isUpperCase(temp))
				sb.append("U").append(String.format("%02d", temp - 64));

			else if(Character.isSpaceChar(temp))
				sb.append("-");
		}

		return sb.toString();
	}
}
