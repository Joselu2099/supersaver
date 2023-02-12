package com.joselu_dani.supersaver;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.stream.IntStream;

import com.joselu_dani.supersaver.dto.UserDto;
import com.joselu_dani.supersaver.service.LocationService;
import com.joselu_dani.supersaver.service.ProductService;
import com.joselu_dani.supersaver.service.SupermarketService;
import com.joselu_dani.supersaver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.javafaker.Faker;
import com.joselu_dani.supersaver.model.Product;
import com.joselu_dani.supersaver.model.Supermarket;
import com.joselu_dani.supersaver.model.Location;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SupersaverApplication {

	@Autowired
	private SupermarketService supermarketService;
	@Autowired
	private ProductService productService;
	@Autowired
	private LocationService locationService;
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SupersaverApplication.class, args);
	}

	@Bean
	public CommandLineRunner init() {
		Faker faker = new Faker(new Locale("es-ES"));
		return args -> {
			if(locationService.findAll().isEmpty()) {
				IntStream.range(0, 20).forEach(i -> {
					Location location = new Location();
					location.setAddress(faker.address().fullAddress());
					location.setPostalCode(Integer.parseInt(faker.address().zipCode()));
					location.setCity(faker.address().city());
					location.setCountry(faker.address().country());
					locationService.saveLocation(location);

					Supermarket supermarket = new Supermarket();
					String supermarketName = faker.company().name();
					supermarket.setName(supermarketName);
					supermarket.setImage(faker.company().logo());
					supermarket.setLocation(location);
					supermarketService.saveSupermarket(supermarket);

					IntStream.range(0, 10).forEach(j -> {
						Product product = new Product();
						int numRandom = faker.number().numberBetween(1,3);
						String productName = switch (numRandom) {
							case 1 -> faker.food().fruit();
							case 2 -> faker.food().vegetable();
							case 3 -> faker.food().ingredient();
							default -> "milk";
						};
						product.setName(productName);
						product.setBrand(faker.company().name());
						String priceString = faker.commerce().price(0.2, 20.0);
						priceString = priceString.replace(",", ".");
						double price = Double.parseDouble(priceString);
						product.setPrice(price);
						product.setImage(faker.avatar().image());
						//product.setImage(productName + ".png");
						product.setSupermarket(supermarket);
						productService.saveProduct(product);
					});
				});
			}
		};
	}
}

