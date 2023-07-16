package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void remainCashback() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3200;

        int expected = 800;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

}