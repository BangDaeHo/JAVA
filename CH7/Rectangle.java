package CH7;

class Rectangle extends Shape{
    int height;
    int weight;

    public Rectangle(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    public void draw(){
        System.out.println("사각형을 그리다.");
    }

    public double findArea(){
        return height * weight;
    }
}
