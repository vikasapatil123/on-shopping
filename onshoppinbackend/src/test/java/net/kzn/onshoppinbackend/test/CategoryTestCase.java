package net.kzn.onshoppinbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.onshoppinbackend.dao.CategoryDao;
import net.kzn.onshoppinbackend.daoimpl.CategoryDaoImpl;
import net.kzn.onshoppinbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDao categoryDao;
	private Category category;
	
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("net.kzn.onshoppinbackend");
		context.refresh();
		categoryDao=(CategoryDao) context.getBean("cat");  //categoryDao to cat using componentscan
		
	}
	
	/*@Test
	public void testAddCategory()
	{
		category=new Category();
		category.setName("Television1");
		category.setDescription("Desciption for Television");
		category.setImageUrl("BPL.png");
		assertEquals("sucessfully added category in table",true,categoryDao.add(category));
	}*/
	
/*	@Test
	public void testGetCategory()
	{
		//fetch single category
		category=categoryDao.get(2);
		assertEquals("sucessfully get category from table","TV",category.getName());
	}*/
	
/*	@Test
	public void testUpdateCategory()
	{
		//first fecth category
		category=categoryDao.get(2);
		category.setName("TVVEE");
		categoryDao.update(category);
		assertEquals("sucessfully updated category","TVVEE",categoryDao.get(2).getName());
		
	}*/
/*	@Test
	public void testDeleteCategory()
	{
		//fetch and delete(ie. to make status inactive)
		category=categoryDao.get(3);
		assertEquals("sucessfully deleted category",true,categoryDao.delete(category));
		
	}
	*/
	
	/*
	@Test
	public void testListCategory()
	{	//fetch whole list
		assertEquals("sucessfully fetch list",5,categoryDao.list().size());
	}*/
	@Test
	public void CRUDTest()
	{
		category = new Category();
		category.setName("Furnitue");
		category.setDescription("Desciption for Furniture");
		category.setImageUrl("BPL.png");
		assertEquals("sucessfully added category in table", true, categoryDao.add(category));

		category = new Category();
		category.setName("Furnitue");
		category.setDescription("Desciption for Furniture");
		category.setImageUrl("BPL.png");
		assertEquals("sucessfully added category in table", true, categoryDao.add(category));

		// fetch single category
		category = categoryDao.get(2);
		assertEquals("sucessfully get category from table", "TV", category.getName());

		// first and update fecth category
		category = categoryDao.get(2);
		category.setName("TVVEE");
		categoryDao.update(category);
		assertEquals("sucessfully updated category", "TVVEE", categoryDao.get(2).getName());

		// fetch and delete(ie. to make status inactive)
		category = categoryDao.get(3);
		assertEquals("sucessfully deleted category", true, categoryDao.delete(category));

		// fetch whole list
		assertEquals("sucessfully fetch list", 6, categoryDao.list().size());
		
		
	}
	
}
