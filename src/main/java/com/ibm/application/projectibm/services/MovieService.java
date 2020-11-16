package com.ibm.application.projectibm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.application.projectibm.adapter.MovieDTOAdapter;
import com.ibm.application.projectibm.dto.MovieDTO;
import com.ibm.application.projectibm.entities.MovieEntity;
import com.ibm.application.projectibm.response.Page;

@Service
public class MovieService {

	@Autowired
	public MovieQueryService movieQueryService;

	private final Integer LIMIT = 10;

	public Page<MovieDTO> findByNameContains(String title, Integer page) {

		List<MovieEntity> movieEntities = movieQueryService.findByNameContains(title, page, LIMIT);

		List<MovieDTO> dtos = MovieDTOAdapter.toDTO(movieEntities);

		Integer total = movieQueryService.countMovies(title);

		Page<MovieDTO> pages = new Page<>();
		pages.setData(dtos);
		pages.setPage(page);
		pages.setPerPage(LIMIT);
		pages.setTotal(total);
		pages.setTotalPages(Math.round(total / LIMIT));

		return pages;
	}

}
