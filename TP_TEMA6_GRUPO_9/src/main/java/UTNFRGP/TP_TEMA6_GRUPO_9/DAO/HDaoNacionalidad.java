package UTNFRGP.TP_TEMA6_GRUPO_9.DAO;

import org.hibernate.Session;

import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.ENacionalidad;

public class HDaoNacionalidad {

	public static void Add(ENacionalidad nacionalidad)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		
	        
	    session.beginTransaction();
	    session.save(nacionalidad);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public static ENacionalidad ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
        ENacionalidad nacionalidad=(ENacionalidad)session.get(ENacionalidad.class,id);
        
        config.cerrarSession();
        
        return nacionalidad;
	}
	
	public static void Update(ENacionalidad nacionalidad)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(nacionalidad);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void Delete(ENacionalidad nacionalidad) 
	{
		
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(nacionalidad);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
}
