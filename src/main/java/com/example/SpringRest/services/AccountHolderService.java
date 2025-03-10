package com.example.SpringRest.services;

import com.example.SpringRest.entities.AccoutHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountHolderService {
    List<AccoutHolder> list = new ArrayList<>();

    public AccountHolderService(){
        list.add(new AccoutHolder("Shyam",111112));
        list.add(new AccoutHolder("Ram",111113));
        list.add(new AccoutHolder("Ayush",111115));
    }

    public List<AccoutHolder> getAccountHolders(){
        return list;
    }

    public AccoutHolder getAccoutHolderById(String accountNumber){
        AccoutHolder accoutHolder = null;
        for(AccoutHolder a : list){
            if (a.getAccountNumber() == Long.parseLong(accountNumber)){
                accoutHolder =  a;
                break;
            }
        }
        return accoutHolder;
    }

    public AccoutHolder addAccout(AccoutHolder accoutHolder){
        list.add(accoutHolder);
        return accoutHolder;
    }

    public AccoutHolder deleteAccoutHolderById(String accountNumber){
        AccoutHolder accoutHolder = null;
        for(AccoutHolder a : list){
            if (a.getAccountNumber() == Long.parseLong(accountNumber)){
                accoutHolder = a;
                list.remove(a);
                break;
            }
        }
        return accoutHolder;
    }

    public boolean updateAccountHolder(String accountNumber, String newName) {
        AccoutHolder acc = getAccoutHolderById(accountNumber);
        if (acc != null) {
            acc.setName(newName);
            return true; // Update successful
        }
        return false; // Account not found
    }


}
