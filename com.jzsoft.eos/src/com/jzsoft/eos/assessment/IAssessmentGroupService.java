package com.jzsoft.eos.assessment;

import com.jzsoft.eos.assessment.data.AssessmentGroup;

public interface IAssessmentGroupService {

	public AssessmentGroup[] getGroupsByTaskId(Long taskId);

	public AssessmentGroup[] getGroupsByParentId(Long parentId);

	public AssessmentGroup[] getHierarchyGroupsByTaskId(Long taskId);
}
