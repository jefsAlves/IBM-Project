
package com.ibm.application.projectibm.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.application.projectibm.entities.MovieEntity;
import com.ibm.application.projectibm.repositories.MovieRepository;

@Service
public class MovieQueryService {

	@Autowired
	private MovieRepository movieRepository;

	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("movieEntityManager");
	private final EntityManager em = emf.createEntityManager();

	public List<MovieEntity> findByNameContains(String title, Integer page, Integer limit) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<MovieEntity> cq = cb.createQuery(MovieEntity.class);

		Root<MovieEntity> movie = cq.from(MovieEntity.class);
		Predicate titlePrecidate = cb.like(movie.get("title"), "%" + title + "%");
		cq.where(titlePrecidate);

		TypedQuery<MovieEntity> query = em.createQuery(cq);
		return query.setMaxResults(limit).setFirstResult((page - 1) * limit).getResultList();
	}

	// TODO:Refactory Query Select Count;
	public Integer countMovies(String title) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<MovieEntity> cq = cb.createQuery(MovieEntity.class);

		Root<MovieEntity> movie = cq.from(MovieEntity.class);
		Predicate titlePrecidate = cb.like(movie.get("title"), "%" + title + "%");
		cq.where(titlePrecidate);

		TypedQuery<MovieEntity> query = em.createQuery(cq);
		return query.getFirstResult();
	}
}
