package edu.tuan4;

public class BaiTap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "truong quoc viet";
		str = str.trim();
		int i = str.lastIndexOf(' ');
		String ten = str.substring(i + 1);
		System.out.println(ten);
		System.out.println("\nTruong Quoc Viet 20198341");
	}
	
}
