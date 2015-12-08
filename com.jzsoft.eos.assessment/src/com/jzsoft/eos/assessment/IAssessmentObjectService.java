package com.jzsoft.eos.assessment;

import com.eos.das.entity.criteria.CriteriaType;
import com.eos.foundation.PageCond;
import com.jzsoft.eos.assessment.dataset.AssessmentObject;

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
public interface IAssessmentObjectService {

	/**
	 * 
	 * @param assessmentObject
	 *            AssessmentObject
	 */
	public abstract void addAssessmentObject(AssessmentObject assessmentObject);

	/**
	 * 
	 * @param assessmentObjects
	 *            AssessmentObject[]
	 */
	public abstract void deleteAssessmentObjects(
			AssessmentObject[] assessmentObjects);

	/**
	 * 
	 * @param assessmentObject
	 *            AssessmentObject[]
	 */
	public abstract void getAssessmentObject(AssessmentObject assessmentObject);

	/**
	 * 
	 * @param criteria
	 *            CriteriaType
	 * @param page
	 *            PageCond
	 * @return AssessmentObject[]
	 */
	public abstract AssessmentObject[] queryAssessmentObjects(
			CriteriaType criteriaType, PageCond pageCond);

	/**
	 * 
	 * @param assessmentObject
	 *            AssessmentObject[]
	 */
	public abstract void updateAssessmentObject(
			AssessmentObject assessmentObject);

	public abstract AssessmentObject[] loadObjectTaskTreeData();
}
