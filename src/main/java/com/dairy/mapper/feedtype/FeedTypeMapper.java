package com.dairy.mapper.feedtype;

import org.springframework.stereotype.Component;

import com.dairy.dto.feedtype.FeedTypeRequestDto;
import com.dairy.entity.FeedCompany;
import com.dairy.entity.FeedType;

@Component
public class FeedTypeMapper {

	public FeedType toEntity(FeedTypeRequestDto dto) {
		if (dto == null) {
			return null;
		}
		FeedType feedType = new FeedType();
		feedType.setType(dto.getType());
		return feedType;
	}
}
