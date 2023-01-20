package Cliente;

public class Cliente {
    
    public Long id;
    public String nombre;
    public String apellido;

    public Cliente(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre(String nombre) {
        return this.nombre;
    }

    public String getApellido(String apellido) {
        return this.apellido;
    }
    
}
