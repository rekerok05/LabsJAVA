package Lab6.c;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class lab6с {
    public static void main(String[] args) throws IOException {
        try {
            String path = "D:\\study\\proga\\JAVA\\Labs\\src\\Lab6\\c\\Example.java";
            String fileContent = Files.readString(Path.of(path));
            fileContent.replace("public", "private");
            System.out.println(fileContent);
            //PrintWriter writer = new PrintWriter("D:\\study\\proga\\JAVA\\Labs\\src\\Lab6\\c\\text.txt", "UTF-8");
            //writer.println(fileContent);
            //writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
