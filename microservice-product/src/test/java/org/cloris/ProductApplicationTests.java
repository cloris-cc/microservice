package org.cloris;

import java.util.Arrays;
import java.util.List;

import org.cloris.dao.ProductCategoryRepository;
import org.cloris.dao.ProductInfoRepository;
import org.cloris.domain.ProductCategory;
import org.cloris.domain.ProductInfo;
import org.cloris.service.CategoryService;
import org.cloris.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductApplicationTests {
	@Autowired
	private ProductInfoRepository productInfoRepository;

	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;

	// @Test
	public void findByProductStatus() throws Exception {
		List<ProductInfo> list = productInfoRepository.findByProductStatus(1);
		System.out.println(list);
	}

	// @Test
	public void findByCategoryTypeIn() {
		List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 22));
		System.out.println(list);
	}

	// @Test
	public void findUpAll() {
		List<ProductInfo> list = productService.findUpAll();
		System.out.println(list);
	}

	@Test
	public void test() {
		List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
		System.out.println(list);
	}

}
