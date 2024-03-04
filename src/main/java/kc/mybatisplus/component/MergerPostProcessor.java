package kc.mybatisplus.component;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author pc
 * @date Create in  2023/5/17
 */
@Component
public class MergerPostProcessor implements MergedBeanDefinitionPostProcessor {
    @Override
    public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
//        if(beanName.equals("userService")){
//            MutablePropertyValues pvs=new MutablePropertyValues();
//            OrderService orderService=new OrderService();
//            pvs.add("orderService",orderService);
//            System.out.println(11111111);
//            beanDefinition.setPropertyValues(pvs);
//        }

    }
}
