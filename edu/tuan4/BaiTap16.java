package edu.tuan4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTap16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "truong quoc viet";
		String str1 = "iet";
		Pattern pattern = Pattern.compile(str1);
		Matcher matcher = pattern.matcher(str);

		if (matcher.find()) {
			System.out.print(str1 + " là xâu con của " + str);
		} else {
			System.out.print(str1 + " không phải là xâu con của " + str);
		}

		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
