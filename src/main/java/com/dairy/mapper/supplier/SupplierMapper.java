package com.dairy.mapper.supplier;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dairy.dto.supplier.SupplierRequestDto;
import com.dairy.dto.supplier.SupplierResponseDto;
import com.dairy.entity.Supplier;

@Component
public class SupplierMapper {
	public Supplier toEntity(SupplierRequestDto supplierRequestDto) {
		if (supplierRequestDto == null) {
			return null;
		}
		Supplier supplier = new Supplier();
		supplier.setId(supplierRequestDto.getId());
		supplier.setName(supplierRequestDto.getName());
		supplier.setContact(supplierRequestDto.getContact());
		supplier.setDateOfRegistration(supplierRequestDto.getDateOfRegistration());
		supplier.setAddress(supplierRequestDto.getAddress());

		return supplier;

	}

	public SupplierResponseDto toSupplierResponseDto(Supplier supplier) {
		if (supplier == null) {
			return null;
		}

		SupplierResponseDto responseDto = new SupplierResponseDto();
		responseDto.setId(supplier.getId());
		responseDto.setName(supplier.getName());
		responseDto.setContact(supplier.getContact());
		responseDto.setDateOfRegistration(supplier.getDateOfRegistration());
		responseDto.setAddress(supplier.getAddress());

		if (supplier.getBank() != null) {
			responseDto.setBankId(supplier.getBank().getId());
			responseDto.setBankName(supplier.getBank().getBankName());
			responseDto.setIfscCode(supplier.getBank().getIfscCode());
			responseDto.setBankBranchName(supplier.getBank().getBranchName());
			responseDto.setAccountNumber(supplier.getBank().getAccountNumber());
			responseDto.setUpiId(supplier.getBank().getUpiId());

		}

		return responseDto;

	}

	public List<SupplierResponseDto> toList(List<Supplier> list) {
		List<SupplierResponseDto> dtos = new ArrayList<>();
		for (Supplier entity : list) {
			dtos.add(toSupplierResponseDto(entity));
		}
		return dtos;

	}
}
