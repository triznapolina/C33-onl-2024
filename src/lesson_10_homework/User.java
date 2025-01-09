package lesson_10_homework;

import java.util.Objects;

public class User implements Cloneable {

    private int idUser ;
    private String username;
    private String password;

    public User(int idUser , String username, String password) {
        this.password = password;
        this.idUser  = idUser ;
        this.username = username;
    }

    public int getIdUser () {
        return idUser ;
    }

    @Override
    public String toString() {
        return "idUser =" + idUser  +
                "\n\t\tusername='" + username + '\'' +
                "\n\t\tpassword='" + password + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User ) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser , username, password);
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User deepClone() {
        return new User(this.idUser , this.username, this.password);
    }

}
