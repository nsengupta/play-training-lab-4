package services.attendees;

import java.time.LocalDateTime;
import java.time.Month;

public class SoccerAttendeeRecord {
	
	private final String           firstName;
	private final String           lastName;
	private LocalDateTime    firstAppeared = LocalDateTime.of(2017,Month.JANUARY, 16,0,0);
	private final String           country;
	public SoccerAttendeeRecord(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country  = "NotKnown";
	}
	public SoccerAttendeeRecord(String firstName, String lastName,
			String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return (this.lastName + "," + this.firstName);
	}
}
