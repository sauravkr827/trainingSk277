/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 16, 2021, 4:07:50 PM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSk277.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import de.hybris.trainingSk277.core.constants.TrainingSk277CoreConstants;
import de.hybris.trainingSk277.core.jalo.Student;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Teacher}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTeacher extends GenericItem
{
	/** Qualifier of the <code>Teacher.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Teacher.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Teacher.student</code> attribute **/
	public static final String STUDENT = "student";
	/** Relation ordering override parameter constants for StudentTeacher from ((trainingSk277core))*/
	protected static String STUDENTTEACHER_SRC_ORDERED = "relation.StudentTeacher.source.ordered";
	protected static String STUDENTTEACHER_TGT_ORDERED = "relation.StudentTeacher.target.ordered";
	/** Relation disable markmodifed parameter constants for StudentTeacher from ((trainingSk277core))*/
	protected static String STUDENTTEACHER_MARKMODIFIED = "relation.StudentTeacher.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2105, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Student");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(STUDENTTEACHER_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.student</code> attribute.
	 * @return the student
	 */
	public Collection<Student> getStudent(final SessionContext ctx)
	{
		final List<Student> items = getLinkedItems( 
			ctx,
			false,
			TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
			"Student",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Teacher.student</code> attribute.
	 * @return the student
	 */
	public Collection<Student> getStudent()
	{
		return getStudent( getSession().getSessionContext() );
	}
	
	public long getStudentCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
			"Student",
			null
		);
	}
	
	public long getStudentCount()
	{
		return getStudentCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.student</code> attribute. 
	 * @param value the student
	 */
	public void setStudent(final SessionContext ctx, final Collection<Student> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(STUDENTTEACHER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Teacher.student</code> attribute. 
	 * @param value the student
	 */
	public void setStudent(final Collection<Student> value)
	{
		setStudent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to student. 
	 * @param value the item to add to student
	 */
	public void addToStudent(final SessionContext ctx, final Student value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STUDENTTEACHER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to student. 
	 * @param value the item to add to student
	 */
	public void addToStudent(final Student value)
	{
		addToStudent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from student. 
	 * @param value the item to remove from student
	 */
	public void removeFromStudent(final SessionContext ctx, final Student value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STUDENTTEACHER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from student. 
	 * @param value the item to remove from student
	 */
	public void removeFromStudent(final Student value)
	{
		removeFromStudent( getSession().getSessionContext(), value );
	}
	
}
