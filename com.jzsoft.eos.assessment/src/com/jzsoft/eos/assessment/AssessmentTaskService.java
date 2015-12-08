package com.jzsoft.eos.assessment;

import com.eos.das.entity.IDASCriteria;
import com.eos.das.entity.criteria.CriteriaType;
import com.eos.foundation.PageCond;
import com.eos.spring.DASDaoSupport;
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
public class AssessmentTaskService extends DASDaoSupport implements
		IAssessmentTaskService {
	public void addAssessmentTask(AssessmentTask assessmentTask) {
		getDASTemplate().getPrimaryKey(assessmentTask);
		getDASTemplate().insertEntity(assessmentTask);
	}

	public void deleteAssessmentTasks(AssessmentTask[] assessmentTasks) {
		for (DataObject assessmentTask : assessmentTasks) {
			getDASTemplate().deleteEntityCascade(assessmentTask);
		}
	}

	public void getAssessmentTask(AssessmentTask assessmentTask) {
		getDASTemplate().expandEntity(assessmentTask);
	}

	public AssessmentTask[] queryAssessmentTasks(CriteriaType criteriaType,
			PageCond pageCond) {
		IDASCriteria dasCriteria = getDASTemplate().criteriaTypeToDASCriteria(
				criteriaType);
		return getDASTemplate().queryEntitiesByCriteriaEntityWithPage(
				AssessmentTask.class, dasCriteria, pageCond);
	}

	public void updateAssessmentTask(AssessmentTask assessmentTask) {
		getDASTemplate().updateEntity(assessmentTask);
	}

}
