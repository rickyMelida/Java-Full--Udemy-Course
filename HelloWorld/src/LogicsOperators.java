public class LogicsOperators {
    private String myData;

    public LogicsOperators(String myData) {
        this.myData = myData;
    }

    public void BasicOperator() {
        int i=3;
        byte j=3;
        float k=127e-7f;
        double l = 2.1413e3;
        boolean m =false;

        //Evalua primero el and
        boolean b = i == j || k < l && m == true;

        System.out.println(b);
    }
}
