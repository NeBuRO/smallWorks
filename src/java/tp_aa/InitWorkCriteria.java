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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InitWorkCriteria extends AbstractORMCriteria {
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
	
	public InitWorkCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		LocalizationId = new IntegerExpression("Localization.ID", this);
		Localization = new AssociationExpression("Localization", this);
		TasksId = new IntegerExpression("Tasks.ID", this);
		Tasks = new AssociationExpression("Tasks", this);
		WorkerId = new IntegerExpression("Worker.ID", this);
		Worker = new AssociationExpression("Worker", this);
		title = new StringExpression("title", this);
		description = new StringExpression("description", this);
		price = new DoubleExpression("price", this);
		negotiable = new BooleanExpression("negotiable", this);
		state = new StringExpression("state", this);
		startDate = new DateExpression("startDate", this);
		coordLat = new LongExpression("coordLat", this);
		coordLong = new LongExpression("coordLong", this);
	}
	
	public InitWorkCriteria(PersistentSession session) {
		this(session.createCriteria(InitWork.class));
	}
	
	public InitWorkCriteria() throws PersistentException {
		this(globalconf.TPAAPersistentManager.instance().getSession());
	}
	
	public DistrictCriteria createLocalizationCriteria() {
		return new DistrictCriteria(createCriteria("Localization"));
	}
	
	public TaskCriteria createTasksCriteria() {
		return new TaskCriteria(createCriteria("Tasks"));
	}
	
	public user.UserCriteria createWorkerCriteria() {
		return new user.UserCriteria(createCriteria("Worker"));
	}
	
	public InitWork uniqueInitWork() {
		return (InitWork) super.uniqueResult();
	}
	
	public InitWork[] listInitWork() {
		java.util.List list = super.list();
		return (InitWork[]) list.toArray(new InitWork[list.size()]);
	}
}

