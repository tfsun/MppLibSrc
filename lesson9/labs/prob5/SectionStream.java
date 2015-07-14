package lesson9.labs.prob5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SectionStream {
	Stream<String> streamSection(Stream<String> stream, int m, int n){
		return stream
				.skip(m)
				.limit(n-m+1);
	}
	
	public static void main(String[] args){
		List<String> strList = new ArrayList<String>(
				Arrays.asList("No.1", "No.2", "No.3", "No.4", "No.5"));
		SectionStream ss = new SectionStream();
		Stream<String> subStream = ss.streamSection(strList.stream(), 1, 3);
		System.out.println(subStream.collect(Collectors.toList()).toString());
	}
}
