package UTNFRGP.TP_TEMA6_GRUPO_9;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoAutor;
import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoBiblioteca;
import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoGenero;
import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoLibro;
import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoNacionalidad;
import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EAutor;
import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EBiblioteca;
import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EGenero;
import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.ELibro;
import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.ENacionalidad;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EGenero genero1=new EGenero();
       genero1.setID(1);
       genero1.setDescripcion(" genero 1");
       HDaoGenero.Add(genero1);
       
       EGenero genero2=new EGenero();
       genero2.setID(2);
       genero2.setDescripcion(" genero 2");
       HDaoGenero.Add(genero2);
       
       EGenero genero3=new EGenero();
       genero3.setID(3);
       genero3.setDescripcion(" genero 3");
       HDaoGenero.Add(genero3);
       
       EGenero genero4=new EGenero();
       genero4.setID(4);
       genero4.setDescripcion(" genero 4");
       HDaoGenero.Add(genero4);

       EGenero genero5=new EGenero();
       genero5.setID(5);
       genero5.setDescripcion(" genero 5");
       HDaoGenero.Add(genero5);
       
       ENacionalidad nacionalidad1=new ENacionalidad();
       nacionalidad1.setID(1);
       nacionalidad1.setDescripcion(" nacionalidad 1");
       HDaoNacionalidad.Add(nacionalidad1);
       
       ENacionalidad nacionalidad2=new ENacionalidad();
       nacionalidad2.setID(2);
       nacionalidad2.setDescripcion(" nacionalidad 2");
       HDaoNacionalidad.Add(nacionalidad2);
       
       ENacionalidad nacionalidad3=new ENacionalidad();
       nacionalidad3.setID(3);
       nacionalidad3.setDescripcion(" nacionalidad 3");
       HDaoNacionalidad.Add(nacionalidad3);
       
       ENacionalidad nacionalidad4=new ENacionalidad();
       nacionalidad4.setID(4);
       nacionalidad4.setDescripcion(" nacionalidad 4");
       HDaoNacionalidad.Add(nacionalidad4);

       ENacionalidad nacionalidad5=new ENacionalidad();
       nacionalidad5.setID(5);
       nacionalidad5.setDescripcion(" nacionalidad 5");
       HDaoNacionalidad.Add(nacionalidad5);
       
       EAutor autor1=new EAutor();
       autor1.setNombre("Jose");
       autor1.setApellido("Menendez");
       autor1.setEmail("josemenedez@gmail.com");
       autor1.setNacionalidad(HDaoNacionalidad.ReadOne(1));
       HDaoAutor.Add(autor1);
       
       EAutor autor2=new EAutor();
       autor2.setNombre("Regina");
       autor2.setApellido("Laurentino");
       autor2.setEmail("reginalaurentino@gmail.com");
       autor2.setNacionalidad(HDaoNacionalidad.ReadOne(2));
       HDaoAutor.Add(autor2);
       
       EAutor autor3=new EAutor();
       autor3.setNombre("Laura");
       autor3.setApellido("Srebernich");
       autor3.setEmail("laurasrebernich@gmail.com");
       autor3.setNacionalidad(HDaoNacionalidad.ReadOne(3));
       HDaoAutor.Add(autor3);
       
       EAutor autor4=new EAutor();
       autor4.setNombre("Ivan");
       autor4.setApellido("Antunez");
       autor4.setEmail("ivanantunez@gmail.com");
       autor4.setNacionalidad(HDaoNacionalidad.ReadOne(4));
       HDaoAutor.Add(autor4);
       
       EAutor autor5=new EAutor();
       autor5.setNombre("Pablo");
       autor5.setApellido("Bulacio");
       autor5.setEmail("pablobulacio@gmail.com");
       autor5.setNacionalidad(HDaoNacionalidad.ReadOne(5));
       HDaoAutor.Add(autor5);
       
       
       
       ELibro libro1 = new ELibro();
       libro1.setTitulo("La cucaracha");
       libro1.setFechaLanzamiento(new Date(122,05,15));
       libro1.setIdioma("Español");
       libro1.setCantPaginas(200);
       libro1.setAutor(autor1);
       libro1.setDescripcion("Libro de una cucaracha");     
       List<EGenero> listaGeneros = new ArrayList<EGenero>();
       listaGeneros.add(genero1); 
       libro1.setGeneros(listaGeneros);   
       HDaoLibro.Add(libro1); 
       
       ELibro libro2 = new ELibro();
       libro2.setTitulo("La Lalota");
       libro2.setFechaLanzamiento(new Date(122,05,15));
       libro2.setIdioma("Español");
       libro2.setCantPaginas(240);
       libro2.setAutor(autor2);
       libro2.setDescripcion("En un ente sin razon de ser");
       List<EGenero> listaGeneros2 = new ArrayList<EGenero>();
       listaGeneros2.add(genero2); 
       libro2.setGeneros(listaGeneros2);
       HDaoLibro.Add(libro2);
       
       ELibro libro3 = new ELibro();
       libro3.setTitulo("WW2");
       libro3.setFechaLanzamiento(new Date(122,05,15));
       libro3.setIdioma("Ingles");
       libro3.setCantPaginas(300);
       libro3.setAutor(autor3);
       libro3.setDescripcion("Temas relacionados a la 2da. Guerra mundial");
       List<EGenero> listaGeneros3 = new ArrayList<EGenero>();
       listaGeneros3.add(genero3); 
       libro3.setGeneros(listaGeneros3);
       HDaoLibro.Add(libro3);
       
       ELibro libro4 = new ELibro();
       libro4.setTitulo("La pesadilla");
       libro4.setFechaLanzamiento(new Date(122,05,15));
       libro4.setIdioma("Eslovano");
       libro4.setCantPaginas(500);
       libro4.setAutor(autor4);
       libro4.setDescripcion("Como evitar laboratorio V");
       
       
       List<EGenero> listaGeneros4 = new ArrayList<EGenero>();
       listaGeneros4.add(genero4); 
       libro4.setGeneros(listaGeneros4);
       HDaoLibro.Add(libro4);
       
       ELibro libro5 = new ELibro();
       libro5.setTitulo("Duro de domar");
       libro5.setFechaLanzamiento(new Date(122,05,15));
       libro5.setIdioma("Chico");
       libro5.setCantPaginas(1500);
       libro5.setAutor(autor5);
       libro5.setDescripcion("Libro de programa televisivo");
       
       
       List<EGenero> listaGeneros5 = new ArrayList<EGenero>();
       listaGeneros5.add(genero5); 
       libro5.setGeneros(listaGeneros5);
       HDaoLibro.Add(libro5);
       
       
       EBiblioteca biblioteca1 = new EBiblioteca();
       biblioteca1.setFechaAlta(new Date(122,05,15));
       biblioteca1.setEstado(1);
       
       List<ELibro> listaLibros = new ArrayList();
       listaLibros.add(libro1);
       listaLibros.add(libro2);
       listaLibros.add(libro3);
       
       biblioteca1.setListaLibros(listaLibros);
       
       HDaoBiblioteca.Add(biblioteca1);
       
       EBiblioteca biblioteca2 = new EBiblioteca();
       biblioteca2.setFechaAlta(new Date(122,05,15));
       biblioteca2.setEstado(1);
       
       
       
       HDaoBiblioteca.Add(biblioteca2);
       
       EBiblioteca biblioteca3 = new EBiblioteca();
       biblioteca3.setFechaAlta(new Date(122,05,15));
       biblioteca3.setEstado(2);
       
       HDaoBiblioteca.Add(biblioteca3);
       
       EBiblioteca biblioteca4 = new EBiblioteca();
       biblioteca4.setFechaAlta(new Date(122,05,15));
       biblioteca4.setEstado(2);
       
       HDaoBiblioteca.Add(biblioteca4);
       
       EBiblioteca biblioteca5 = new EBiblioteca();
       biblioteca5.setFechaAlta(new Date(122,05,15));
       biblioteca5.setEstado(2);
       List<ELibro> listaLibros2 = new ArrayList();
       listaLibros.add(libro4);
       listaLibros.add(libro5);
       
       biblioteca5.setListaLibros(listaLibros2);
       
       /* ALTA */
       HDaoBiblioteca.Add(biblioteca5);
       /* LISTADO */
       HDaoBiblioteca.ReadOne(2);
       /* MODIFICACION */
       biblioteca1.setEstado(2);
       HDaoBiblioteca.Update(biblioteca1);
       /* BAJA */
       HDaoBiblioteca.Delete(biblioteca4);
    }
    

}
