package com.ibm.application.projectibm.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.application.projectibm.dto.MovieDTO;
import com.ibm.application.projectibm.response.Page;
import com.ibm.application.projectibm.services.MovieService;

@RestController
@RequestMapping(value = "/api/movies")
public class MovieResource {

	@Autowired
	private MovieService service;

	@GetMapping(value = "/search")
	public ResponseEntity<Page<MovieDTO>> findByNameContains(@RequestParam(name = "Title") String title,
			@RequestParam Integer page) {
		Page<MovieDTO> movies = service.findByNameContains(title, page);
		return ResponseEntity.ok().body(movies);
	}
}
