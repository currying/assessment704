package com.jzsoft.eos.assessment;

import com.eos.das.entity.ExpressionHelper;
import com.eos.das.entity.IDASCriteria;
import com.eos.das.entity.criteria.CriteriaType;
import com.eos.foundation.PageCond;
import com.eos.spring.DASDaoSupport;
import com.eos.system.utility.StringUtil;
import com.jzsoft.eos.assessment.dataset.AssessmentItem;
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
public class AssessmentItemService extends DASDaoSupport implements
		IAssessmentItemService {
	public void addAssessmentItem(AssessmentItem assessmentItem) {
		getDASTemplate().getPrimaryKey(assessmentItem);
		getDASTemplate().insertEntity(assessmentItem);
	}

	public void deleteAssessmentItems(AssessmentItem[] assessmentItems) {
		for (DataObject assessmentItem : assessmentItems) {
			getDASTemplate().deleteEntityCascade(assessmentItem);
		}
	}

	public void getAssessmentItem(AssessmentItem assessmentItem) {
		getDASTemplate().expandEntity(assessmentItem);
	}

	public AssessmentItem[] queryAssessmentItems(CriteriaType criteriaType,
			PageCond pageCond) {
		IDASCriteria dasCriteria = getDASTemplate().criteriaTypeToDASCriteria(
				criteriaType).asc("name");
		return getDASTemplate().queryEntitiesByCriteriaEntityWithPage(
				AssessmentItem.class, dasCriteria, pageCond);
	}

	public float queryAssessmentItemWeighting(String id) {
		float weighting = 0;
		AssessmentItem[] results = null;
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentItem.QNAME);
		dasCriteria.add(ExpressionHelper.eq("assessmentItem.id", id));
		results = getDASTemplate().queryEntitiesByCriteriaEntity(
				AssessmentItem.class, dasCriteria);
		for (AssessmentItem assessmentItem : results) {
			weighting += assessmentItem.getWeighting();
		}
		return weighting;
	}

	public AssessmentItem[] queryAssessmentItems(String id) {
		AssessmentItem[] results = null;
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentItem.QNAME).asc("name");
		if (StringUtil.isBlank(id))
			dasCriteria.add(ExpressionHelper.isNull("assessmentItem.id"));
		else
			dasCriteria.add(ExpressionHelper.eq("assessmentItem.id", id));
		results = getDASTemplate().queryEntitiesByCriteriaEntity(
				AssessmentItem.class, dasCriteria);

		for (AssessmentItem assessmentItem : results) {
			IDASCriteria dasCriteria2 = getDASTemplate().createCriteria(
					AssessmentItem.QNAME);
			dasCriteria2.add(ExpressionHelper.eq("assessmentItem.id",
					assessmentItem.getId()));
			AssessmentItem[] children = getDASTemplate()
					.queryEntitiesByCriteriaEntity(AssessmentItem.class,
							dasCriteria2);
			if (children.length > 0) {
				assessmentItem.setBoolean("isLeaf", false);
				assessmentItem.setBoolean("expanded", false);
				assessmentItem.set("itemWeighting",
						queryAssessmentItemWeighting(assessmentItem.getId()));
			}
		}

		return results;
	}

	public void updateAssessmentItem(AssessmentItem assessmentItem) {
		getDASTemplate().updateEntity(assessmentItem);
	}

}
