public class Main {
    public static void main(String[] args) {
        // Muestra la informacion del cliente
        System.out.println("Muestra la informacion del cliente");
        Cliente cliente = new Cliente();
        cliente.mostrarInfo(38, 12345678, "Cecilia Perdomo", 1250);

        System.out.println("----------------------------------------------------------------------");
        // Muestra la informacion del trabajador
        System.out.println("Muestra la informacion del trabajador");
        Trabajador trabajador = new Trabajador();
        trabajador.mostrarInfo(38, 123456789, "Cecilia Perdomo", 5649);
    }
}

// Crea una clase Persona con las siguientes variables:
    // La edad
    // El nombre
    // El teléfono
class Persona {
    int edad;
    int telefono;
    String nombre;
}

// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la
// variable credito solo para esa clase.
// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y
// el credito, tienes que darles valor y mostrarlas por pantalla.

class Cliente extends Persona {
    int credito;

    public void mostrarInfo (int edad, int telefono, String nombre, int credito) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Credito: " + credito);
    }
}

// Una vez hecho esto, haz lo mismo con la clase Trabajador
// que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
class Trabajador extends Persona {
    int salario;

    public void mostrarInfo (int edad, int telefono, String nombre, int salario) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Telefono: " + telefono);
        System.out.println("Salario: " + salario);
    }
}