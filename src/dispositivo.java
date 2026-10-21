package dispositivo;

//Comprender que es un constructor
//Crear un constructor que reciba nombre y tipo
//Crear al menos tres objetos diferentes
//Implementar un contador compartido mediante static
//Crear el metodo getTotalCreados() para consultar cuántos objetos se han creado.

public class Dispositivo {

    // Atributos privados
    private String nombre;
    private String tipo;
    private boolean activo;
    private int id;

    // Contador compartido entre todos los objetos
    private static int totalCreados = 0;

// un constructor debe tener el mismo nombre que la clase y no puede declarar un tipo de retorno, ni siquiera void.

    // Constructor con parametros
    public Dispositivo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        totalCreados++;
        this.id = totalCreados;
    }

    // Metodo para obtener el total de dispositivos creados

    public static int getTotalCreados() {
        return totalCreados;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
