import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);//Initializes scanner for the system inputs

        double firstOperand = 0;//
        double secondOperand = 0;
        double resultCalc = 0;
        int userInput;

        System.out.println("Enter first operand: ");
        firstOperand = scnr.nextDouble();

        System.out.println("Enter second operand: ");
        secondOperand = scnr.nextDouble();

        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println();
        System.out.println("Which operation do you want to perform? ");
        userInput = scnr.nextInt();

                if (userInput == 1) {

                resultCalc = firstOperand + secondOperand;

                }
                else if (userInput == 2) {

                resultCalc = firstOperand - secondOperand;
                }
                else if (userInput == 3) {

                    resultCalc = firstOperand * secondOperand;//The first variable will be multiplied by the second variable
                }
                else if (userInput == 4) {

                    resultCalc = firstOperand / secondOperand;// The first variable will be divided by the second variable
                }
                else {

                    System.out.println("Error: Invalid selection! Terminating program.");
                    System.exit(0);

                }

                System.out.println("The result of the operation is " + resultCalc + ". Goodbye!");

            }

        }