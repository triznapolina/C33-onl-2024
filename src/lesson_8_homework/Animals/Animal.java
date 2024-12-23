package lesson_8_homework.Animals;

public class Animal {

    private String familyRang;  // animal's families, f.e feline family (cats)
    private String typeName;    // type of animal, f.e cat, dog
    private String nickName;   // name of animal, f.e Sharik
    private int age;


    public Animal (String familyRang, String typeName, String nickName, int age) {
        this.familyRang = familyRang;
        this.typeName = typeName;
        this.nickName = nickName;
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void eat() {};
    public void voice() {};

    @Override
    public String toString() {
        return "Animal: \nfamilyRang='" + familyRang + '\'' +
                ", \ntypeName='" + typeName + '\'' +
                ", \nnickName='" + nickName + '\'' +
                ", \nage=" + age;
    }


}
