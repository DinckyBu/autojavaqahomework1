package ru.netology.service;
public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3000;

        int expected = 0;
        int actual = service.remain(amount);


        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3200;

        int expected = 800;
        int actual = service.remain(amount);


        org.junit.Assert.assertEquals(expected, actual);
    }
}