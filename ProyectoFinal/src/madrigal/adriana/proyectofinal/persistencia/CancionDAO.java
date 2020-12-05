package madrigal.adriana.proyectofinal.persistencia;


import madrigal.adriana.proyectofinal.bl.entidades.*;

import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CancionDAO {
    Connection cnx;
    public CancionDAO(Connection cnx){
        this.cnx = cnx;
    }

    public void save(Cancion cancion) throws SQLException {
        Statement stmt = cnx.createStatement();
        StringBuilder buildSentence = new StringBuilder("insert into cancion (nombreCancion,genero,artista,fechaLanzamiento,album,compositor)");
        buildSentence.append("values ('");
        buildSentence.append(cancion.getNombreCancion());
        buildSentence.append("','");
        buildSentence.append(cancion.getGenero());
        buildSentence.append("',");
        buildSentence.append(cancion.getArtista());
        buildSentence.append(",'");
        buildSentence.append(cancion.getFechalanzamiento());
        buildSentence.append("',");
        buildSentence.append(cancion.getAlbum());
        buildSentence.append(",'");
        buildSentence.append(cancion.getCompositor());
        buildSentence.append("')");
        System.out.println(buildSentence.toString());
        stmt.execute(buildSentence.toString());
    }

    public List<Cancion> findAllCanciones() throws SQLException {

        ArrayList<Cancion> listOfResults = new ArrayList<>();
        /*Statement stmt = cnx.createStatement();
        ResultSet result = stmt.executeQuery("select * from tCancion");

        while (result.next()){
            Cancion una = new Cancion();
            una.setNombreCancion(result.getString("nombreCancion"));
            una.setGenero(result.getString("genero"));
            una.setArtista(result.getString("artista"));
            una.setFechalanzamiento(result.getDate("fechaCompra").toLocalDate());
            una.setAlbum(result.getString("album"));
            una.setCompositor(result.getString("compositor"));
            listOfResults.add(una);

        }*/
        return  listOfResults;


    }



}

