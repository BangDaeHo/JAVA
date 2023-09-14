package CH8;

class Student{
    String name;

    public Student(String name){
        this.name = name;
    }

    public String toString(){
        return "학생[" + this.name + "]";
    }
}

public class Q2 {
    public static void main(String[] args){
        System.out.println(new Student("김삿갓"));
        System.out.println(new Student("홍길동"));
    }
}
