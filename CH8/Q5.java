package CH8;

public class Q5 {
    public static void main(String[] args){
        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
        //show(new Date());
    }

    public static void show(Object obj){
        if(obj instanceof String || obj instanceof StringBuilder || obj instanceof StringBuffer){
            System.out.println(obj);
        }
    }
}
