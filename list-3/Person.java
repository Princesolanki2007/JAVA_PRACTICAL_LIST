public class Person 
{
    private String name;
    private int age;
public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        return "Person  : " +
                "name='" + name + '\'' +
                ", age=" + age ;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Prince", 17);
        System.out.println(person1.toString());
 
    }
}
