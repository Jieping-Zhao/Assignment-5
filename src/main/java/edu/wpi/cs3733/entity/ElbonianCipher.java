package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {
	private String state;
	protected Observable message;

	public void setText(String text){

	}

	public String getText(){
		return null;
	}

	@Override
	public void notify(Observable text){
		this.message = text;
		this.message.register(this);
	}
}
