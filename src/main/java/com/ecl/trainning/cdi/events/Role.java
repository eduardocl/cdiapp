package com.ecl.trainning.cdi.events;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

@Qualifier
@Target({FIELD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Role {

	String value();
	
}
