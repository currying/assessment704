/**
 * 
 */
package com.jzsoft.eos.assessment.impl;

import com.eos.das.entity.ExpressionHelper;
import com.eos.das.entity.IDASCriteria;
import com.eos.spring.DASDaoSupport;
import com.jzsoft.eos.assessment.IAssessmentTaskService;
import com.jzsoft.eos.assessment.SequenceName;
import com.jzsoft.eos.assessment.data.AssessmentTask;

/**
 * <pre>
 * Title: 程序的中文名称
 * Description: 程序功能的描述
 * </pre>
 * 
 * @author LUCHAO
 * @version 1.00.00
 * 
 */
/*
 * 修改历史 $log$
 */
public class AssessmentTaskService extends DASDaoSupport implements
		IAssessmentTaskService {

	/**
	 * 
	 */
	public AssessmentTaskService() {
		// TODO 自动生成的构造函数存根
	}

	public AssessmentTask[] getAllTasks() {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentTask.QNAME).asc("number");
		AssessmentTask[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentTask.class,
						dasCriteria);

		return results;
	}

	public AssessmentTask[] getTasksByObjectId(long objectId) {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentTask.QNAME);
		dasCriteria.add(ExpressionHelper.eq("object.id", objectId));
		AssessmentTask[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentTask.class,
						dasCriteria);
		
		return results;
	}

	public AssessmentTask getTasksById(long taskId) {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentTask.QNAME);
		dasCriteria.add(ExpressionHelper.eq("id", taskId));
		AssessmentTask[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentTask.class,
						dasCriteria);
		if (results.length > 0)
			return results[0];
		else
			return null;
	}
	
	public void saveTasks(AssessmentTask[] created, AssessmentTask[] deleted, AssessmentTask[] updated) {
		try {
			for (AssessmentTask object : created) {
				object.setId(getDASTemplate().getNextSequence(SequenceName.TASK_ID));
			}
		} catch (Exception e) {

		}
		getDASTemplate().insertEntityBatch(created);
		getDASTemplate().deleteEntityBatch(deleted);
		getDASTemplate().updateEntityBatch(updated);
	}
}
