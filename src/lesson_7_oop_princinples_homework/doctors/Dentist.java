package lesson_7_oop_princinples_homework.doctors;

public class Dentist extends Doctor{

    public Dentist (String firstName, String lastName) {
        super(firstName, lastName);
    }
    @Override
    public void treatPerson () {
        System.out.println("Doctor: " + getFirstName() + " " + getLastName() + "\n------Dentist------");
        System.out.println("I'm looking after the condition of your teeth!\n");
    }
}
