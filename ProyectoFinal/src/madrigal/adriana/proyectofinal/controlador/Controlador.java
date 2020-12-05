package madrigal.adriana.proyectofinal.controlador;

import madrigal.adriana.proyectofinal.bl.entidades.Cancion;
import madrigal.adriana.proyectofinal.bl.entidades.Genero;
import madrigal.adriana.proyectofinal.gestor.Gestor;
import madrigal.adriana.proyectofinal.ui.UI;


import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Controlador {
    private UI ui = new UI();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() throws SQLException {
        int opcion = 0;
        do {
            ui.mostrarMenu();
            opcion = ui.leerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 4);
    }

    private void ejecutarOpcion(int opcion) throws SQLException {
        switch (opcion){
            case 1:
                ingresarCancion();
                break;

            case 2:
                listarCanciones();
                break;

            case 3:
                crearUsuario();
                break;
            case 4:
                System.out.println("Gracias por usar El Baul de los Recuerdos.");
                break;
            default:
                System.out.println("Opción invalida.");
        }
}

    private void crearUsuario() throws SQLException {
        ui.imprimirMensaje("Ingrese su nombre: ");
        String nombre = ui.leerTexto();
        ui.imprimirMensaje("Ingrese su apellido:");
        String  apellido = ui.leerTexto();
        ui.imprimirMensaje("Suba una foto para su perfil");
        String imagen = ui.leerTexto();
        ui.imprimirMensaje("Ingrese su dirección de correo: ");
        String email = ui.leerTexto();
        ui.imprimirMensaje("Ingrese el nombre de usuario que desea usar: ");
        String userName = ui.leerTexto();
        ui.imprimirMensaje("Ingrese la clave a usuar: ");
        String pw = ui.leerTexto();
        ui.imprimirMensaje("Ingrese su edad: ");
        String edad = ui.leerTexto();
        ui.imprimirMensaje("Seleccione el pais de procedencia: ");
        String pais = ui.leerTexto();
        ui.imprimirMensaje("Ingrese el numero de cedula");
        String cedula = ui.leerTexto();
        gestor.salvarUser(nombre,apellido,imagen,email,userName,pw,edad,pais,cedula);

    }

    private void ingresarCancion() throws SQLException {
        ui.imprimirMensaje("Ingrese el nombre de la cancion: ");
        String nombreCancion = ui.leerTexto();
        ui.imprimirMensaje("Seleccione el nombre del genero:");
        String  genero = ui.leerTexto();
        ui.imprimirMensaje("Ingrese el artista");
        String artista = ui.leerTexto();
        ui.imprimirMensaje("Ingrese la fecha de lanzamiento de la cacion");
        LocalDate fechalanzamiento = LocalDate.parse(ui.leerTexto());
        ui.imprimirMensaje("Ingrese el nombre del album");
        String album = ui.leerTexto();
        ui.imprimirMensaje("Ingrese el artista");
        String compositor = ui.leerTexto();
        gestor.salvarCancion(nombreCancion, genero, artista, fechalanzamiento, album,compositor);
    }

    private void listarCanciones() throws SQLException{
        List<Cancion> canciones = gestor.findAllCanciones();
        for (Cancion unaCancion: canciones) {
            ui.imprimirMensaje(unaCancion.toCSVLine());
        }
    }
    }
