package shahid.foy.resourceservice.feignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "user-service")
public interface UserServiceFeign {

    @GetMapping("/api/hello")
    String getHello();
}
