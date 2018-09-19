package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductController {

    @RequestMapping("/product")
    public String index() {
        return "Greetings from ProductController!";
    }

}
