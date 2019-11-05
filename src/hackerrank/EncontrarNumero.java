package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class EncontrarNumero {
	
	static String findNumber(List<Integer> arr, int k) {
		if(arr.contains(k)) return "YES";
		else return "NO";
	}
	
	public static void main(String[] args) {
		
		List<Integer> numerosTestes = new ArrayList<>();
		numerosTestes.add(6);
		numerosTestes.add(4);
		numerosTestes.add(3);
		numerosTestes.add(2);
		
		System.out.println(findNumber(numerosTestes,0));
		
	}

}
