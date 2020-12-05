package madrigal.adriana.proyectofinal.bl.entidades;

/**
 * @author adrianamadrigal
 * @version 2.1 12/4/20
 *
 */

public class Genero {
    private String nombreGenero;
    private String descripcionGenero;

    /**
     *
     * @return el nombre del genero
     */
    public String getNombreGenero() {
        return nombreGenero;
    }

    /**
     *
     * @param nombreGenero recibe el nombre del genero
     */

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    /**
     *
     * @return la descripcion del genero
     */

    public String getDescripcionGenero() {
        return descripcionGenero;
    }

    /**
     *
     * @param descripcionGenero recibe la descripcion del genero
     */

    public void setDescripcionGenero(String descripcionGenero) {
        this.descripcionGenero = descripcionGenero;
    }

    /**
     * constructor con parametros
     * @param nombreGenero
     * @param descripcionGenero
     */

    public Genero(String nombreGenero, String descripcionGenero) {
        this.nombreGenero = nombreGenero;
        this.descripcionGenero = descripcionGenero;
    }

    /**
     * constructor vacio
     */
    public Genero() {
    }

    /**
     *
     * @return un string con los valores de los atributos
     */

    @Override
    public String toString() {
        return "Genero{" +
                "nombreGenero='" + nombreGenero + '\'' +
                ", descripcionGenero='" + descripcionGenero + '\'' +
                '}';
    }


    public static class valueof extends Genero {
        public valueof(String s) {
            setNombreGenero(s);
            setDescripcionGenero(null);
        }
    }
}
