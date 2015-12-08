/*******************************************************************************
 *
 * Copyright (c) 2001-2006 Primeton Technologies, Ltd.
 * All rights reserved.
 *
 * Created on Apr 11, 2008
 *******************************************************************************/
package com.jzsoft.eos.assessment.dataset;

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
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentObject#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentObject#getNumber <em>Number</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentObject#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentObject#getAssessmentTasks <em>AssessmentTasks</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface AssessmentObject extends DataObject {

	public final static String QNAME = "com.jzsoft.eos.assessment.dataset.AssessmentObject";

	public final static Type TYPE = TypeHelper.INSTANCE.getType("com.jzsoft.eos.assessment.dataset", "AssessmentObject");

	public final static IObjectFactory<AssessmentObject> FACTORY = new IObjectFactory<AssessmentObject>() {
		public AssessmentObject create() {
			return (AssessmentObject) DataFactory.INSTANCE.create(TYPE);
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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentObject#getId <em>Id</em>}' attribute.
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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentObject#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 */
	public void setNumber(String number);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 */
	public void setName(String name);

	/**
	 * Returns the value of the '<em><b>AssessmentTasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentTasks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentTasks</em>' attribute.
	 * @see #setAssessmentTasks(com.jzsoft.eos.assessment.dataset.AssessmentTask)
	 */
	public List<AssessmentTask> getAssessmentTasks();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentObject#getAssessmentTasks <em>AssessmentTasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentTasks</em>' attribute.
	 * @see #getAssessmentTasks()
	 */
	public void setAssessmentTasks(List<AssessmentTask> assessmentTasks);


}