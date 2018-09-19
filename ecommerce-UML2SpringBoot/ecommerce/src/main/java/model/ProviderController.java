package model;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProviderController {

    @RequestMapping("/provider")
    public String index() {
        return "Greetings from ProviderController!";
    }

}
