package CH4;

class Triangle2{
    double height, weight;

    public Triangle2(double h, double w){
        this.height = h;
        this.weight = w;
    }

    public double findArea(){
        return height * weight / 2;
    }

    public String isSameArea(Triangle2 t){
        if (this.findArea() == t.findArea()){
            return "같습니다.";
        }
        else{
            return "다릅니다";
        }
    }
}

public class TriangleTest2{
    public static void main(String[] args){
        Triangle2 t1 = new Triangle2(10.0, 5.0); 
        Triangle2 t2 = new Triangle2(5.0, 10.0); 
        Triangle2 t3 = new Triangle2(8.0, 8.0);
        
        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}

