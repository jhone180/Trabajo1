
import java.util.Scanner;

public class Principal{

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique el numero del tipo de empleado que desea registrar: ");
        System.out.println("    1. Gerente.");
        System.out.println("    2. Analista.");
        System.out.println("    3. Auxiliar.");
        int tipoEmpleado = scanner.nextInt();

        System.out.print("Indique el numero de personas que desea registrar: ");
        int numeroEmpleados = scanner.nextInt();

        switch (tipoEmpleado) {
            case 1:
                Gerente gerente = new Gerente(numeroEmpleados);
                gerente.calcularSalarioTotal();
                break;
            case 2:
                Analista analista = new Analista(numeroEmpleados);
                analista.calcularSalarioTotal();
                break;
            case 3:
                System.out.print("Indique el numero de comisiones: ");
                int numComisiones = scanner.nextInt();
                Auxiliar auxiliar = new Auxiliar(numeroEmpleados, numComisiones);
                auxiliar.calcularSalarioTotal();
                break;
            default:
                System.out.println("Error, tipo de persona incorrecto.");
                break;
        }
    }
}
