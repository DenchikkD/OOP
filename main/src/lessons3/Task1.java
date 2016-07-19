package lessons3;

/**
 * Created by Denni on 18.07.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {5, 5, 9, 1, 3, 8, 9, 4, 3,};
        bibbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

        }
    }

    public static void bibbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                   int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }


}
