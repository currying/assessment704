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

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentTask#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentTask#getNumber <em>Number</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentTask#getTitle <em>Title</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentTask#getScore <em>Score</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentTask#getStatus <em>Status</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentTask#getDescription <em>Description</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentTask#getAssessmentObject <em>AssessmentObject</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentTask#getAssessmentGroups <em>AssessmentGroups</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentTask#getAssessmentItems <em>AssessmentItems</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface AssessmentTask extends DataObject {

	public final static String QNAME = "com.jzsoft.eos.assessment.data.AssessmentTask";

	public final static Type TYPE = TypeHelper.INSTANCE.getType("com.jzsoft.eos.assessment.data", "AssessmentTask");

	public final static IObjectFactory<AssessmentTask> FACTORY = new IObjectFactory<AssessmentTask>() {
		public AssessmentTask create() {
			return (AssessmentTask) DataFactory.INSTANCE.create(TYPE);
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
	 * @see #setId(java.lang.String)
	 */
	public String getId();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentTask#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 */
	public void setId(String id);

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
	public String getNumber();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentTask#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 */
	public void setNumber(String number);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(java.lang.String)
	 */
	public String getTitle();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentTask#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 */
	public void setTitle(String title);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentTask#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 */
	public void setScore(float score);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(long)
	 */
	public long getStatus();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentTask#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 */
	public void setStatus(long status);

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
	public String getDescription();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentTask#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 */
	public void setDescription(String description);

	/**
	 * Returns the value of the '<em><b>AssessmentObject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentObject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentObject</em>' attribute.
	 * @see #setAssessmentObject(com.jzsoft.eos.assessment.data.AssessmentObject)
	 */
	public AssessmentObject getAssessmentObject();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentTask#getAssessmentObject <em>AssessmentObject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentObject</em>' attribute.
	 * @see #getAssessmentObject()
	 */
	public void setAssessmentObject(AssessmentObject assessmentObject);

	/**
	 * Returns the value of the '<em><b>AssessmentGroups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentGroups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentGroups</em>' attribute.
	 * @see #setAssessmentGroups(com.jzsoft.eos.assessment.data.AssessmentGroup)
	 */
	public List<AssessmentGroup> getAssessmentGroups();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentTask#getAssessmentGroups <em>AssessmentGroups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentGroups</em>' attribute.
	 * @see #getAssessmentGroups()
	 */
	public void setAssessmentGroups(List<AssessmentGroup> assessmentGroups);

	/**
	 * Returns the value of the '<em><b>AssessmentItems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentItems</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentItems</em>' attribute.
	 * @see #setAssessmentItems(com.jzsoft.eos.assessment.data.AssessmentItem)
	 */
	public List<AssessmentItem> getAssessmentItems();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentTask#getAssessmentItems <em>AssessmentItems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentItems</em>' attribute.
	 * @see #getAssessmentItems()
	 */
	public void setAssessmentItems(List<AssessmentItem> assessmentItems);


}