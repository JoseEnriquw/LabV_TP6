package UTNFRGP.TP_TEMA6_GRUPO_9.DAO;

import java.util.List;

import org.hibernate.Session;

import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EGenero;
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
	
	public static void ReadAllByIdAndPrint()
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		session.beginTransaction();
		
        ELibro libro=(ELibro)session.createQuery("from ELibro l where isbn=1").uniqueResult();
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print(libro.toString());
        
        config.cerrarSession();
        
	}
	
	public static void ReadMaxId() {
		
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		Integer maximo = (Integer) session.createQuery("SELECT MAX(l.isbn) FROM ELibro l").uniqueResult();
						
		System.out.println("El Maximo ISBN es: " + maximo);
		
		config.cerrarSession();
		
		
	}
	
	public static void GetCantByGenero() {
		
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		
		List<Object[]> libros= (List<Object[]>) session.createQuery("Select g.id, g.descripcion, count(l.isbn) FROM ELibro as l INNER JOIN l.generos g group by g.id, g.descripcion").list();
			
		
		  for (Object[] objeto : libros) {
	        	
	        	Integer idGenero = (Integer) objeto[0];
	        	String descripcion = (String) objeto[1];
	        	Long cantidad = (Long) objeto[2];
	        	       	        	  		        	       	
	        	
	      	  System.out.println("Genero= Id:" +idGenero+ " Descripcion:" +descripcion+ " Cantidad:" + cantidad);	
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
