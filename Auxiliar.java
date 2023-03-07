
public class Auxiliar extends Empleado{
    
    public Persona[] personas;
    
    public int salarioTotal;
    
    public static final int Comisiones = 50000;
    
    public int numComisiones;
    
    public Auxiliar(int numEmpleados, int numComisiones) {
        super.registrarEmpleado(numEmpleados);
        this.personas = super.getPersona();
        this.numComisiones = numComisiones;
    }
    
    public void calcularSalarioTotal() {
        for(int i = 0; i < personas.length; i++){
            salarioTotal += (persona[i].getSalario() + (Comisiones * numComisiones));
        }
        
        System.out.println("El salario total de los empleados es: " + salarioTotal);
    }
    
}
