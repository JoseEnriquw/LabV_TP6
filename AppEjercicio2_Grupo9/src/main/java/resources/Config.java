package resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import dao.ConfigHibernate;
import dao.UsuarioDao;
import entidad.Usuario;
import negocio.UsuarioNegocio;

@Configuration
public class Config {
	
	@Bean
	public Usuario UsuarioPepe()
	{
		Usuario usuario = new Usuario();
		   usuario.setUsuario("Pepe");
		    usuario.setContrasenia("123");
		return usuario;
	}
	
	@Bean
	public  UsuarioNegocio usuarioNegocio()
	{
		return new UsuarioNegocio();
	}
	
	@Bean
	public ConfigHibernate configHibernate()
	{
		return new ConfigHibernate();
	}
	
	@Bean
	public UsuarioDao usuarioDao()
	{
		return new UsuarioDao();
	}
}
