

public class Gerente extends Empleado {

    public Persona[] personas;

    public int salarioTotal;

    public Gerente(int numEmpleados) {
        super.registrarEmpleado(numEmpleados);
        personas = super.getPersona();
    }

    public void calcularSalarioTotal() {
        for (int i = 0; i < 2; i++) {
            salarioTotal += personas[i].getSalario();
        }
        System.out.println("El salario total es " + salarioTotal);
    }

}
