package com.so4it.service;

import com.so4it.dao.AccountDaoImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountServiceImplTest {

    @Test
    void testIfSingleton(){
        AccountService a1 = new AccountServiceImpl(new AccountDaoImpl());
        AccountService a2 = new AccountServiceImpl(new AccountDaoImpl());

        Assert.assertEquals(a1, a2);
    }

}