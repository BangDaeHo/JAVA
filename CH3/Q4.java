package CH3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int number = in.nextInt();

        if((number%4 == 0 && number%100 != 0) || number%400 == 0)
            System.out.println("윤년입니다.");
        else
            System.out.println("평년입니다.");
    }
}
