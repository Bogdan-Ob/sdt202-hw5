package Part2;

public class Shell {

    public static void sort(Comparable[] a) {
        int N = a.length;

        int count = 0;
        int h = 1;
        while (h < N / 3) {
            count++;
            h = 3 * h + 1;
        }
        if (count == 0) {
            count = 1;
        }

        int[] increments = new int[count];
        h = 1;
        for (int i = 0; i < count; i++) {
            increments[i] = h;
            h = 3 * h + 1;
        }

        for (int k = increments.length - 1; k >= 0; k--) {
            int gap = increments[k];

            for (int i = gap; i < N; i++) {
                for (int j = i; j >= gap && less(a[j], a[j - gap]); j -= gap) {
                    exch(a, j, j - gap);
                }
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void show(Comparable[] a) {
        for (Comparable item : a) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}