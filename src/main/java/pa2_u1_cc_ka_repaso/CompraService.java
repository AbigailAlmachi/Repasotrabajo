package pa2_u1_cc_ka_repaso;

import jakarta.enterprise.context.ApplicationScoped;
import pa2_u1_cc_ka_repaso.interceptors.SMS;
import pa2_u1_cc_ka_repaso.interceptors.WhatsApp;

@ApplicationScoped 
@WhatsApp 
@SMS 
public class CompraService{

    public void comprar(Compra compra){
        System.out.println("Realizando Compra:");
        System.out.println("Nombre: " + compra.getNombre());
        System.out.println("Apellido: " + compra.getApellido());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Descripción: " + compra.getDescripcion());  
        System.out.println("Compra realizada con éxito!");

    }
}