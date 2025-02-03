package lesson_13_homework.task1;

public class Authorization {

    private String login;
    private String password;
    private String confirmPassword;

    public Authorization (String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public static boolean logInSystem(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        String loginError = "";
        String passwordError = "";

        if (login.length() >= 20 || login.contains(" ")) {
            loginError = "The username must be less than 20 characters long and contain no spaces.";
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            passwordError = "The password must be less than 20 characters, " +
                    "contain no spaces, and include at least one digit.";
        }

        if (!password.equals(confirmPassword)) {
            passwordError += "The passwords don't match.";
        }

        if (!loginError.isEmpty() || !passwordError.isEmpty()) {
            StringBuilder errorMessage = new StringBuilder();
            if (!loginError.isEmpty()) {
                errorMessage.append(loginError);
            }
            if (!passwordError.isEmpty()) {
                errorMessage.append("\nWrongPasswordException: ").append(passwordError);
            }
            throw new WrongLoginException(errorMessage.toString());
        }

        return true;
    }


    @Override
    public String toString() {
        return "----User details---" +
                "\nlogin: " + login +
                "\npassword: " + password +
                "\nconfirmPassword: " + confirmPassword;
    }
}
