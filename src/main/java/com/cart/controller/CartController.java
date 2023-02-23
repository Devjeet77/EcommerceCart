package com.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cart.entity.Account;
import com.cart.entity.Cart;
import com.cart.services.CartService;

@RestController
@CrossOrigin
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping("/cart")
	public Cart addCart(@RequestBody Cart cart) throws Exception{
		return cartService.addCart(cart);
	}
	@GetMapping("/cart/get")
	public List<Cart> getCart(){
		return cartService.getCart();
	}
	
	@PostMapping("/cart/user")
	public List<Cart> getCartByUser(@RequestBody Account account) throws Exception{
		return cartService.getCartByUser(account);
	}
	
	@DeleteMapping("/cart/delete/{id}")
	public void deleteCart(@PathVariable String id) throws Exception{
		cartService.deleteCart(Long.parseLong(id));
	}
}
