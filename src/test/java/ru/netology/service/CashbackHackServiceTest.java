package ru.netology.service;

class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3000;

        int expected = 0;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    void remainCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3200;

        int expected = 800;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual,expected);
    }

}