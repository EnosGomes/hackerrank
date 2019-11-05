package hackerrank;

import java.util.List;
import java.util.ArrayList;

public class ListImpares {

	public static List<Integer> impares(Integer l, Integer r) {
		List<Integer> numerosImpares = new ArrayList<>();
		int i;	
		for (i = l; i <= r; i++) {
			if (i % 2 != 0)
				numerosImpares.add(i);
		}

		return numerosImpares;
	}

	public static void main(String[] args) {

		System.out.println(impares(12, 111));
	}
}
