/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.jzsoft.eos.assessment.data.impl;

import com.jzsoft.eos.assessment.data.AssessmentItem;
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
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getInnerNumber <em>InnerNumber</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getScores <em>Scores</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentItemImpl#getTask <em>Task</em>}</li>
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
	public final static int INDEX_NUMBER = 1;
	public final static int INDEX_INNERNUMBER = 2;
	public final static int INDEX_NAME = 3;
	public final static int INDEX_WEIGHT = 4;
	public final static int INDEX_SUMMARY = 5;
	public final static int INDEX_DESCRIPTION = 6;
	public final static int INDEX_LEVEL = 7;
	public final static int INDEX_PARENTS = 8;
	public final static int INDEX_PARENT = 9;
	public final static int INDEX_SCORES = 10;
	public final static int INDEX_TASK = 11;
	public final static int SDO_PROPERTY_COUNT = 12;

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
	 * @see #setId(long)
	 */
	public long getId() {
		return DataUtil.toLong(super.getByIndex(INDEX_ID, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 */
	public void setId(long id) {
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
	 * Returns the value of the '<em><b>InnerNumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>InnerNumber</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>InnerNumber</em>' attribute.
	 * @see #setInnerNumber(java.lang.String)
	 */
	public String getInnerNumber() {
		return DataUtil.toString(super.getByIndex(INDEX_INNERNUMBER, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getInnerNumber <em>InnerNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>InnerNumber</em>' attribute.
	 * @see #getInnerNumber()
	 */
	public void setInnerNumber(String innerNumber) {
		super.setByIndex(INDEX_INNERNUMBER, innerNumber);
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
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(float)
	 */
	public float getWeight() {
		return DataUtil.toFloat(super.getByIndex(INDEX_WEIGHT, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 */
	public void setWeight(float weight) {
		super.setByIndex(INDEX_WEIGHT, weight);
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
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 */
	public int getLevel() {
		return DataUtil.toInt(super.getByIndex(INDEX_LEVEL, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 */
	public void setLevel(int level) {
		super.setByIndex(INDEX_LEVEL, level);
	}

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' attribute.
	 * @see #setParents(com.jzsoft.eos.assessment.data.AssessmentItem)
	 */
	public List<AssessmentItem> getParents() {
		return (List<AssessmentItem>) getList(INDEX_PARENTS, true);
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getParents <em>Parents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parents</em>' attribute.
	 * @see #getParents()
	 */
	public void setParents(List<AssessmentItem> parents) {
		super.setByIndex(INDEX_PARENTS, parents);
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
	 * @see #setParent(com.jzsoft.eos.assessment.data.AssessmentItem)
	 */
	public AssessmentItem getParent() {
		return (AssessmentItem) DataUtil.toDataObject(super.getByIndex(INDEX_PARENT, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 */
	public void setParent(AssessmentItem parent) {
		super.setByIndex(INDEX_PARENT, parent);
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
	 * Returns the value of the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see #setTask(com.jzsoft.eos.assessment.data.AssessmentTask)
	 */
	public AssessmentTask getTask() {
		return (AssessmentTask) DataUtil.toDataObject(super.getByIndex(INDEX_TASK, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 */
	public void setTask(AssessmentTask task) {
		super.setByIndex(INDEX_TASK, task);
	}


}