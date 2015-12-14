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
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getEmail <em>Email</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getIsGroup <em>IsGroup</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getAccessCode <em>AccessCode</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getStatus <em>Status</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getParent <em>Parent</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getChildren <em>Children</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getScores <em>Scores</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getTask <em>Task</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface AssessmentGroup extends DataObject {

	public final static String QNAME = "com.jzsoft.eos.assessment.data.AssessmentGroup";

	public final static Type TYPE = TypeHelper.INSTANCE.getType("com.jzsoft.eos.assessment.data", "AssessmentGroup");

	public final static IObjectFactory<AssessmentGroup> FACTORY = new IObjectFactory<AssessmentGroup>() {
		public AssessmentGroup create() {
			return (AssessmentGroup) DataFactory.INSTANCE.create(TYPE);
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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 */
	public void setId(long id);

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
	public String getName();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 */
	public void setName(String name);

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
	public String getEmail();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 */
	public void setEmail(String email);

	/**
	 * Returns the value of the '<em><b>IsGroup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IsGroup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IsGroup</em>' attribute.
	 * @see #setIsGroup(boolean)
	 */
	public boolean getIsGroup();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getIsGroup <em>IsGroup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IsGroup</em>' attribute.
	 * @see #getIsGroup()
	 */
	public void setIsGroup(boolean isGroup);

	/**
	 * Returns the value of the '<em><b>AccessCode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AccessCode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AccessCode</em>' attribute.
	 * @see #setAccessCode(java.lang.String)
	 */
	public String getAccessCode();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getAccessCode <em>AccessCode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AccessCode</em>' attribute.
	 * @see #getAccessCode()
	 */
	public void setAccessCode(String accessCode);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(int)
	 */
	public int getStatus();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 */
	public void setStatus(int status);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 */
	public void setDescription(String description);

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
	public AssessmentGroup getParent();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 */
	public void setParent(AssessmentGroup parent);

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
	public List<AssessmentGroup> getChildren();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getChildren <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children</em>' attribute.
	 * @see #getChildren()
	 */
	public void setChildren(List<AssessmentGroup> children);

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
	public List<AssessmentScore> getScores();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getScores <em>Scores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scores</em>' attribute.
	 * @see #getScores()
	 */
	public void setScores(List<AssessmentScore> scores);

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
	public AssessmentTask getTask();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentGroup#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 */
	public void setTask(AssessmentTask task);


}