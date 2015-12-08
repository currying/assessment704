/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.jzsoft.eos.assessment.dataset.impl;

import com.jzsoft.eos.assessment.dataset.AssessmentGroup;
import com.jzsoft.eos.assessment.dataset.AssessmentItem;
import com.jzsoft.eos.assessment.dataset.AssessmentScore;
import com.primeton.ext.data.sdo.DataUtil;
import com.primeton.ext.data.sdo.ExtendedDataObjectImpl;

import commonj.sdo.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentScoreImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentScoreImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentScoreImpl#getScore <em>Score</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentScoreImpl#getWeighting <em>Weighting</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentScoreImpl#getAssessmentGroup <em>AssessmentGroup</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentScoreImpl#getAssessmentItem <em>AssessmentItem</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements AssessmentScore;
 */

public class AssessmentScoreImpl extends ExtendedDataObjectImpl implements AssessmentScore {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_ID = 0;
	public final static int INDEX_NAME = 1;
	public final static int INDEX_SCORE = 2;
	public final static int INDEX_WEIGHTING = 3;
	public final static int INDEX_ASSESSMENTGROUP = 4;
	public final static int INDEX_ASSESSMENTITEM = 5;
	public final static int SDO_PROPERTY_COUNT = 6;

	public final static int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentScoreImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentScoreImpl(Type type) {
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
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(float)
	 */
	public float getScore() {
		return DataUtil.toFloat(super.getByIndex(INDEX_SCORE, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 */
	public void setScore(float score) {
		super.setByIndex(INDEX_SCORE, score);
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
	 * Returns the value of the '<em><b>AssessmentItem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentItem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentItem</em>' attribute.
	 * @see #setAssessmentItem(com.jzsoft.eos.assessment.dataset.AssessmentItem)
	 */
	public AssessmentItem getAssessmentItem() {
		return (AssessmentItem) DataUtil.toDataObject(super.getByIndex(INDEX_ASSESSMENTITEM, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAssessmentItem <em>AssessmentItem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentItem</em>' attribute.
	 * @see #getAssessmentItem()
	 */
	public void setAssessmentItem(AssessmentItem assessmentItem) {
		super.setByIndex(INDEX_ASSESSMENTITEM, assessmentItem);
	}


}