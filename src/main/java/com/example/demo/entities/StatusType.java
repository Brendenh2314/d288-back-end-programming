package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatusType {

    private CartStatus cartStatus;

    public enum CartStatus {
        PENDING, ORDERED, CANCELED
    }

    public StatusType(CartStatus cartStatus) {
        this.cartStatus = cartStatus;
    }

    public class CustomerStatus {
    }
}

