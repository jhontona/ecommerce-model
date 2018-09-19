package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CategoryController {

    @RequestMapping("/category")
    public String index() {
        return "Greetings from CategoryController!";
    }

}
