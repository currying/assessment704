/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.jzsoft.eos.assessment.dataset.impl;

import com.jzsoft.eos.assessment.dataset.AssessmentGroup;
import com.jzsoft.eos.assessment.dataset.AssessmentScore;
import com.jzsoft.eos.assessment.dataset.AssessmentTask;
import com.primeton.ext.data.sdo.DataUtil;
import com.primeton.ext.data.sdo.ExtendedDataObjectImpl;

import commonj.sdo.Type;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentGroupImpl#getWeighting <em>Weighting</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentGroupImpl#getAssessmentScores <em>AssessmentScores</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentGroupImpl#getAssessmentGroup <em>AssessmentGroup</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentGroupImpl#getAssessmentGroups <em>AssessmentGroups</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentGroupImpl#getAssessmentTask <em>AssessmentTask</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements AssessmentGroup;
 */

public class AssessmentGroupImpl extends ExtendedDataObjectImpl implements AssessmentGroup {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_ID = 0;
	public final static int INDEX_NAME = 1;
	public final static int INDEX_WEIGHTING = 2;
	public final static int INDEX_ASSESSMENTSCORES = 3;
	public final static int INDEX_ASSESSMENTGROUP = 4;
	public final static int INDEX_ASSESSMENTGROUPS = 5;
	public final static int INDEX_ASSESSMENTTASK = 6;
	public final static int SDO_PROPERTY_COUNT = 7;

	public final static int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentGroupImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentGroupImpl(Type type) {
		super(type);
	}

	protected void validate() {
		validateType(TYPE);
	}

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(java.lang.String)
	 */
	public String getId() {
		return DataUtil.toString(super.getByIndex(INDEX_ID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 */
	public void setId(String id) {
		super.setByIndex(INDEX_ID, id);
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(java.lang.String)
	 */
	public String getName() {
		return DataUtil.toString(super.getByIndex(INDEX_NAME, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 */
	public void setName(String name) {
		super.setByIndex(INDEX_NAME, name);
	}

	/**
	 * Returns the value of the '<em><b>Weighting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weighting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weighting</em>' attribute.
	 * @see #setWeighting(float)
	 */
	public float getWeighting() {
		return DataUtil.toFloat(super.getByIndex(INDEX_WEIGHTING, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getWeighting <em>Weighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighting</em>' attribute.
	 * @see #getWeighting()
	 */
	public void setWeighting(float weighting) {
		super.setByIndex(INDEX_WEIGHTING, weighting);
	}

	/**
	 * Returns the value of the '<em><b>AssessmentScores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentScores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentScores</em>' attribute.
	 * @see #setAssessmentScores(com.jzsoft.eos.assessment.dataset.AssessmentScore)
	 */
	public List<AssessmentScore> getAssessmentScores() {
		return (List<AssessmentScore>) getList(INDEX_ASSESSMENTSCORES, true);
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAssessmentScores <em>AssessmentScores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentScores</em>' attribute.
	 * @see #getAssessmentScores()
	 */
	public void setAssessmentScores(List<AssessmentScore> assessmentScores) {
		super.setByIndex(INDEX_ASSESSMENTSCORES, assessmentScores);
	}

	/**
	 * Returns the value of the '<em><b>AssessmentGroup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentGroup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentGroup</em>' attribute.
	 * @see #setAssessmentGroup(com.jzsoft.eos.assessment.dataset.AssessmentGroup)
	 */
	public AssessmentGroup getAssessmentGroup() {
		return (AssessmentGroup) DataUtil.toDataObject(super.getByIndex(INDEX_ASSESSMENTGROUP, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAssessmentGroup <em>AssessmentGroup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentGroup</em>' attribute.
	 * @see #getAssessmentGroup()
	 */
	public void setAssessmentGroup(AssessmentGroup assessmentGroup) {
		super.setByIndex(INDEX_ASSESSMENTGROUP, assessmentGroup);
	}

	/**
	 * Returns the value of the '<em><b>AssessmentGroups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentGroups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentGroups</em>' attribute.
	 * @see #setAssessmentGroups(com.jzsoft.eos.assessment.dataset.AssessmentGroup)
	 */
	public List<AssessmentGroup> getAssessmentGroups() {
		return (List<AssessmentGroup>) getList(INDEX_ASSESSMENTGROUPS, true);
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAssessmentGroups <em>AssessmentGroups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentGroups</em>' attribute.
	 * @see #getAssessmentGroups()
	 */
	public void setAssessmentGroups(List<AssessmentGroup> assessmentGroups) {
		super.setByIndex(INDEX_ASSESSMENTGROUPS, assessmentGroups);
	}

	/**
	 * Returns the value of the '<em><b>AssessmentTask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentTask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentTask</em>' attribute.
	 * @see #setAssessmentTask(com.jzsoft.eos.assessment.dataset.AssessmentTask)
	 */
	public AssessmentTask getAssessmentTask() {
		return (AssessmentTask) DataUtil.toDataObject(super.getByIndex(INDEX_ASSESSMENTTASK, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAssessmentTask <em>AssessmentTask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentTask</em>' attribute.
	 * @see #getAssessmentTask()
	 */
	public void setAssessmentTask(AssessmentTask assessmentTask) {
		super.setByIndex(INDEX_ASSESSMENTTASK, assessmentTask);
	}


}