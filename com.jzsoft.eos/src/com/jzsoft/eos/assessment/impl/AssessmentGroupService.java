/**
 * 
 */
package com.jzsoft.eos.assessment.impl;

import com.eos.das.entity.ExpressionHelper;
import com.eos.das.entity.IDASCriteria;
import com.eos.spring.DASDaoSupport;
import com.jzsoft.eos.assessment.IAssessmentGroupService;
import com.jzsoft.eos.assessment.SequenceName;
import com.jzsoft.eos.assessment.data.AssessmentGroup;

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
public class AssessmentGroupService extends DASDaoSupport implements
		IAssessmentGroupService {

	/**
	 * 
	 */
	public AssessmentGroupService() {
	}

	public AssessmentGroup[] getGroupsByTaskId(Long taskId) {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentGroup.QNAME);
		dasCriteria.add(ExpressionHelper.eq("task.id", taskId));
		dasCriteria.add(ExpressionHelper.isNull("parent.id"));
		AssessmentGroup[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentGroup.class,
						dasCriteria);
		
		return results;
	}

	public AssessmentGroup[] getGroupsByParentId(Long parentId) {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentGroup.QNAME);
		dasCriteria.add(ExpressionHelper.eq("parent.id", parentId));
		AssessmentGroup[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentGroup.class,
						dasCriteria);

		return results;
	}

	public AssessmentGroup[] getCascadeGroupsByTaskId(Long taskId) {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentGroup.QNAME);
		dasCriteria.add(ExpressionHelper.eq("task.id", taskId));
		dasCriteria.add(ExpressionHelper.isNull("parent.id"));
		AssessmentGroup[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentGroup.class,
						dasCriteria);

		for (int i = 0; i < results.length; i++) {
			loadChildren(results[i]);
		}

		return results;
	}

	private void loadChildren(AssessmentGroup group) {
		getDASTemplate().getRelationEntities(AssessmentGroup.class, group,
				"children");
		for (int i = 0; i < group.getChildren().size(); i++) {
			loadChildren(group.getChildren().get(i));
		}
	}

	public void saveGroups(AssessmentGroup[] created,
			AssessmentGroup[] deleted, AssessmentGroup[] updated) {
		try {
			for (AssessmentGroup object : created) {
				object.setId(getDASTemplate().getNextSequence(
						SequenceName.GROUP_ID));
			}
		} catch (Exception e) {

		}
		getDASTemplate().insertEntityBatch(created);
		getDASTemplate().deleteEntityBatch(deleted);
		getDASTemplate().updateEntityBatch(updated);
	}
}
