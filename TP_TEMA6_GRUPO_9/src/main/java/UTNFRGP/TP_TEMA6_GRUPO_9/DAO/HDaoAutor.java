package UTNFRGP.TP_TEMA6_GRUPO_9.DAO;

import java.util.List;

import org.hibernate.Session;

import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EAutor;
import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.ENacionalidad;

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
	
	public static void ReadAllAutorNacionalidadAndPrint1() {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		List<Object[]> autores = (List<Object[]>)session.createQuery("from EAutor a inner join a.nacionalidad n where n.descripcion='Argentina' ").list();
		System.out.print("\n");
		System.out.print("\n");
		for(Object[] autor: autores) {
			System.out.print("\n");
			System.out.print("Autor: "+((EAutor)autor[0]).toString()+"  Nacionalidad: "+((ENacionalidad)autor[1]).toString());
			
		}
		
		ch.cerrarSession();
	}
	
	public static void ReadAllAutorNacionalidadAndPrint2() {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		List<EAutor> autores = (List<EAutor>)session.createQuery("from EAutor a where a.nacionalidad.descripcion='Argentina' ").list();
		System.out.print("\n");
		System.out.print("\n");
		for(EAutor autor: autores) {
			System.out.print("\n");
			System.out.print("Autor: "+autor.toString());
			
		}
		
		ch.cerrarSession();
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
