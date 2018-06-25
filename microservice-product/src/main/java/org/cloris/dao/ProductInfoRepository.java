package org.cloris.dao;

import java.util.List;

import org.cloris.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>{

	List<ProductInfo> findByProductStatus(Integer productStatus);
}
