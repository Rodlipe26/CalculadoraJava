import java.util.Objects;
import java.util.Scanner;
import java.lang.String;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Double num1 = null, num2 = null;
        int cont1 = 0, cont2 = 0;
        Scanner input = new Scanner(System.in);

        boolean num1Valido = false, num2Valido = false, opValido = false;
        boolean opera = false;
        while (!num1Valido) {

            try {
                System.out.println("Digite o primeiro número:");
                num1 = input.nextDouble();
                num1Valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: você não digitou um número válido.");
                input.nextLine();
            }
        }

        while (!num2Valido) {
            try {
                System.out.println("Digite o segundo número:");
                num2 = input.nextDouble();
                num2Valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: você não digitou um número válido.");
                input.nextLine();
            }
        }
        String op1 = null;
        while(!opValido) {
            try {
            System.out.println("operador:");
            op1 = input.next();
            opValido = true;}catch (InputMismatchException e){
                System.out.println("você não digitou um operador matemático.");
            }

        }

        while (!opera) {
            if (Objects.equals(op1, "+")) {
                Double result = num1 + num2;
                System.out.println("Resultado:");
                System.out.println(result);
                opera = true;
            } else if (Objects.equals(op1, "-")) {
                Double result = num1 - num2;
                System.out.println("Resultado:");
                System.out.println(result);
                opera = true;
            } else if (Objects.equals(op1, "*")) {
                Double result = num1 * num2;
                System.out.println("Resultado:");
                System.out.println(result);
                opera = true;
            } else if (Objects.equals(op1, "/")) {
                Double result = num1 / num2;
                System.out.println("Resultado:");
                System.out.println(result);
                opera = true;
            } else {
                System.out.println("digite um dos simbolos: + , - , * , /!");
                op1 = input.next();
            }
        }
    }
}

