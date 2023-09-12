package CH4;

class Preson{
    String name;
    int age;

    public Preson setName(String name){
        this.name = name;
        return this;
    }

    public Preson setAge(int age){
        this.age = age;
        return this;
    }

    public void sayHello(){
        System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야.");
    }
}

public class MethodChainDemo {
    public static void main(String[] args){
        Preson person = new Preson();
        person.setName("민국").setAge(21).sayHello();
    }
}
