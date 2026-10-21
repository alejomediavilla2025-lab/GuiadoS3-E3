import dispositivo.Dispositivo;

public class Main {
    public static void main(String[] args) {

        // 1. Consultar el contador inicial
        System.out.println("\n=== CONTADOR DE DISPOSITIVOS ===");

        System.out.println("Total inicial " + Dispositivo.getTotalCreados());

        //  Crear los tres dispositivos
        System.out.println("\n=== DISPOSITIVOS CREADOS ===");

        Dispositivo dispositivo1 = new Dispositivo("Computadora", "Laptop");
        System.out.println("Despues del primer Dispositivo: " + dispositivo1.getTotalCreados());

        // Crear el segundo dispositivo
        Dispositivo dispositivo2 = new Dispositivo("Celular", "Smartphone");
        System.out.println("Despues del segundo Dispositivo: " + dispositivo2.getTotalCreados());

        // Crear el tercer dispositivo
        Dispositivo dispositivo3 = new Dispositivo("Tablet", "Dispositivo movil");
        System.out.println("Despues del tercer Dispositivo: " + dispositivo3.getTotalCreados());
        System.out.println("\n === CONTADOR FINAL " + Dispositivo.getTotalCreados());

        // Diferenciar entre atributos de instancia y atributos static
        System.out.println("\n=== INSTANCIA Y CLASE ===");

        // Mostrar atributos de los objetos
        System.out.println("Dispositivo1 " + dispositivo1.getNombre());
        System.out.println("Dispositivo2 " + dispositivo2.getNombre());
        System.out.println("Dispositivo3 " + dispositivo3.getNombre());

        // Mostar el atributo compartido
        System.out.println("Total de dispositivos creados: " + Dispositivo.getTotalCreados());

        // Consultar los identificadores de los dispositivos
        System.out.println("\n=== IDENTIFICADORES DE DISPOSITIVOS ===");

        System.out.println("Dispositivo1 - ID " + dispositivo1.getId());

        System.out.println("Dispositivo2 - ID " + dispositivo2.getId());

        System.out.println("Dispositivo3 - ID " + dispositivo3.getId());

        System.out.println("Total de dispositivos creados: " + Dispositivo.getTotalCreados());

    }
}
