package com.jzsoft.eos.assessment;

import com.jzsoft.eos.assessment.data.AssessmentItem;

public interface IAssessmentItemService {
	public AssessmentItem[] getRootItemsByTaskId(Long taskId);
	public AssessmentItem[] getItemsByParentId(Long parentId);
	public boolean insert(AssessmentItem item);
}
