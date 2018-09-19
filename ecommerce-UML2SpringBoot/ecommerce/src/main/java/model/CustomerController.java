package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CustomerController {

    @RequestMapping("/customer")
    public String index() {
        return "Greetings from CustomerController!";
    }

}
