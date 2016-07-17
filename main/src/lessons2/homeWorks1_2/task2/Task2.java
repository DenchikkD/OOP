package lessons2.homeWorks1_2.task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Ilirenon 17.07.2016.
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("D:\\progects/OOP/main/FileDirectory/array.txt");
        Scanner scanner = new Scanner(reader);
        String str = "";
        int td = scanner.nextLine().length();
        int tr = 0;
        while (scanner.hasNextLine()) {
            str += scanner.nextLine();
            str += ";";
            tr++;
        }
        String[] s = str.split(";");
        String[] trs;
//        for (int i = 0; i < s.length; i++) {
            trs = s[0].split(" ");

            System.out.println(trs.length);
        for (int i = 0; i <trs.length ; i++) {
            System.out.print(trs[i]);

        }
            System.out.println();

//        }


        System.out.println(s[0]);
    }
}
