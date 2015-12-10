/**
 * 
 */
package com.jzsoft.eos.assessment.impl;

import com.eos.das.entity.ExpressionHelper;
import com.eos.das.entity.IDASCriteria;
import com.eos.spring.DASDaoSupport;
import com.jzsoft.eos.assessment.IAssessmentGroupService;
import com.jzsoft.eos.assessment.data.AssessmentGroup;

/**
 * <pre>
 * Title: 程序的中文名称
 * Description: 程序功能的描述
 * </pre>
 * @author LUCHAO
 * @version 1.00.00
 * 
 */
/*
 * 修改历史
 * $log$
 */
public class AssessmentGroupService extends DASDaoSupport implements
		IAssessmentGroupService {

	/**
	 * 
	 */
	public AssessmentGroupService() {
		// TODO 自动生成的构造函数存根
	}

	public AssessmentGroup[] getHierarchyGroupsByTaskId(Long taskId) {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(AssessmentGroup.QNAME);
		dasCriteria.add(ExpressionHelper.eq("task.id", taskId));
		dasCriteria.add(ExpressionHelper.isNull("parent.id"));
		AssessmentGroup[] results = getDASTemplate().queryEntitiesByCriteriaEntity(AssessmentGroup.class,
				dasCriteria);
		
		for (int i = 0; i < results.length; i ++) {
			loadChildren(results[i]);
		}
		
		return results;
	}
	
	private void loadChildren(AssessmentGroup group) {
		getDASTemplate().getRelationEntities(AssessmentGroup.class, group, "children");
		for (int i = 0; i < group.getChildren().size(); i ++) {
			loadChildren(group.getChildren().get(i));
		}
	}
}
