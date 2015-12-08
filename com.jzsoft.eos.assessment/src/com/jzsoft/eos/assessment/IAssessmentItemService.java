package com.jzsoft.eos.assessment;

import com.eos.das.entity.criteria.CriteriaType;
import com.eos.foundation.PageCond;
import com.jzsoft.eos.assessment.dataset.AssessmentItem;

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
public interface IAssessmentItemService {

	/**
	 * 
	 * @param assessmentItem
	 *            AssessmentItem
	 */
	public abstract void addAssessmentItem(AssessmentItem assessmentItem);

	/**
	 * 
	 * @param assessmentItems
	 *            AssessmentItem[]
	 */
	public abstract void deleteAssessmentItems(AssessmentItem[] assessmentItems);

	/**
	 * 
	 * @param assessmentItem
	 *            AssessmentItem[]
	 */
	public abstract void getAssessmentItem(AssessmentItem assessmentItem);

	/**
	 * 
	 * @param criteria
	 *            CriteriaType
	 * @param page
	 *            PageCond
	 * @return AssessmentItem[]
	 */
	public abstract float queryAssessmentItemWeighting(String id);

	public abstract AssessmentItem[] queryAssessmentItems(String id);

	public abstract AssessmentItem[] queryAssessmentItems(
			CriteriaType criteriaType, PageCond pageCond);

	/**
	 * 
	 * @param assessmentItem
	 *            AssessmentItem[]
	 */
	public abstract void updateAssessmentItem(AssessmentItem assessmentItem);

}
