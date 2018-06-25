package org.cloris.service.implement;

import java.util.List;

import org.cloris.dao.ProductInfoRepository;
import org.cloris.domain.ProductInfo;
import org.cloris.service.ProductService;
import org.cloris.util.ProductStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cloris 
 * @data 2018-06-25
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductInfoRepository productInfoRepository;

	@Override
	public List<ProductInfo> findUpAll() {

		return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
	}

}
