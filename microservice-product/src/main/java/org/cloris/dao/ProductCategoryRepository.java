package org.cloris.dao;

import java.util.List;

import org.cloris.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, String> {
	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
