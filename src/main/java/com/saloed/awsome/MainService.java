package com.saloed.awsome;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MainService {

    public void callButton() {
        System.out.println("MainService.callButton " + new Random().nextInt());
    }
}
