package com.example.feign.feign.micro.service.fallback;

import com.example.feign.feign.micro.service.AccountService;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceFallback implements AccountService {
    @Override
    public String findByName(String name) {
        return "default name";
    }
}
