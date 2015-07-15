package lesson10.labs.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lesson10.labs.prob6.GuestListPreJava8.IllegalGuestException;

public class GuestListJava8 {
	 
	public static void main(String[] args) {
		final boolean yes = true;
		final boolean no = false;
		GuestListJava8 gl = new GuestListJava8();
		List<Guest> invited 
		  = Arrays.asList(new Guest("Joe Stevens", Status.COMMON, Gender.M, 5, yes),
				          new Guest("Susan Richards", Status.GOLD, Gender.F, 10, no),
				          new Guest("Toni Smith", Status.COMMON, Gender.F, 4, yes),
				          new Guest("Anthony Hawkins", Status.ILLEGAL, Gender.M, 0, yes),
				          new Guest("Tony Thomas", Status.SILVER, Gender.M, 8, no),
				          new Guest("Antoinette Cerisier", Status.SILVER, Gender.F, 7, yes),
				          new Guest("Ricardo Salhuega", Status.COMMON, Gender.M, 2, yes));
		
		gl.printListOfExpectedFemaleGuests(invited);
		
	}
	
	public void printListOfExpectedFemaleGuests(List<Guest> invited) {
		//implement
		PredicateWithException<Guest> predicateWithException = new PredicateWithException<Guest>() {
			@Override
			public boolean test(Guest guest) throws Exception {
				boolean isIllegal = (guest.getStatus() == Status.ILLEGAL);
				if(isIllegal) throw new IllegalGuestException(String.format(
							"Illegal guest %s has attempted entry to the event", guest.getName()));
				else return true;
			}
		};
		
		String guests	= invited.stream().filter(PredicateWithException.unchecked(predicateWithException))
			.filter(guest -> guest.getGender() == Gender.F && guest.isPlanningToCome())
			.map(guest -> guest.getName())
			.sorted()
			.collect(Collectors.joining(", "));
		System.out.println(guests);
	}
	
	
	class IllegalGuestException extends Exception {
		private static final long serialVersionUID = 1L;
		IllegalGuestException() {
			super("An illegal guest has attempted entry.");
		}
		IllegalGuestException(String msg) {
			super(msg);
		}
		IllegalGuestException(Throwable t) {
			super(t);
		}
	}
}
