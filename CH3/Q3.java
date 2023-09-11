package CH3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("사과의 개수를 입력하세요: ");
        int number = in.nextInt();

        if(number%10 == 0)
            System.out.printf("필요한 바구니의 개수는 %d개 입니다", number/10);        
        else
            System.out.printf("필요한 바구니의 개수는 %d개 입니다", number/10 + 1);     

    }
}
