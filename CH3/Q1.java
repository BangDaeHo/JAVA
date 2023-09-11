package CH3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int number = in.nextInt();

        if (number % 2 == 0)
            System.out.println("2의 배수입니다");
        if (number % 3 == 0)
            System.out.println("3의 배수입니다");
        if (number % 5 == 0)
            System.out.println("5의 배수입니다");            
        
    }
}
