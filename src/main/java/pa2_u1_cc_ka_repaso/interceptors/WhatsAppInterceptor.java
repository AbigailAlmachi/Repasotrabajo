package pa2_u1_cc_ka_repaso.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@WhatsApp 
@Interceptor
@Priority(10)
public class WhatsAppInterceptor {
    
    @AroundInvoke
    public Object enviar(InvocationContext context) throws Exception {
        System.out.println("[WhatsApp].....");
        System.out.println("Enviando notificación por WhatsApp...");
        Object result = context.proceed();
        System.out.println("Notificación enviada por WhatsApp con éxito!");
        return result;
    }
}
