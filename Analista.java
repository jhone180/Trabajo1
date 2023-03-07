
public class Analista extends Empleado {

    public Persona[] personas;
    
    public int salarioTotal;
    
    public static final int Bonos = 500000;
    
    public Analista(int numEmpleados) {
        super.registrarEmpleado(numEmpleados);
        personas = super.getPersona();
    }
    
    public void calcularSalarioTotal() {
        for(int i = 0; i < personas.length; i++){
            salarioTotal += (persona[i].getSalario() + Bonos);
        }
        
        System.out.println("El salario total de los empleados es: " + salarioTotal);
        
    }

}
