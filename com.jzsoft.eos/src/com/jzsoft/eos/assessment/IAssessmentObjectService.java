package com.jzsoft.eos.assessment;

import com.jzsoft.eos.assessment.data.AssessmentObject;

public interface IAssessmentObjectService {
	public abstract AssessmentObject[] getAllObjects();
	
	public abstract boolean save(AssessmentObject[] created, AssessmentObject[] deleted, AssessmentObject[] updated);
}
