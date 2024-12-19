package lesson_7_oop_princinples_homework.doctors;

public class Surgeon extends Doctor{

    public Surgeon (String firstName, String lastName) {
        super(firstName, lastName);
    }


    @Override
    public void treatPerson () {
        System.out.println("Doctor: " + getFirstName() + " " + getLastName() + "\n------Surgeon------");
        System.out.println("I perform the most difficult operations to cure complex injuries!\n");
    }
}
