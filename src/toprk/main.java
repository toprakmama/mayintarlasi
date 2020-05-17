package toprk;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int row , column;
	  System.out.println("Mayin Tarlasina Hosgeldiniz ! ");
      System.out.println("Lütfen Oynamak Istediginiz Boyutu Giriniz");
      System.out.print("Satýr Sayýsý: ");
      row = scan.nextInt();
      System.out.print("Sütun Sayiyisini: ");
       column=scan.nextInt();
      
     mayintarlasi1 mayin=new mayintarlasi1(row,column);
     mayin.run();
      
	}

}
