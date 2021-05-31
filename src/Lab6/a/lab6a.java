package Lab6.a;

import Dependencies.Example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class lab6a {
    public static void main(String[] args) throws IOException {

        String path = "D:\\study\\proga\\JAVA\\Labs\\src\\Lab6\\a\\thePoem.txt";
        String fileContent = Files.readString(Path.of(path));
        System.out.println(fileContent);
        fileContent = replace(fileContent);
        System.out.println(fileContent);
    }

    public static String replace(String str) {
        System.out.print("Стороку, которую стоит заменить: ");
        String substring = Example.in.nextLine();
        if (!str.contains(substring)) {
            System.out.println("Данная подстрока не входит в строку");
        } else {
            System.out.print("На какую строку заменим: ");
            String tmp = Example.in.nextLine();
            str = str.replace(substring, tmp);
        }
        return str;
    }

}
