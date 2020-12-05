package madrigal.adriana.proyectofinal.bl.entidades;
/**
 * @author adrianamadrigal
 * @version 2.1 12/4/20
 *
 */

import madrigal.adriana.proyectofinal.interfaces.SerilizacionCSV;

import java.time.LocalDate;

public class Cancion implements SerilizacionCSV{

    private String nombreCancion;
    private Genero genero;
    private Artista artista;
    private LocalDate fechalanzamiento;
    private Album album;
    private Compositor compositor;

    /**
     *
     * @return el nombre de la cancion
     */


    public String getNombreCancion() {
        return nombreCancion;
    }

    /**
     *
     * @param nombreCancion recibe
     */

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    /**
     *
     * @return el tipo de genero de la cancion
     */

    public Genero getGenero() {
        return genero;
    }

    /**
     *
     * @param genero de la cancion
     */

    public void setGenero(Genero genero) {
        this.genero = genero;
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
     * @return la fecha de lanzamiento de la cancion
     */

    public LocalDate getFechalanzamiento() {
        return fechalanzamiento;
    }

    /**
     *
     * @param fechalanzamiento recibe la fecha de lanzamiento de la cancion
     */

    public void setFechalanzamiento(LocalDate fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
    }

    /**
     *
     * @return el nombre del album
     */

    public Album getAlbum() {
        return album;
    }

    /**
     *
     * @param album el nombre del album la que pertenece
     */

    public void setAlbum(Album album) {
        this.album = album;
    }

    /**
     *
     * @return el nombre del compositor
     */

    public Compositor getCompositor() {
        return compositor;
    }

    /**
     *
     * @param compositor recibe le nombre del compositor
     */

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }

    /**
     * constructor con parametros
     * @param nombreCancion
     * @param genero
     * @param artista
     * @param fechalanzamiento
     * @param album
     * @param compositor
     */

    public Cancion(String nombreCancion, Genero genero, Artista artista, LocalDate fechalanzamiento, Album album, Compositor compositor) {
        this.nombreCancion = nombreCancion;
        this.genero = genero;
        this.artista = artista;
        this.fechalanzamiento = fechalanzamiento;
        this.album = album;
        this.compositor = compositor;
    }

    /**
     * constructor vacio
     */

    public Cancion() {
    }

    /**
     *
     * @return un string con los valores de los atributos
     */

    @Override
    public String toString() {
        return "Cancion{" +
                "nombreCancion='" + nombreCancion + '\'' +
                ", genero=" + genero +
                ", artista=" + artista +
                ", fechalanzamiento='" + fechalanzamiento + '\'' +
                ", album=" + album +
                ", compositor=" + compositor +
                '}';
    }

    @Override
    public String toCSVLine() {
        return null;
    }

}
