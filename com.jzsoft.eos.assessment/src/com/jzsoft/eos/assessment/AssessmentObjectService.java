package com.jzsoft.eos.assessment;

import com.eos.das.entity.IDASCriteria;
import com.eos.das.entity.criteria.CriteriaType;
import com.eos.foundation.PageCond;
import com.eos.spring.DASDaoSupport;
import com.jzsoft.eos.assessment.dataset.AssessmentObject;
import com.jzsoft.eos.assessment.dataset.AssessmentTask;
import commonj.sdo.DataObject;

/**
 * <pre>
 * Title: 程序的中文名称
 * Description: 程序功能的描述
 * </pre>
 * 
 * @author currying (mailto:service6@primeton.com)
 * @version 1.00.00
 * 
 */
public class AssessmentObjectService extends DASDaoSupport implements
		IAssessmentObjectService {
	public void addAssessmentObject(AssessmentObject assessmentObject) {
		getDASTemplate().getPrimaryKey(assessmentObject);
		getDASTemplate().insertEntity(assessmentObject);
	}

	public void deleteAssessmentObjects(AssessmentObject[] assessmentObjects) {
		for (DataObject assessmentObject : assessmentObjects) {
			getDASTemplate().deleteEntityCascade(assessmentObject);
		}
	}

	public void getAssessmentObject(AssessmentObject assessmentObject) {
		getDASTemplate().expandEntity(assessmentObject);
	}

	public AssessmentObject[] queryAssessmentObjects(CriteriaType criteriaType,
			PageCond pageCond) {
		IDASCriteria dasCriteria = getDASTemplate().criteriaTypeToDASCriteria(
				criteriaType);
		return getDASTemplate().queryEntitiesByCriteriaEntityWithPage(
				AssessmentObject.class, dasCriteria, pageCond);
	}

	public void updateAssessmentObject(AssessmentObject assessmentObject) {
		getDASTemplate().updateEntity(assessmentObject);
	}

	public AssessmentObject[] loadObjectTaskTreeData() {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentObject.QNAME);
		AssessmentObject[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentObject.class,
						dasCriteria);

		for (int i = 0; i < results.length; i++) {
			getDASTemplate().getRelationEntities(AssessmentTask.class,
					results[i], "assessmentTasks");
		}

		return results;
	}
}
