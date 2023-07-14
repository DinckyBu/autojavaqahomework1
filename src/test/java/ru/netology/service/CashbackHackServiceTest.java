package ru.netology.service;
import org.junit.Test;
public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3000;

        int expected = 1000;
        int actual = service.remain(amount);


        org.junit.Assert.assertEquals(expected, actual);
    }
}