package com.axelor.product.controller;

import java.math.BigDecimal;
import java.util.List;

import com.axelor.app.AppSettings;
import com.axelor.product.db.Order;
import com.axelor.product.db.OrderItem;
import com.axelor.product.db.Product;
import com.axelor.product.db.repo.OrderItemRepository;
import com.axelor.product.db.repo.ProductRepository;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.google.inject.Inject;

public class OrderController {

	@Inject OrderItemRepository orderItemRepository;
	@Inject ProductRepository productRepository;
	
	public void getTotalAmount(ActionRequest request,ActionResponse response) {
		Order order =  request.getContext().asType(Order.class);
		List<OrderItem> orderItemList = orderItemRepository.findByOrderCode(order).fetch();
		BigDecimal totalAmount = BigDecimal.ZERO;
		for(OrderItem item : orderItemList) {
			totalAmount = totalAmount.add(item.getPrice().multiply(new BigDecimal(item.getQuantity())));
		}		
		response.setValue("amount", totalAmount);;
	}
	
	public void getProductPrice(ActionRequest request,ActionResponse response) {
		Product product = request.getContext().asType(Product.class);
		response.setValue("price", product.getPrice());
	}
	
	public void getFilePath(ActionRequest request,ActionResponse response) {
		request.getContext().put("fpath", AppSettings.get().get("file.upload.dir"));
//		response.setValue("fpath", AppSettings.get().get("file.upload.dir"));
		System.out.println("Path : " + request.getContext().get("fpath"));
	}
}