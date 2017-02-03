package com.qa.cinemaServices;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.cinema.Film;
import com.qa.student.model.Person;
import com.qa.student.rest.PersonService;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {
 
@InjectMocks
 FilmService personService = new FilmService();
 
@Mock
 EntityManager em;

@Mock
 Query query;
 
@Test
 public void test() {
  List<Film> filmList = new ArrayList<Film>();
  Film film = new Film();
  film.setTitle("test");
  FilmService.add(filmList);
  Mockito.when(em.createQuery(Mockito.anyString())).thenReturn(query);
  Mockito.when(query.getResultList()).thenReturn(filmList);
  
  // test the add functionality
  List<Film> assertionList = filmService.getAllPeople();
  Assert.assertEquals(assertionList.get(0).getFirstName(), "test");
  
  // verify the behavior
  Mockito.verify(em).createQuery(Mockito.anyString());
 }
}