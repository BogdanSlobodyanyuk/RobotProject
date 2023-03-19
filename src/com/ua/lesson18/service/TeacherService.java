package src.com.ua.lesson18.service;

import src.com.ua.lesson18.domain.Student;
import src.com.ua.lesson18.repository.NumbersCollections;
import src.com.ua.lesson18.repository.StudentsCollections;

import java.util.List;
import java.util.Scanner;

public class TeacherService {

    public List<Integer> getSmallCollectionOfNumbers() {

        NumbersCollections.fillNumbersInSmallCollection();

        return NumbersCollections.getSmallCollection();
    }

    public List<Integer> getBigCollectionOfNumbers() {

        NumbersCollections.fillNumbersInBigCollection();

        return NumbersCollections.getBigCollection();
    }

    public List<Student> getCollectionOfStudents() {

        System.out.println("Write please hom many students you would like to see in your collection");
        Scanner scanner = new Scanner(System.in);
        int quantityOfStudents = scanner.nextInt();

        StudentsCollections.fillStudentsInCollectionOfStudents(quantityOfStudents);

        return StudentsCollections.getStudents();
    }


    public void printSmallCollectionOfNumbers() {
        System.out.println(getSmallCollectionOfNumbers());
    }

    public void printBigCollectionOfNumbers() {
        System.out.println(getBigCollectionOfNumbers());
    }

    public void printStudentsCollection() {
        System.out.println(getCollectionOfStudents());
    }


}
