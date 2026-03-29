package RestController.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class HelloController {
    @GetMapping("/you")
    public String greet(){

    return "HEllow My Friend";
}

@GetMapping("/welocme")
    public String welocme(){
        return "Welcomes you ";
}
@GetMapping("/user")
    public User getUser(){
        return new User(1,"Rahul","rahul@gmail.com");
}


}
