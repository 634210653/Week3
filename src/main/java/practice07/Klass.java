package practice07;

public class Klass {

    private  int number;

    public Klass(int num){
        this.number = num;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return  String.format("Class %d", number);
    }
}
