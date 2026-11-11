package pa2_u1_cc_ka_repaso.interceptors;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@SMS 
@Interceptor  
public class SMSInterceptor {
    
    @AroundInvoke 
    public Object enviarSMS(InvocationContext context) throws Exception {
        System.out.println("[SMS].....");
        System.out.println("Interceptando el envío de SMS...");
        Object result = context.proceed();
        System.out.println("SMS enviado con éxito!");
        return result;
    }


}