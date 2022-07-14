package com.fasttrack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PathTofile {
    private static int StudentGrade;

    public static void main(String[] args) throws IOException {
        StudentGrade studentGrade = new StudentGrade("Alex", "Computer Science", 5);

        System.out.println(studentGrade.getName());
        System.out.println(studentGrade.getDiscipline());
        System.out.println(studentGrade.getGrade());

        BufferedWriter writer=new BufferedWriter(new FileWriter("Files/StudenGrade.txt"));
        writer.write("Alex");
        writer.newLine();
        writer.write("Mihai");
        writer.newLine();
        writer.write("George");
        writer.newLine();
        writer.flush();

    }
}
