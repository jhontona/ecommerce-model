package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ShoppingCartController {

    @RequestMapping("/shoppingcart")
    public String index() {
        return "Greetings from ShoppingCartController!";
    }

}
