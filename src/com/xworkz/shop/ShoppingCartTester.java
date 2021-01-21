package com.xworkz.shop;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.shop.dto.ShoppingCartDTO;

public class ShoppingCartTester {

	public static void main(String[] args) {
		
		ShoppingCartDTO cartDTO=new ShoppingCartDTO();
		cartDTO.setItemName("Selwar");
		cartDTO.setPrice(2000);
		cartDTO.setQuantity(1);
		
		ShoppingCartDTO cartDTO2=new ShoppingCartDTO();
		cartDTO2.setItemName("Shoe");
		cartDTO2.setPrice(1500);
		cartDTO2.setQuantity(1);
		
		Collection<ShoppingCartDTO> cart=new ArrayList<ShoppingCartDTO>();
		cart.add(cartDTO);
		cart.add(cartDTO2);
		
		ShoppingCartDTO cartDTO3=new ShoppingCartDTO();
		cartDTO3.setItemName("pant");
		cartDTO3.setPrice(5000);
		cartDTO3.setQuantity(1);
		
		boolean contain=cart.contains(cartDTO3);
		System.out.println(contain);
		if(contain) {
			System.out.println("Already there in cart");
		}else {
			System.out.println("Added to the cart");
			cart.add(cartDTO3);
		}
		System.out.println("After the cart");
		System.out.println(cart.size());
	}

}
