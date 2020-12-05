package madrigal.adriana.proyectofinal.bl.entidades;
/**
 * @author adrianamadrigal
 * @version 2.1 12/4/20
 *
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class ListaReproducion {
    private String NombreLista;
    private Date fechaCreacion;
    private ArrayList<Cancion> canciones;
    private int calificacion;

    /**
     *
     * @return nombre de la lista de reproduccion
     */

    public String getNombreLista() {
        return NombreLista;
    }

    /**
     *
     * @param nombreLista
     */

    public void setNombreLista(String nombreLista) {
        NombreLista = nombreLista;
    }

    /**
     *
     * @return la fecha de creacion de la lista
     */

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     *
     * @param fechaCreacion
     */

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     *
     * @return la listas de canciones asociadas a ella
     */

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    /**
     *
     * @param canciones
     */

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    /**
     *
     * @return la calificacion de la lista de canciones
     */

    public int getCalificacion() {
        return calificacion;
    }

    /**
     *
     * @param calificacion
     */

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * constructor con parametros
     * @param nombreLista
     * @param fechaCreacion
     * @param canciones
     * @param calificacion
     */

    public ListaReproducion(String nombreLista, Date fechaCreacion, ArrayList<Cancion> canciones, int calificacion) {
        NombreLista = nombreLista;
        this.fechaCreacion = fechaCreacion;
        this.canciones = canciones;
        this.calificacion = calificacion;
    }

    /**
     * constructor vacio
     */

    public ListaReproducion() {
    }

    /**
     *
     * @return un string con los valores de los atributos
     */

    @Override
    public String toString() {
        return "ListasCanciones{" +
                "NombreLista='" + NombreLista + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", canciones=" + canciones +
                ", calificacion=" + calificacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaReproducion that = (ListaReproducion) o;
        return calificacion == that.calificacion &&
                Objects.equals(NombreLista, that.NombreLista) &&
                Objects.equals(fechaCreacion, that.fechaCreacion) &&
                Objects.equals(canciones, that.canciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NombreLista, fechaCreacion, canciones, calificacion);
    }

}
