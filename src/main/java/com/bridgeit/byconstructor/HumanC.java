package com.bridgeit.byconstructor;



public class HumanC {
	private HeartC heartC;
	
	public HumanC(HeartC heartC) {
		this.heartC = heartC;
	}

	public void setHeart(HeartC heartC) {
		this.heartC = heartC;
	}
	
	public void pumping()
	{
		if(heartC == null){
			System.out.println("Dead");
		}
		else {
		heartC.pump();
		}
	}
}
