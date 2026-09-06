package com.mycompany.exercise513;

import junit.framework.TestCase;

public class TestConstructor extends TestCase {

    public void testConstructor() {
        // tao 3 Book dung du lieu de bai
        Book b1 = new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
        Book b2 = new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
        Book b3 = new Book("Pat Conroy", "Beach Music", 9.50, 1996);
        assertNotNull(b1);
        assertNotNull(b2);
        assertNotNull(b3);

        // reading list rong - dau danh sach
        AList readingList = new Empty();
        assertTrue(readingList instanceof Empty);

        // them tung Book vao reading list bang Cons
        readingList = new Cons(b1, readingList);
        assertTrue(readingList instanceof Cons);

        readingList = new Cons(b2, readingList);
        assertTrue(readingList instanceof Cons);

        readingList = new Cons(b3, readingList);

        // reading list cuoi cung phai la Cons (khong null, khong nem exception luc construct)
        assertNotNull(readingList);
        assertTrue(readingList instanceof Cons);
    }
}
