package kc.mybatisplus.component;

import org.springframework.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * @author pc
 * @date Create in  2023/5/18
 */
public class ProxyTest {


    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallbacks(new Callback[]{new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("代理开始===========");
                Object result=methodProxy.invokeSuper(o,objects);
                System.out.println("代理结束======");
                return result;
            }
        }});

        enhancer.setCallbackFilter(new CallbackFilter() {
            @Override
            public int accept(Method method) {
                return 0;
            }
        });

      UserService userService= (UserService) enhancer.create();
      userService.a();
    }
}



