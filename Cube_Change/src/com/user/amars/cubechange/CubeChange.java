package com.user.amars.cubechange;

import java.util.Scanner;

public class CubeChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = Integer.parseInt(input.nextLine());
		for (int i = 0; i< testCases; i++ ) {
			Long side = Long.parseLong(input.nextLine());
			if (side != 1L) {
				System.out.println(cube(side) - cube(side-2));
			} else {
				System.out.println(1);
			}
				
		}
		input.close();
	}
	
	public static Long cube(Long num) {
		return num*num*num;
	}
}
