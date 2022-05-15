package UTNFRGP.TP_TEMA6_GRUPO_9.DAO;

import org.hibernate.Session;

import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EGenero;

public class HDaoGenero {

	public static void Add(EGenero genero)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	        
	    session.beginTransaction();
	    session.save(genero);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public static EGenero ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
        EGenero genero=(EGenero)session.get(EGenero.class,id);
        
        config.cerrarSession();
        
        return genero;
	}
	
	public static void Update(EGenero genero)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(genero);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void Delete(EGenero genero) 
	{
		
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(genero);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
}
