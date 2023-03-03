import java.util.Objects;
import java.util.Scanner;
import java.lang.String;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Double num1, num2;

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            num1 = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: você não digitou um número válido.");
            return;
        }

        try {
            System.out.println("Digite o segundo número:");
            num2 = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Erro: você não digitou um número válido.");
            return;
        }

        System.out.println("operador:");
        String op1 = input.next();

        if (Objects.equals(op1, "+")) {
            Double result = num1 + num2;
            System.out.println("Resultado:");
            System.out.println(result);
        } else if (Objects.equals(op1, "-")) {
            Double result = num1 - num2;
            System.out.println("Resultado:");
            System.out.println(result);
        } else if (Objects.equals(op1, "*")) {
            Double result = num1 * num2;
            System.out.println("Resultado:");
            System.out.println(result);
        } else if (Objects.equals(op1, "/")) {
            Double result = num1 / num2;
            System.out.println("Resultado:");
            System.out.println(result);
        } else {
            System.out.println("digite um dos simbolos: + , - , * , /!");
        }
    }
}

