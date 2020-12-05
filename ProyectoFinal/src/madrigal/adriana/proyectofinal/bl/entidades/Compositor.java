package madrigal.adriana.proyectofinal.bl.entidades;
/**
 * @author adrianamadrigal
 * @version 2.1 12/4/20
 *
 */

public class Compositor {
    private String nombreCompositor;
    private String apellidoCompositor;
    private String paisNacimiento;
    private int edad;

    /**
     *
     * @return el primer nombre del compositor
     */

    public String getNombreCompositor() {
        return nombreCompositor;
    }

    /**
     *
     * @param nombreCompositor recibe el primer nombre del compositor
     */

    public void setNombreCompositor(String nombreCompositor) {
        this.nombreCompositor = nombreCompositor;
    }

    /**
     *
     * @return el apellido del compositor
     */

    public String getApellidoCompositor() {
        return apellidoCompositor;
    }

    /**
     *
     * @param apellidoCompositor recibe el apellido del compositor
     */

    public void setApellidoCompositor(String apellidoCompositor) {
        this.apellidoCompositor = apellidoCompositor;
    }

    /**
     *
     * @return el pais de procedencia del compositor
     */

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    /**
     *
     * @param paisNacimiento recibe el pais de procedencia del compositor
     */

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    /**
     *
     * @return retorna la edad del compositor
     */

    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad recibe la edad del compositor
     */

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Constructor con parametros
     * @param nombreCompositor
     * @param apellidoCompositor
     * @param paisNacimiento
     * @param edad
     */

    public Compositor(String nombreCompositor, String apellidoCompositor, String paisNacimiento, int edad) {
        this.nombreCompositor = nombreCompositor;
        this.apellidoCompositor = apellidoCompositor;
        this.paisNacimiento = paisNacimiento;
        this.edad = edad;
    }

    /**
     * constructor vacio
     */

    public Compositor() {
    }

    /**
     *
     * @return string con los valores de los atributos
     */

    @Override
    public String toString() {
        return "Compositor{" +
                "nombreCompositor='" + nombreCompositor + '\'' +
                ", apellidoCompositor='" + apellidoCompositor + '\'' +
                ", paisNacimiento='" + paisNacimiento + '\'' +
                ", edad=" + edad +
                '}';
    }

    public static class valueof extends Compositor {
        public valueof(String s) {
            setNombreCompositor(s);
            setApellidoCompositor(null);
            setPaisNacimiento(null);
            setEdad(0);
        }
    }

}
