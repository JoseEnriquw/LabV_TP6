package UTNFRGP.TP_TEMA6_GRUPO_9.DAO;

import org.hibernate.Session;

import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EBiblioteca;

public class HDaoBiblioteca {
	public static void Add (EBiblioteca biblioteca) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		session.save(biblioteca);
		
		session.getTransaction().commit();
	}
	
	public static EBiblioteca ReadOne(int id) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		EBiblioteca biblioteca = (EBiblioteca)session.get(EBiblioteca.class, id);
		
		ch.cerrarSession();
		
		return biblioteca;
	}
	
	public static void Update(EBiblioteca biblioteca) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		session.update(biblioteca);
		session.getTransaction().commit();
		
		ch.cerrarSession();
		
	}
	
	public static void Delete(EBiblioteca biblioteca) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		session.delete(biblioteca);
		session.getTransaction().commit();
		
		ch.cerrarSession();
	}
}
