package dao;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entidad.Usuario;
import resources.Config;

public class UsuarioDao {

	private static ConfigHibernate config;
	private static ApplicationContext appContext; 
	
	public void Add(Usuario user)
	{
		appContext = new AnnotationConfigApplicationContext(Config.class);
		config = (ConfigHibernate)appContext.getBean("configHibernate"); 
		Session session= config.abrirConexion();


		session.beginTransaction();
		session.save(user);

		session.getTransaction().commit();    
		config.cerrarSession();
	    ((ConfigurableApplicationContext)(appContext)).close();
	}
	
	public Usuario ReadOne(String nombreUsuario)
	{
		appContext = new AnnotationConfigApplicationContext(Config.class);
		config = (ConfigHibernate)appContext.getBean("configHibernate"); 
		Session session= config.abrirConexion();
		
		session.beginTransaction();
        Usuario usuario=(Usuario)session.get(Usuario.class,nombreUsuario);
        
        config.cerrarSession();
        ((ConfigurableApplicationContext)(appContext)).close();  
        return usuario;
	}

	public boolean Exist(String nombreUsuario)
	{
		appContext = new AnnotationConfigApplicationContext(Config.class);
		config = (ConfigHibernate)appContext.getBean("configHibernate"); 
		Session session= config.abrirConexion();

		session.beginTransaction();
		Usuario usuario=(Usuario)session.get(Usuario.class,nombreUsuario);

		config.cerrarSession();
		if(usuario!=null) {
			((ConfigurableApplicationContext)(appContext)).close();
			return true;
		}
		((ConfigurableApplicationContext)(appContext)).close();
		return false;
	}

	
	public void Update(Usuario usuario)
	{
		appContext = new AnnotationConfigApplicationContext(Config.class);
		config = (ConfigHibernate)appContext.getBean("configHibernate"); 
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.update(usuario);
        session.getTransaction().commit();        
        
        config.cerrarSession();
        ((ConfigurableApplicationContext)(appContext)).close();
	}
	
	public static void Delete(Usuario usuario) 
	{	
		appContext = new AnnotationConfigApplicationContext(Config.class);
		config = (ConfigHibernate)appContext.getBean("configHibernate"); 
		Session session= config.abrirConexion();
		
        session.beginTransaction();
        session.delete(usuario);
        session.getTransaction().commit();        
        
        config.cerrarSession();
        ((ConfigurableApplicationContext)(appContext)).close();
	}
}
