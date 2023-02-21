public class LogicOperatorLogin {

    private String name = "Ricardo";
    private String password = "123456";
    private Boolean isAuth = false;

    public String SigIn(String name, String password) {
        if (this.name.equals(name) && this.password.equals(password)) {
            this.isAuth = true;
        } else {
            return "Usuario o contraseña incorrecta";
        }

        if (isAuth) {
            return "Bienvenido ".concat(name).concat("!");
        } else {
            return "Lo siento, debe de autenticarse!:(";
        }

    }

}
