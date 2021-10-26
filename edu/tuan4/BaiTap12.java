package edu.tuan4;

public class BaiTap12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = { "Nguyễn Hoàng An", "Trương Quốc Việt", "Đoàn Khánh Trường", "Vũ Nhật Hòang An", "Nguyễn Thị Hoàng Mai" };
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].split(" ")[1].contains("Thị")) {
				count++;
			}
		}
		System.out.println("\nSố người có phần đệm 'Thị': " + count);
		System.out.println("\nTruong Quoc Viet 20198341");
	}

}
