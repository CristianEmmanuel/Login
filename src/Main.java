import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    private static String Luis;

    public static void main(String[] args) {
        String name = "Luis";
        int password = 1234;
        Scanner scanner = new Scanner(System.in);

        out.println("Please enter your name");
        name = scanner.nextLine();

        if (Objects.equals(name, "Luis")) {
            int primerNumero;
            int segundoNumero;


            out.println("Please enter your password");
            password = scanner.nextInt();
            out.println("Whats operation do you like to make ?? sum, rest, multiplication or division");
            String operacion = scanner.next();

            out.print("Introduzca el primer número: ");
            primerNumero = scanner.nextInt();
            out.print("Introduzca el segundo número: ");
            segundoNumero = scanner.nextInt();

            int suma = 0;
            int resta = 0;
            int multiplicacion = 0;
            int division = 0;
            int resto = 0;
            int resultado = 0;

            if(operacion.equals("suma")){resultado = primerNumero + segundoNumero;}
            if(operacion.equals("resta")){resultado = primerNumero - segundoNumero;}
            if(operacion.equals("multiplicacion")){resultado = primerNumero * segundoNumero;}
            if(operacion.equals("division")){resultado = primerNumero / segundoNumero;}
            if(operacion.equals("resto")){resultado = primerNumero % segundoNumero;}


            System.out.print("El resultado es : " + resultado);


        }else{
                out.println("Fuck Of Here");
            }
        }
    }



