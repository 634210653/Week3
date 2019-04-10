package practice08;

public class Klass extends practice07.Klass {

    private  Student leader;

    public Klass(int num){
        super(num);
    }

    public int getNumber() {
        return super.getNumber();
    }
    public  void assignLeader(Student stu){
        leader = stu;
    }

    public Student getLeader() {
        return leader;
    }
}
