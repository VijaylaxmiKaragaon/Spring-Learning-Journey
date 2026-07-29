package com.dcl.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dcl.Entity.Movie;
import java.util.List;


@Repository
//to perform crud operation
public interface MovieRepository extends CrudRepository<Movie, Integer>{
//JPA repository extends CrudRepository -> crud operation(sorting,pagination,QBE)
	
	List<Movie> findByMovieId(Integer movieId);
	List<Movie> findByLangauge(String langauge);
	
	List<Movie> findByMovieName(String movieName);
	
	@Query(value="SELECT * FROM MOVIE WHERE MOVIE_NAME=?", nativeQuery=true)
	List<Movie> getByMovieName(String movieName);
	
	@Query("FROM Movie WHERE Budget=:Budget")
	List<Movie> getByBudget(Double Budget);
	
	@Query("SELECT m FROM Movie m WHERE m.movieLanguage = :language")
	List<Movie> getByLanguage(String language);
}
