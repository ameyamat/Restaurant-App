package RestaurantApp.Restaurant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class checkController {
    @GetMapping("/hello")
    public String getCheck(){
        return "ok";
    }


}
