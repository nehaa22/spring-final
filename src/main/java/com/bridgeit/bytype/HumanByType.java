package com.bridgeit.bytype;

public class HumanByType {
	private HeartByType heartByType;

  public void setHeartByName(HeartByType heartByType) {
		this.heartByType = heartByType;
	}



	public void pumping()
	{
		if(heartByType == null){
			System.out.println("Dead");
		}
		else {
			heartByType.pump();
		}
	}
}
