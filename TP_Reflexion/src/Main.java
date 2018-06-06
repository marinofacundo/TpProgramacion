import java.lang.reflect.Field;

public class Main {
public static void main(String[] args) {
	Persona p = new Persona("Facundo", "Mari�o");
	Class clase = p.getClass();
	
	ConecBD conectar = new ConecBD();
	conectar.conectarBD();
	
	try {
		Field f = clase.getDeclaredField("apellido");
		f.setAccessible(true);
		try {
			System.out.println(f.get(p));
			f.set(p, "Mari�o");
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	} catch (NoSuchFieldException | SecurityException e) {
		e.printStackTrace();
	}
	
}
}
