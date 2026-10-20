public class Modulo {
    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion() {
        System.out.println("Módulo: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Versión: " + version);
        System.out.println("Terminado: " + terminado);
    }

    public void marcarTerminado() {
        terminado = true;
    }

    void mostrarEstado() {
        if (terminado) {
            System.out.println("El módulo " + nombre + " está completado.");
        } else {
            System.out.println("El módulo " + nombre + " está en desarrollo.");
        }
    }

    void mostrarVersion() {
        System.out.println("Versión actual del módulo "+nombre+": " + version);
    }
}
