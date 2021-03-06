package practice02;

public class Student extends Person {
    private Integer klass;

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }

    public Student(String name, Integer age, Integer klass) {

        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return String.format("I am a Student. I am at Class %d.",this.klass );
    }

}