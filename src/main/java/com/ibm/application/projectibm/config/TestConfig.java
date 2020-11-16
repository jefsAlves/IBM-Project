package com.ibm.application.projectibm.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ibm.application.projectibm.entities.MovieEntity;
import com.ibm.application.projectibm.repositories.MovieRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public void run(String... args) throws Exception {
		
		List<MovieEntity> movieEntity = new ArrayList<>();
		
	    movieEntity.add(new MovieEntity(null, "Amazing Spiderman Syndrome", 2012, "tt2586634", "Sam Raimi", "Heroes", 130));
	    movieEntity.add(new MovieEntity(null, "Fighting, Flying and Driving: The Stunts of Spiderman 3", 2007, "tt1132238", "Sam Raimi", "Heroes", 156));
	    movieEntity.add(new MovieEntity(null, "Hollywood's Master Storytellers: Spiderman Live", 2006, "tt2158533", "Sam Raimi", "Heroes", 130));
	    movieEntity.add(new MovieEntity(null, "Italian Spiderman", 2007, "tt2705436", "Dario Russo", "Heroes", 37));
	    movieEntity.add(new MovieEntity(null, "Spiderman", 1990, "tt0100669", "Ray Jorge", "Heroes", 120));
	    movieEntity.add(new MovieEntity(null, "Spiderman", 2010, "tt1785572", "Sam Raimi", "Heroes", 120));
	    movieEntity.add(new MovieEntity(null, "Spiderman 5", 2008, "tt3696826", "Sam Raimi", "Heroes", 120));
	    movieEntity.add(new MovieEntity(null, "Spiderman and Gradma", 2009, "tt1433184", "Lara Izagirre", "Heroes", 120));
	    movieEntity.add(new MovieEntity(null, "Spiderman in Cannes", 2016, "tt5978586", "Aleksandrs Hãns", "Heroes", 120));
	    movieEntity.add(new MovieEntity(null, "Superman, Spiderman or Batman", 2011, "tt2084949", "Will Garden", "Heroes", 120));
	    movieEntity.add(new MovieEntity(null, "The Amazing Spiderman or Batman T4 Premiere Special", 2012, "tt2233044", "Steven Vinacour", "Heroes", 120));
	    movieEntity.add(new MovieEntity(null, "The Death of Spiderman", 2015, "tt5921428", "Bob Green", "Heroes", 120));
	    movieEntity.add(new MovieEntity(null, "They Call Me Spiderman", 2016, "tt5861236", "Adrian Ortega", "Heroes", 120));
		
		movieRepository.saveAll(movieEntity);
	}
}
