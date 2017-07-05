package rover.raspirover.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import rover.raspirover.aspects.StatementAspect;
import rover.raspirover.raspirover.Action;

@Aspect(className = Action.class)
@SuppressWarnings("all")
public abstract class ActionAspect extends StatementAspect {
}
