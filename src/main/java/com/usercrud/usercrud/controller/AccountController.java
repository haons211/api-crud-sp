package com.usercrud.usercrud.controller;
import org.springframework.ui.Model;

import com.usercrud.usercrud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // This should match the name of your HTML file without the extension
    }

    @PostMapping("/register")
    public String saveAccount(@RequestParam String userName, @RequestParam String passWord,Model model) {
        accountService.addNewAccount(userName, passWord);
        model.addAttribute("message", "User registered successfully");
        return "register";
    }
//    @GetMapping
//    public  List<Accounts>
}
