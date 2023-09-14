package CH8;

class Circle{
    int radius;
    public Circle(int n){
        this.radius = n;
    }

    public boolean equals(Circle c){
        return this.sameTest(c);
    }

    public boolean sameTest(Circle c){
        return this.radius == c.radius;
    }
}

public class Q1 {
    public static void main(String[] args){
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(3);

        if(c1.equals(c2))
            System.out.println("c1과 c2는 같다.");
        else
            System.out.println("c1과 c2는 다르다.");

    }
}
