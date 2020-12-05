package madrigal.adriana.proyectofinal.bl.entidades;
/**
 * @author adrianamadrigal
 * @version 2.1 12/4/20
 *
 */
public class Artista {
    private String nombreArtista;
    private String apellidoArtista;
    private String nombreArtistico;
    private String fechaNacimientoArtista;
    private String fechaDefusionArtista;
    private String paisNacimiento;
    private Genero genero;
    private int edad;
    private String descripcionArtista;

    /**
     *
     * @return El primer nombre del artista
     */

    public String getNombreArtista() {
        return nombreArtista;
    }

    /**
     *
     * @param nombreArtista primer nombre del artista
     *
     */
    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    /**
     *
     * @return el apellido del artista
     */

    public String getApellidoArtista() {
        return apellidoArtista;
    }

    /**
     *
     * @param apellidoArtista apellido del artista
     */

    public void setApellidoArtista(String apellidoArtista) {
        this.apellidoArtista = apellidoArtista;
    }

    /**
     *
     * @return nombre artistico del artista
     */

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    /**
     *
     * @param nombreArtistico recibe del artista
     */

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    /**
     *
     * @return la fecha de naciemiento del artista
     */

    public String getFechaNacimientoArtista() {
        return fechaNacimientoArtista;
    }

    /**
     *
     * @param fechaNacimientoArtista recibe la fecha de nacimientos del artista
     */

    public void setFechaNacimientoArtista(String fechaNacimientoArtista) {
        this.fechaNacimientoArtista = fechaNacimientoArtista;
    }

    /**
     *
     * @return la fecha de defuncion del artista
     */

    public String getFechaDefusionArtista() {
        return fechaDefusionArtista;
    }

    /**
     *
     * @param fechaDefusionArtista recibe del artista
     */

    public void setFechaDefusionArtista(String fechaDefusionArtista) {
        this.fechaDefusionArtista = fechaDefusionArtista;
    }

    /**
     *
     * @return el pais de procedencia del artista
     */

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     *
     * @param paisNacimiento recibe del artista
     */

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    /**
     *
     * @return  el genero al que se dedica el artista
     */

    public Genero getGenero() {
        return genero;
    }

    /**
     *
     * @param genero recibe el genero musical al que se dedica el artista
     */

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     *
     * @return retorna la edad del artista
     */

    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad recibe la edad del artista
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return retorna algun tipo de descripcion que se le agregara al artista
     */

    public String getDescripcionArtista() {
        return descripcionArtista;
    }

    /**
     *
     * @param descripcionArtista recibe la descripcion que se desea agregar del artista
     */

    public void setDescripcionArtista(String descripcionArtista) {
        this.descripcionArtista = descripcionArtista;
    }

    /**
     *
     * @param nombreArtista
     * @param apellidoArtista
     * @param nombreArtistico
     * @param fechaNacimientoArtista
     * @param fechaDefusionArtista
     * @param paisNacimiento
     * @param genero
     * @param edad
     * @param descripcionArtista
     */

    public Artista(String nombreArtista, String apellidoArtista, String nombreArtistico, String fechaNacimientoArtista, String fechaDefusionArtista, String paisNacimiento, Genero genero, int edad, String descripcionArtista) {
        this.nombreArtista = nombreArtista;
        this.apellidoArtista = apellidoArtista;
        this.nombreArtistico = nombreArtistico;
        this.fechaNacimientoArtista = fechaNacimientoArtista;
        this.fechaDefusionArtista = fechaDefusionArtista;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
        this.edad = edad;
        this.descripcionArtista = descripcionArtista;
    }

    /**
     * constructor vacio
     */

    public Artista() {
    }

    /**
     *
     * @return el string de todos los datos de los atributos
     */

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                ", apellidoArtista='" + apellidoArtista + '\'' +
                ", nombreArtistico='" + nombreArtistico + '\'' +
                ", fechaNacimientoArtista='" + fechaNacimientoArtista + '\'' +
                ", fechaDefusionArtista='" + fechaDefusionArtista + '\'' +
                ", paisNacimiento='" + paisNacimiento + '\'' +
                ", genero=" + genero +
                ", edad=" + edad +
                ", descripcionArtista='" + descripcionArtista + '\'' +
                '}';
    }

    /**
     * metodo que ayuda al manejo de recibir un string como dato y posicionarlo correctamente
     */

    public static class valueof extends Artista {
        public valueof(String s) {
            setNombreArtistico(s);
            setNombreArtista(null);
            setApellidoArtista(null);
            setFechaNacimientoArtista(null);
            setFechaDefusionArtista(null);
            setPaisNacimiento(null);
            setGenero(null);
            setEdad(0);
            setDescripcionArtista(null);
        }
    }
}
