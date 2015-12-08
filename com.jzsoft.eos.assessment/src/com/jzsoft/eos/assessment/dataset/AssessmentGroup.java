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
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getWeighting <em>Weighting</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getAssessmentScores <em>AssessmentScores</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getAssessmentGroup <em>AssessmentGroup</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getAssessmentGroups <em>AssessmentGroups</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getAssessmentTask <em>AssessmentTask</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface AssessmentGroup extends DataObject {

	public final static String QNAME = "com.jzsoft.eos.assessment.dataset.AssessmentGroup";

	public final static Type TYPE = TypeHelper.INSTANCE.getType("com.jzsoft.eos.assessment.dataset", "AssessmentGroup");

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
	 * @see #setId(java.lang.String)
	 */
	public String getId();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 */
	public void setId(String id);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 */
	public void setName(String name);

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
	public float getWeighting();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getWeighting <em>Weighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighting</em>' attribute.
	 * @see #getWeighting()
	 */
	public void setWeighting(float weighting);

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
	public List<AssessmentScore> getAssessmentScores();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getAssessmentScores <em>AssessmentScores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentScores</em>' attribute.
	 * @see #getAssessmentScores()
	 */
	public void setAssessmentScores(List<AssessmentScore> assessmentScores);

	/**
	 * Returns the value of the '<em><b>AssessmentGroup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentGroup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentGroup</em>' attribute.
	 * @see #setAssessmentGroup(com.jzsoft.eos.assessment.dataset.AssessmentGroup)
	 */
	public AssessmentGroup getAssessmentGroup();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getAssessmentGroup <em>AssessmentGroup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentGroup</em>' attribute.
	 * @see #getAssessmentGroup()
	 */
	public void setAssessmentGroup(AssessmentGroup assessmentGroup);

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
	public List<AssessmentGroup> getAssessmentGroups();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getAssessmentGroups <em>AssessmentGroups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentGroups</em>' attribute.
	 * @see #getAssessmentGroups()
	 */
	public void setAssessmentGroups(List<AssessmentGroup> assessmentGroups);

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
	public AssessmentTask getAssessmentTask();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentGroup#getAssessmentTask <em>AssessmentTask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentTask</em>' attribute.
	 * @see #getAssessmentTask()
	 */
	public void setAssessmentTask(AssessmentTask assessmentTask);


}