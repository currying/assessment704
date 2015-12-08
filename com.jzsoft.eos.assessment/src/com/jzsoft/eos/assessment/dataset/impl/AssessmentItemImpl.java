/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.jzsoft.eos.assessment.dataset.impl;

import com.jzsoft.eos.assessment.dataset.AssessmentItem;
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
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentItemImpl#getWeighting <em>Weighting</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentItemImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentItemImpl#getAssessmentScores <em>AssessmentScores</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentItemImpl#getAssessmentTask <em>AssessmentTask</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentItemImpl#getAssessmentItem <em>AssessmentItem</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentItemImpl#getAssessmentItems <em>AssessmentItems</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements AssessmentItem;
 */

public class AssessmentItemImpl extends ExtendedDataObjectImpl implements AssessmentItem {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_ID = 0;
	public final static int INDEX_NAME = 1;
	public final static int INDEX_WEIGHTING = 2;
	public final static int INDEX_SUMMARY = 3;
	public final static int INDEX_ASSESSMENTSCORES = 4;
	public final static int INDEX_ASSESSMENTTASK = 5;
	public final static int INDEX_ASSESSMENTITEM = 6;
	public final static int INDEX_ASSESSMENTITEMS = 7;
	public final static int SDO_PROPERTY_COUNT = 8;

	public final static int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentItemImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentItemImpl(Type type) {
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
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(java.lang.String)
	 */
	public String getSummary() {
		return DataUtil.toString(super.getByIndex(INDEX_SUMMARY, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 */
	public void setSummary(String summary) {
		super.setByIndex(INDEX_SUMMARY, summary);
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

	/**
	 * Returns the value of the '<em><b>AssessmentItems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentItems</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentItems</em>' attribute.
	 * @see #setAssessmentItems(com.jzsoft.eos.assessment.dataset.AssessmentItem)
	 */
	public List<AssessmentItem> getAssessmentItems() {
		return (List<AssessmentItem>) getList(INDEX_ASSESSMENTITEMS, true);
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAssessmentItems <em>AssessmentItems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentItems</em>' attribute.
	 * @see #getAssessmentItems()
	 */
	public void setAssessmentItems(List<AssessmentItem> assessmentItems) {
		super.setByIndex(INDEX_ASSESSMENTITEMS, assessmentItems);
	}


}