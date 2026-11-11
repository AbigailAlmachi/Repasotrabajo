package pa2_u1_cc_ka_repaso.Extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class ExtensionWhatsApp implements Extension {
    
    @Override
    public void enviar(String nombre, String mensaje) {
        System.out.println("[WhatsApp Extension]");
        System.out.println("Enviando notificación por WhatsApp...");
        System.out.println("Nombre: " + nombre);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Notificación enviada por WhatsApp con éxito!");
    }
    
}
