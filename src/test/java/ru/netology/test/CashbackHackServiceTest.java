package ru.netology.test;

import ru.netology.CashBackHack;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void testPurchase() {

        CashBackHack service = new CashBackHack();

        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testPurchase_1() {

        CashBackHack service = new CashBackHack();

        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testPurchase_2() {

        CashBackHack service = new CashBackHack();

        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testPurchase_3() {

        CashBackHack service = new CashBackHack();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testPurchase_4() {

        CashBackHack service = new CashBackHack();

        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void testPurchase_5() {

        CashBackHack service = new CashBackHack();

        int amount = 1001;
        int expected = 999;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void testPurchase_6() {

        CashBackHack service = new CashBackHack();

        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(actual, expected);
    }
}
