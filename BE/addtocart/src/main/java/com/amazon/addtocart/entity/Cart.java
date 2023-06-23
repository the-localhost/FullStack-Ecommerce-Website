package com.amazon.addtocart.entity;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue
	public long id;

	public UUID productId;
	public UUID userId;

	public Cart() {
		super();
	}

	public Cart(long id, UUID productId, UUID userId) {
		super();
		this.id = id;
		this.productId = productId;
		this.userId = userId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}
}
