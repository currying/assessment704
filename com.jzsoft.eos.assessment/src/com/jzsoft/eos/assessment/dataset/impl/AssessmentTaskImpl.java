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
import com.jzsoft.eos.assessment.dataset.AssessmentObject;
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
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentTaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentTaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentTaskImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentTaskImpl#getAssessmentObject <em>AssessmentObject</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentTaskImpl#getAssessmentGroups <em>AssessmentGroups</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.impl.AssessmentTaskImpl#getAssessmentItems <em>AssessmentItems</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements AssessmentTask;
 */

public class AssessmentTaskImpl extends ExtendedDataObjectImpl implements AssessmentTask {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_ID = 0;
	public final static int INDEX_NAME = 1;
	public final static int INDEX_NUMBER = 2;
	public final static int INDEX_ASSESSMENTOBJECT = 3;
	public final static int INDEX_ASSESSMENTGROUPS = 4;
	public final static int INDEX_ASSESSMENTITEMS = 5;
	public final static int SDO_PROPERTY_COUNT = 6;

	public final static int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentTaskImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentTaskImpl(Type type) {
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
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(java.lang.String)
	 */
	public String getNumber() {
		return DataUtil.toString(super.getByIndex(INDEX_NUMBER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 */
	public void setNumber(String number) {
		super.setByIndex(INDEX_NUMBER, number);
	}

	/**
	 * Returns the value of the '<em><b>AssessmentObject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentObject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentObject</em>' attribute.
	 * @see #setAssessmentObject(com.jzsoft.eos.assessment.dataset.AssessmentObject)
	 */
	public AssessmentObject getAssessmentObject() {
		return (AssessmentObject) DataUtil.toDataObject(super.getByIndex(INDEX_ASSESSMENTOBJECT, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getAssessmentObject <em>AssessmentObject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentObject</em>' attribute.
	 * @see #getAssessmentObject()
	 */
	public void setAssessmentObject(AssessmentObject assessmentObject) {
		super.setByIndex(INDEX_ASSESSMENTOBJECT, assessmentObject);
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