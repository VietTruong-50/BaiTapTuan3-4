package edu.tuan3;

public class BaiTap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 8, 3, 9, 12, 17, 22, 95, 11 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\nCac uoc so thuc su cua so " + arr[i] + " la:");
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] % arr[j] == 0 && arr[i] != arr[j]) {
					System.out.print(" " + arr[j]);
				}
			}
		}	
		System.out.println("\nTruong Quoc Viet 20198341");
	}
}
