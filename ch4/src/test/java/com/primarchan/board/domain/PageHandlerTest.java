package com.primarchan.board.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class PageHandlerTest {

    @Test
    public void test01() {
        PageHandler ph = new PageHandler(250, 1);
        ph.print();
        assertTrue(ph.beginPage  == 1);
        assertTrue(ph.endPage == 10);
    }

    @Test
    public void test02() {
        PageHandler ph = new PageHandler(250, 11);
        ph.print();
        assertTrue(ph.beginPage  == 11);
        assertTrue(ph.endPage == 20);
    }

    @Test
    public void test03() {
        PageHandler ph = new PageHandler(255, 25);
        ph.print();
        assertTrue(ph.beginPage  == 21);
        assertTrue(ph.endPage == 26);
    }

}