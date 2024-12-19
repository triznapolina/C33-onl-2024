package lesson_7_oop_princinples_homework.doctors;

public class Clinicus extends Doctor {


    public Clinicus (String firstName, String lastName) {
        super(firstName, lastName);
    }


    @Override
    public void treatPerson () {
        System.out.println("Doctor: " + getFirstName() + " " + getLastName() + "\n------Clinicus------");
        System.out.println("I check the general state of health, prescribe treatment!\n");
    }


    public void assignDoctor(Patient patient) {

        if (patient.getCodeTreatmentPlan() == 1) {
            patient.setDoctor(new Surgeon("Denis", "Pitrushkov"));
        } else if (patient.getCodeTreatmentPlan() == 2) {
            patient.setDoctor(new Dentist("Nadezhda", "Fialkina"));
        } else {
            patient.setDoctor(this);
        }

        System.out.println("Patient: " + patient.getFirstName() + " " + patient.getLastName() +
                "\nThe treatment plan code: " + patient.getCodeTreatmentPlan());
        patient.getDoctor().treatPerson();
    }
}
