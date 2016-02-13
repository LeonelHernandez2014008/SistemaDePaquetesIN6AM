package org.leonelhernandez.SistemaDePaquetes.db;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Conexion {
	private SessionFactory session;
	private static Conexion instancia; 
	public static synchronized Conexion getInstancia(){
		return (instancia==null)?new Conexion():instancia;
	}
	public Conexion(){
		try {
			session=new Configuration().configure().buildSessionFactory();
		} catch (Throwable e) {
			System.out.println("Error al conectar a la base de datos");
			e.printStackTrace();
		}
	}
	public SessionFactory getSession() {
		return session;
	}	
   public void closeSession()throws HibernateException {
        try {
        	
            if (session.isClosed()==false | session.getCurrentSession().isOpen()) {
            	session.close();
            	session.getCurrentSession().close();
            }
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

	public List<Object> listar(String consulta){
		Session sesion=session.getCurrentSession();
		List<Object> listado=null;
		sesion.beginTransaction();
		listado=sesion.createQuery(consulta).list();
		sesion.getTransaction().commit();
		return listado;
	}
	
	public List<Object> autenticar(String nick,String password){
		Session sesion=session.getCurrentSession();
		List<Object> listado=null;
		sesion.beginTransaction();
		listado=sesion.createQuery("From Usuario u where u.nick='"+nick+"' and u.contraseña='"+password+"'").list();
		sesion.getTransaction().commit();
		return listado;
	}

	
}
