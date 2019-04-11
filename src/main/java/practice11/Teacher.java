package practice11;

import java.util.LinkedList;

public class Teacher extends  Person{

    private LinkedList<Klass> classes ;

    public void initTeacherInClass(){

        if(classes == null) return;

        for(Klass c : classes){
            c.addTeachers(this);
        }
    }
    public  Teacher(int id, String name, int age,LinkedList classes){
        super(id,name,age);
        this.classes = classes;
        initTeacherInClass();
    }

    public  Teacher(int id, String name, int age){
        this(id,name,age,null);

    }

    //use stream to map a class name
    public  String  getClassesName(){
        return "Class "+ classes.stream().map(practice07.Klass::getNumber).map(String::valueOf).reduce((a,b)-> a+", "+b).get();
    }

    //tell leader
    public void  say(String sentences){
        System.out.print(sentences);
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
