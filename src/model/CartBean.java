package model;

import java.util.ArrayList;

public class CartBean {
	
	private String user;
	private ArrayList<ProductBean> voli = new ArrayList<ProductBean>();
	
	public CartBean ()
	{
		this.voli = new ArrayList<ProductBean>();
    }
	
	public float getTotal(){
		
		float tot = 0;
		
		for(ProductBean beans : voli) {
			tot += beans.getPrezzo();
		}
		
		return tot;
	}
	
	public void addProduct(ProductBean pb) {
		this.voli.add(pb);
		
		System.out.println("Elemento aggiunto con successo!");
	}
	
	public void removeProduct(ProductBean pb){
		voli.remove(pb);
	}
	
	public ProductBean getProduct(int i) {
		return this.voli.get(i);
	}
	
	public ArrayList<ProductBean> getAllProduct(){
		return this.voli;
	}
	
	public boolean isEmpty() {
		
		if(this.voli.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void deleteCart() {
		int i = 0;
		
		while(!(this.voli.isEmpty())) {
			this.voli.remove(i);
			i++;
		}
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String uEmail) {
		this.user = uEmail;
	}
	
	public CartBean restoreCart (CartBean cart)
	{
		CartBeanDAO cbd = new CartBeanDAO();
		return cart = cbd.restore(cart.getUser());
	}
	
	public void saveCart (CartBean cart, ProductBean pb) {
		CartBeanDAO cbd = new CartBeanDAO();
		cbd.saveCart(cart, pb);
	}
	
	public void removeFlightDB (ProductBean pb) {
		CartBeanDAO cbd = new CartBeanDAO();
		cbd.deleteFromCart(this.getUser(), pb.getId());
	}
}
