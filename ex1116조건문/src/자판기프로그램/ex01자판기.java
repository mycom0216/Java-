package 자판기프로그램;

import java.util.Scanner;

public class ex01자판기 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      System.out.println("금액을 입력하세요.");
      int money = scan.nextInt();
      System.out.println("메뉴를 고르세요");
      System.out.println("1. 아우터(700원) 2. 이구동성(1000원) 3. 에그몽(500원)");
      int menu = scan.nextInt();

      if (menu == 1) {
         if(money >= 700) {
            money -= 700;
            System.out.println("잔돈 : " + money);
         } else if(money < 700) {
            System.out.println("잔돈 : " + money);
            System.out.println("돈이 부족해요 ㅠㅠ");
         }
      } else if (menu == 2) {
         if(money >= 1000) {
            money -= 1000;
            System.out.println("잔돈 : " + money);
         } else if(money < 1000) {
            System.out.println("잔돈 : " + money);
            System.out.println("돈이 부족해요 ㅠㅠ");
         }
      } else if (menu == 3) {
         if(money >= 500) {
            money -= 500;     
            System.out.println("잔돈 : " + money);
         } else if(money < 500) {
            System.out.println("잔돈 : " + money);
            System.out.println("돈이 부족해요 ㅠㅠ");
         }
      } else {
         System.out.println("잘못된 메뉴를 입력하셨습니다.");
      }
   }

}