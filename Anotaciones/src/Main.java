import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
			
		try {
			Class c = Clase.class;
			Object o = c.newInstance();
			for (Method m : c.getDeclaredMethods()) {
				if (m.getAnnotation(Prueba.class) != null) {
					m.invoke(o, null);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}		

	}

}
