package com.bridgeit.basic;

public class Human {
	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void pumping()
	{
		if(heart == null){
			System.out.println("Dead");
		}
		else {
		heart.pump();
		}
	}
}
