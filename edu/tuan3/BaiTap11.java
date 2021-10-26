package edu.tuan3;

public class BaiTap11 {

	public static void main(String[] args) {
        String str = "1533666993456677777889";
        int current = 0;
		int count = 1, max=0, maxIndex=0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                if (count > max) {
                    max = count;
                    maxIndex = current;
                }
                current = i + 1;
                count = 1;
            } else {
                ++count;
            }
        }
                if (count > max) {
                    max = count;
                    maxIndex = current;
                }

        for (int i = maxIndex; i < maxIndex + max; i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println("\nTruong Quoc Viet 20198341");
    }

}
