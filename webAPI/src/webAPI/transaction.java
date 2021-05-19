package webAPI;

import java.util.Date;

public class transaction {

	String name;
	int points;
	Date timeStamp;
	
	
	public transaction(String name, int points, Date timeStamp) {
		this.name = name;
		this.points = points;
		this.timeStamp = timeStamp;
	}

}
