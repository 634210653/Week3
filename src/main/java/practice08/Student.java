package practice08;

public class Student extends Person{

    private Klass klass = null;

    public Student(int id,String name,int age, Klass klass){

        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {

        if(klass.getLeader() != this) {

            return String.format("%s I am a Student. I am at %s.", super.introduce(), this.klass.getDisplayName());

        }else{

            return String.format("%s I am a Student. I am Leader of %s.", super.introduce(), this.klass.getDisplayName());

        }

    }
}
