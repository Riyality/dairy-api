package com.dairy.service;



import java.util.List;

import com.dairy.dto.feedcompany.FeedcompanyRequestDto;
import com.dairy.dto.feedcompany.FeedcompanyResponseDto;

public interface FeedcompanyService {

	 boolean addfeedcompany( FeedcompanyRequestDto dto);

	public FeedcompanyResponseDto findById(Long id);

	List<FeedcompanyResponseDto> findAll();

	

	

	
}
