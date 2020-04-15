package main;

import Model.Product;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

public class Main {

	public static void main(String[] args) {
		try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
			ProductRepository productRepository = c.getBean(ProductRepository.class);
			productRepository.getProducts().stream().forEach(System.out::println);
		}
	}
}
