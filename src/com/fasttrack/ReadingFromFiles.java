package com.fasttrack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFromFiles {
    public static void main(String[] args) throws IOException {
        List<StudentGrade> studentGrades = new ArrayList<>();

        for(StudentGrade studentGrade : studentGrades) {
            System.out.println(studentGrade.getName());
            System.out.println(studentGrade.getDiscipline());
            System.out.println(studentGrade.getGrade());

        }
        readFullFile();
        readStudentGrade();

    }
    public static void readFullFile() throws FileNotFoundException {
        System.out.println("--Reading whole files: ");
        Scanner scanner = new Scanner(new File("files", "grades.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
    public static void readStudentGrade() throws FileNotFoundException {
        System.out.println("--Reading whole files StudentGrade: ");
        Scanner scanner = new Scanner(new File("files", "StudenGrade.txt"));
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());

        }


    }








}
