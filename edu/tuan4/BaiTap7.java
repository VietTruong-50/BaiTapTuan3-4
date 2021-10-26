package edu.tuan4;

public class BaiTap7 {

	public static void main(String[] args) {
		String sData = "12b3t";
		char arr[] = sData.toCharArray();
		// TODO Auto-generated method stub
		   for (int i = 0; i < sData.length(); i++) {
	            if (Character.isDigit(sData.charAt(i))) {
	                arr[i] = '$';
	            }
	        } 
		   System.out.print(arr);
		   System.out.println("\nTruong Quoc Viet 20198341");
	}
}
