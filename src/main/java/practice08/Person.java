package practice08;

public class Person extends common.Person {

    public  final int id ;

    public Person(int id, String name, int age) {
        super(name, age);
        this.id = id;
    }

    @Override
    public boolean equals(Object person) {
        return  id == ((Person)person).id;
    }
}

