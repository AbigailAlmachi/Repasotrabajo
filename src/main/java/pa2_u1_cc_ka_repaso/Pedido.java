package pa2_u1_cc_ka_repaso;


public class Pedido {

    String nombre;
    String apellido;
    String producto;
    double total;
    String descripción;

    
    public Pedido(String nombre, String apellido, String producto, double total, String descripción) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.producto = producto;
        this.total = total;
        this.descripción = descripción;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getProducto() {
        return producto;
    }

    public double getTotal() {
        return total;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    
}
