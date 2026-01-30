package in.ankesh.moneymanager.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@RequestMapping({"status","health"})
public class homeController {
    @GetMapping
    public String health(){
        return "Application is Running...";
    }
}
