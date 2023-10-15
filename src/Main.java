import exercitiul1.Person;
import exercitiul1.Staff;
import exercitiul1.Student;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Victor", "Zorile 5");
        System.out.println(person);

        Student student = new Student("Ion", "Bulgara 35", "Program1",2002, 12);
        System.out.println(student);

        Staff staff = new Staff("Radu","Tighina 2","Mircea Eliade",12);
        System.out.println(staff);
    }
}