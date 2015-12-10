/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.jzsoft.eos.assessment.data.impl;

import com.jzsoft.eos.assessment.data.AssessmentGroup;
import com.jzsoft.eos.assessment.data.AssessmentItem;
import com.jzsoft.eos.assessment.data.AssessmentScore;
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
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentScoreImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentScoreImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentScoreImpl#getScore <em>Score</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentScoreImpl#getIsComputed <em>IsComputed</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentScoreImpl#getItem <em>Item</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.impl.AssessmentScoreImpl#getGroup <em>Group</em>}</li>
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
	public final static int INDEX_WEIGHT = 1;
	public final static int INDEX_SCORE = 2;
	public final static int INDEX_ISCOMPUTED = 3;
	public final static int INDEX_ITEM = 4;
	public final static int INDEX_GROUP = 5;
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
	 * Returns the value of the '<em><b>IsComputed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IsComputed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IsComputed</em>' attribute.
	 * @see #setIsComputed(boolean)
	 */
	public boolean getIsComputed() {
		return DataUtil.toBoolean(super.getByIndex(INDEX_ISCOMPUTED, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getIsComputed <em>IsComputed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IsComputed</em>' attribute.
	 * @see #getIsComputed()
	 */
	public void setIsComputed(boolean isComputed) {
		super.setByIndex(INDEX_ISCOMPUTED, isComputed);
	}

	/**
	 * Returns the value of the '<em><b>Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' attribute.
	 * @see #setItem(com.jzsoft.eos.assessment.data.AssessmentItem)
	 */
	public AssessmentItem getItem() {
		return (AssessmentItem) DataUtil.toDataObject(super.getByIndex(INDEX_ITEM, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #getItem()
	 */
	public void setItem(AssessmentItem item) {
		super.setByIndex(INDEX_ITEM, item);
	}

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(com.jzsoft.eos.assessment.data.AssessmentGroup)
	 */
	public AssessmentGroup getGroup() {
		return (AssessmentGroup) DataUtil.toDataObject(super.getByIndex(INDEX_GROUP, true));
	}

	/**
	 * Sets the value of the '{@link com.primeton.eos.Test#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 */
	public void setGroup(AssessmentGroup group) {
		super.setByIndex(INDEX_GROUP, group);
	}


}