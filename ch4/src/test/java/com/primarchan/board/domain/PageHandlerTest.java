//package com.primarchan.board.domain;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class PageHandlerTest {
//
//    @Test
//    public void test01() {
//        PageHandler ph = new PageHandler(250, 1);
//        ph.print();
//        assertTrue(ph.getBeginPage()  == 1);
//        assertTrue(ph.getEndPage() == 10);
//    }
//
//    @Test
//    public void test02() {
//        PageHandler ph = new PageHandler(250, 11);
//        ph.print();
//        assertTrue(ph.getBeginPage()  == 11);
//        assertTrue(ph.getEndPage() == 20);
//    }
//
//    @Test
//    public void test03() {
//        PageHandler ph = new PageHandler(255, 25);
//        ph.print();
//        assertTrue(ph.getBeginPage()  == 21);
//        assertTrue(ph.getEndPage() == 26);
//    }
//
//    @Test
//    public void test04() {
//        PageHandler ph = new PageHandler(220, 10);
//        ph.print();
//        assertTrue(ph.getBeginPage()  == 1);
//        assertTrue(ph.getEndPage() == 10);
//    }
//
//}