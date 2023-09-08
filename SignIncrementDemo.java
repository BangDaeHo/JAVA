public class SignIncrementDemo {
    public static void main(String[] args){
        int plusOne = 1;
        int minusOne = -plusOne;
        System.out.println("plusOne은 " + plusOne + "입니다.");
        System.out.println("minusOne은 " + minusOne + "입니다.");

        int x = 1, y = 1;
        System.out.println("x = " + x + ", ++x = " + ++x);
        System.out.println("y = " + y + ", y++ = " + y++);
        System.out.println("x = " + x + ", y = " + y);

        /*
        안좋은 코드
        int a = 1, b = 0;
        System.out.println("b = " + ++a + a++);    
        System.out.println("a = " + a + ", b = " + b);

        a = 1;
        b = 0;
        System.out.println("b = " + a++ + ++a);
        System.out.println("a = " + a + ", b = " + b);
         */
    }
}
