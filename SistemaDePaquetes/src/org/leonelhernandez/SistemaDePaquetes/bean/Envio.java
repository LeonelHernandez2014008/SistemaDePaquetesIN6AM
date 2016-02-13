package org.leonelhernandez.SistemaDePaquetes.bean;

public class Envio {
	private Integer idEnvio;
	private Notificacion idNotificacion;
	public Integer getIdEnvio() {
		return idEnvio;
	}
	public void setIdEnvio(Integer idEnvio) {
		this.idEnvio = idEnvio;
	}
	public Notificacion getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(Notificacion idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	public Envio(Integer idEnvio, Notificacion idNotificacion) {
		super();
		this.idEnvio = idEnvio;
		this.idNotificacion = idNotificacion;
	}
	public Envio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
