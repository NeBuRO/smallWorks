/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package tp_aa;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InitWorkDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression LocalizationId;
	public final AssociationExpression Localization;
	public final IntegerExpression TasksId;
	public final AssociationExpression Tasks;
	public final IntegerExpression WorkerId;
	public final AssociationExpression Worker;
	public final StringExpression title;
	public final StringExpression description;
	public final DoubleExpression price;
	public final BooleanExpression negotiable;
	public final StringExpression state;
	public final DateExpression startDate;
	public final LongExpression coordLat;
	public final LongExpression coordLong;
	
	public InitWorkDetachedCriteria() {
		super(tp_aa.InitWork.class, tp_aa.InitWorkCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		LocalizationId = new IntegerExpression("Localization.ID", this.getDetachedCriteria());
		Localization = new AssociationExpression("Localization", this.getDetachedCriteria());
		TasksId = new IntegerExpression("Tasks.ID", this.getDetachedCriteria());
		Tasks = new AssociationExpression("Tasks", this.getDetachedCriteria());
		WorkerId = new IntegerExpression("Worker.ID", this.getDetachedCriteria());
		Worker = new AssociationExpression("Worker", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		negotiable = new BooleanExpression("negotiable", this.getDetachedCriteria());
		state = new StringExpression("state", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
		coordLat = new LongExpression("coordLat", this.getDetachedCriteria());
		coordLong = new LongExpression("coordLong", this.getDetachedCriteria());
	}
	
	public InitWorkDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tp_aa.InitWorkCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		LocalizationId = new IntegerExpression("Localization.ID", this.getDetachedCriteria());
		Localization = new AssociationExpression("Localization", this.getDetachedCriteria());
		TasksId = new IntegerExpression("Tasks.ID", this.getDetachedCriteria());
		Tasks = new AssociationExpression("Tasks", this.getDetachedCriteria());
		WorkerId = new IntegerExpression("Worker.ID", this.getDetachedCriteria());
		Worker = new AssociationExpression("Worker", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		negotiable = new BooleanExpression("negotiable", this.getDetachedCriteria());
		state = new StringExpression("state", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
		coordLat = new LongExpression("coordLat", this.getDetachedCriteria());
		coordLong = new LongExpression("coordLong", this.getDetachedCriteria());
	}
	
	public DistrictDetachedCriteria createLocalizationCriteria() {
		return new DistrictDetachedCriteria(createCriteria("Localization"));
	}
	
	public TaskDetachedCriteria createTasksCriteria() {
		return new TaskDetachedCriteria(createCriteria("Tasks"));
	}
	
	public user.UserDetachedCriteria createWorkerCriteria() {
		return new user.UserDetachedCriteria(createCriteria("Worker"));
	}
	
	public InitWork uniqueInitWork(PersistentSession session) {
		return (InitWork) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public InitWork[] listInitWork(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (InitWork[]) list.toArray(new InitWork[list.size()]);
	}
}

