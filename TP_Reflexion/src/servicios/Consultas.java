package servicios;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;

import anotaciones.Tabla;
import utilidades.Ubean;

public class Consultas {
public static void guardar(Object o){
	ArrayList<Field> atributos= Ubean.obtenerAtributos(o);
	Class c =  o.getClass();
	String s = ((Tabla)c.getAnnotation(Tabla.class)).nombre();
	
	
	String ins = "Insert into" ;
}
public static void modificar(Object o){
	
}
public static void eliminar(Object o){
	
}
public static Object obtenerPorId(Class c, Object id){
	
	return null;
}
//Object o = c.newInstance();
//Constructor[] con = c.getConstructors();
//Object o = con[0].newInstance(null);
}
