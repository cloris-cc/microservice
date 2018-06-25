package org.cloris.service.implement;

import java.util.List;

import org.cloris.dao.ProductCategoryRepository;
import org.cloris.domain.ProductCategory;
import org.cloris.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cloris 
 * @data 2018-06-25
 */
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Override
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {

		return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
	}

}
