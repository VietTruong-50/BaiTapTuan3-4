package edu.tuan4;

public class BaiTap11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ten = null;
		int count = 0;
		String arr[] = { "Nguyễn Hoàng An", "Trương Quốc Việt", "Đoàn Khánh Trường", "Vũ Nhật Hòang An" };

		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i] + "\t");
			arr[i] = arr[i].trim();
			int j = arr[i].lastIndexOf(' ');
			ten = arr[i].substring(j + 1);
			if (ten.toLowerCase().contains("an")) {
				count++;
			}
		}

		System.out.println("\nSố người có tên An: " + count);
		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
