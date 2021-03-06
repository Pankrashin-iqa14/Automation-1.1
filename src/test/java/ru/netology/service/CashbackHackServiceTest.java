package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateRemainIfLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void shouldCalculateRemainIfMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void shouldCalculateRemainIfEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual,expected);
    }



}