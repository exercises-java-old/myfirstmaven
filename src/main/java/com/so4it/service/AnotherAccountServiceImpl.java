package com.so4it.service;

public class AnotherAccountServiceImpl implements  AccountService{

    @Override
    public Double getBalance(Long id) {
        return 42d;
    }

    @Override
    public Double calculateInterest(Long id) {
        return null;
    }
}
