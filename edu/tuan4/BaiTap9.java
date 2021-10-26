package edu.tuan4;

public class BaiTap9 {

	public static void main(String[] args) {
		String str = "Hello world";
		char arr[] = str.toCharArray();
		int i = 3, j = 6;
		char tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		System.out.println(arr);
		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
