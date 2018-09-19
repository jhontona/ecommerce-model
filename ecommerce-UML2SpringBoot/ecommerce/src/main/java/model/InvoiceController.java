package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class InvoiceController {

    @RequestMapping("/invoice")
    public String index() {
        return "Greetings from InvoiceController!";
    }

}
