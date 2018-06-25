package org.cloris.service;

import java.util.List;

import org.cloris.domain.ProductInfo;

/**
 * 
 * @author cloris
 * @data 2018-06-25
 */
public interface ProductService {

	/**
	 * 查询所有在架商品列表
	 */
	List<ProductInfo> findUpAll();

}
