package com.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.constants.MessageConstants;
import com.dairy.dto.branch.BranchResponseDto;
import com.dairy.dto.feedcompany.FeedcompanyRequestDto;
import com.dairy.dto.feedcompany.FeedcompanyResponseDto;
import com.dairy.service.FeedcompanyService;



@RestController
@RequestMapping("/feedcompany")
public class FeedcompanyController {

	@Autowired
	private FeedcompanyService feedcompanyService;
	
	
	
	
	@PostMapping
	public ResponseEntity<String> addfeedcompany(@RequestBody FeedcompanyRequestDto dto) {
		boolean isAdded =feedcompanyService.addfeedcompany(dto);
	
		if ( isAdded )
			return ResponseEntity.status( HttpStatus.CREATED ).body( MessageConstants.ADD_FEEDCOMPANY_SUCCESS_MESSAGE );

		else
			return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( MessageConstants.ADD_FEEDCOMPANY_ERROR_MESSAGE );
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<FeedcompanyResponseDto> findById(@PathVariable Long id) {
		FeedcompanyResponseDto responseDto = feedcompanyService.findById(id);
		return ResponseEntity.status( HttpStatus.OK ).body(responseDto);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<FeedcompanyResponseDto>> findAll() {
		return new ResponseEntity<>( feedcompanyService.findAll(), HttpStatus.OK );
	}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

