package learning.dilearning;

import learning.dilearning.controllers.ConstructorInjectedController;
import learning.dilearning.controllers.MyController;
import learning.dilearning.controllers.PropertyInjectedController;
import learning.dilearning.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiLearningApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiLearningApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
