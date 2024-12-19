package lesson_7_oop_princinples_homework.doctors;

public class Patient {

    private String firstName;
    private String lastName;
    private int CodeTreatmentPlan;

    private Doctor doctor;

    public Patient(String firstName, String lastName, int CodeTreatmentPlan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CodeTreatmentPlan = CodeTreatmentPlan;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCodeTreatmentPlan() {
        return CodeTreatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}



