package madrigal.adriana.proyectofinal;


import madrigal.adriana.proyectofinal.controlador.Controlador;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        try {
            Controlador controlador = new Controlador();
            controlador.ejecutarPrograma();
        }catch (Exception e){
           e.printStackTrace();
        }

    }
}
