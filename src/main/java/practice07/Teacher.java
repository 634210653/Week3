package practice07;

public class Teacher extends Person{

    private Klass klass = null;

    public Teacher(String name, int age){
        super(name,age);
    }

    public Teacher(String name,int age, Klass klass){

        super(name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if(klass == null)
            return String.format("%s I am a Teacher. I teach No Class.",super.introduce());
        return String.format("%s I am a Teacher. I teach %s.",super.introduce(),this.klass.getDisplayName());
    }

    public  String introduceWith(Student stu){
        if(klass.getNumber() == stu.getKlass().getNumber())
            return String.format("%s I am a Teacher. I teach %s.",super.introduce(),stu.getName());
        else
            return String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),stu.getName());
    }
}
