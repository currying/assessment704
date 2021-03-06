package com.jzsoft.eos.assessment;

import com.jzsoft.eos.assessment.data.AssessmentGroup;

public interface IAssessmentGroupService {

	public AssessmentGroup[] getGroupsByTaskId(Long taskId);

	public AssessmentGroup[] getGroupsByParentId(Long parentId);

	public AssessmentGroup[] getCascadeGroupsByTaskId(Long taskId);
	
	public void saveGroups(AssessmentGroup[] created, AssessmentGroup[] deleted, AssessmentGroup[] updated);
}
