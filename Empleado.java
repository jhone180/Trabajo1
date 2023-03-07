
import java.util.Scanner;

public abstract class Empleado {
    
    public Persona[] persona;
    
    public abstract void calcularSalarioTotal();
    
    public void registrarEmpleado(int numEmpleados){
        Persona[] personaRegistro = new Persona[numEmpleados];
        Scanner scanner = new Scanner(System.in);
        
        for(int i = 0; i < personaRegistro.length; i++){
            personaRegistro[i] = new Persona();
            System.out.println("Datos del empleado " + (i + 1) + ": ");
            System.out.print("Digite el nombre: ");
            String nombre = scanner.nextLine();
            scanner.nextLine();
            personaRegistro[i].setNombre(nombre);
            System.out.print("Digite la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            personaRegistro[i].setEdad(edad);
            System.out.print("Digite el cargo: ");
            String cargo = scanner.nextLine();
            personaRegistro[i].setCargo(cargo);
            System.out.print("Digite el salario: ");
            int salario = scanner.nextInt();
            personaRegistro[i].setSalario(salario);
            System.out.println("");
        }
        setPersona(personaRegistro);
        visualizarEmpleado(personaRegistro);
    }
    
    public void visualizarEmpleado(Persona[] persona){
        
        for(int i = 0; i < persona.length; i++){
            System.out.println("Datos registrados del empleado " + (i + 1) + ": ");
            System.out.println("Nombre del empleado: " + persona[i].getNombre());
            System.out.println("Edad del empleado: " + persona[i].getEdad());
            System.out.println("Cargo del empleado: " + persona[i].getCargo());
            System.out.println("Salario del empleado: " + persona[i].getSalario());
            System.out.println("");
        }
    }
    
    public void setPersona(Persona[] persona){
        this.persona = persona;
    }
    
    public Persona[] getPersona(){
        return persona;
    }
}