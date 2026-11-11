package pa2_u1_cc_ka_repaso.interceptors;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

import jakarta.interceptor.InterceptorBinding;

@InterceptorBinding 
@Retention(RetentionPolicy.RUNTIME)
@Target ({ElementType.METHOD, ElementType.TYPE})
public @interface SMS {
    
}
