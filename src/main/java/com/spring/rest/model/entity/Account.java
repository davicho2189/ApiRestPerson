package com.spring.rest.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="account")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long accountId;
}
