public class Main {
    public static void main(String[] args) {
        int arr[] = {23, 43254, 1, 2, 3, 3, 36};
        sort(arr);
    }

    static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int imin = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    imin = j;
                }
            }
            if (i != imin) {
                int temp = a[i];
                a[i] = a[imin];
                a[imin] = temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
