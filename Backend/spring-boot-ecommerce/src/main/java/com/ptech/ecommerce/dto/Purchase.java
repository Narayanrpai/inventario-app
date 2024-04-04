package com.ptech.ecommerce.dto;

import com.ptech.ecommerce.entity.Address;
import com.ptech.ecommerce.entity.Customer;
import com.ptech.ecommerce.entity.Order;
import com.ptech.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
