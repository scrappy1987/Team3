package com.qa.cinema;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateDirector {

	public static void main( String[ ] args ) {
	   
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	      
	EntityManager entitymanager = emfactory.createEntityManager( );
	entitymanager.getTransaction( ).begin( );

	Director director = new Director(); 
	director.setDirectorID(1);
	director.setDirector_name( "Michael Bay" );      
	entitymanager.persist( director );
	entitymanager.getTransaction( ).commit( );

	entitymanager.close( );
	emfactory.close( );
	}
}
