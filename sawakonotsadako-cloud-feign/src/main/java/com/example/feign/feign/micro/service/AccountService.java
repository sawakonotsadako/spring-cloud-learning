package com.example.feign.feign.micro.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@FeignClient(value = "account", fallback = FeignCustomerServiceFallback.class)
@Service("accountService")
public interface AccountService {




}
