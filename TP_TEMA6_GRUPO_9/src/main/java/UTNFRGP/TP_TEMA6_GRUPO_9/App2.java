package UTNFRGP.TP_TEMA6_GRUPO_9;

import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoBiblioteca;
import UTNFRGP.TP_TEMA6_GRUPO_9.DAO.HDaoLibro;
import UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES.ELibro;

public class App2 {

	public static void main(String[] args) {
		
      HDaoLibro.ReadAllOrderByIdAndPrint();
      
      HDaoBiblioteca.ReadAllPrestadoAndPrint();
		
	}

}
