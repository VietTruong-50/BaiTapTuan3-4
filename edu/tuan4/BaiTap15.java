package edu.tuan4;

import java.io.BufferedReader;
import java.util.Scanner;


public class BaiTap15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner Nhap=new Scanner(System.in);
		    
	        System.out.print("Nhap S1 = ");
	        String S1= Nhap.nextLine();
	        System.out.print("Nhap S2 = ");
	        String S2= Nhap.nextLine();
	    
	        //String S1= new String ("1234");
	        //String S2=new String ("abcd");
	        String S3=null;
	        // tach xau S2 co bien n
	        int n=S2.length(); // do dai cua S2
	        int k;
	        if(n%2==0){
	            k=n/2;
	        }
	        else k=(n+1)/2;
	        S3=S2.substring(0,k);
	        S3=S3+S1;
	        S3=S3+S2.substring(k);
	        System.out.println(S3);
	}

}
