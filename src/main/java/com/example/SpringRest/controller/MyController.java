package com.example.SpringRest.controller;

import com.example.SpringRest.entities.AccoutHolder;
import com.example.SpringRest.services.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    public AccountHolderService accountHolderService;

    @GetMapping("/home")
    public String home(){
        return "hello welcome to home";
    }

    @GetMapping("/accountholders")
    public List<AccoutHolder> getAccountHolders(){
        return accountHolderService.getAccountHolders();
    }

    @GetMapping("/accountholders/{accountNumber}")
    public AccoutHolder getAccountHolderById(@PathVariable String accountNumber){
        return accountHolderService.getAccoutHolderById(accountNumber);
    }

    @PostMapping("/accountholders/add")
    public AccoutHolder AddAccount(@RequestBody AccoutHolder accoutHolder){
        return accountHolderService.addAccout(accoutHolder);
    }

    @PutMapping("/accountholders/update/{accountNumber}")
    public boolean updateAccountHolder(@RequestBody String accountNumber, String newName) {
        return accountHolderService.updateAccountHolder(accountNumber, newName);

    }

}
