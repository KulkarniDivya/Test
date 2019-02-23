package test;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		System.out.println(checkLetters(s));
	}

	private static int checkLetters(String s) {
		// TODO Auto-generated method stub
		int n=0;
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if( i%3 !=1 && ch[i] != 'S' )
			{
				if(i > 3) {
					if( ch[i-2] != 'S')
					{
						break;
					}
				}
				
				n++;
				
			}
				
			else if( i%3 ==1 && ch[i] !='O')
				n++;
		}
		return n;
	}

}
