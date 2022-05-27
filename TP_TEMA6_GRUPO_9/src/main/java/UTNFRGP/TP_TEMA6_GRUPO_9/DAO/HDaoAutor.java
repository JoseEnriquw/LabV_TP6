package UTNFRGP.TP_TEMA6_GRUPO_9.DAO;

import org.hibernate.Session;

import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EAutor;

public class HDaoAutor {

	public static void Add(EAutor autor)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	        
	    session.beginTransaction();
	    session.save(autor);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public static EAutor ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
        EAutor autor=(EAutor)session.get(EAutor.class,id);
        
        config.cerrarSession();
        
        return autor;
	}
	
	public static void Update(EAutor autor)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(autor);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void Delete(EAutor autor) 
	{
		
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(autor);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
}
