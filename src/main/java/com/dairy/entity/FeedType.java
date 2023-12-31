package com.dairy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "feed_types")
public class FeedType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")

	private Long id;

	private String type;

	@ManyToOne
	@JoinColumn(name = "feed_company")
	private FeedCompany feedCompany;

}
