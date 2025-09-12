package _2025_09_06_DesignPattern._2025_09_11_0_FirstLesson;

public class User {
    //Fields(attributes)

    public String name;

    public User(String name, int age){
        this.name=name;
    }

    public void sayHello(){
        System.out.println("--Hello, my name is: "+ name);
    }

    // Methods

}
