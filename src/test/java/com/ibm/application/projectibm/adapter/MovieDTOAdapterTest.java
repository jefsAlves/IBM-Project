package com.ibm.application.projectibm.adapter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.ibm.application.projectibm.adapter.MovieDTOAdapter;
import com.ibm.application.projectibm.dto.MovieDTO;
import com.ibm.application.projectibm.entities.MovieEntity;
import com.ibm.application.projectibm.services.MovieService;

public class MovieDTOAdapterTest {

	@Test
	public void testToDTO() {
		MovieEntity movieEntity = new MovieEntity(1L, "Spiderman", 2020, "tt30494", "Sami Raim", "Heroies", 130);
		MovieDTO movieDTO = new MovieDTO("Spiderman", 2020, "tt30494");

		assertThat(MovieDTOAdapter.toDTO(movieEntity)).isEqualTo(movieDTO);
		MovieService ms = new MovieService();

	}

}
