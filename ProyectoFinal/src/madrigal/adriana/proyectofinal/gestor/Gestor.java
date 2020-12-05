package madrigal.adriana.proyectofinal.gestor;

import madrigal.adriana.proyectofinal.bl.entidades.*;
import madrigal.adriana.proyectofinal.persistencia.CancionDAO;
import madrigal.adriana.proyectofinal.persistencia.UserDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Gestor {

    Connection connection;

    UserDAO userdao;

    CancionDAO canciondao;

    public Gestor(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_proyectoFinal","root","David07Santi2930");
            this.canciondao = new CancionDAO(this.connection);
            this.userdao = new UserDAO(this.connection);
        } catch (Exception e){
            System.out.println("Cant connect to db");
            System.out.println(e.getMessage());
        }

    }


    public void salvarUser(String nombre, String apellido, String imagen, String email, String userName, String pw, String edad, String pais, String cedula) throws SQLException {
        User user = new User(nombre,apellido,imagen,email,userName,pw,Integer.parseInt(edad),pais,cedula);
        userdao.save(user);
    }
    public List<User> findAllUser() throws SQLException {
        return userdao.findAllUser();
    }

    public void salvarCancion(String nombreCancion, String genero, String artista, LocalDate fechalanzamiento, String album, String compositor) throws SQLException {
        Genero vgenero = new Genero.valueof(genero);
        Album vAlbum = new Album.valueof(album);
        Artista vArtista = new Artista.valueof(artista);
        Compositor vCompositor = new Compositor.valueof(compositor);
        Cancion cancion = new Cancion(nombreCancion, vgenero, vArtista, fechalanzamiento, vAlbum,vCompositor);
        canciondao.save(cancion);
    }

    public List<Cancion> findAllCanciones() throws SQLException {
        return canciondao.findAllCanciones();
    }
}
