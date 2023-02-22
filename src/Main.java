import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int operationIndex = 0;

        do {

            System.out.print("Captura Operacion: ");
            String operacion = sc.nextLine();


            if (operacion.equals("SUMA") || operacion.equals("RESTA") ||operacion.equals("MULTIPLICACION") || operacion.equals("DIVISION")){
                System.out.print("Operando 1: ");
                Integer operandoIzquierdo = sc.nextInt();

                System.out.print("Operando 2: ");
                Integer operandoDerecho = sc.nextInt();

                switch (operacion) {
                    case "SUMA" ->
                            System.out.println(operandoIzquierdo + " + " + operandoDerecho + " = " + (operandoIzquierdo + operandoDerecho));
                    case "RESTA" ->
                            System.out.println(operandoIzquierdo + " - " + operandoDerecho + " = " + (operandoIzquierdo - operandoDerecho));
                    case "MULTIPLICACION" ->
                            System.out.println(operandoIzquierdo + " * " + operandoDerecho + " = " + (operandoIzquierdo * operandoDerecho));
                    case "DIVISION" ->
                            System.out.println(operandoIzquierdo + " / " + operandoDerecho + " = " + (operandoIzquierdo / operandoDerecho));
                }
            }
            else {
                System.out.println("Operacion no soportada");
            }

            sc.nextLine();

            operationIndex ++;
        }while(operationIndex < 4);
    }
}