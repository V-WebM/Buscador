package aplicaciones.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "organizaciones")
public class Albergue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_organizacion;
	private String nombre;
	private String region;
	private String distrito;
	private String provincia;
	private String direccion;
	private String referencias;
	public Long getId_organizacion() {
		return id_organizacion;
	}
	public void setId_organizacion(Long id_organizacion) {
		this.id_organizacion = id_organizacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public Albergue(Long id_organizacion, String nombre, String region, String distrito, String provincia,
			String direccion, String referencias) {
		super();
		this.id_organizacion = id_organizacion;
		this.nombre = nombre;
		this.region = region;
		this.distrito = distrito;
		this.provincia = provincia;
		this.direccion = direccion;
		this.referencias = referencias;
	}
	
	public Albergue() {
		super();
	}
}
