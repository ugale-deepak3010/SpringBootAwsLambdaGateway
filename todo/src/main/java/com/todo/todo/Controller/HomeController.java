package com.todo.todo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping
    public String getMethodName() {
        return "1. /actuator <br>2. /h2-console u:root p:toor jdbc:h2:mem:tododb <br>3. /todo <br>"
                + "4. v3/api-docs or /swagger-ui/index.html";
    }

}
