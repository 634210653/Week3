package common;

public class Person {
    /**
     * Person's name
     */
    private String name;
    /***
     * Person's age
     */
    private int age;

    public  Person(String name, int age){

        this.name = name;
        this.age = age;
    }
    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return  String.format("My name is %s. I am %d years old.",this.name,this.age);

    }
}
