package sd.majid.Oshare249.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sd.majid.Oshare249.other.User;
import sd.majid.Oshare249.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public @ResponseBody List<User> getUser(){
        return userService.getUsers();
    }
}
