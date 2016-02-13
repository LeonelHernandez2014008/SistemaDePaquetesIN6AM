package org.leonelhernandez.SistemaDePaquetes.bean;

public class Paquete {
	private Integer idPaquete;
	private String nombrePaquete;
	private Envio idEnvio;
	private Usuario idUsuario;
	private String fechaEntrega;
	private String fechaEnvio;
	private String lugarDeEntrega;
	public Integer getIdPaquete() {
		return idPaquete;
	}
	public void setIdPaquete(Integer idPaquete) {
		this.idPaquete = idPaquete;
	}
	public String getNombrePaquete() {
		return nombrePaquete;
	}
	public void setNombrePaquete(String nombrePaquete) {
		this.nombrePaquete = nombrePaquete;
	}
	public Envio getIdEnvio() {
		return idEnvio;
	}
	public void setIdEnvio(Envio idEnvio) {
		this.idEnvio = idEnvio;
	}
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getFechaEnvio() {
		return fechaEnvio;
	}
	public void setFechaEnvio(String fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}
	public String getLugarDeEntrega() {
		return lugarDeEntrega;
	}
	public void setLugarDeEntrega(String lugarDeEntrega) {
		this.lugarDeEntrega = lugarDeEntrega;
	}
	public Paquete(Integer idPaquete, String nombrePaquete, Envio idEnvio, Usuario idUsuario, String fechaEntrega,
			String fechaEnvio, String lugarDeEntrega) {
		super();
		this.idPaquete = idPaquete;
		this.nombrePaquete = nombrePaquete;
		this.idEnvio = idEnvio;
		this.idUsuario = idUsuario;
		this.fechaEntrega = fechaEntrega;
		this.fechaEnvio = fechaEnvio;
		this.lugarDeEntrega = lugarDeEntrega;
	}
	public Paquete() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
