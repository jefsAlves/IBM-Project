package com.ibm.application.projectibm.adapter;

import java.util.List;
import java.util.stream.Collectors;

import com.ibm.application.projectibm.dto.MovieDTO;
import com.ibm.application.projectibm.entities.MovieEntity;

public class MovieDTOAdapter {

	public static MovieDTO toDTO(MovieEntity e) {

		if (e == null)
			return null;
		MovieDTO movieDto = new MovieDTO();
		movieDto.setTitle(e.getTitle());
		movieDto.setYear(e.getYear());
		movieDto.setImdbID(e.getImdbID());
		return movieDto;
	}

	public static List<MovieDTO> toDTO(List<MovieEntity> es) {
		if (es == null)
			return null;
		return es.stream().map(e -> toDTO(e)).collect(Collectors.toList());
	}
}
