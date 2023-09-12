package CH4;

class Triangle{
    double height, weight;

    public Triangle(double h, double w){
        this.height = h;
        this.weight = w;
    }

    public double findArea(){
        return height * weight / 2;
    }
}

public class TriangleTest {
    public static void main(String[] args){
        Triangle t = new Triangle(10.0, 5.0); 
        System.out.println(t.findArea());
    }
}

