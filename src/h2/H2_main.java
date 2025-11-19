package h2;

public class H2_main {
    public static void main(String[] args) {
        int n = 87124;
        int digits = 0;

        int a[] = new int[9];

        int tempN = n;

        if (n == 0) {
            digits = 1;
        }
        else {
            while (tempN > 0) {
                tempN /= 10;
                digits++;
            }
        }

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = n % 10;
            n /= 10;
        }

    }
}
