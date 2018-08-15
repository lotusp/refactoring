package com.lotusp.refactoring.entity;

public class Customer {

    private String fullname;

    private String mobile;

    private String homePhone;

    private String workPhone;

    private String province;

    private String city;

    private String street;

    private String address;

    public String getAddress() {
        return province + city + street + address;
    }

}
