package rover.rcl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.rcl.aspects.StatementAspect;
import rover.rcl.rcl.Action;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect extends StatementAspect {
}
