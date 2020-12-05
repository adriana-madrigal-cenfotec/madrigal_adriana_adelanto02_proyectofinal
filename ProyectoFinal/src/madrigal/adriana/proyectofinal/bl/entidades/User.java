package madrigal.adriana.proyectofinal.bl.entidades;
import java.util.Objects;

/**
 * @author adrianamadrigal
 * @version 2.1 12/4/20
 *
 */

public class User {
    private String nombre;
    private String apellido;
    private String imagen;
    private String email;
    private String userName;
    private String pw;
    private int edad;
    private String pais;
    private String cedula;
    private Boolean isAdmin;

    /**
     *
     * @return primer nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre recibe el primer nombre del usuario
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return apellido del usuario
     */

    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido recibe apellido del usuario
     */

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return la foto del usuario
     */

    public String getImagen() {
        return imagen;
    }

    /**
     *
     * @param imagen la imagen del usuario
     */

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     *
     * @return el correo del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return el nombre de usuario del usuario
     */

    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName del usuario
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return el pw del usuario
     */

    public String getPw() {
        return pw;
    }

    /**
     *
     * @param pw recibe el pasword del usuario
     */
    public void setPw(String pw) {
        this.pw = pw;
    }

    /**
     *
     * @return la edad del usuario
     */

    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad del usuario
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return el pais de procedencia del usuario
     */

    public String getPais() {
        return pais;
    }

    /**
     *
     * @param pais del usuario
     */

    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     *
     * @return el numero de cedula del usuario
     */

    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula recibe del usuario
     */

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return si el usuario es el admin o no
     */

    public Boolean getAdmin() {
        return isAdmin;
    }

    /**
     *
     * @param admin recibe del usuario
     */

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    /**
     *
     * @param nombre primer nombre del usuario
     * @param apellido apellido del usuario
     * @param imagen la imagen de la aplicacion del usuario
     * @param email el correo electronico del usuario
     * @param userName el nombre de usuario del usuario
     * @param pw la contraseña del usuario
     * @param edad la edad del del usuario
     * @param pais el pais de procedencia del usuario
     * @param cedula la cedula del usuario
     */

    public User(String nombre, String apellido, String imagen, String email, String userName, String pw, int edad, String pais, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
        this.email = email;
        this.userName = userName;
        this.pw = pw;
        this.edad = edad;
        this.pais = pais;
        this.cedula = cedula;
    }

    /**
     * constructor vacio
     */

    public User() {
    }

    /**
     *
     * @return todas los atributos en un string
     */

    @Override
    public String toString() {
        return "User{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", imagen=" + imagen +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", pw='" + pw + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", cedula='" + cedula + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }

    /**
     *
     * @param o recibe un objecto de la clase objeto
     * @return la comparacion de cada uno de las variables
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return edad == user.edad &&
                Objects.equals(nombre, user.nombre) &&
                Objects.equals(apellido, user.apellido) &&
                Objects.equals(imagen, user.imagen) &&
                Objects.equals(email, user.email) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(pw, user.pw) &&
                Objects.equals(pais, user.pais) &&
                Objects.equals(cedula, user.cedula) &&
                Objects.equals(isAdmin, user.isAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, imagen, email, userName, pw, edad, pais, cedula, isAdmin);
    }

}
