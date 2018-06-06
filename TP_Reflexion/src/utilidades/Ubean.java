package utilidades;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public class Ubean {
public static ArrayList<Field> obtenerAtributos(Object o){
	Class clase = o.getClass();
	ArrayList<Field> attrs= new ArrayList<Field>();
	for (Field f : attrs) {
		attrs.add(f);
	}
	return attrs;	
}
public static void ejecutarSet(Object o, String att, Object valor){
	Class clase = o.getClass();
	for (Method m : clase.getDeclaredMethods()) {
		
		if (m.getName().startsWith("set")) {
			
		 try {
			valor = m.invoke(o, att);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
		}
	}	
}
public static Object ejecutarGet(Object o, String att){
	Class clase = o.getClass();
	Object obj=null ;
	for (Method m : clase.getDeclaredMethods()) {
		
		if (m.getName().startsWith("get"+att.substring(0,1).toUpperCase()+att.substring(1))) {
		
				try {
					obj = m.invoke(o, null);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
		}	
	}
	return obj;	
}
}
