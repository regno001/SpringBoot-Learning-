package MiniProject.db;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class DataBaseConnection {
    private List<String> users;

    public void init(){
        users= new ArrayList<>();
        System.out.println("DB Connected (Simulated)");
    }
    public List<String> getUsers(){
        return users;
    }

    public void addUSer(String user){
        users.add(user);
    }

    public void cleanup(){
        System.out.println("DB Disconnected");
    }
}
