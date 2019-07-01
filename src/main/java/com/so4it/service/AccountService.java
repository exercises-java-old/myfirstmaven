package com.so4it.service;

public interface AccountService {
    Double getBalance(Long id);

    Double calculateInterest(Long id);
}
