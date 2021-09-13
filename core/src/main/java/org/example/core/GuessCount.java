package org.example.core;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Target indicates the context in which an annotation type is applicable
// in this case MaxNumber can be added to fields parameters or methods
// ElementType is an enum that provides locations to constants where annotation appear in the program
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
// Retention tells how long annotations with the annotated type should be retained
@Retention(RetentionPolicy.RUNTIME)
//Qualifier is an annotation used to annotate other custom annotations that can in turn be used as qualifiers
@Qualifier
public @interface GuessCount {




}
