package com.nweiler.adventuregame;

import java.awt.Color;

public class Marker implements Carriable {

	private Color color;
	
	public Marker() {}
	
	public Marker(String color) {
		if (color.equals("Green"))
		{
			this.color = Color.GREEN;
		}
		if (color.equals("Red"))
		{
			this.color = Color.RED;
		}
		if (color.equals("Yellow"))
		{
			this.color = Color.YELLOW;
		}
		else {
			this.color = Color.WHITE;
		}
	}

	public Color returnColor() {
		return color;
	}
	
	public void setColor(String color) {
		if (color.equals("Green"))
		{
			this.color = Color.GREEN;
		}
		if (color.equals("Red"))
		{
			this.color = Color.RED;
		}
		if (color.equals("Yellow"))
		{
			this.color = Color.YELLOW;
		}
		else {
			this.color = Color.WHITE;
		}
		
	}
	
	public void use(){
		
	}
}
