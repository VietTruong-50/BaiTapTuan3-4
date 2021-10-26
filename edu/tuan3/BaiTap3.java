package edu.tuan3;

public class BaiTap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 8, 3, 9 };
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				int tmp = arr[i];
				arr[i] = min;
				min = tmp;
			}
		}
		System.out.print(min);
		System.out.println(" Truong Quoc Viet 20198341");
	}

}
