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
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getId <em>Id</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getName <em>Name</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getWeighting <em>Weighting</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getSummary <em>Summary</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getAssessmentScores <em>AssessmentScores</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getAssessmentTask <em>AssessmentTask</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getAssessmentItem <em>AssessmentItem</em>}</li>
 *   <li>{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getAssessmentItems <em>AssessmentItems</em>}</li>
 * </ul>
 * </p>
 *
 * @extends DataObject;
 */
public interface AssessmentItem extends DataObject {

	public final static String QNAME = "com.jzsoft.eos.assessment.dataset.AssessmentItem";

	public final static Type TYPE = TypeHelper.INSTANCE.getType("com.jzsoft.eos.assessment.dataset", "AssessmentItem");

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
	 * @see #setId(java.lang.String)
	 */
	public String getId();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getId <em>Id</em>}' attribute.
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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getName <em>Name</em>}' attribute.
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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getWeighting <em>Weighting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weighting</em>' attribute.
	 * @see #getWeighting()
	 */
	public void setWeighting(float weighting);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 */
	public void setSummary(String summary);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getAssessmentScores <em>AssessmentScores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentScores</em>' attribute.
	 * @see #getAssessmentScores()
	 */
	public void setAssessmentScores(List<AssessmentScore> assessmentScores);

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
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getAssessmentTask <em>AssessmentTask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentTask</em>' attribute.
	 * @see #getAssessmentTask()
	 */
	public void setAssessmentTask(AssessmentTask assessmentTask);

	/**
	 * Returns the value of the '<em><b>AssessmentItem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AssessmentItem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AssessmentItem</em>' attribute.
	 * @see #setAssessmentItem(com.jzsoft.eos.assessment.dataset.AssessmentItem)
	 */
	public AssessmentItem getAssessmentItem();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getAssessmentItem <em>AssessmentItem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentItem</em>' attribute.
	 * @see #getAssessmentItem()
	 */
	public void setAssessmentItem(AssessmentItem assessmentItem);

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
	public List<AssessmentItem> getAssessmentItems();

	/**
	 * Sets the value of the '{@link com.jzsoft.eos.assessment.dataset.AssessmentItem#getAssessmentItems <em>AssessmentItems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AssessmentItems</em>' attribute.
	 * @see #getAssessmentItems()
	 */
	public void setAssessmentItems(List<AssessmentItem> assessmentItems);


}