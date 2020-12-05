package madrigal.adriana.proyectofinal.ui;

import madrigal.adriana.proyectofinal.bl.entidades.Genero;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarMenu() {
        output.println("Bievenido: escoja una opcion:");
        output.println("1. Crear Cancion");
        output.println("2. Listar Canciones");
        output.println("3. Crear usuario");
        output.println("4. Salir");
    }

    public int leerOpcion() {
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }

    public String leerTexto() {
        return input.next();
    }

}