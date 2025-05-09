/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatraining;

/**
 *
 * @author Harry
 */
import java.util.Scanner;
public class JavaTraining {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keeprunning = true;
        
     while(keeprunning){
        System.out.printf("\n1.plus \n2.minus \n3.divide \n4.Multiplacation\n");
        System.out.println(" pick ur math operator: ");
        int input = scan.nextInt();
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        if (input == num1 ){
          System.out.println("write two numbers you want to add: ");
            int inputad1 = scan.nextInt();
            int inputad2 = scan.nextInt();
            int add = inputad1 + inputad2;
            System.out.println(add);
        }else if (input == num2){
            System.out.println("Write the number you want to subtract: ");
            int inputsub1 = scan.nextInt();
            int inputsub2 = scan.nextInt();
            int subtract = inputsub1- inputsub2;
            System.out.println(subtract);
        }else if (input == num3){
            System.out.println("Write the number you want to divide: ");
           int inputdiv1 = scan.nextInt();
           int inputdiv2 = scan.nextInt();
           int divide = inputdiv1 / inputdiv2;
           System.out.println(divide);
        }else if (input == num4){
            System.out.println("Write the number you want to Multiply: ");
           int inputmul1 = scan.nextInt();
           int inputmul2 = scan.nextInt();
           int multiply = inputmul1 * inputmul2;
            System.out.println(multiply);
        }else{
            System.out.println("You did not pick any of the number. ");
        }
                    System.out.print("Do you want to calculate again? (yes/no): ");
            String answer = scan.next();
            if (!answer.equalsIgnoreCase("yes")) {
                keeprunning = false;
                System.out.println("Calculator exited. Goodbye!");
            }

            System.out.println(); // Add a blank line for readability
        }

            scan.close();
}
}
