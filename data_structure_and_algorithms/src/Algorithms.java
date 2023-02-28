public class Algorithms {

    public void InsertSort() {
        int[] arr = { 5, 3, 4, 8, 7, 5, 1, 2, 3 };
        for(int elem:arr) System.out.print(elem + " ");
 
        for (int j = 1; j < arr.length; j++) {
            int current = arr[j];

            int i = j - 1;
            while (i >= 0 && arr[i] > current) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = current;
        }
        System.out.println("");
        for(int elem:arr) {
            System.out.print(elem + " ");
        }
    }
}
