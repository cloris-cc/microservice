package org.cloris.util;

import lombok.Getter;

/**
 * 商品状态
 * 
 * @author cloris 
 * @data 2018-06-25
 */
@Getter
public enum ProductStatusEnum {
	UP(0, "在架"), DOWN(1, "下架"),;

	private Integer code;

	private String message;

	ProductStatusEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
