package Lab2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class lab2a {
    public static void main(String[] args) {
        System.out.println("name is " + System.getProperty("user.name"));
        System.out.println("Creation date: + " + date("D:\\study\\proga\\JAVA\\Labs\\src\\Lab2\\lab2docs.docx"));

    }
    public static FileTime date(String pathFile){
        Path path = Paths.get(pathFile);
        try {
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
            return attr.creationTime();
            //System.out.println("Last access date: " + attr.lastAccessTime());
            //System.out.println("Last modified date: " + attr.lastModifiedTime());
        } catch (IOException e) {
            System.out.println("oops error! " + e.getMessage());
            BasicFileAttributes attr;
        }
        return null;
    }
}
