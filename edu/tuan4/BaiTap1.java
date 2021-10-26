package edu.tuan4;

import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ten = sc.nextLine();
		System.out.println("String: " + ten);
		System.out.print("Sau khi xóa khoảng trắng thừa: ");
		System.out.println(ten.replaceAll("\\s\\s+", " ").trim());
		System.out.println("\nTruong Quoc Viet 20198341");
	}
}
