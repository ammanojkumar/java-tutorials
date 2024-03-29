package io.mk.designpattern.creational.builder;

public class BuilderFactoryTest {

	public static void main(String[] args) {
		Meeting meeting = new Meeting.MeetingBuilder().title("Standup").organizer("Peter").startTime("12:00pm")
				.numberOfAttendees(10).build();
		System.out.println(meeting);
	}
}
