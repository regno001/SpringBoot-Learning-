package MiniProject.config;

import MiniProject.db.DataBaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean(initMethod = "init" ,destroyMethod = "cleanup")
    public DataBaseConnection dataBaseConnection(){
    return new DataBaseConnection();
    }
}
