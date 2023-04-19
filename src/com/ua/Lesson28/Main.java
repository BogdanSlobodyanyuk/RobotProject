package src.com.ua.Lesson28;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "This is an example of writing to a file.";
        String path = "src/com/ua/Lesson28/";
        createFile(fileName,path);
        writeToFile(fileName, content, path);
        System.out.println( readFromFile(fileName,path));
    }

    public static void writeToFile(String fileName, String content, String path) {
        try {
            Files.write(Path.of(path).resolve(fileName), content.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFromFile(String fileName, String path) {
        List <String> result2;
        try {
            result2 = Files.readAllLines(Path.of(path + fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result2.toString();
    }


    public static void createFile (String fileName,String path){
        try {
            Files.createFile(Path.of(path).resolve(fileName));
        } catch (IOException e){
            throw new RuntimeException();
        }
    }
}

