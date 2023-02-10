public class ValidarString {
    public String data;
    public ValidarString(String data) {
        this.data = data;
    }

    public void validaString() {
        boolean esNulo = data == null;
        boolean esVacio = data.length() == 0;
        boolean esVacio2 = data.isEmpty();
        //boolean esBlanco = data.isBlank(); //el metodo isBlank viene a partir del jdk 11

        if(esNulo) {
            System.out.println("El string  es nuelo");
        }

        if(esVacio ||  esVacio2) {
            System.out.println("El estring esta vacio");
        }

        if(!esNulo && !esVacio && !esVacio2) {
            System.out.println("El string tiene un dato");
        }


    } 



}
