package com.dairy.mapper.feedcompany;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dairy.dto.branch.BranchResponseDto;
import com.dairy.dto.feedcompany.FeedcompanyRequestDto;
import com.dairy.dto.feedcompany.FeedcompanyResponseDto;
import com.dairy.entity.Branch;
import com.dairy.entity.Feedcompany;

@Component
public class FeedcompanyMapper {
	
	
	public Feedcompany toEntity( FeedcompanyRequestDto feedcompanyRequestDto ) {
		
		if(feedcompanyRequestDto == null){
		return null;
		
		}

	 Feedcompany feedCompany = new Feedcompany();
	 feedCompany.setId(feedcompanyRequestDto.getId());
	 feedCompany.setName(feedcompanyRequestDto.getName());
	return feedCompany;
	 
		
	}

	public FeedcompanyResponseDto toFeedompanyResponce( Feedcompany feedcompany) {
	
		 

		  FeedcompanyResponseDto feedCompanyResponseDto = new FeedcompanyResponseDto();
		  feedCompanyResponseDto.setId(feedcompany.getId());
		  feedCompanyResponseDto.setName(feedcompany.getName());
		  
		    return feedCompanyResponseDto;
	}

	public List<FeedcompanyResponseDto> toList( List<Feedcompany> list ) {
		List<FeedcompanyResponseDto> dtos = new ArrayList<FeedcompanyResponseDto>();
		for ( Feedcompany feedcompany : list ) {
			dtos.add( toFeedompanyResponce( feedcompany ) );
		}
		return dtos;

	}

	
	}
	
	

