package madrigal.adriana.proyectofinal.bl.entidades;

/**
 * @author adrianamadrigal
 * @version 2.1 12/4/20
 *
 */

import java.awt.*;
import java.util.ArrayList;

public class Album {

    private String nombreAlbum;
    private String fechaLanzamiento;
    private Artista artista;
    private Image portada;
    private ArrayList<Cancion> canciones;

    /**
     *
     * @return el nombre del album
     */

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    /**
     *
     * @param nombreAlbum recibe
     */

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    /**
     *
     * @return la fecha de lanzamiento del album
     */

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     *
     * @param fechaLanzamiento recibe del album
     */

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     *
     * @return el nombre del artista
     */

    public Artista getArtista() {
        return artista;
    }

    /**
     *
     * @param artista nombre del artista
     */

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    /**
     *
     * @return la locacion de imagen Portada del album
     */

    public Image getPortada() {
        return portada;
    }

    /**
     *
     * @param portada la locacion de imagen Portada del album
     */

    public void setPortada(Image portada) {
        this.portada = portada;
    }

    /**
     * Construtpr con parametros
     * @param nombreAlbum
     * @param fechaLanzamiento
     * @param artista
     * @param portada
     */

    public Album(String nombreAlbum, String fechaLanzamiento, Artista artista, Image portada) {
        this.nombreAlbum = nombreAlbum;
        this.fechaLanzamiento = fechaLanzamiento;
        this.artista = artista;
        this.portada = portada;
    }

    /**
     * constructor sin parametros
     */

    public Album() {
    }

    /**
     *
     * @return string con los valores de los atributos
     */

    @Override
    public String toString() {
        return "Album{" +
                "nombreAlbum='" + nombreAlbum + '\'' +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ", artista=" + artista +
                ", portada=" + portada +
                '}';
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public static class valueof extends Album {
        public valueof(String s) {
            setNombreAlbum(s);
            setFechaLanzamiento(null);
            setArtista(null);
            setPortada(null);
            setCanciones(null);

        }
    }
}
