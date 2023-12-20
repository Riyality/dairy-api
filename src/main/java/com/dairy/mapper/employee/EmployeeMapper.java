package com.dairy.mapper.employee;

import org.springframework.stereotype.Component;

import com.dairy.dto.employee.EmployeeRequestDto;
import com.dairy.dto.employee.EmployeeResponseDto;
import com.dairy.entity.Branch;
import com.dairy.entity.Employee;

@Component
public class EmployeeMapper {

	public Employee toEntity( EmployeeRequestDto employeeRequestDto, Branch branch ) {
		if ( employeeRequestDto == null ) {
			return null;
		}

		Employee employee = new Employee();
		employee.setName( employeeRequestDto.getName() );
		employee.setContact( employeeRequestDto.getContact() );
		employee.setAddress( employeeRequestDto.getAddress() );
		employee.setDateOfJoining( employeeRequestDto.getDateOfJoining() );
		employee.setBranch( branch );

		return employee;
	}

	public EmployeeResponseDto toEmployeeResponseDto( Employee employee ) {
		if ( employee == null ) {
			return null;
		}

		EmployeeResponseDto responseDto = new EmployeeResponseDto();
		responseDto.setId( employee.getId() );
		responseDto.setName( employee.getName() );
		responseDto.setContact( employee.getContact() );
		responseDto.setAddress( employee.getAddress() );
		responseDto.setDateOfJoining( employee.getDateOfJoining() );

		if ( employee.getBranch() != null ) {
			responseDto.setBranchId( employee.getBranch().getId() );
			responseDto.setBranchName( employee.getBranch().getName() );
		}

		return responseDto;
	}
}
