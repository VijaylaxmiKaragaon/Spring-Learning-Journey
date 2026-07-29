package com.dcl;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dcl.Entity.Movie;
import com.dcl.Repository.MovieRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(Application.class, args);
	MovieRepository mdao = context.getBean(MovieRepository.class);
	System.out.println(mdao.getClass().getName());
    Movie m1 = new Movie();
    m1.setMovieId(1);
    m1=mdao.save(m1);
	m1.setLangauge("Kannada");
	m1.setBudget(10000000);
	m1.setMovieName("KGF");
	m1=mdao.save(m1);
	Movie m2 = new Movie(2,"Kannada","KGF2",2000000);
	Movie m3 = new Movie(3,"Kannada","Kantara",3000000);
	Movie m4 = new Movie(4,"Kannada","Om",4000000);
	mdao.saveAll(Arrays.asList(m2,m3,m4));
	
	
	//Retriving the data
//	Movie m1=mdao.findById(1).orElse(null);
//	System.out.println(m1);
//	
//	mdao.findAllById(Arrays.asList(2,3,4)).forEach(System.out::println);
//	
//	mdao.findAll().forEach(System.out::println);
	
	
//	Boolean exists = mdao.existsById(10);
//	System.out.println(exists);
//	
//	Long no_of_records = mdao.count();
//	System.out.println(no_of_records);
//	
//	mdao.deleteById(1);
//	mdao.deleteAllById(Arrays.asList(2,3));
//	mdao.deleteAll();
	
    mdao.findByMovieId(1);
    mdao.findByLangauge("Kannada").forEach(System.out::println);
    mdao.findByMovieName("KGF").forEach(System.out::println);
	
    mdao.getByMovieName("KGF").forEach(System.out::println);
    mdao.getByBudget((double) 2000000).forEach(System.out::println);
    mdao.getByLanguage("Om").forEach(System.out::println);
    
    
	}

}
