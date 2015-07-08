package lesson8.labs.prob4;

import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();
		System.out.println("countWords1: " + good.countWords(Folks.friends, "c", "d",5));	
		System.out.println("countWords2: " + good.countWords(Folks.editors, "c", "d",5));
	}
	
	public int countWords(List<String> words, String c, String d, int len) {
		return 
				words.stream()   //convert list to stream
         	     .filter(name -> name.length() == len) 
         	     .filter(name -> name.indexOf(c) !=-1)  
         	     .filter(name -> name.indexOf(d) ==-1)
         	     .collect(Collectors.toList())
         	     .size();
	}
}
