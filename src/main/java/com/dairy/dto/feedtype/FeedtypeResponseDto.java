package com.dairy.dto.feedtype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedtypeResponseDto {

	private Long id ;
	private String type;
	private Long feedcompanyId;
}
