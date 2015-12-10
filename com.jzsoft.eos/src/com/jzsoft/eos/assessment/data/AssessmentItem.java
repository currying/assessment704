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
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getNumber <em>Number</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getInnerNumber <em>InnerNumber</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getWeight <em>Weight</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getSummary <em>Summary</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getDescription <em>Description</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getTask <em>Task</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getParent <em>Parent</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getChildren <em>Children</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.data.AssessmentItem#getScores <em>Scores</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface AssessmentItem extends DataObject {

	public final static String QNAME = "com.jzsoft.eos.assessment.data.AssessmentItem";

	public final static Type TYPE = TypeHelper.INSTANCE.getType("com.jzsoft.eos.assessment.data", "AssessmentItem");

	public final static IObjectFactory<AssessmentItem> FACTORY = new IObjectFactory<AssessmentItem>() {
		public AssessmentItem create() {
			return (AssessmentItem) DataFactory.INSTANCE.create(TYPE);
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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 */
	public void setId(long id);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 */
	public void setNumber(String number);

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
	public String getInnerNumber();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getInnerNumber <em>InnerNumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>InnerNumber</em>' attribute.
	 * @see #getInnerNumber()
	 */
	public void setInnerNumber(String innerNumber);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 */
	public void setName(String name);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 */
	public void setWeight(float weight);

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
	public String getSummary();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 */
	public void setSummary(String summary);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 */
	public void setDescription(String description);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getTask <em>Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 */
	public void setTask(AssessmentTask task);

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
	public AssessmentItem getParent();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 */
	public void setParent(AssessmentItem parent);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' attribute.
	 * @see #setChildren(com.jzsoft.eos.assessment.data.AssessmentItem)
	 */
	public List<AssessmentItem> getChildren();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getChildren <em>Children</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children</em>' attribute.
	 * @see #getChildren()
	 */
	public void setChildren(List<AssessmentItem> children);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.data.AssessmentItem#getScores <em>Scores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scores</em>' attribute.
	 * @see #getScores()
	 */
	public void setScores(List<AssessmentScore> scores);


}