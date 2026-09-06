package com.mycompany.exercise513;

// Exercise 5.1.3 - phan revision: bookstore voi reading list (danh sach cac Book)
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
        Book b2 = new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
        Book b3 = new Book("Pat Conroy", "Beach Music", 9.50, 1996);

        // reading list la 1 AList (giong het cau truc AList/Empty/Cons cua bai 5.1.4)
        AList readingList = new Empty();
        readingList = new Cons(b1, readingList);
        readingList = new Cons(b2, readingList);
        readingList = new Cons(b3, readingList);
    }
}
