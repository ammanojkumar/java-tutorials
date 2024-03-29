package io.mk.designpattern.creational.builder;

public class Meeting {

	private Meeting(MeetingBuilder meetingBuilder) {
		this.title = meetingBuilder.title;
		this.organizer = meetingBuilder.organizer;
		this.place = meetingBuilder.place;
		this.startTime = meetingBuilder.startTime;
		this.endTime = meetingBuilder.endTime;
		this.numberOfAttendees = meetingBuilder.numberOfAttendees;
	}

	private String title;
	private String organizer;
	private String place;
	private String startTime;
	private String endTime;
	private int numberOfAttendees;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getNumberOfAttendees() {
		return numberOfAttendees;
	}

	public void setNumberOfAttendees(int numberOfAttendees) {
		this.numberOfAttendees = numberOfAttendees;
	}

	@Override
	public String toString() {
		return "Meeting [title=" + title + ", organizer=" + organizer + ", place=" + place + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", numberOfAttendees=" + numberOfAttendees + "]";
	}

	public static class MeetingBuilder {

		public Meeting build() {
			return new Meeting(this);
		}

		private String title;
		private String organizer;
		private String place;
		private String startTime;
		private String endTime;
		private int numberOfAttendees;

		public MeetingBuilder title(String title) {
			this.title = title;
			return this;
		}

		public MeetingBuilder organizer(String organizer) {
			this.organizer = organizer;
			return this;
		}

		public MeetingBuilder place(String place) {
			this.place = place;
			return this;
		}

		public MeetingBuilder startTime(String startTime) {
			this.startTime = startTime;
			return this;
		}

		public MeetingBuilder endTime(String endTime) {
			this.endTime = endTime;
			return this;
		}

		public MeetingBuilder numberOfAttendees(int numberOfAttendees) {
			this.numberOfAttendees = numberOfAttendees;
			return this;
		}

	}

}
