package pa2_u1_cc_ka_repaso;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.Quarkus;
import jakarta.inject.Inject;
import pa2_u1_cc_ka_repaso.Extensiones.ExtensionWhatsApp;
import pa2_u1_cc_ka_repaso.Extensiones.ExtensionMail;


public class Main implements QuarkusApplication {

    @Inject 
    private PedidoService pedidoService;

    @Inject 
    private Notificacion notificacion;

    @Inject 
    private ExtensionWhatsApp extensionWhatsApp;

    @Inject 
    private ExtensionMail extensionMail;
    
     public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        Pedido pedido = new Pedido("Abi", "Almachi", "celular", 1250.0, "celular con buena grafica");
        this.pedidoService.procesarPedido(pedido, notificacion);  
        this.extensionWhatsApp.enviar(pedido.getNombre(), "Su pedido ha sido procesado.");
        System.out.println("Pedido realizado con éxito!");

        Pedido pedido2 = new Pedido("Abi", "Almachi", "celular", 1250.0, "celular con buena grafica");
        this.pedidoService.procesarPedido(pedido2, notificacion);
        this.extensionMail.enviar(pedido2.getNombre(), "Su pedido ha sido procesado.");
        System.out.println("Pedido realizado con éxito!");

        return 0;
    }

   
}
