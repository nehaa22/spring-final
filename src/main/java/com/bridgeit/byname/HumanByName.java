package com.bridgeit.byname;

public class HumanByName {
	private HeartByName heartByName;

  public void setHeartByName(HeartByName heartByName) {
		this.heartByName = heartByName;
	}



	public void pumping()
	{
		if(heartByName == null){
			System.out.println("Dead");
		}
		else {
		heartByName.pump();
		}
	}
}
