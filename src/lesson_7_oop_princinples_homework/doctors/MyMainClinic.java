package lesson_7_oop_princinples_homework.doctors;

public class MyMainClinic {

    // Task. Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
    //хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
    //по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
    //«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
    //терапевта создать метод, который будет назначать врача пациенту согласно плану
    //лечения:
    //Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
    //Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
    //Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
    //лечить.
    public static void main(String[] args) {

        Clinicus therapist = new Clinicus("Marina", "Leonova");

        Patient patient1 = new Patient("Polina","Ivanova",2);
        therapist.assignDoctor(patient1);

        Patient patient2 = new Patient("Ivan","Petrov",1);
        therapist.assignDoctor(patient2);

        Patient patient3 = new Patient("Alexander","Pirogi",25);
        therapist.assignDoctor(patient3);




    }
}
