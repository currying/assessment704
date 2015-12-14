/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.jzsoft.eos.assessment.data;

import com.eos.data.sdo.IObjectFactory;

import commonj.sdo.DataObject;
import commonj.sdo.Type;
import commonj.sdo.helper.DataFactory;
import commonj.sdo.helper.TypeHelper;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentScore#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentScore#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentScore#getScore <em>Score</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentScore#getIsComputed <em>IsComputed</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentScore#getGroup <em>Group</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentScore#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface AssessmentScore extends DataObject {

	public final static String QNAME = "com.jzsoft.eos.assessment.data.AssessmentScore";

	public final static Type TYPE = TypeHelper.INSTANCE.getType("com.jzsoft.eos.assessment.data", "AssessmentScore");

	public final static IObjectFactory<AssessmentScore> FACTORY = new IObjectFactory<AssessmentScore>() {
		public AssessmentScore create() {
			return (AssessmentScore) DataFactory.INSTANCE.create(TYPE);
		}
	};

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
	public long getId();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentScore#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 */
	public void setId(long id);

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
	public float getWeight();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentScore#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 */
	public void setWeight(float weight);

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
	public float getScore();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentScore#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 */
	public void setScore(float score);

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
	public boolean getIsComputed();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentScore#getIsComputed <em>IsComputed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IsComputed</em>' attribute.
	 * @see #getIsComputed()
	 */
	public void setIsComputed(boolean isComputed);

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
	public AssessmentGroup getGroup();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentScore#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 */
	public void setGroup(AssessmentGroup group);

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
	public AssessmentItem getItem();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentScore#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #getItem()
	 */
	public void setItem(AssessmentItem item);


}