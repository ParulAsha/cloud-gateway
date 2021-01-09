package com.codebuffer.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {


    @GetMapping("/userServiceFallBack")
    public String userFallBackMethod()
    {
        return "User service is taking longer than uusual time, Please try again";
    }

      @GetMapping("/departmentServiceFallBack")
    public String departmentFallBackMethod()
    {
        return "User service is taking longer than uusual time, Please try again";
    }
}
