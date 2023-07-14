package ru.netology.service;
import org.testng.annotations.Test;

class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3000;

        int actual = service.remain(amount);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual, expected);
    }
}