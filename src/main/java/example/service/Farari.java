package example.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
class Farari extends Car {
    public String getName() {
        return "Farari";
    }
}
