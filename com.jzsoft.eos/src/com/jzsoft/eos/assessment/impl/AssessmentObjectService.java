/**
 * 
 */
package com.jzsoft.eos.assessment.impl;

import com.eos.das.entity.IDASCriteria;
import com.eos.spring.DASDaoSupport;
import com.eos.system.exception.EOSRuntimeException;
import com.jzsoft.eos.assessment.IAssessmentObjectService;
import com.jzsoft.eos.assessment.SequenceName;
import com.jzsoft.eos.assessment.data.AssessmentObject;

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

	public void saveObjects(AssessmentObject[] created, AssessmentObject[] deleted, AssessmentObject[] updated) {
		try {
			for (AssessmentObject object : created) {
				object.setId(getDASTemplate().getNextSequence(SequenceName.OBJECT_ID));
			}
		} catch (Exception e) {

		}
		getDASTemplate().insertEntityBatch(created);
		getDASTemplate().deleteEntityBatch(deleted);
		getDASTemplate().updateEntityBatch(updated);
	}
}
