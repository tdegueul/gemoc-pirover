package org.gemoc.rover.rcl.semantics;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.rover.rcl.semantics.StatementAspect;
import rcl.Action;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect extends StatementAspect {
}
