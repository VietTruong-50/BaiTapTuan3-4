package edu.tuan3;

import java.util.Scanner;

public class BaiTap13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[50][50];

		System.out.print("\n nhap n>0: ");
		int n = sc.nextInt();
		while (n < 3 || n > 8) {
			System.out.println("3<=n<=8 : ");
			n = sc.nextInt();
		}
		tao(a, n);
		inkq(a, n);
		System.out.println(" Truong Quoc Viet 20198341");
	}

	public static void tao(int a[][], int n) {
		int d = 0, gt = 1, hang = n - 1, cot = n - 1;
		while (d <= n / 2) {
			for (int i = d; i <= cot; i++)
				a[d][i] = gt++;
			for (int i = d + 1; i <= hang; i++)
				a[i][cot] = gt++;
			for (int i = cot - 1; i >= d; i--)
				a[hang][i] = gt++;
			for (int i = hang - 1; i > d; i--)
				a[i][d] = gt++;
			d++;
			hang--;
			cot--;
		}
	}

	public static void inkq(int a[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(a[i][j] + "\t");
			System.out.print("\n\n");
		}
	}

}
