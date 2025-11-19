package h1;
public class H1_main {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};
        int storage;

        
        for (int i = 1; i <= myArray.length / 2; i++) {
            storage = myArray[i-1];
            myArray[i-1] = myArray[myArray.length - i];
            myArray[myArray.length - i] = storage;
        }

    }
}