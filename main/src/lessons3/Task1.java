package lessons3;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Denni on 18.07.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        bibbleSort(array);
        selection(array);


    }

    public static void bibbleSort(int[] array) {
        boolean hasChange = true;

        for (int i = 0; hasChange; i++) {
            hasChange = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array,j+1,j);
//                    int tmp = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = tmp;
                    hasChange = true;
                }
            }


            System.out.println(Arrays.toString(array));
        }
    }

    public static void selection(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int minIdx=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    minIdx = j;
                }
            }
            swap(array,i,minIdx);
//           int tmp = array[i];
//            array[i] = array[minIdx];
//            array[minIdx] = tmp;

            System.out.println(Arrays.toString(array));
        }
    }
    public static void swap(int[]array, int i, int j){

        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;

    }

}
