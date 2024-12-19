//Codigo 2/2 Actividad n3
//Almacena datos de un estudiante
import java.util.Scanner;

public class Code2_act3 {
    public static void main(String[] args) {
        // Crear el objeto Scanner para capturar entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        int edad;
        String ID;
        char genero;

        // Capturar datos del usuario
        System.out.print("Digite el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.print("Digite el ID del estudiante: ");
        ID = entrada.nextLine();
        System.out.print("Digite la edad del estudiante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Digite el género: ");
        genero = entrada.next().charAt(0);

        // Crear la cadena concatenada
        String datosConcatenados = "Nombre: " + nombre + ", ID: " + ID +
                ", Edad: " + edad +
                ", Genero: " + genero;

        // Mostrar los datos del visitante
        System.out.println("Datos del estudiante: " + datosConcatenados);
    }
}