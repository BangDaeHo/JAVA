package CH8;

import java.util.Random;

class Dice{

    int roll(){
        return new Random().nextInt(6) + 1;
    }


}

public class Q4 {
    public static void main(String[] args){
        System.out.println(new Dice().roll());
    }
}
