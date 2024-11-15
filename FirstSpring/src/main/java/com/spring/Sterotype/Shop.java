package com.spring.Sterotype;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;

@Component
public class Shop {
	@Value("hare shop ")
    private String shopName;
	@Value("Nagpur ")
    private String city;

    // Default constructor required by Spring
    public Shop() {
    }

    // Parameterized constructor
    public Shop(String shopName, String city) {
        this.shopName = shopName;
        this.city = city;
    }

    // Getter and setter for shopName
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    // Getter and setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Shop [shopName=" + shopName + ", city=" + city + "]";
    }
}
