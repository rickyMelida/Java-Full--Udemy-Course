public class AnalisisAlgoritmo {
    public String data;

    public AnalisisAlgoritmo(String data) {
        this.data = data;
    }

    // O(n) + O(n^2) => O(n^2)
    public void Algoritmo1() {
        String[][] dataEjemplo = new String[5][5];

        // O(n)
        for (int h = 0; h < this.data.length(); h++) {
            System.out.println("Primer For");
        }

        // O(n^2)
        for (int i = 0; i < this.data.length(); i++) {
            for (int j = 0; j < this.data.length(); j++) {
                dataEjemplo[i][j] = "" + i * j;
            }
        }
    }

    public boolean Algoritmo2() {
        if (!this.data.isEmpty()) {
            return true;
        }
        return false;

    }

}