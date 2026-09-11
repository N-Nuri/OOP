package com.mycompany.shippingbusiness;

public class Package {
    private Boxsize boxSize;
    private double weight;
    private Person sender;
    private Person recipient;
    private String url;

    public Package(Boxsize boxSize, double weight, Person sender, Person recipient, String url) {
        this.setBoxSize(boxSize);
        this.setWeight(weight);
        this.setSender(sender);
        this.setRecipient(recipient);
        this.setUrl(url);
    }

    public Boxsize getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(Boxsize boxSize) {
        this.boxSize = boxSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getRecipient() {
        return recipient;
    }

    public void setRecipient(Person recipient) {
        this.recipient = recipient;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
