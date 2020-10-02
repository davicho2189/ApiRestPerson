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
@Table(name="person_card")
public class PersonCard {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long personCardId;
	private String numberCard;
	private String password;
	private Date dateValidFrom;
	private Date dateValidTo;
}
