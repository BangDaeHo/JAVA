package CH5;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("문자를 입력해주세요 : ");
        String s = in.nextLine();
        
        for(int i = s.length() ; i > 0 ; i--){
            //거꾸로 된 문자열을 저장하려면 스트링빌더를 이용, 스트링빌더가 없는 경우는 상당히 어려움

            System.out.print(s.charAt(i - 1));
        }

        in.close();
    }
}
