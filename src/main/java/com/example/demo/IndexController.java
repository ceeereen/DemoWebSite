package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.example.demo.myproject.client;
import com.example.demo.repository.CustomerRepository;


@Controller
public class IndexController {

    @Autowired
    private CustomerRepository clientRepository;
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/register")
    public String clientRegistration(@ModelAttribute client client, Model model){
        System.out.println(client.toString());
        System.out.println(client.getName());
        System.out.println(client.getSurname());

        /*model.addAttribute("name", client.getName());
        model.addAttribute("surname", client.getSurname());*/

        client client_inserted = clientRepository.save(client);
        model.addAttribute("message", client_inserted.getName() + "inserted");
        
        return "welcome";
    }
}
