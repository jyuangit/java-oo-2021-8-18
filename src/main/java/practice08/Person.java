package practice08;

public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !getClass().equals(o.getClass())) {
            return false;
        }

        Person person = (Person) o;
        return id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", this.name, this.age);
    }
}
