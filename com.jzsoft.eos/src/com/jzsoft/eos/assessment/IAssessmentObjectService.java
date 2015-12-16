package com.jzsoft.eos.assessment;

import com.jzsoft.eos.assessment.data.AssessmentObject;

public interface IAssessmentObjectService {
	public abstract AssessmentObject[] getAllObjects();

	public abstract AssessmentObject[] loadObjectTaskTreeData();

	public abstract void addAssessmentObject(AssessmentObject assessmentObject);

	public abstract void deleteAssessmentObject(
			AssessmentObject[] assessmentObjects);
}
