package net.kzn.onshoppinbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.onshoppinbackend.dao.ProductDao;

import net.kzn.onshoppinbackend.dto.Product;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;
	private static ProductDao productDao;
	private Product product;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("net.kzn.onshoppinbackend");
		context.refresh();
		productDao=(ProductDao) context.getBean("product");
	}
	
	@Test
	public void CRUDTest()
	{
		/*Product product=new Product();
		product.setName("OppoF5");
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		product.setDescription("This is mobile phone");
		product.setUnitPrice(10_000);
		product.setBrand("oppo");
		
		//insert/add product into Product table
		assertEquals("Somthing gone wrong doing add in Product",true, productDao.add(product));
		
		//fetch and update single operation
		product=productDao.get(9);
		product.setName("OPPO4");
		productDao.update(product);
		assertEquals("Somthing gone wrong doing update in Product","OPPO4", productDao.get(9).getName());
		
		//delete
		product=productDao.get(9);
		
		assertEquals("Somthing gone wrong doing delete in Product",true,productDao.delete(product));
		

		assertEquals("Somthing gone wrong doing fetch whole list",9,productDao.list().size());*/
		
		
		
	}

	@Test
	public void testlistActiveProductsByCategory()
	{
		assertEquals("Somthing gone wrong doing fetch list of Active Products By Category",5,productDao.listActiveProductsByCategory(6).size());
		assertEquals("Somthing gone wrong doing fetch list of Active Products By Category",2,productDao.listActiveProductsByCategory(1).size());
	}
	
	@Test
	public void testlistActiveProducts()
	{
		assertEquals("Something gone wrong doing fetch list of Active Products",9,productDao.listActiveProducts().size());
	}

	@Test
	public void testgetLatestActiveProducts()
	{
		assertEquals("Somthing gone wrong doing fetch list latest Active Products",3,productDao.getLatestActiveProducts(3).size());
	}
	
	
}
