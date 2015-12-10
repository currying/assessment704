/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.jzsoft.eos.assessment.data.impl;

import com.jzsoft.eos.assessment.data.AssessmentObject;
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
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentObjectImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentObjectImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @extends ExtendedDataObjectImpl;
 *
 * @implements AssessmentObject;
 */

public class AssessmentObjectImpl extends ExtendedDataObjectImpl implements AssessmentObject {
	/**
	 * Comment for <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	public final static int INDEX_ID = 0;
	public final static int INDEX_NUMBER = 1;
	public final static int INDEX_NAME = 2;
	public final static int INDEX_DESCRIPTION = 3;
	public final static int INDEX_TASKS = 4;
	public final static int SDO_PROPERTY_COUNT = 5;

	public final static int EXTENDED_PROPERTY_COUNT = -1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentObjectImpl() {
		this(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public AssessmentObjectImpl(Type type) {
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
	 * Returns the value of the '<em><b>Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' attribute.
	 * @see #setTasks(com.jzsoft.eos.assessment.data.AssessmentTask)
	 */
	public List<AssessmentTask> getTasks() {
		return (List<AssessmentTask>) getList(INDEX_TASKS, true);
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getTasks <em>Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tasks</em>' attribute.
	 * @see #getTasks()
	 */
	public void setTasks(List<AssessmentTask> tasks) {
		super.setByIndex(INDEX_TASKS, tasks);
	}


}