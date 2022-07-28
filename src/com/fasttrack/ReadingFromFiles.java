package com.fasttrack;

import javax.xml.namespace.QName;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ReadingFromFiles {
    public static List<StudentGrade> readFileBuffered(String filePath) throws IOException {
        List<StudentGrade> studentGradeList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line;
        while( (line=bufferedReader.readLine())!=null){
            studentGradeList.add(fromLine(line));
        }
        return studentGradeList;
    }

    private static StudentGrade fromLine(String line){
        String [] tokens = line.split((Pattern.quote("|")));


        return new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
    }





       /* List<StudentGrade> studentGrades = new ArrayList<>(10);
        studentGrades.add(new StudentGrade("Alex","Matematica",7));
        studentGrades.add(new StudentGrade("Mihai","Romana",6));
        studentGrades.add(new StudentGrade("George","Italiana",5));

        System.out.println(studentGrades);


       /* for(StudentGrade studentGrade : studentGrades) {

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

    }*/


}
