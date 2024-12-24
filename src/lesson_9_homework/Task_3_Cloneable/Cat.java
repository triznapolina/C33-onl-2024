package lesson_9_homework.Task_3_Cloneable;

public class Cat implements Cloneable{

    private String nickName;
    private String breedType;
    private int age;


    public Cat (String nickName, String breedType, int age) {
        this.nickName = nickName;
        this.breedType = breedType;
        this.age = age;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    // causes cloning of the parent object, try - catch for exception handling CloneNotSupportedException
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning is not supported", e);
        }
    }


    @Override
    public String toString() {
        return "Cat: " +
                "\nnickName='" + nickName + '\'' +
                "\nbreedType='" + breedType + '\'' +
                "\nage=" + age;
    }
}
