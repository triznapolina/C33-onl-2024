package lesson_7_oop_princinples_homework.doctors;

public class Doctor {

    private String firstName;
    private String lastName;

    public Doctor (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return  lastName;
    }

    public void treatPerson () {
        System.out.println("I'm a doctor... My goal to treat person!");
    }
}
