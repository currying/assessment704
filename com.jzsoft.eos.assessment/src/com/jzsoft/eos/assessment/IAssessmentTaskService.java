package com.jzsoft.eos.assessment;

import com.eos.das.entity.criteria.CriteriaType;
import com.eos.foundation.PageCond;
import com.jzsoft.eos.assessment.dataset.AssessmentTask;

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
/*
 * 修改历史 $log$
 */
public interface IAssessmentTaskService {

	/**
	 * 
	 * @param assessmentTask
	 *            AssessmentTask
	 */
	public abstract void addAssessmentTask(AssessmentTask assessmentTask);

	/**
	 * 
	 * @param assessmentTasks
	 *            AssessmentTask[]
	 */
	public abstract void deleteAssessmentTasks(AssessmentTask[] assessmentTasks);

	/**
	 * 
	 * @param assessmentTask
	 *            AssessmentTask[]
	 */
	public abstract void getAssessmentTask(AssessmentTask assessmentTask);

	/**
	 * 
	 * @param criteria
	 *            CriteriaType
	 * @param page
	 *            PageCond
	 * @return AssessmentTask[]
	 */
	public abstract AssessmentTask[] queryAssessmentTasks(
			CriteriaType criteriaType, PageCond pageCond);

	/**
	 * 
	 * @param assessmentTask
	 *            AssessmentTask[]
	 */
	public abstract void updateAssessmentTask(AssessmentTask assessmentTask);

}
