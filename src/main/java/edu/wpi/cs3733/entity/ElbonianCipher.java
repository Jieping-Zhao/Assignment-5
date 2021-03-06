package edu.wpi.cs3733.entity;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {
	private String text;
	protected Observable message;

	public ElbonianCipher() {
	}

	public void setText(String text){

	}

	public String getText(){
		StringBuilder sb = new StringBuilder();
		LinkedList<Character> letters = new LinkedList<Character>();
		LinkedList<Character> valid = new LinkedList<Character>();

		HashMap<Character, String> converter = new HashMap<Character, String>();
		converter.put('a', "L01");
		converter.put('b', "L02");
		converter.put('c', "L03");
		converter.put('d', "L04");
		converter.put('e', "L05");
		converter.put('f', "L06");
		converter.put('g', "L07");
		converter.put('h', "L08");
		converter.put('i', "L09");
		converter.put('j', "L10");
		converter.put('k', "L11");
		converter.put('l', "L12");
		converter.put('m', "L13");
		converter.put('n', "L14");
		converter.put('o', "L15");
		converter.put('p', "L16");
		converter.put('q', "L17");
		converter.put('r', "L18");
		converter.put('s', "L19");
		converter.put('t', "L20");
		converter.put('u', "L21");
		converter.put('v', "L22");
		converter.put('w', "L23");
		converter.put('x', "L24");
		converter.put('y', "L25");
		converter.put('z', "L26");

		converter.put('A', "U01");
		converter.put('B', "U02");
		converter.put('C', "U03");
		converter.put('D', "U04");
		converter.put('E', "U05");
		converter.put('F', "U06");
		converter.put('G', "U07");
		converter.put('H', "U08");
		converter.put('I', "U09");
		converter.put('J', "U10");
		converter.put('K', "U11");
		converter.put('L', "U12");
		converter.put('M', "U13");
		converter.put('N', "U14");
		converter.put('O', "U15");
		converter.put('P', "U16");
		converter.put('Q', "U17");
		converter.put('R', "U18");
		converter.put('S', "U19");
		converter.put('T', "U20");
		converter.put('U', "U21");
		converter.put('V', "U22");
		converter.put('W', "U23");
		converter.put('X', "U24");
		converter.put('Y', "U25");
		converter.put('Z', "U26");
		converter.put(' ', "-");

		for (int i=0; i<text.length(); i++) {
			letters.addLast(text.charAt(i));
		}
		for (Character letter: letters) {
			sb.append(converter.get(letter));
		}
		return sb.toString();
	}

	@Override
	public void notify(Observable text){
		this.message = text;
		this.message.register(this);
		this.text = message.getText();
	}
}
