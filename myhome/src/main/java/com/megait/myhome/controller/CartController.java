package com.megait.myhome.controller;

import com.megait.myhome.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;
}
