package ttttttest;

import java.util.Scanner;

import ttttttest_test.test;


public class main {

	test ts = new test();
		public static void main(String[] args) {
		   
		      
		      Scanner input = new Scanner(System.in);

		      
		    

		      int num;
		      while(true) {
		      System.out.println("1.메뉴 및 수량 선택");
		      System.out.println("2.맵기 선택");
		      System.out.println("3.금액 확인");
		      System.out.println(">>>>>>");



		      num = input.nextInt();

		      
		      switch(num) {
		      case 1 :
		         System.out.println("1.짜장면 2.짬뽕 ");
		         System.out.println(">>>>>>");

		         num= input.nextInt();
		         switch(num) {
		         case 3 :
		             System.out.println("주문을 확인합니다.");
		             System.out.println("짜장면 ");
		            
		             break;
		          
		          default : 
		             System.out.println("다시 선택하세요"); 
		          }
		       }
		    }
		    }
		         }
