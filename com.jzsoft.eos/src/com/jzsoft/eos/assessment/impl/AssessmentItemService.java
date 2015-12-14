/**
 * 
 */
package com.jzsoft.eos.assessment.impl;

import com.eos.das.entity.ExpressionHelper;
import com.eos.das.entity.IDASCriteria;
import com.eos.spring.DASDaoSupport;
import com.jzsoft.eos.assessment.IAssessmentItemService;
import com.jzsoft.eos.assessment.SequenceName;
import com.jzsoft.eos.assessment.data.AssessmentItem;

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
public class AssessmentItemService extends DASDaoSupport implements
		IAssessmentItemService {

	/**
	 * 
	 */
	public AssessmentItemService() {
		// TODO 自动生成的构造函数存根
	}

	public AssessmentItem[] getRootItemsByTaskId(Long taskId) {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentItem.QNAME);
		dasCriteria.add(ExpressionHelper.eq("task.id", taskId));
		dasCriteria.add(ExpressionHelper.isNull("parent.id"));
		AssessmentItem[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentItem.class,
						dasCriteria);
		System.out.println("getRootItemsByTaskId" + taskId);
		return results;
	}

	public AssessmentItem[] getItemsByParentId(Long parentId) {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentItem.QNAME);
		dasCriteria.add(ExpressionHelper.eq("parent.id", parentId));
		AssessmentItem[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentItem.class,
						dasCriteria);
		return results;
	}

	public boolean addItem(AssessmentItem newItem) {

		try {
			newItem.setId(getDASTemplate()
					.getNextSequence(SequenceName.ITEM_ID));
		} catch (Exception e) {
			e.printStackTrace();
		}
		getDASTemplate().insertEntity(newItem);
		return true;
	}
}
