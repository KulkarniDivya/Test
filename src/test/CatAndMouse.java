package test;

import java.util.Scanner;

public class CatAndMouse {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no.of queries");
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			z[i] = sc.nextInt();
		}
		String[] s = checkCatOrMouse(x,y,z);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	private static String[] checkCatOrMouse(int[] x, int[] y, int[] z) {
		// TODO Auto-generated method stub
		String[] s = new String[x.length];
		for (int i = 0; i < x.length; i++) {
			int a = x[i]-z[i];
			int b = y[i]-z[i];
			
			if(Math.abs(a)<Math.abs(b))
				s[i] = "CatA";
			else if(Math.abs(a)>Math.abs(b))
				s[i] = "CatB";
			else
				s[i] = "MouseC";
		}
		return s;
	}

}
