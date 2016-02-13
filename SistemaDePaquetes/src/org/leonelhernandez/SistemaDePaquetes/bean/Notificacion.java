package org.leonelhernandez.SistemaDePaquetes.bean;

public class Notificacion {
	private Integer idNotificacion;
	private String tipoDeNotificacion;
	private String fechaNotificacion;
	private String mensaje;
	private Envio idEnvio;
	
	public Envio getIdEnvio() {
		return idEnvio;
	}
	public void setIdEnvio(Envio idEnvio) {
		this.idEnvio = idEnvio;
	}
	public Integer getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(Integer idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	public String getTipoDeNotificacion() {
		return tipoDeNotificacion;
	}
	public void setTipoDeNotificacion(String tipoDeNotificacion) {
		this.tipoDeNotificacion = tipoDeNotificacion;
	}
	public String getFechaNotificacion() {
		return fechaNotificacion;
	}
	public void setFechaNotificacion(String fechaNotificacion) {
		this.fechaNotificacion = fechaNotificacion;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Notificacion(Integer idNotificacion, String tipoDeNotificacion, String fechaNotificacion, String mensaje,
			Envio idEnvio) {
		super();
		this.idNotificacion = idNotificacion;
		this.tipoDeNotificacion = tipoDeNotificacion;
		this.fechaNotificacion = fechaNotificacion;
		this.mensaje = mensaje;
		this.idEnvio = idEnvio;
	}
	public Notificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
