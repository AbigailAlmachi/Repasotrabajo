package pa2_u1_cc_ka_repaso;


public class Compra{
    String Nombre;
    String apellido;
    String producto;
    Double total;
    String descripcion;

    
    public Compra(String nombre, String apellido, String producto, Double total, String descripcion) {
        Nombre = nombre;
        this.apellido = apellido;
        this.producto = producto;
        this.total = total;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getProducto() {
        return producto;
    }

    public Double getTotal() {
        return total;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}