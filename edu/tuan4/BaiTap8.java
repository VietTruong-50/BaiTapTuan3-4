package edu.tuan4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTap8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcWx0xtYabcHellox0xHabcoHEabc";
		String str1 = "bc";
		Pattern pattern = Pattern.compile(str1);
		Matcher matcher = pattern.matcher(str);

		int count = 0;
		while (matcher.find())
			count++;

		System.out.println(count + " vi tri");
		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
