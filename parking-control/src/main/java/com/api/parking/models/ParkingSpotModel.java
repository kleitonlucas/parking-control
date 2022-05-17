package com.api.parking.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "parking_spot")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotModel{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false, unique = true, length = 10, name = "parking_spot_number")
	private String parkingSpotNumber;
	@Column(nullable = false, unique = true, length = 7, name = "license_plate_car")
	private String licensePlateCar;
	@Column(nullable = false, length = 70, name = "brand_car")
	private String brandCar;
	@Column(nullable = false, length = 70, name = "model_car")
	private String modelCar;
	@Column(nullable = false, length = 70, name = "color_car")
	private String colorCar;
	@Column(nullable = false, name = "registration_date")
	private LocalDateTime registrationDate;
	@Column(nullable = false, length = 130, name = "responsible_name")
	private String responsibleName;
	@Column(nullable = false, length = 30)
	private String apartment;
	@Column(nullable = false, length = 30)
	private String block;
	
}
