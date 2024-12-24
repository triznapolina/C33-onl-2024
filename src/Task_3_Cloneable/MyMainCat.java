package Task_3_Cloneable;

public class MyMainCat {

    public static void main(String[] args) {

        Cat cat = new Cat("Asya", "British Shorthair", 5);
        Cat cloneCat = (Cat) cat.clone(); // clone cat
        cloneCat.setNickName("Malpa"); // set new nickname
        System.out.println(cat);
        System.out.println("----------------");
        System.out.println(cloneCat);
    }

}
