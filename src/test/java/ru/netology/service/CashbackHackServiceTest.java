package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void remainCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1200;

        int expected = 800;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainjunit4() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainCashbackjunit4() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1200;

        int expected = 800;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }
}