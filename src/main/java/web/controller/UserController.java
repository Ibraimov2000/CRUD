package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import web.service.UserService;



@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String main() {
        return "user-list";
    }

//    @GetMapping("/user-create")
//    public String createUserForm(User user) {
//        return "redirect:/user-create";
//    }
//
//    @PostMapping("/user-create")
//    public String createUser(User user) {
//        userService.create(user);
//        return "redirect:/user-list";
//    }
//
//    @GetMapping("user-delete/{id}")
//    public String deleteUser(@PathVariable("id") User user) {
//        userService.delete(user);
//        return "redirect:/user-list";
//    }
//
//    @GetMapping("/user-update/{id}")
//    public String updateUserForm(@PathVariable("id") Long id, Model model) {
//        User user = userService.read(id);
//        model.addAttribute("user", user);
//        return "redirect:/user-update";
//    }
//
//    @PostMapping("/user-update")
//    public String updateUser(User user) {
//        userService.create(user);
//        return "redirect:/user-update";
//    }
}
