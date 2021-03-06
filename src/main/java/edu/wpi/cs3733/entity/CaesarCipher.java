package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {
	private static final int MAX_LENGTH = 140;
	private String text;

	public CaesarCipher() {
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
				sb.append((char) (((temp - 97 + 13) % 26) + 97));

			else if(Character.isAlphabetic(temp) && Character.isUpperCase(temp))
				sb.append((char) (((temp - 65 + 13) % 26) + 65));

			else if(Character.isSpaceChar(temp))
				sb.append(" ");
		}

		return sb.toString();
	}


}
