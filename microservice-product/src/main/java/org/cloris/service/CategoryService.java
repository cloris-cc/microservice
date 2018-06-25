package org.cloris.service;
/**
 *
 * @author cloris 
 * @data 2018-06-25
 */

import java.util.List;

import org.cloris.domain.ProductCategory;

public interface CategoryService {
	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
