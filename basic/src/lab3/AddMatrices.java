package lab3;

import java.util.Scanner;

public class AddMatrices {
	public static void main(String[] args) {
		int x[][]=new int[][] {{1,2,3},{2,2,2},{1,1,5}};
		int y[][]= {{1,2,3},{2,2,2},{1,1,5}};
		int z[][]=new int[3][3];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<y.length;j++) {
				z[i][j]=x[i][j]+y[i][j];
				System.out.print(z[i][j]+" ");
			}
		System.out.println("\n");
		}
//		for(int i=0;i<x.length;i++)
//		{
//			for(int j=0;j<y.length;j++) {
//				System.out.print(z[i][j]+" ");
//			}
//		
//			System.out.println("\n");
//		}
	}
}