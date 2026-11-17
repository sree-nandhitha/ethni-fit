package ethnifit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public String products() {
        return """
                [
                    {
                        "name":"Lehenga",
                        "price":2500
                    },
                    {
                        "name":"Saree",
                        "price":1800
                    }
                ]
                """;
    }
}
