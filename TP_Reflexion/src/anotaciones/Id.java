package anotaciones;

import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

@Documented
@Target(FIELD)
public @interface Id {

}
