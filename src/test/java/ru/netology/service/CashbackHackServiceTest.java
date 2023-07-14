package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();

        int amount = 3000;

        int expected = 1000;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}