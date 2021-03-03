package Lab2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class lab2a {
    public static void main(String[] args) {
        System.out.println("name is " + System.getProperty("user.name"));
        System.out.println("Creation date: "
                + dateFile("D:\\study\\proga\\JAVA\\Labs\\src\\Lab2\\lab2docs.docx"));
        System.out.println("Now " + dateNow());

    }
    /** Fuction create file with tasks */
    public static FileTime dateFile(String pathFile) {
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

    /** Function give date and time NOW */
    public static String dateNow() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd - HH:mm:ss");
        return simpleDateFormat.format(calendar.getTime());
    }
}
