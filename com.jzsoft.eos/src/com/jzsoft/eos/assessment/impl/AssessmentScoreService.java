/**
 * 
 */
package com.jzsoft.eos.assessment.impl;

import com.eos.das.entity.ExpressionHelper;
import com.eos.das.entity.IDASCriteria;
import com.eos.spring.DASDaoSupport;
import com.jzsoft.eos.assessment.IAssessmentScoreService;
import com.jzsoft.eos.assessment.data.AssessmentScore;

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
public class AssessmentScoreService extends DASDaoSupport implements
		IAssessmentScoreService {

	/**
	 * 
	 */
	public AssessmentScoreService() {
		// TODO 自动生成的构造函数存根
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.jzsoft.eos.assessment.IAssessmentScoreService#getScoreByItemIdAndGroupId
	 * (java.lang.Long, java.lang.Long)
	 */
	public AssessmentScore getScoreByItemIdAndGroupId(Long itemId, Long groupId) {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentScore.QNAME);
		dasCriteria.add(ExpressionHelper.eq("item.id", itemId));
		dasCriteria.add(ExpressionHelper.eq("group.id", groupId));
		
		AssessmentScore[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentScore.class,
						dasCriteria);
		
		if (results.length != 0) {
			return results[0];
		} else {
			return null;
		}
	}
}
