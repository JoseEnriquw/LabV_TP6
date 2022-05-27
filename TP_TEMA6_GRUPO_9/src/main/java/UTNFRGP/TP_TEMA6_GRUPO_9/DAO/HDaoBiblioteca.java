package UTNFRGP.TP_TEMA6_GRUPO_9.DAO;

import java.util.List;

import org.hibernate.Session;

import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EBiblioteca;

public class HDaoBiblioteca {
	public static void Add (EBiblioteca biblioteca) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		session.save(biblioteca);
		
		session.getTransaction().commit();

		ch.cerrarSession();
	}
	
	public static EBiblioteca ReadOne(int id) {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		EBiblioteca biblioteca = (EBiblioteca)session.get(EBiblioteca.class, id);
		
		ch.cerrarSession();
		
		return biblioteca;
	}
	
	public static void ReadAllPrestadoAndPrint() {
		ConfigHibernate ch = new ConfigHibernate();
		Session session = ch.abrirConexion();
		
		session.beginTransaction();
		List<Object[]> bibliotecas = (List<Object[]>)session.createQuery("select b.id, b.fechaAlta,l.titulo from EBiblioteca b inner join b.listaLibros l where b.estado=2").list();
		System.out.print("\n");
		System.out.print("\n");
		for(Object[] biblioteca: bibliotecas) {
			System.out.print("\n");
			System.out.print("ID de Biblioteca: "+biblioteca[0]+"  Fecha de Alta: "+biblioteca[1]+" Título del Libro: "+biblioteca[2]);
			
		}
		
		ch.cerrarSession();
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
