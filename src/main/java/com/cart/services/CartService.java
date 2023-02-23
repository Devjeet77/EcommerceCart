package com.cart.services;

import java.util.List;

import com.cart.entity.Account;
import com.cart.entity.Cart;

public interface CartService {

	public Cart addCart(Cart cart)throws Exception;

	public List<Cart> getCart();

	public List<Cart> getCartByUser(Account account) throws Exception;

	public void deleteCart(long parseLong) throws Exception;

}
