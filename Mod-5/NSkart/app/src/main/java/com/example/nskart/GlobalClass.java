package com.example.nskart;

import java.util.HashMap;


public class GlobalClass {

    public static HashMap<String, CartItem> cart;

    static  {
        cart = new HashMap<>();
    }
}
