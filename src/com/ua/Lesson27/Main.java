package src.com.ua.Lesson27;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "This is an example of writing to a file.";
        String path = "src/com/ua/Lesson27/";
        writeToFile(path + fileName, content);
        System.out.println(readFromFile(path + fileName));

     //   optionalTask("src/com/ua/Lesson27/" + fileName);

    }

    public static void writeToFile(String fileName, String content) {
        try (OutputStream os = new FileOutputStream(fileName); OutputStreamWriter osw = new OutputStreamWriter(os)) {
            osw.append(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//        public static void writeToFile(String fileName, String content) {
//            try {
//                FileWriter fileWriter = new FileWriter(fileName);
//                fileWriter.write(content);
//                fileWriter.close();
//                System.out.println("Successfully wrote to the file.");
//            } catch (IOException e) {
//                System.out.println("An error occurred while writing to the file.");
//                e.printStackTrace();
//            }
//        }


    public static String readFromFile(String fileName) {
        String dataString;
        try (InputStream is = new FileInputStream(fileName)) {
            byte[] data = is.readAllBytes();
            dataString = new String(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return dataString;
    }


//        public static void readFromFile(String fileName) {
//            try {
//                File file = new File("src/Lesson27" + fileName);
//                BufferedReader reader = new BufferedReader(new FileReader(file));
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    System.out.println(line);
//                }
//                reader.close();
//            } catch (IOException e) {
//                System.out.println("An error occurred while reading from the file.");
//                e.printStackTrace();
//            }
//        }



    public static void optionalTask(String fileName) {

        Student s1 = new Student("Bon", 343, "Trepa");
        Student s2 = new Student("Kon", 4345, "Kino");
        Student s3 = new Student("Fifo", 676, "Pola");
        Student s4 = new Student("Defo", 343, "Lanker");
        Student s5 = new Student("Kana", 222, "Sota");

        List<Student> l1 = List.of(s1, s2, s3, s4, s5);

        try (OutputStream os = new FileOutputStream(fileName); ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(l1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream is = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(is)) {
            List<Student> s = (List<Student>) ois.readObject();
            System.out.println(s);
            s.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

