package UTNFRGP.TP_TEMA6_GRUPO_9.ENTIDADES;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="libro")
public class ELibro implements Serializable{
	
	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )    
	private UUID isbn;
	
	private String titulo;
	
	private Date fechaLanzamiento;
	
	private String idioma;
	
	private Integer cantPaginas;
	
	
	@ManyToOne (cascade= {CascadeType. ALL})
	@JoinColumn
	private EAutor autor;
	
	@ManyToOne (cascade= {CascadeType. ALL})
	@JoinColumn
	private EBiblioteca biblioteca;

	private String descripcion;
	
	@ManyToMany (cascade= {CascadeType. ALL})
	@JoinTable(name="generos_x_libro", joinColumns = {@JoinColumn(name = "isbn")}, inverseJoinColumns = {@JoinColumn(name="id_genero")})
	private List<EGenero> generos;

	public UUID getIsbn() {
		return isbn;
	}

	public void setIsbn(UUID isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(Date fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Integer getCantPaginas() {
		return cantPaginas;
	}

	public void setCantPaginas(Integer cantPaginas) {
		this.cantPaginas = cantPaginas;
	}

	public EAutor getAutor() {
		return autor;
	}

	public void setAutor(EAutor autor) {
		this.autor = autor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<EGenero> getGeneros() {
		return generos;
	}

	public void setGeneros(List<EGenero> generos) {
		this.generos = generos;
	}
	
	public EBiblioteca getBibliteca() {
		return biblioteca;
	}

	public void setBibliteca(EBiblioteca bibliteca) {
		this.biblioteca = bibliteca;
	}

	@Override
	public String toString() {
		return "ELibro [isbn=" + isbn + ", titulo=" + titulo + ", fechaLanzamiento=" + fechaLanzamiento + ", idioma="
				+ idioma + ", cantPaginas=" + cantPaginas + ", autor=" + autor + ", bibliteca=" + biblioteca
				+ ", descripcion=" + descripcion + ", generos=" + generos + "]";
	}

	public ELibro() {
		
	}
	
	

}
