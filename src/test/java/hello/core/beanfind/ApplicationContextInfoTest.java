//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package hello.core.beanfind;

import hello.core.AppConfig;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(new Class[]{AppConfig.class});

    public ApplicationContextInfoTest() {
    }

    @Test
    @DisplayName("모든 빈 출력하기")
    void findAllBean() {
        String[] beanDefinitionNames = this.ac.getBeanDefinitionNames();
        String[] var2 = beanDefinitionNames;
        int var3 = beanDefinitionNames.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String beanDefinitionName = var2[var4];
            Object bean = this.ac.getBean(beanDefinitionName);
            System.out.println("name = " + beanDefinitionName + " object = " + bean);
        }

    }

    @Test
    @DisplayName("애플리케이션 빈 출력하기")
    void findApplicationBean() {
        String[] beanDefinitionNames = this.ac.getBeanDefinitionNames();
        String[] var2 = beanDefinitionNames;
        int var3 = beanDefinitionNames.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String beanDefinitionName = var2[var4];
            BeanDefinition beanDefinition = this.ac.getBeanDefinition(beanDefinitionName);
            if (beanDefinition.getRole() == 2) {
                Object bean = this.ac.getBean(beanDefinitionName);
                System.out.println("name = " + beanDefinitionName + " object = " + bean);
            }
        }

    }
}
