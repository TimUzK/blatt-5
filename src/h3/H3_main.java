package h3;

public class H3_main {
    public static void main(String[] args) {
        int[][] einheiten = {
                { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 },
                new int[15]
        };

        int input = 102;

        for (int i = 0; i < einheiten[0].length; i++) {
            if (input >= einheiten[0][i]) {
                einheiten[1][i] = input / einheiten[0][i];
                input = input % einheiten[0][i];
            } else {
                einheiten[1][i] = 0;
            }
        }

    }
}
