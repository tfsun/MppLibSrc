package lesson8.labs.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import javax.print.attribute.standard.RequestingUserName;

public class Lambda2BiFunction {

	public static void main(String[] args) {
		/*
		BiFunction<Integer, Integer, List<Double>> f =
				(x, y) -> {
					List<Double> list = new ArrayList<>();
					list.add(Math.pow(x, y));
					list.add((double) (x*y));
					return list;
				};		
		System.out.println(f.apply(2,3));
		*/
		class MyBiFunction implements BiFunction<Integer, Integer, List<Double>> {
			public List<Double> apply(Integer x, Integer y) {
				List<Double> list = new ArrayList<>();
				Integer a = (int) Math.pow(x, y);
				list.add(Math.pow(x, y));
				list.add((double) (x*y));
				return list;
			}
		}
		MyBiFunction f = new MyBiFunction();
		System.out.println(f.apply(2,3));
	}

}
