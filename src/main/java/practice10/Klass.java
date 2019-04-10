package practice10;

import java.util.HashSet;

public class Klass extends practice07.Klass {

    private HashSet<Student> students = new HashSet<Student>();
    private  Student leader = null;
    private int number;

    public Klass(int num){
        super(num);
    }

    public void appendMember(Student stu){
        students.add(stu);
    }

    public void assignLeader(Student stu) {
        if(students.contains(stu)){
            leader = stu;
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

}
