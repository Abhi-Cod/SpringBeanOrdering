package example.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
class Marcedies extends Car {
    public String getName() {
        return "Marcedies";
    }
}
