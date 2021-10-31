package edu.tuan4;

import java.util.Scanner;

public class BaiTap14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S1 = "1111100000";
		char str[] = S1.toCharArray();
		int j = 0;
		int n = sc.nextInt();

		for (j = 1; j < n; j++) {
			int i = 1;
			while (i < 10) {
				char tmp = str[i - 1];
				str[i - 1] = str[i];
				str[i] = tmp;
				i++;
			}
		}
		String Sk = new String(str);
		System.out.print("xau thu " + n + " la : " + Sk);
		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
