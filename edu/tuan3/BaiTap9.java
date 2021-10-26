package edu.tuan3;

public class BaiTap9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 2, 8, 3, 0, 9, 0, 12, 17, 22, 95, 11, 0 };
		int c = 15;
		int bang_c = 0, lonHon_c = 0, nhoHon_c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (c == arr[i]) {
				bang_c++;
			}
			if (c > arr[i]) {
				nhoHon_c++;
			}
			if (c < arr[i]) {
				lonHon_c++;
			}
		}
		System.out.print("Bang c: " + bang_c + " " + ";Nho hon c: "+ nhoHon_c + " " + ";Lon hon c: "+ lonHon_c);
		System.out.println("\nTruong Quoc Viet 20198341");
	}
}
