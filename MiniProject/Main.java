package MiniProject;

import MiniProject.config.AppConfig;
import MiniProject.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserController controller= context.getBean(UserController.class);

        controller.createUser("Aman");
        controller.createUser("Bob");
        controller.listUSers();



    }
}