import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingrese nota 1");
        double nota1 = scanner.nextDouble();

        System.out.println("ingrese nota 2");
        double nota2 = scanner.nextDouble();

        System.out.println("ingrese nota 3");
        double nota3 = scanner.nextDouble();

        double setenta = ((nota1+nota2+nota3)/3)*0.7;

        System.out.println("ingrese tercera nota");
        double terceraNota = scanner.nextDouble();

        double treinta = terceraNota*0.3;

        double resultado = setenta+treinta;

        System.out.println("la nota del estudiante es "+ resultado);

        scanner.close();
    }
}
