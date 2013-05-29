package org.example.api;


public class UserBean {

    private String name;
    private String address;
    public int randomId;

    public UserBean(){
        randomId = (int)(Math.random() *100);
    }

    public String getName() {
        return "This si eht eman";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return "This si eht sserdda";
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
