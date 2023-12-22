package com.dairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dairy.constants.MessageConstants;
import com.dairy.dto.feedtype.FeedTypeRequestDto;
import com.dairy.entity.FeedCompany;
import com.dairy.service.FeedTypeService;

@RestController
@RequestMapping("/feedtype")
public class FeedTypeController {

	@Autowired
	FeedTypeService feedTypeService;
	
	
	@PostMapping
	public ResponseEntity<String> addfeed(@RequestBody FeedTypeRequestDto dto) {
		boolean isAdded = feedTypeService.addFeed( dto );
		if ( isAdded )
			return ResponseEntity.status( HttpStatus.CREATED ).body( MessageConstants.ADD_FEEDTYPE_SUCCESS_MESSAGE );

		else
			return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( MessageConstants.ADD_FEEDTYPE_ERROR_MSG );
	}

	}
	

