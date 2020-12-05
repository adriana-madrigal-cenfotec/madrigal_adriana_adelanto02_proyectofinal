package madrigal.adriana.proyectofinal.persistencia;

import madrigal.adriana.proyectofinal.bl.entidades.Cancion;
import madrigal.adriana.proyectofinal.bl.entidades.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    Connection cnx;
    public UserDAO(Connection cnx){
        this.cnx = cnx;
    }

    public void save(User user) throws SQLException {
        Statement stmt = cnx.createStatement();
        StringBuilder buildSentence = new StringBuilder("insert into tuser (nombre,apellido,imagen,email,userName,pw,edad,pais,cedula)");
        buildSentence.append("values ('");
        buildSentence.append(user.getNombre());
        buildSentence.append("','");
        buildSentence.append(user.getApellido());
        buildSentence.append("','");
        buildSentence.append(user.getImagen());
        buildSentence.append("','");
        buildSentence.append(user.getEmail());
        buildSentence.append("','");
        buildSentence.append(user.getUserName());
        buildSentence.append("','");
        buildSentence.append(user.getPw());
        buildSentence.append("','");
        buildSentence.append(user.getEdad());
        buildSentence.append("','");
        buildSentence.append(user.getPais());
        buildSentence.append("','");
        buildSentence.append(user.getCedula());
        buildSentence.append("')");
        System.out.println(buildSentence.toString());
        stmt.execute(buildSentence.toString());
    }

    public List<User> findAllUser() {
        ArrayList<User> listOfUserResults = new ArrayList<>();
        return listOfUserResults;
    }
}
