//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Modulo login = new Modulo();
    Modulo inventario = new Modulo();
    Modulo reportes = new Modulo();

    login.nombre = "Login";
    login.lenguaje = "Java";
    login.version = "1.0";
    login.terminado = true;

    inventario.nombre = "Inventario";
    inventario.lenguaje = "Java";
    inventario.version = "1.2";
    inventario.terminado = false;

    reportes.nombre = "Reportes";
    reportes.lenguaje = "Python";
    reportes.version = "0.8";
    reportes.terminado = false;

    System.out.println(" ");
    login.mostrarInformacion();
    login.mostrarEstado();

    System.out.println(" ");
    inventario.mostrarInformacion();
    inventario.mostrarEstado();
    inventario.marcarTerminado();
    inventario.mostrarEstado();

    System.out.println(" ");
    reportes.mostrarInformacion();
    reportes.mostrarEstado();
    reportes.version = "1.4";
    reportes.mostrarVersion();
}
