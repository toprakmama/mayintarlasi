package toprk;

import java.util.Random;
import java.util.Scanner;
public class mayintarlasi1 {

	int rowNumber,colNumber,size;
	int[][] map;
	int[][] board;
	boolean game = true;
	
	Scanner scan=new Scanner(System.in);
	Random rand=new Random();
	
	mayintarlasi1 (int rowNumber , int colNumber){
		this . rowNumber = rowNumber;
		this . colNumber = colNumber;
		this . map = new int[rowNumber][colNumber];
		this . board = new int [rowNumber][colNumber];
		this . size = rowNumber * colNumber;
}
	public void run() {
		int row,col,success = 0;
		prepareGame();
		print(map);
		System.out.println("Oyun Baslad�: ");
		while (game) {
			print(board);//may�nlar�n g�z�kt�g� yer
			System.out.print("Sat�r: ");
			row=scan.nextInt();
			System.out.print("S�tun: ");
			col=scan.nextInt();
			if(row < 0 || row >=rowNumber  ) {
				System.out.println("Ge�ersiz Kordinat!!");
				continue;
			}if(col < 0 || col >=colNumber  ) {
				System.out.println("Ge�ersiz Kordinat!!");
				continue;
			}
			if(map[row][col] !=-1) {
				check(row,col);
				success++;
				if(success == (size - (size/3))) {
					System.out.println("Basar�l� Bir Sekilde Tamamlad�n�z");
					break;
				}
			}else {
				game = false;
				System.out.println("May�na Bast�n�z Oyun Bitti !");
			}
		}
	}
	//sectigin yerin etra�nda ka� adet may�n var onu g�steriyor
	public void check(int r ,int c) {
		if ((map[r][c] == 0) ) {
			if((c	< colNumber -1) && map[r][c+1] == -1) {
				board[r][c]++;
			}if((r < colNumber -3) && map[r+1][c] == -1) {
				board[r][c]++;
			}if((	r > 0) && (map[r-1][c] == -1)) {
				board[r][c]++;
			}if((c > 0 ) && (map[r][c-1] == -1)) {
				board[r][c]++;
			}
			if(board [r][c] == 0) {
				board [r][c] =-2;
				
			}
			
		}
		
	}
	public void prepareGame() {
		int randRow,randCol , count =0;
		while (count != (size/3)) {
			randRow = rand.nextInt(rowNumber);
			randCol = rand.nextInt(colNumber);
			if(map[randRow][randCol] != -1) {
			     map[randRow][randCol] = -1	;
			    count++;
			}			
		}
	}
	public void print(int [][] arr) {
		for (int i =0; i<arr.length; i++) {
			for (int j=0;  j<arr[0].length; j++) {
				if(arr[i] [j] >= 0) 
					System.out.print(" ");			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}




















