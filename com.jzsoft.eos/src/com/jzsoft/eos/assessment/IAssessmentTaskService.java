package com.jzsoft.eos.assessment;

import com.jzsoft.eos.assessment.data.AssessmentTask;

public interface IAssessmentTaskService {
	public abstract AssessmentTask[] getAllTasks();
	
	public abstract AssessmentTask[] getTasksByObjectId(long objectId);
}
