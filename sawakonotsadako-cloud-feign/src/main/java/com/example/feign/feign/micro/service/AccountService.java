package com.example.feign.feign.micro.service;

import com.example.feign.feign.micro.service.fallback.AccountServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@FeignClient(value = "account", fallback = AccountServiceFallback.class)
@Service("accountService")
public interface AccountService {

    String findByName(String name);

}
