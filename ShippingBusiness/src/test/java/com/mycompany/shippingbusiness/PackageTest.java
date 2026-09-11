package com.mycompany.shippingbusiness;

import junit.framework.TestCase;

public class PackageTest extends TestCase {

    public void testConstructor() {
        Address senderAddress1 = new Address("Vo Van Ngan", 1, "Thu Duc");
        Address recipientAddress1 = new Address("Le Van Viet", 484, "Thu Duc");
        Person sender1 = new Person("Pham Gia Minh", "09888888", senderAddress1);
        Person recipient1 = new Person("Pham Thanh Phong", "098888881", recipientAddress1);
        Boxsize boxSize1 = new Boxsize(12, 45, 13);
        Package package1 = new Package(boxSize1, 42, sender1, recipient1, "www.example.com");

        APackageList list = new Empty();
        list = new Cons(package1, list);

        assertNotNull(package1);
        assertTrue(list instanceof Cons);
    }
}
