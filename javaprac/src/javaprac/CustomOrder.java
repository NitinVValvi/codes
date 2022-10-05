package javaprac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomOrder {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 7, 3, 8, 16, 11, 14, 35, 23, 26, 37, 50, 41, 38);

		Comparator<Integer> reverseComparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}

		};

		List<Integer> sortedList = list.stream().sorted(reverseComparator).collect(Collectors.toList());

		System.out.println(sortedList);
	}
}