package com.cart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.entity.Account;
import com.cart.entity.Cart;
import com.cart.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Cart addCart(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		return cartRepository.save(cart);
	}

	@Override
	public List<Cart> getCart() {
		// TODO Auto-generated method stub
		return cartRepository.findAll();
	}

	@Override
	public List<Cart> getCartByUser(Account account) throws Exception {
		
		return cartRepository.findByAccount(account);
	}

	@Override
	public void deleteCart(long parseLong) throws Exception {
		// TODO Auto-generated method stub
		Cart check=cartRepository.findById(parseLong).get();
		if(check!=null) {
			cartRepository.deleteById(parseLong);
		}
		else {
			throw new Exception("no product found");
		}
		
	}

}
