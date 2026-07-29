package com.dcl.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	@Id
     private Integer movieId;
	
	//@Column(unique=true,nullable=false)
     private String movieName;
     private String langauge;
     private double budget;
}
