/**
 * 
 */
package com.jzsoft.eos.assessment.impl;

import com.eos.das.entity.IDASCriteria;
import com.eos.spring.DASDaoSupport;
import com.jzsoft.eos.assessment.IAssessmentObjectService;
import com.jzsoft.eos.assessment.data.AssessmentObject;
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
public class AssessmentObjectService extends DASDaoSupport implements
		IAssessmentObjectService {

	/**
	 * 
	 */
	public AssessmentObjectService() {
		// TODO 自动生成的构造函数存根
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see
	 * com.jzsoft.eos.assessment.IAssessmentObjectService#getAllAssessmentObjects
	 * (com.eos.das.entity.criteria.CriteriaType)
	 */
	public AssessmentObject[] getAllObjects() {
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentObject.QNAME).asc("number");
		AssessmentObject[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentObject.class,
						dasCriteria);

		return results;
	}

	public AssessmentObject[] loadObjectTaskTreeData() {
		// try {
		// System.out.println(getDASTemplate().getNextSequence("bbb"));
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		IDASCriteria dasCriteria = getDASTemplate().createCriteria(
				AssessmentObject.QNAME).asc("number");
		AssessmentObject[] results = getDASTemplate()
				.queryEntitiesByCriteriaEntity(AssessmentObject.class,
						dasCriteria);
		for (int i = 0; i < results.length; i++) {
			getDASTemplate().getRelationEntities(AssessmentTask.class,
					results[i], "tasks");
		}
		return results;
	}

	public void addAssessmentObject(AssessmentObject assessmentObject) {
		getDASTemplate().getPrimaryKey(assessmentObject);
		getDASTemplate().insertEntity(assessmentObject);
	}

	public void deleteAssessmentObject(AssessmentObject[] assessmentObjects) {
		for (AssessmentObject object : assessmentObjects) {
			getDASTemplate().deleteEntityCascade(object);
		}
	}
}
