package com.dairy.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dairy.dto.feedcompany.FeedcompanyRequestDto;
import com.dairy.dto.feedcompany.FeedcompanyResponseDto;
import com.dairy.entity.Feedcompany;

import com.dairy.mapper.feedcompany.FeedcompanyMapper;
import com.dairy.repository.FeedcompanyRepository;
import com.dairy.service.FeedcompanyService;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@Slf4j
public class FeedcompanyServiceImpl implements FeedcompanyService {

	@Autowired
	private FeedcompanyRepository feedcomponyRepository;

	@Autowired
	private FeedcompanyMapper feedcompanyMapper;

	@Autowired
	private Feedcompany feedcompany;
	
	                          // ADD FINDCOMPANY 
	
	@Override
	public boolean addfeedcompany(FeedcompanyRequestDto dto) {
		try {
			Feedcompany feedcompany = feedcompanyMapper.toEntity(dto);
			feedcomponyRepository.save(feedcompany);
			return true;

		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return false;

	}
                                       // FINDCOMPANY BY ID                                     
	@Override
	public FeedcompanyResponseDto findById(Long id) {

		Optional<Feedcompany> opt = feedcomponyRepository.findById(id);
		if (opt.isPresent()) {
			Feedcompany feedcompany = opt.get();
			return feedcompanyMapper.toFeedompanyResponce(feedcompany);
		}

		return null;
	}
	                              // FINDALL FEEDCOMPANIES

	@Override
	public List<FeedcompanyResponseDto> findAll() {
		List<Feedcompany> feedcompany = (List<Feedcompany>) feedcomponyRepository.findAll();
		return feedcompanyMapper.toList(feedcompany);
	}

}