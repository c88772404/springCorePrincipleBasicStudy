package hello.core.beandefinition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanDefinitionTest {
    GenericXmlApplicationContext ac = new GenericXmlApplicationContext(new String[]{"appConfig.xml"});

    public BeanDefinitionTest() {
    }

    @Test
    @DisplayName("빈 설정 메타정보 확인")
    void findApplicationBean() {
        String[] beanDefinitionNames = this.ac.getBeanDefinitionNames();
        String[] var2 = beanDefinitionNames;
        int var3 = beanDefinitionNames.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String beanDefinitionName = var2[var4];
            BeanDefinition beanDefinition = this.ac.getBeanDefinition(beanDefinitionName);
            if (beanDefinition.getRole() == 0) {
                System.out.println("beanDefinitionName = " + beanDefinitionName + " beanDefinition = " + beanDefinition);
            }
        }

    }
}