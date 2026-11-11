package pa2_u1_cc_ka_repaso.interceptors;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import pa2_u1_cc_ka_repaso.Pedido;

@Auditoria
@Interceptor
public class AuditoriaInterceptor {
    
    @AroundInvoke
    public Object auditar(InvocationContext context) throws Exception {
        System.out.println("Auditoría: Se está ejecutando el método " + context.getMethod().getName());
        Pedido pedido = (Pedido) context.getTarget();
        System.out.println("Auditoría: Nombre del pedido: " + pedido.getNombre());
        
        Object result = context.proceed();
        System.out.println("Auditoría: Método " + context.getMethod().getName() + " ejecutado con éxito");

        return result;
    }
}