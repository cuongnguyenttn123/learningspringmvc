package cuongnguyen.tt.controller;

import cuongnguyen.tt.entity.*;
import cuongnguyen.tt.service.EmployeeService;
import cuongnguyen.tt.service.RoleService;
import cuongnguyen.tt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;
    
    @GetMapping
    public String index(){
        List<RoleEntity> roleEntityList = roleService.findAll();
        List<UserEntity> userEntities = userService.findAll();

        return "home";
    }
}
