package Clases;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListaPropietario {

    private String nombreArchivo;//ATRIBUTO QUE TIENE EL NOMBRE DEL ARCHIVO DONDE SE GUARDARÁN LOS DATOS
    private String nombre;
    //LISTA
    private NodoPropietario cabeza;

    // CONSTRUCTOR  QUE RECIBE EL NOMBRE DE LA LISTA Y EL
    // NOMBRE DEL ARCHIVO DONDE ESTAN LOS DATOS
    //****************************************************/
    public ListaPropietario(String nombreArchivo, String nombre, NodoPropietario cabeza) {
        this.nombreArchivo = nombreArchivo;
        this.nombre = nombre;
        this.cabeza = null;
    }

    public ListaPropietario() {
        this.cabeza = null;
    }

    //MÉTODO QUE DEVUELVE UNA RESPUESTA SI LA LISTA ESTA VACIA O NO
    public boolean estaVacia() {
        boolean Respuesta = false;
        //SI LA CABEZA NO ESTA VACIA
        if (cabeza != null) {
            //SE CONVIERTE LA RESPUESTA
            Respuesta = true;
        }
        return Respuesta;
    }
    //*******************************************
    // MÉTODO QUE RECIBE EL NODO X DEL BOTÓN
    // Y GUARDAR SI EL DOCUMENTO NO EXISTE
    //*******************************************

    public String InsertarOrdenado(NodoPropietario p) {
        
        boolean Respuesta = false;
        String msj;
        NodoPropietario N = p;
        //SE HACE LA CONDICIÓN PARA SABER QUE EL DOCUMENTO NO ESTÉ INGRESADO EN LA LISTA
        if (BuscarID(N.getDocumento()) == false) {
//        if ( Respuesta == false) {
            Respuesta = true;
            NodoPropietario A;
            //SI LISTA ESTA VACIA
            if (cabeza == null) {
//                EL NODO QUE INGRESO, SE VUELVE LA CABEZA
                cabeza = N;                
            }
            else {
                //BUSCO EL DOCUMENTO ANTERIOR
                A = BuscarAnterior(N.getDocumento());
                //SI EL NODO RECIBIDO ESTA LLENO
                if (A != null) {
                    //NODO APUNTA A LA LIGA DE A
                    N.setLiga(A.getLiga());
                    //'A' SE COLOCA ANTES DE 'N'
                    A.setLiga(N);
                } else {
                    //NODO QUE APUNTA A LIGA, SE VUELVE LA CABEZA
                    N.setLiga(cabeza);
                    //CABEZA SE VUELVE 'N'
                    this.cabeza = N;
                }
            }
        }
        msj = "Propietario insertado";
        return msj;
    }

    //MÉTODO PARA BUSCAR QUE EL DOCUMENTO NO ESTE EN LA LISTA
    public boolean BuscarID(int Documento) {
        boolean Respuesta = false;
        NodoPropietario P = cabeza;
        while (P != null) {
            //SI EL DOCUMENTO ESTÁ EN LA LISTA, ME CAMBIA LA RESPUESTA
            if (P.getDocumento() == Documento) {
                Respuesta = true;
            }
            //SINO ESTÁ, SIGUE RECORRIENDO LA LISTA
            P = P.getLiga();
        }
        return Respuesta;
    }
    //*******************************************************
    // MÉTODO QUE ME BUSCA SI EL DOCUMENTO INGRESADO
    // ES MENOR QUE LOS DATOS QUE YA ESTABAN INGRESADOS
    //*******************************************************

    public NodoPropietario BuscarAnterior(int Documento) {
        NodoPropietario A = null, P = cabeza;
        while (P != null) {
            //SI EL DOC ES MENOR
            if (P.getDocumento() < Documento) {
                //ANTERIOR ME GUARDA P
                A = P;
                //P ESTA AVANZANDO
                P = P.getLiga();
            } else {
                //RETORNA EL NUEVO NODO VACIO
                return A;
            }
        }
        //RETORNA EL NODO LLENO
        return A;
    }
    //*********************************************
    // MÉTODO QUE ME BUSCA EL DOCUMENTO
    // RETORNA UN NODO CON LA INFORMACIÓN SI LA ENCUENTRA
    // SINO, RETORNA NULL '0'
    //*********************************************

    public NodoPropietario Buscar(int Documento) {
        NodoPropietario B = null, P = cabeza;
        while (P != null) {
            //B AVANZA IGUAL QUE P
            B = P;
            //PREGUNTO SI EL DOCUMENTO ES IGUAL A EL DOC DEL NODO
            if (P.getDocumento() != Documento) {
                //SIGUE RECORRIENDO LA LISTA
                P = P.getLiga();
            } else {
                //RETORNA EL NODO CON LA INFORMACIÓN
                return B;
            }
        }
        //RETORNA NULL SINO ENCUENTRA EL DOCUMENTO
        return null;
    }
    //**********************************************************
    // MÉTODO PARA MODIFICAR LOS DATOS, MENOS EL DOCUMENTO 
    //**********************************************************

    public void Modificar(int Documento, String nombre, String apellido,
            String telefono, String celular, String email) {
        //BUSCO EL DOCUMENTO
        NodoPropietario N = Buscar(Documento);
        //MODIFICO LOS DATOS
        N.setNombre(nombre);
        N.setApellido(apellido);
        N.setTelefono(telefono);
        N.setCelular(celular);
        N.setEmail(email);

    }
    //MÉTODO ELIMINAR INFORMACIÓN
    //RECIBE EL DOCUMENTO

    public NodoPropietario Eliminar(int Documento) {
        NodoPropietario A = null, P = cabeza, Z = null;
        boolean Bandera = false;
        //RECORRO LA LISTA
        while (P != null && Bandera == false) {
            //SE HACE LA CONDICIÓN PARA LA BUSQUEDA
            if (P.getDocumento() == Documento) {
                //SI ESTÁ AL PRINCIPIO
                if (P == cabeza) {
                    //LA CABEZA AVANZA A LA LIGA
                    cabeza = P.getLiga();
                } else {
                    //EL NODO AUXILIAR APUNTA A LA LIGA DE P
                    A.setLiga(P.getLiga());
                }
                //Z TOMA LOS DATOS DE P
                Z = P;
                //P AVANZA A LA LIGA
                P = P.getLiga();
                //CAMBIO BANDERA
                Bandera = true;
            } else {
                //A ME AYUDA A GUARDAR EL DATO ANTERIOR
                A = P;
                //P AVANZA A LA LIGA
                P = P.getLiga();
            }
        }
        return Z;
    }

    //OBTENER Y ASIGNAR LA CABEZA
    public NodoPropietario getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoPropietario cabeza) {
        this.cabeza = cabeza;
    }
    //***************************************************
    // MÉTODO ENCARGADO DE MOSTRAR LOS DATOS DE LA LISTA
    // EN EL JTABLE Y MODELO RECIBIDOS COMO PARAMETROS
    //***************************************************

    public void mostrarDatos(JTable tabla, DefaultTableModel modelo) {
        //SE CREAN LOS TÍTULOS DE LAS COLUMNAS
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("Documento");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Celular");
        modelo.addColumn("Email");
        tabla.setRowHeight(20);//ALTURA DE LA FILA DE LOS TÍTULOS
        //**********************
        //ANCHO DE LAS COLUMNAS
        //**********************
        tabla.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(60);
        tabla.getColumnModel().getColumn(5).setPreferredWidth(60);
        //SE CREA LA CADENA   
        String datos[] = new String[6];
        NodoPropietario P = cabeza;
        //SE EMPIEZA A RECORRER LA LISTA
        while (P != null) {
            //A CADA POSICIÓN DE DATO, LE DECIMOS QUE OBTENGA UN CAMPO DEL NODO
            datos[0] = "" + P.getDocumento();
            datos[1] = P.getNombre();
            datos[2] = P.getApellido();
            datos[3] = P.getTelefono();
            datos[4] = P.getCelular();
            datos[5] = P.getEmail();
            modelo.addRow(datos);
            P = P.getLiga();
        }
    }
    //************************************************************
    // MÉTODO QUE INGRESA LOS USUARIOS INICIALES PARA QUE LA LISTA
    // NO INICIE VACIA. SE TOMAN LOS DATOS DEL ACHIVO 
    //************************************************************

    public void ingresarDatosIniciales() {
        DataInputStream entrada = null;//PARA ENTRAR INFORMACIÓN-LEER
        DataOutputStream salida = null;//PARA COPIAR INFORMACIÓN-ESCRIBIR
        try {
            //ABRO EL ARCHIVO
            salida = new DataOutputStream(new FileOutputStream(nombreArchivo, true));
            entrada = new DataInputStream(new FileInputStream(nombreArchivo));
        } catch (IOException e) {
            //EXCEPCIÓN CUANDO HAY PROBLEMA DE LECTURA
            System.out.println("No se pudo abrir el archivo para lectura");
            System.exit(1);
        }
        try {
            //AQUÍ LEO EL ARCHIVO
            while (true) {
                NodoPropietario P;
                int Documento = entrada.readInt();
                String nomb = entrada.readUTF();
                String apellido = entrada.readUTF();
                String telefono = entrada.readUTF();
                String celular = entrada.readUTF();
                String email = entrada.readUTF();

                P = new NodoPropietario(Documento, nomb, apellido, telefono, celular, email);
                InsertarOrdenado(P);
            }
        } //EXCEPCIÓN PARA CUANDO TERMINA DE LEERLO
        catch (EOFException e) {
            //SE DISPARA CUANDO SE TERMINA DE LEER EL ARCHIVO
        } //EXCEPCIÓN SI HAY PROBLEMAS CON EL ARCHIVO
        catch (IOException e) {
            System.out.println("Error al listar el archivo");
            System.exit(1);
        }
    }
    //*******************************************
    // GUARDA EN EL ARCHIVO TODOS LA INFORMACIÓN
    // QUE ESTÁ EN LA LISTA
    //*******************************************

    public void guardar() {
        DataOutputStream salida = null;
        //ABRÓ EL ARCHIVO
        try {
            //SE ABRE EL ARCHIVO PARA ESCRIBIR EN EL BORRADOR TODO EL CONTENIDO QUE SE TIENE EN EL MOMENTO.  
            salida = new DataOutputStream(new FileOutputStream("Propietario.txt"));
        } //EXCEPCIÓN SI HAY PROBLEMAS PARA ESCRIBIR
        catch (IOException e) {
            System.out.println("No se pudo abrir el archivo para escritura");
            System.exit(1);
        }
        //ESCRIBO EN EL ARCHIVO
        try {
            //SE GUARDA EN EL ARCHIVO TODO EL USUARIO DEL BUFETE QUE HAY EN LA LISTA 
            NodoPropietario P = cabeza;
            while (P != null) {
                salida.writeInt(P.getDocumento());
                salida.writeUTF(P.getNombre());
                salida.writeUTF(P.getApellido());
                salida.writeUTF(P.getTelefono());
                salida.writeUTF(P.getCelular());
                salida.writeUTF(P.getEmail());
                P = P.getLiga();
            }
        } catch (IOException e) {
            //EXCEPCIÓN SI HAY PROBLEMAS PARA ESCRIBIR
            System.out.println("Error al escribir en el archivo");
            System.exit(1);
        }
    }

}
