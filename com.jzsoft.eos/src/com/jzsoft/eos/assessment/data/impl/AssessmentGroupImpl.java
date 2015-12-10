/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.jzsoft.eos.assessment.data.impl;

import com.jzsoft.eos.assessment.data.AssessmentGroup;
import com.jzsoft.eos.assessment.data.AssessmentScore;
import com.jzsoft.eos.assessment.data.AssessmentTask;
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
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentGroupImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentGroupImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentGroupImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentGroupImpl#getScores <em>Scores</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentGroupImpl#getAssessmentTask <em>AssessmentTask</em>}</li>
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
	public final static int INDEX_EMAIL = 2;
	public final static int INDEX_DESCRIPTION = 3;
	public final static int INDEX_PARENT = 4;
	public final static int INDEX_CHILDREN = 5;
	public final static int INDEX_SCORES = 6;
	public final static int INDEX_ASSESSMENTTASK = 7;
	public final static int SDO_PROPERTY_COUNT = 8;

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
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(java.lang.String)
	 */
	public String getEmail() {
		return DataUtil.toString(super.getByIndex(INDEX_EMAIL, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 */
	public void setEmail(String email) {
		super.setByIndex(INDEX_EMAIL, email);
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(java.lang.String)
	 */
	public String getDescription() {
		return DataUtil.toString(super.getByIndex(INDEX_DESCRIPTION, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 */
	public void setDescription(String description) {
		super.setByIndex(INDEX_DESCRIPTION, description);
	}

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(com.jzsoft.eos.assessment.data.AssessmentGroup)
	 */
	public AssessmentGroup getParent() {
		return (AssessmentGroup) DataUtil.toDataObject(super.getByIndex(INDEX_PARENT, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 */
	public void setParent(AssessmentGroup parent) {
		super.setByIndex(INDEX_PARENT, parent);
	}

	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' attribute.
	 * @see #setChildren(com.jzsoft.eos.assessment.data.AssessmentGroup)
	 */
	public List<AssessmentGroup> getChildren() {
		return (List<AssessmentGroup>) getList(INDEX_CHILDREN, true);
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getChildren <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children</em>' attribute.
	 * @see #getChildren()
	 */
	public void setChildren(List<AssessmentGroup> children) {
		super.setByIndex(INDEX_CHILDREN, children);
	}

	/**
	 * Returns the value of the '<em><b>Scores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scores</em>' attribute.
	 * @see #setScores(com.jzsoft.eos.assessment.data.AssessmentScore)
	 */
	public List<AssessmentScore> getScores() {
		return (List<AssessmentScore>) getList(INDEX_SCORES, true);
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getScores <em>Scores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scores</em>' attribute.
	 * @see #getScores()
	 */
	public void setScores(List<AssessmentScore> scores) {
		super.setByIndex(INDEX_SCORES, scores);
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
	 * @see #setAssessmentTask(com.jzsoft.eos.assessment.data.AssessmentTask)
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