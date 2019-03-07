package net.kzn.onshopping.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.onshoppinbackend.dao.CategoryDao;
import net.kzn.onshoppinbackend.dao.ProductDao;
import net.kzn.onshoppinbackend.dto.Category;
import net.kzn.onshopping.exception.ProductNotFoundException;
import net.kzn.onshoppinbackend.dto.Product;




@Controller
public class PageController {
	
	@Autowired
	private CategoryDao categoryDao;  
	
	private static final Logger logger=LoggerFactory.getLogger(PageController.class);
			
	@Autowired
	private ProductDao productDao;
		
	@RequestMapping(value = { "/", "home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
	
		logger.info("inside page controller index method-INFO");
		logger.debug("inside page controller index method-DEBUG");
		//passing list of categories
		mv.addObject("categories",categoryDao.list());
		mv.addObject("userClickHome",true);
		return mv;
	}

	@RequestMapping(value = { "listProducts" })
	public ModelAndView listProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","List of Poducts");
		mv.addObject("userClickListProducts",true);
		return mv;
	}
	
	@RequestMapping(value = { "contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	@RequestMapping(value = { "about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	
	@RequestMapping(value ="/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Products");
		
		//passing list of categories
		
		System.out.println(categoryDao.list());
		
		mv.addObject("categories",categoryDao.list());
		//mv.addObject("products",productDao.list());
		
		
	
	
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
/*	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {		
		ModelAndView mv = new ModelAndView("page");		
		mv.addObject("title","All Products");
		
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		mv.addObject("userClickAllProducts",true);
		return mv;				
	}	
	*/
	
	
	@RequestMapping(value ="/show/category/{id}/products")
	/*@RequestMapping(value="/category/{id}/products")*/
	public ModelAndView showCategoryProducts(@PathVariable("id")int id) {
		ModelAndView mv = new ModelAndView("page");
		
		//CategoryDao fetch single category
		Category category=null;
		category=categoryDao.get(id);
		
		
		
		mv.addObject("title",category.getName());
		
		//passing list of categories
		mv.addObject("categories",categoryDao.list());
		
	//	mv.addObject("categories",productDao.listActiveProductsByCategory(id));
		
		System.out.println(productDao.listActiveProductsByCategory(id));
		//passing single category object
		mv.addObject("category",category);
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
	
	@RequestMapping(value = "/show/{id}/product") 
	public ModelAndView showSingleProduct(@PathVariable int id) throws ProductNotFoundException {
		
		ModelAndView mv = new ModelAndView("page");
		
		Product product = productDao.get(id);
		
		if(product == null) throw new ProductNotFoundException();
		
		// update the view count
		product.setViews(product.getViews() + 1);
		productDao.update(product);
		//---------------------------
		
		mv.addObject("title", product.getName());
		mv.addObject("product", product);
		
		mv.addObject("userClickShowProduct", true);
		
		
		return mv;
		
	}
	/*@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {		
		ModelAndView mv = new ModelAndView("page");
		
		// categoryDAO to fetch a single category
		Category category = null;
		
		category = categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		// passing the single category object
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;				
	}	
	
	*/
	
	
	
	
	
	
	/*@RequestMapping("test")
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting) {
		if(greeting==null)
			greeting="Hello,welcome in web MVC";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", greeting);
		return mv;
	}*/
	
/*	@RequestMapping("/test/{greeting}")
	public ModelAndView test(@PathVariable(value="greeting")String greeting) {
		if(greeting==null)
			greeting="Hello,welcome in web MVC";
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greetings", greeting);
		return mv;
	}*/
}
