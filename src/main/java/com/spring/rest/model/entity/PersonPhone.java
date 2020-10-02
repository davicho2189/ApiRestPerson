package com.spring.rest.model.entity;

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
@Table(name="person_phone")
public class PersonPhone {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long phoneId;
	private String number;
	private String typephone;
}
