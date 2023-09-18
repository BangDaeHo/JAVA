package CH11;

import java.util.*;

public class PerformanceDemo {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        long start = System.nanoTime();
        for(int i = 0 ; i < 10000 ; i ++)
            al.add(0, i);
        long end = System.nanoTime();
        long duration = end - start;
        System.out.println("ArrayList로 처리한 시간" + duration);

        start = System.nanoTime();
        for(int i = 0 ; i < 10000 ; i ++)
            ll.add(0, i);
        end = System.nanoTime();
        duration = end - start;
        System.out.println("LinkedList로 처리한 시간" + duration);
        
    }
}
