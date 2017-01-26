package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lxu1 on 2017-01-25.
 */
@RestController
public class helloController {

    @RequestMapping("/say")
    public String say(String name ) {
        return FancyAlgo.processMessage(name);
    }
}
