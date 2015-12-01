package Clases;

import Formularios.frmPrincipal;
import javax.swing.JOptionPane;
import java.util.Date;

public class Datos {
	
	private int maxUsu = 100;
	private Usuario misUsuarios[] = new Usuario[maxUsu];
	private int contUsu = 0;
	

	
        
        
	/*private int maxPro = 100;
	private Proceso misProcesos[] = new Proceso [maxPro];
	private int contPro = 0;*/
	
	
	//Constructor de la clase datos
	public Datos() {
		cargarUsuarios();
	
	}
	
	public boolean validarUsuario(String usuario, String clave) {
		for(int i = 0; i < contUsu; i++) {
			if(misUsuarios[i].getUsuario().equalsIgnoreCase(usuario)
				&& misUsuarios[i].getContraseña().equals(clave)) {
				{
    			JOptionPane.showMessageDialog(null,"Bienvenido a Poli-Leasing");
    			new frmPrincipal();
    			return true;
    		    } 
		}
	}
	return false;				
}

    public int posicionUsuario(String documento) {
    	for(int i = 0; i < contUsu; i++) {
    		if(misUsuarios[i].getUsuario().equalsIgnoreCase(documento)) {
    			return i;
    		}
    	}
    	return -1;
    }
    


    /*public int posicionProceso(String proceso) {
    	for(int i = 0; i < contPro; i++) {
    		if(misProcesos[i].getidentificacion().equalsIgnoreCase(proceso)) {
    			return i;
    		}
    	}
    	return -1;
    } 	*/
    
    public String agregarUsuario(Usuario miUsuario) {
    	if(contUsu == maxUsu) {
    		return "Se ha alcanzado el número máximo de usuarios";
    	}
    	
    	misUsuarios[contUsu] = miUsuario;
    	contUsu++;
    	return "Usuario agregado correctamente";
    }
    
//    public String agregarPermiso(Permiso miPermiso) {
//    	if(contPerm == maxPerm) {
//    		return "Se ha alcanzado el número máximo de permisos";
//    	}
//    	
//    	misPermisos[contPerm] = miPermiso;
//    	contPerm++;
//    	return "Permiso agregado correctamente";
//    }
    
//    public String agregarAgenda(Agenda miAgenda) {
//    	if(contAgen == maxAgen) {
//    		return "Se ha alcanzado el número máximo de Agendas";
//    	}
//    	
//    	misAgendas[contAgen] = miAgenda;
//    	contAgen++;
//    	return "Agenda agregada correctamente";
//    }
    
//     public String agregarContacto(Contacto miContacto) {
//    	if(contContac == maxContac) {
//    		return "Se ha alcanzado el número máximo de contactos";
//    	}
//    	
//    	misContactos[contContac] = miContacto;
//    	contContac++;
//    	return "Contacto agregado correctamente";
//    }
    
   /* public String agregarProceso(Nodo_Proceso Lista_Proceso) {
    
    	Lista_Proceso.get();
    	return "Proceso agregado correctamente";
    }*/
	
//	public String modificarContacto(Contacto miContacto, int pos) {
//		misContactos[pos].setDocumento(miContacto.getDocumento());
//		misContactos[pos].setTipoDoc(miContacto.getTipoDoc());
//		misContactos[pos].setNombres(miContacto.getNombres());
//		misContactos[pos].setApellidos(miContacto.getApellidos());
//		misContactos[pos].setCorreo(miContacto.getCorreo());
//		misContactos[pos].setDireccion(miContacto.getDireccion());
//		misContactos[pos].setTelefono(miContacto.getTelefono());
//		misContactos[pos].setCelular(miContacto.getCelular());
//		misContactos[pos].setDepartamento(miContacto.getDepartamento());
//		misContactos[pos].setCiudad(miContacto.getCiudad());
//		misContactos[pos].setFechaNacimiento(miContacto.getFechaNacimiento());
//		misContactos[pos].setTipoSangre(miContacto.getTipoSangre());
//		misContactos[pos].setTipoSexo(miContacto.getTipoSexo());
//		misContactos[pos].setNivelAcademico(miContacto.getNivelAcademico());
//		misContactos[pos].setProfesion(miContacto.getProfesion());
//		misContactos[pos].setFechaTitulo(miContacto.getFechaTitulo());
//    	return "Contacto modificado correctamente";
//	}
	
//	public String modificarAgenda(Agenda miAgenda, int pos) {
//		misAgendas[pos].setFecha(miAgenda.getFecha());
//		misAgendas[pos].setHora(miAgenda.getHora());
//		misAgendas[pos].setLugar(miAgenda.getLugar());
//		misAgendas[pos].setTitulo(miAgenda.getTitulo());
//		misAgendas[pos].setDescripcion(miAgenda.getDescripcion());
//    	return "Agenda modificada correctamente";
//	}
//	
//	public String modificarPermiso(Permiso miPermiso, int pos) {
//		misPermisos[pos].setPerfil(miPermiso.getPerfil());
//    	return "Permiso modificado correctamente";
//	}
	
	public String modificarUsuario(Usuario miUsuario, int pos) {
		misUsuarios[pos].setUsuario(miUsuario.getUsuario());
		misUsuarios[pos].setPregunta(miUsuario.getPregunta());
		misUsuarios[pos].setCorreo(miUsuario.getCorreo());
		misUsuarios[pos].setContraseña(miUsuario.getContraseña());
                
		
    	return "Usuario modificado correctamente";
	}
	
	/*public String modificarProceso(Proceso miProceso, int pos) {
		Lista_Proceso.get(pos).setIdProceso(miProceso.getIdProceso());
		Lista_Proceso.get(pos).setIdProceso(miProceso.getNombreProceso());
    	return "Proceso modificado correctamente";
	}*/
	
	public String borrarUsuario(int pos) {
		for(int i = pos; i < contUsu -1; i++) {
			misUsuarios[i] = misUsuarios[i + 1];
		}
		contUsu--;
    	return "Usuario borrado correctamente";
	}
	
	
	
	

	
	/*public String borrarProceso(int pos) {
		Lista_Proceso.remove(pos);
		
    	return "Proceso borrado correctamente";
	}*/
        
	
	private void cargarUsuarios() {
		Usuario miUsuario;
		
		miUsuario = new Usuario("123", "hugo","ajhj@hotmail.com",2 ,"azul","123",1);
		misUsuarios[contUsu] = miUsuario;
		contUsu++;
		
		miUsuario = new Usuario("124", "paco","ajhj@hotmail.com",2 ,"azul","123",1);
		misUsuarios[contUsu] = miUsuario;
		contUsu++;
		
		miUsuario = new Usuario("125", "luis","ajhj@hotmail.com",2 ,"azul","123",1);
		misUsuarios[contUsu] = miUsuario;
		contUsu++;
	}
	
//	private void cargarPermisos() {
//		Permiso miPermiso;
//		
//		miPermiso = new Permiso("10254545", 0);
//		misPermisos[contPerm] = miPermiso;
//		contPerm++;
//		
//		miPermiso = new Permiso("98595854", 1);
//		misPermisos[contPerm] = miPermiso;
//		contPerm++;
//		
//		miPermiso = new Permiso("456353345", 2);
//		misPermisos[contPerm] = miPermiso;
//		contPerm++;
//	}
	
//	private void cargarAgendas() {
//		Agenda miAgenda;
//		
//		miAgenda = new Agenda(new Date(), "14:02", "Bufete Centro", "x", "xxxxx");
//		misAgendas[contAgen] = miAgenda;
//		contAgen++;
//		
//		miAgenda = new Agenda(new Date(), "09:50", "Bufete Sur", "yy", "xxxxx");
//		misAgendas[contAgen] = miAgenda;
//		contAgen++;
//		
//		miAgenda = new Agenda(new Date(), "16:40", "Bufete Norte", "zzz", "xxxxx");
//		misAgendas[contAgen] = miAgenda;
//		contAgen++;
//		
//		miAgenda = new Agenda(new Date(), "07:32", "Bufete Occidente", "zzzzz", "xxxxx");
//		misAgendas[contAgen] = miAgenda;
//		contAgen++;
//		
//	}
	
//	private void cargarContactos() {
//		Contacto miContacto;
//		
//		miContacto = new Contacto("1010", 0, "Andres", "Sierra", "ahaha@hotmail.com", "Cr. 50#24-45",
//		"4567867", "3452456723", 0, 3, new Date(), 1, 0, 3, "Programador", 
//		new Date());
//		misContactos[contContac] = miContacto;
//		contContac++;
//		
//		miContacto = new Contacto("2010", 2, "Julian", "Escobar", "julashs@hotmail.com", "Cr. 67#12-25",
//		"5577867", "3152456723", 3, 1, new Date(), 2, 0, 1, "Programador", 
//		new Date());
//		misContactos[contContac] = miContacto;
//		contContac++;
//		
//		miContacto = new Contacto("3010", 3, "Ricardo", "Cabezas", "risfs@hotmail.com", "Cr. 12#78-95",
//		"3127867", "3192456723", 3, 0, new Date(), 3, 0, 3, "Programador", 
//		new Date());
//		misContactos[contContac] = miContacto;
//		contContac++;
//		
//		miContacto = new Contacto("4010", 4, "Leonel", "Messi", "messi@hotmail.com", "Cll. 10#07-21",
//		"2347867", "3102456723", 3, 1, new Date(), 1, 0, 3, "F?tbolista", 
//		new Date());
//		misContactos[contContac] = miContacto;
//		contContac++;
//		
//	}
	
	/*private void cargarProcesos() {
		Proceso miProceso;
		
		miProceso = new Proceso("14343", "XXXX");
                Lista_Proceso.add(miProceso);
                
		miProceso = new Proceso("2434", "XXXX");
		Lista_Proceso.add(miProceso);
                
		miProceso = new Proceso("439483843", "XXXX");
		Lista_Proceso.add(miProceso);
        }*/
	
	public int numeroUsuarios() {
		return contUsu;
	}
	
       public Usuario[] getUsuario() {
        return misUsuarios;
    }

	
	

	
	
}
