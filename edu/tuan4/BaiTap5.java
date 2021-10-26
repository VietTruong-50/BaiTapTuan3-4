package edu.tuan4;

public class BaiTap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "10011101001";
		char arr[] = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='0') {
				arr[i]='1';
			}else {
				arr[i]='0';
			}
		}
		System.out.print(arr);
		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
