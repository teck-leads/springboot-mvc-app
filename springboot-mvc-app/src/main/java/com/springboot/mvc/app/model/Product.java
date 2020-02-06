package com.springboot.mvc.app.model;

import java.util.List;

import lombok.Data;

@Data
public class Product {
	private Integer prodId;
	private String prodCode;
	private Double prodCost;
	private String prodModel;
	private String prodDesc;
	private String prodFormat;
	private List<String> prodGrd;
	private List<String> prodBrnd; 

}
