package zhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import zhang.entity.User;
import zhang.service.impl.HelloService;

import java.util.List;


@RestController
public class HelloController {
    @Autowired
    HelloService helloService;




    @RequestMapping("/find")
    @ResponseBody
    public List<User> hello(){
        System.out.println("111");
        return helloService.findAll();

    }
}