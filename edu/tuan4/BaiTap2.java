package edu.tuan4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcwxxxtyabcHelloxxxHabcoHeabc";
		Pattern pattern = Pattern.compile("abc");
		Matcher matcher = pattern.matcher(str);

		int count = 0;
		while (matcher.find())
			count++;

		System.out.println(count);
		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
