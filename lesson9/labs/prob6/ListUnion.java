package lesson9.labs.prob6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListUnion {
	public Set<String> union(List<Set<String>> sets){
		Set<String> unionSet = new HashSet<String>();
		return sets.stream()
				.reduce(unionSet, (a,b) -> {a.addAll(b); return a;});
	}
	public static void main(String[] args){
		Set<String> s1 = new HashSet<String>(Arrays.asList("A", "B"));
		Set<String> s2 = new HashSet<String>(Arrays.asList("D"));
		Set<String> s3 = new HashSet<String>(Arrays.asList("1", "3", "5"));

		List<Set<String>> unionList = new ArrayList<Set<String>>(Arrays.asList(s1, s2, s3));
		ListUnion lu = new ListUnion();
		System.out.println(lu.union(unionList));
	}
}
