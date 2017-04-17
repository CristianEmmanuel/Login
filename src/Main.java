import java.util.Objects;
import java.util.Scanner;

public class Main {

    private static String Luis;

    public static void main(String[] args) {
        String name = "Luis";
        int password = 1234;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        name = scanner.nextLine();

        if (Objects.equals(name, "Luis")) {
            System.out.println("Please enter your password");
            password = scanner.nextInt();
            System.out.println("Whats operation do you like to make ?? sum, rest, multiplication or division");

            System.out.print( "Introduzca el primer número: " );
            int primerNumero = scanner.nextInt();
            System.out.print( "Introduzca el segundo número: " );
            int segundoNumero = scanner.nextInt();

            int suma   = primerNumero + segundoNumero;
            int resta  = primerNumero - segundoNumero;
            int mult   = primerNumero * segundoNumero;
            int div    = primerNumero / segundoNumero;
            int modulo = primerNumero % segundoNumero;

            System.out.print("Suma :");
            System.out.println(suma );
            System.out.print("Resta :");
            System.out.println(resta);
            System.out.print("Multiplicacion :");
            System.out.println(mult);
            System.out.print("Division :");
            System.out.println(div);
            System.out.print("Modulo :");
            System.out.println(modulo);


        } else {
            System.out.println("Fuck Of Here");}
        }

    }
