package org.actuate.business;

	import java.util.ArrayList;
	import java.util.List;

import org.actuate.model.Product;

	public class ProductServiceImpl {

		List<String> bookList = new ArrayList<>();
		List<String> musicList = new ArrayList<>();
		List<String> movieList = new ArrayList<>();
		public ProductServiceImpl() {
			bookList.add("Inferno");
			bookList.add("Joyland");
			bookList.add("The Game of Thrones");
			
			musicList.add("Random Access Memories");
			musicList.add("Night Visions");
			musicList.add("Unorthodox Jukebox");
			
			movieList.add("Oz the Great and Powerful");
			movieList.add("Despicable Me");
			movieList.add("Star Trek Into Darkness");
		}
		
		public List<String> getProductCategories(){
			List<String> categories = new ArrayList<>();
			
			categories.add("Books");
			categories.add("Music");
			categories.add("Movies");
			
			return categories;
		}
		
		public List<String> getProduct(String category){
			switch(category.toLowerCase()) {
				case "books":
					return bookList;
				case "music":
					return musicList;
				case "movies":
					return movieList;
			}
			return null;
		}
		
		public boolean addProduct(String category, String product) {
			switch(category.toLowerCase()) {
			
				case "books":
					bookList.add(product);
					break;
				case "music":
					musicList.add(product);
					break;
				case "movies":
					movieList.add(product);
					break;
				default:
						return false;
			}
			return true;
		}

		public List<Product> getProductList(String category) {
			List<Product> productList = new ArrayList<>();
			productList.add(new Product("Book1","123",123.45));
			productList.add(new Product("Book2","321",321.54));
			return productList;
		}
	}
