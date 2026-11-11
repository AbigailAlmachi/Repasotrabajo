package pa2_u1_cc_ka_repaso.Extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class ExtensionMail implements Extension{

    @Override
    public void enviar(String nombre, String mensaje) {
        System.out.println("[Mail Extension]");
        System.out.println("Enviando notificación por correo electrónico...");
        System.out.println("Nombre: " + nombre);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Notificación enviada por correo electrónico con éxito!");
    }
    
}
