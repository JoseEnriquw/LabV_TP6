package UTNFRGP.TP_TEMA6_GRUPO_9.DAO;

import java.util.List;

import org.hibernate.Session;

import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.ELibro;

public class HDaoLibro {
	public static void Add(ELibro libro)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
	        
	    session.beginTransaction();
	    session.save(libro);
	    
	    session.getTransaction().commit();    
		ch.cerrarSession();
	}
	
	public static ELibro ReadOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
        ELibro libro=(ELibro)session.get(ELibro.class,id);
        
        config.cerrarSession();
        
        return libro;
	}
	
	public static void ReadAllOrderByIdAndPrint()
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
        List<ELibro> libros=(List<ELibro>)session.createQuery("from ELibro l order by l.isbn desc").list();
		
        for(ELibro libro :  libros) {
		System.out.print(libro.toString());
		}
        
        config.cerrarSession();
        
	}
	
	public static void Update(ELibro libro)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(libro);
        session.getTransaction().commit();        
        
        config.cerrarSession();
	}
	
	public static void Delete(ELibro libro) 
	{
		
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(libro);
        session.getTransaction().commit();        
        
        config.cerrarSession();

	}
}
