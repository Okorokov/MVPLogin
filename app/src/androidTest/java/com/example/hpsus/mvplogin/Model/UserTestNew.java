package com.example.hpsus.mvplogin.Model;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class UserTestNew {

    @Test
    public void UserEmailEmptyPasswordNoEmpty() {
        User user=new User(null,"password");
        boolean result=user.isValidData();
        assertFalse(result);
    }

    @Test
    public void UserEmailNoEmptyPasswordEmpty() {
        User user=new User("asd@asd.ru",null);
        boolean result=user.isValidData();
        assertFalse(result);
    }

    @Test
    public void UserEmailEmptyPasswordEmpty() {
        User user=new User(null,null);
        boolean result=user.isValidData();
        assertFalse(result);
    }

    @Test
    public void UserEmailNoMatchDogPasswordMatch() {
        User user=new User("asdasd.ru","password");
        boolean result=user.isValidData();
        assertFalse(result);
    }

    @Test
    public void UserEmailNoMatchPointPasswordMatch() {
        User user=new User("asd@asdru","password");
        boolean result=user.isValidData();
        assertFalse(result);
    }

    @Test
    public void UserEmailNoMatchDogPointPasswordMatch() {
        User user=new User("asdasdru","password");
        boolean result=user.isValidData();
        assertFalse(result);
    }

    @Test
    public void UserEmailMatchPasswordNoMatchLengthLess6() {
        User user=new User("asd@asd.ru","passwo");
        boolean result=user.isValidData();
        assertFalse(result);
    }
}