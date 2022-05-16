package UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="biblioteca")
public class EBiblioteca implements Serializable{
	
	/*private static final long serialVersionUID = 1L;*/
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToMany()
	@JoinColumn(name="id_libro")
	private Set<ELibro> listaLibros;
	
	@Column
	private Date fechaAlta;
	
	@Column
	private int estado;
	
	public EBiblioteca() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<ELibro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(Set<ELibro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "EBiblioteca [id=" + id + ", Cantidad libros=" + listaLibros.size() + ", fechaAlta=" + fechaAlta + ", estado="
				+ estado + "]";
	}
}
