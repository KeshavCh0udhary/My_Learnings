package com.Classes;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.Classes.Product;
import com.Classes.ProductRepo;

import com.masai.utility.EMUtil;

@Repository
public class ProductRepoImpl implements ProductRepo {

	public boolean insertProductDetails(Product product) {
EntityManager em= EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(product);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		
		return true;
	}

	public List<Product> getAllProductDetails() {
EntityManager em= EMUtil.provideEntityManager();
		
		Query q= em.createQuery("from Product");
		
		List<Product> products= q.getResultList();
		
		em.close();
		
		return products;
	}

	public Product findProduct(int productId) {
		EntityManager em= EMUtil.provideEntityManager();
	
		
		
		return em.find(Product.class, productId);
	}

	public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
		EntityManager em= EMUtil.provideEntityManager();
Query q= em.createQuery("from Product");
		
		List<Product> products= q.getResultList();
		
		List<Product> psl=new ArrayList<>();
		
		
		for(Product p:products) {
			if(p.getPrice()>fromPrice && p.getPrice()<toPrice)psl.add(p);
		}
		em.close();
		
		return psl;
	}

}
