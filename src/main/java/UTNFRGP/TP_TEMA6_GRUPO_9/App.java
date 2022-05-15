package UTNFRGP.TP_TEMA6_GRUPO_9;

import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoAutor;
import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoGenero;
import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoNacionalidad;
import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EAutor;
import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.EGenero;
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
       
//       EAutor autor=new EAutor();
//       autor.setNombre("Jose");
//       autor.setApellido("Menendez");
//       autor.setEmail("josemenedez@gmail.com");
//       autor.setNacionalidad(HDaoNacionalidad.ReadOne(1));
//       HDaoAutor.Add(autor);
//       
//       autor=new EAutor();
//       autor.setNombre("Regina");
//       autor.setApellido("Laurentino");
//       autor.setEmail("reginalaurentino@gmail.com");
//       autor.setNacionalidad(HDaoNacionalidad.ReadOne(2));
//       HDaoAutor.Add(autor);
//       
//       autor=new EAutor();
//       autor.setNombre("Laura");
//       autor.setApellido("Srebernich");
//       autor.setEmail("laurasrebernich@gmail.com");
//       autor.setNacionalidad(HDaoNacionalidad.ReadOne(3));
//       HDaoAutor.Add(autor);
//       
//       autor=new EAutor();
//       autor.setNombre("Ivan");
//       autor.setApellido("Antunez");
//       autor.setEmail("ivanantunez@gmail.com");
//       autor.setNacionalidad(HDaoNacionalidad.ReadOne(4));
//       HDaoAutor.Add(autor);
//       
//       autor=new EAutor();
//       autor.setNombre("Pablo");
//       autor.setApellido("Bulacio");
//       autor.setEmail("pablobulacio@gmail.com");
//       autor.setNacionalidad(HDaoNacionalidad.ReadOne(5));
//       HDaoAutor.Add(autor);
       
    }
}
