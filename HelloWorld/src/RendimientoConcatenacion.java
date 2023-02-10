public class RendimientoConcatenacion {
    private String a;
    private String b;
    private String c;

    public RendimientoConcatenacion(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void Rendimiento() {
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            // c = c.concat(a).concat(b).concat("\n"); //2ms
            // c += a + b + "\n"; //1
            sb.append(b).append(b).append("\n"); // 0
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
