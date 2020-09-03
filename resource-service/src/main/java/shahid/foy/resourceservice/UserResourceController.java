package shahid.foy.resourceservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import shahid.foy.resourceservice.feignService.UserServiceFeign;


@RestController
@RequestMapping("api")
public class UserResourceController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    public UserResourceController(UserServiceFeign userServiceFeign) {
        this.userServiceFeign = userServiceFeign;
    }

    @GetMapping(value="/getHelloFromUserService")
    public String getHelloFromUserService() {
        return userServiceFeign.getHello();
    }
    
}
