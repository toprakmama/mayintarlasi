package toprk;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row , column;
	  System.out.println("Mayin Tarlasina Hosgeldiniz ! ");
      System.out.println("L�tfen Oynamak Istediginiz Boyutu Giriniz");
      System.out.print("Sat�r Say�s�: ");
      row = scan.nextInt();
      System.out.print("S�tun Sayiyisini: ");
       column=scan.nextInt();
      
     mayintarlasi1 mayin=new mayintarlasi1(row,column);
     mayin.run();
      
	}

}
