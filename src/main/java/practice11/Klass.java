package practice11;

import java.util.HashSet;

public class Klass extends practice07.Klass {

    private HashSet<Student> students = new HashSet<Student>();
    private Student leader = null;
    private int number;
    private HashSet<Teacher> teachers = new HashSet<Teacher>();

    public Klass(int num) {
        super(num);
    }

    public void appendMember(Student stu) {

        students.add(stu);
        for(Teacher t: teachers){
            System.out.print(String.format("I am %s. I know %s has joined %s.\n",t.getName(), stu.getName(),getDisplayName()));
        }
    }

    public void assignLeader(Student stu) {
        if (students.contains(stu)) {

            leader = stu;
            for(Teacher t: teachers){
                System.out.print(String.format("I am %s. I know %s become Leader of %s.\n",t.getName(), stu.getName(),getDisplayName()));
            }

        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void addTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }
}

