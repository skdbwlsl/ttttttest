package ttttttest;

import java.util.Scanner;

import ttttttest_test.test;


public class main {

	test ts = new test();
		public static void main(String[] args) {
		   
		      
		      Scanner input = new Scanner(System.in);

		      
		    

		      int num;
		      while(true) {
		      System.out.println("1.�޴� �� ���� ����");
		      System.out.println("2.�ʱ� ����");
		      System.out.println("3.�ݾ� Ȯ��");
		      System.out.println(">>>>>>");



		      num = input.nextInt();

		      
		      switch(num) {
		      case 1 :
		         System.out.println("1.¥��� 2.«�� ");
		         System.out.println(">>>>>>");

		         num= input.nextInt();
		         switch(num) {
		         case 3 :
		             System.out.println("�ֹ��� Ȯ���մϴ�.");
		             System.out.println("¥��� ");
		            
		             break;
		          
		          default : 
		             System.out.println("�ٽ� �����ϼ���"); 
		          }
		       }
		    }
		    }
		         }
