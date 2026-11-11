package pa2_u1_cc_ka_repaso;

import jakarta.enterprise.context.ApplicationScoped;
import pa2_u1_cc_ka_repaso.interceptors.SMS;
import pa2_u1_cc_ka_repaso.interceptors.WhatsApp;

@ApplicationScoped 
@WhatsApp 
@SMS 
public class PedidoService{
    
    public void procesarPedido(Pedido pedido, Notificacion notificacion){
        System.out.println("Pedido procesado:");
        System.out.println("Nombre: " + pedido.getNombre());
        System.out.println("Apellido: " + pedido.getApellido());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Descripción: " + pedido.getDescripción());

        
        // Enviar notificación
        String mensaje = "Su pedido ha sido procesado.";
        notificacion.enviar(pedido.getNombre(), mensaje);
    }
}
