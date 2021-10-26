package edu.tuan4;

public class BaiTap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "tr", "qudffoc", "sdgfdgdfgt" };
		int a=0, b=0;
		for (int i = 0; i < arr.length; i++) {
			a=i;
			for (int j = 0; j < arr.length; j++) {
				b=j;
				if (arr[i].length() < arr[j].length()) {
					int tmp = a;
					a = b;
					b = tmp;
				}
			}
		}
		System.out.println(arr[a]);
		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
