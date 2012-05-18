package com.ecl.trainning.cdi.qualifier;

import java.text.Annotation;

import javax.enterprise.util.AnnotationLiteral;

import com.ecl.trainning.cdi.events.Role;


public abstract class RoleQualifier extends AnnotationLiteral<Role> implements Role{

}
