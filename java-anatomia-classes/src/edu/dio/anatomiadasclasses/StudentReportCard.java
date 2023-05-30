package edu.dio.anatomiadasclasses;
public class StudentReportCard {
    public static void main(String[] args){
        int finalAverage = 7;
        if (finalAverage<6){
            System.out.println("REPROVADO");
        }
        else if (finalAverage == 6){
            System.out.println("PROVA MINERVA");
        }
        else{
            System.out.println("APROVADO");
        }
    }
}
