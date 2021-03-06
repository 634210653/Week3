package practice10;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends  Person{

    private LinkedList<Klass> classes ;

    public  Teacher(int id, String name, int age,LinkedList classes){
        super(id,name,age);
        this.classes = classes;
    }

    public  Teacher(int id, String name, int age){
        this(id,name,age,null);

    }

    //use stream to map a class name
    public  String  getClassesName(){
        return "Class "+ classes.stream().map(practice07.Klass::getNumber).map(String::valueOf).reduce((a,b)-> a+", "+b).get();
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student stu){

        if(classes == null)
            return  false;

        if(classes.contains(stu.getKlass()))
            return  true;

        return  false;
    }


    @Override
    public String introduce() {

        if(classes == null || classes.size()==0)
            return String.format("%s I am a Teacher. I teach No Class.",super.introduce());

        return String.format("%s I am a Teacher. I teach %s.",super.introduce(), getClassesName());
    }

    public  String introduceWith(Student stu){

        if(classes != null && classes.contains(stu.getKlass()))
            return String.format("%s I am a Teacher. I teach %s.",super.introduce(),stu.getName());
        else
            return String.format("%s I am a Teacher. I don't teach %s.",super.introduce(),stu.getName());
    }
}
