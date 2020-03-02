package objectOriented;

/**
 * @author ：wangjianfeng
 * @date ：Created in 2020-02-10 19:01
 */

class Person {
    protected String name = "wang";
    protected int age = 20;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void run(){
        System.out.println("weqnaewnga--------");
    }
}

class Student extends Person {
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public void run(){
        System.out.println("caicai ......");
    }
}

public class method {
    public static void main(String[] args) {
        Person ming = new Person("ming", 23);
        System.out.println(ming.getAge());
        Person wang = new Person();
        System.out.println(wang.getName());
        Student student = new Student(39);
        System.out.println(student.getAge());
        System.out.println(student.getName());
        System.out.println(student.getScore());

    }

}
