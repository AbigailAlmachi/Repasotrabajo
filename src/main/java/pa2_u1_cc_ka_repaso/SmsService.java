package pa2_u1_cc_ka_repaso;

import jakarta.inject.Singleton;

@Singleton 
public class SmsService implements Notificacion{

    private Integer cantidad = 0;
    @Override
    public void enviar(String nombre, String mensaje) {
        System.out.println("Enviando SMS a " + nombre + ": " + mensaje);
        System.out.println("SMS enviado con éxito!");
        cantidad++;
    }

    @Override
    public Integer getCantidad() {
        return cantidad;
        }

    @Override
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String getNombre() {
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public void setNombre(String nombre) {
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }
    
} 
    

