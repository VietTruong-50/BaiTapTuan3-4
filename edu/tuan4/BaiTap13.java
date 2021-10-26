package edu.tuan4;

public class BaiTap13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ten = null;
		int count = 0;
		String arr[] = { "Nguyễn Ngọc Hân", "Trương Quốc Việt", "Trần Thị Hường", "Vũ Nhật Hòang An", "Ngô Gia Huy" };

		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i] + "\t");
			arr[i] = arr[i].trim();
			int j = arr[i].lastIndexOf(' ');
			ten = arr[i].substring(j + 1);
			char firstLt = ten.toLowerCase().charAt(0);
			if (firstLt=='h') {
				count++;
			}
		}
		System.out.println("\nSố người có tên bắt đầu bằng chữ 'h': " + count);
		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
