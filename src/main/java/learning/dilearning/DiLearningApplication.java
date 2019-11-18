package learning.dilearning;

import learning.dilearning.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiLearningApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiLearningApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");
        controller.hello();
    }
}
