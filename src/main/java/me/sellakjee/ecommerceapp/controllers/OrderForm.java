package me.sellakjee.ecommerceapp.controllers;

import lombok.Data;
import me.sellakjee.ecommerceapp.entities.Client;

import java.util.ArrayList;
import java.util.List;
@Data
public class OrderForm {
    private Client client=new Client();
    private List<OrderProduct> products=new ArrayList<>();
}
@Data
class OrderProduct{
    private Long id;
    private int quantity;
}
