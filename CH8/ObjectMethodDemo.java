package CH8;

public class ObjectMethodDemo {
    public static void main(String[] args){
        Mouse m1 = new Mouse("Logiteh");
        Mouse m2 = new Mouse("Logiteh");
        Mouse m3 = m1;
        KeyBoard k1 = new KeyBoard("Microsoft");
        KeyBoard k2 = new KeyBoard("Microsoft");

        System.out.println(m1.toString());
        System.out.println(m1);

        System.out.println(k1.toString());
        System.out.println(k1);

        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(k1.equaks(k2));

    }
}
