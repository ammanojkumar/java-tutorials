package io.mk.java8.lambda;

@FunctionalInterface
interface TicketCounterA {
	public void bookTicket();
}

@FunctionalInterface
interface TicketCounterB {
	public void bookTicket(String name);
}

@FunctionalInterface
interface TicketCounterC {

	void bookTicket(String name, int age);

	static void greet() {
		System.out.println("Welcome");
	}

	default void sayThankyou() {
		System.out.println("Thank you");
	}
}

public class TicketCounter {

	public static void main(String[] args) {
		TicketCounterA tca = () -> System.out.println("Booking ticket..");
		tca.bookTicket();

		TicketCounterB tcb = name -> System.out.println("Ticket booking for " + name);
		tcb.bookTicket("Manoj");

		TicketCounterC tcc = (name, age) -> System.out.println("Ticket booking for " + name + ", age is " + age);
		TicketCounterC.greet();
		tcc.bookTicket("Manoj", 30);
		tcc.sayThankyou();
	}

}
