package practice08;

public class Student extends Person{

    private Klass klass = null;

    public Student(String name,int age, Klass klass){

        super(name,age);
        this.klass = klass;
   }
}
