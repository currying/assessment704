package com.jzsoft.eos.assessment;

import com.jzsoft.eos.assessment.data.AssessmentScore;

public interface IAssessmentScoreService {
	public AssessmentScore getScoreByItemIdAndGroupId(Long itemId, Long groupId);
}
