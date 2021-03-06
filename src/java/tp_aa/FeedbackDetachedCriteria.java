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

public class FeedbackDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression ClassificationId;
	public final AssociationExpression Classification;
	public final StringExpression coment;
	
	public FeedbackDetachedCriteria() {
		super(tp_aa.Feedback.class, tp_aa.FeedbackCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		ClassificationId = new IntegerExpression("Classification.ID", this.getDetachedCriteria());
		Classification = new AssociationExpression("Classification", this.getDetachedCriteria());
		coment = new StringExpression("coment", this.getDetachedCriteria());
	}
	
	public FeedbackDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tp_aa.FeedbackCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		ClassificationId = new IntegerExpression("Classification.ID", this.getDetachedCriteria());
		Classification = new AssociationExpression("Classification", this.getDetachedCriteria());
		coment = new StringExpression("coment", this.getDetachedCriteria());
	}
	
	public ClassificationDetachedCriteria createClassificationCriteria() {
		return new ClassificationDetachedCriteria(createCriteria("Classification"));
	}
	
	public Feedback uniqueFeedback(PersistentSession session) {
		return (Feedback) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Feedback[] listFeedback(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Feedback[]) list.toArray(new Feedback[list.size()]);
	}
}

