package lessons1;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Denni on 11.07.2016.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("D:\\progects/OOP/main/FileDirectory/text.txt");// якщо з true то файл дозаписується
        for (int i = 0; i <1000 ; i++) {
            writer.write("Hello word");
            writer.write(System.lineSeparator());

        }
//        writer.flush();
//        writer.close();
//        writer.write("c");// уже не можна використовувати, оскільки поток записі закритий методом close




    }
}
