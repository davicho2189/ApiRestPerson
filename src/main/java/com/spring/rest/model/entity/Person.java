package com.spring.rest.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="person")
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String dni;
	private String name;
	@Column(name="last_name")
	private String lastName;	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNac;
//	private String phoneNumber;
//	private Date dateRegister;
//	private String direction;
//	private String email;
	
}
