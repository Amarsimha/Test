package com.user.amars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting_Triangles {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int total_triangles = Integer.parseInt(input.nextLine());
		Map<String, Boolean> processedMap = new HashMap<String, Boolean>();

		StringBuffer num = new StringBuffer();

		for (int i = 0; i< total_triangles; i++) {
			String [] sidesList = input.nextLine().split(" ");
			Arrays.sort(sidesList);
			num.delete(0, num.length());
			for (String s : sidesList) {
				num.append(s + " ");
			}
			String triangle = num.toString();
			if (processedMap.get(triangle) == null) {
				processedMap.put(triangle, true);
			} else {
				processedMap.put(triangle, false);
			}
		}

		//System.out.println(processedMap.entrySet().stream().filter(p -> p.getValue()).count());
		int result = 0;
		for (boolean value : processedMap.values()) {
			if (value) { 
				result++;
			}
		}
		System.out.println(result);
		input.close();

		
	}
}
