package com.dairy.dto.equipment;

import java.time.LocalDateTime;

import com.dairy.dto.employee.EmployeeRequestDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentRequestDto {
	 private Long id;
	 private String name;
	  private LocalDateTime dateOfPurchase;
	  private Integer quantity;
	  private Float price;
     private Float totalAmount;
}
