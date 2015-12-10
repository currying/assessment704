package com.jzsoft.eos.assessment;

import com.jzsoft.eos.assessment.data.AssessmentGroup;

public interface IAssessmentGroupService {
	public AssessmentGroup[] getHierarchyGroupsByTaskId(Long taskId);
}
