package practice08;

public class Teacher extends Person{

    private Klass klass = null;

    public Teacher(String name,int age, Klass klass){

        super(name,age);
        this.klass = klass;
    }
}
