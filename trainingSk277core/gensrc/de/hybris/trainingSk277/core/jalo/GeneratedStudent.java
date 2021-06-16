/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 1, 2021, 5:37:14 PM                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSk277.core.jalo;

import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import de.hybris.trainingSk277.core.constants.TrainingSk277CoreConstants;
import de.hybris.trainingSk277.core.jalo.Teacher;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Student}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedStudent extends GenericItem
{
	/** Qualifier of the <code>Student.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Student.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Student.enteryTime</code> attribute **/
	public static final String ENTERYTIME = "enteryTime";
	/** Qualifier of the <code>Student.newOrOldEntry</code> attribute **/
	public static final String NEWOROLDENTRY = "newOrOldEntry";
	/** Qualifier of the <code>Student.teacher</code> attribute **/
	public static final String TEACHER = "teacher";
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
		tmp.put(ENTERYTIME, AttributeMode.INITIAL);
		tmp.put(NEWOROLDENTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.enteryTime</code> attribute.
	 * @return the enteryTime
	 */
	public Date getEnteryTime(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENTERYTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.enteryTime</code> attribute.
	 * @return the enteryTime
	 */
	public Date getEnteryTime()
	{
		return getEnteryTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.enteryTime</code> attribute. 
	 * @param value the enteryTime
	 */
	public void setEnteryTime(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENTERYTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.enteryTime</code> attribute. 
	 * @param value the enteryTime
	 */
	public void setEnteryTime(final Date value)
	{
		setEnteryTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.id</code> attribute. 
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
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Teacher");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(STUDENTTEACHER_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.newOrOldEntry</code> attribute.
	 * @return the newOrOldEntry
	 */
	public Boolean isNewOrOldEntry(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NEWOROLDENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.newOrOldEntry</code> attribute.
	 * @return the newOrOldEntry
	 */
	public Boolean isNewOrOldEntry()
	{
		return isNewOrOldEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.newOrOldEntry</code> attribute. 
	 * @return the newOrOldEntry
	 */
	public boolean isNewOrOldEntryAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNewOrOldEntry( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.newOrOldEntry</code> attribute. 
	 * @return the newOrOldEntry
	 */
	public boolean isNewOrOldEntryAsPrimitive()
	{
		return isNewOrOldEntryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.newOrOldEntry</code> attribute. 
	 * @param value the newOrOldEntry
	 */
	public void setNewOrOldEntry(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NEWOROLDENTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.newOrOldEntry</code> attribute. 
	 * @param value the newOrOldEntry
	 */
	public void setNewOrOldEntry(final Boolean value)
	{
		setNewOrOldEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.newOrOldEntry</code> attribute. 
	 * @param value the newOrOldEntry
	 */
	public void setNewOrOldEntry(final SessionContext ctx, final boolean value)
	{
		setNewOrOldEntry( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.newOrOldEntry</code> attribute. 
	 * @param value the newOrOldEntry
	 */
	public void setNewOrOldEntry(final boolean value)
	{
		setNewOrOldEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.teacher</code> attribute.
	 * @return the teacher
	 */
	public Collection<Teacher> getTeacher(final SessionContext ctx)
	{
		final List<Teacher> items = getLinkedItems( 
			ctx,
			true,
			TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
			"Teacher",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Student.teacher</code> attribute.
	 * @return the teacher
	 */
	public Collection<Teacher> getTeacher()
	{
		return getTeacher( getSession().getSessionContext() );
	}
	
	public long getTeacherCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
			"Teacher",
			null
		);
	}
	
	public long getTeacherCount()
	{
		return getTeacherCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.teacher</code> attribute. 
	 * @param value the teacher
	 */
	public void setTeacher(final SessionContext ctx, final Collection<Teacher> value)
	{
		new PartOfHandler<Collection<Teacher>>()
		{
			@Override
			protected Collection<Teacher> doGetValue(final SessionContext ctx)
			{
				return getTeacher( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<Teacher> _value)
			{
				final Collection<Teacher> value = _value;
				setLinkedItems( 
					ctx,
					true,
					TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(STUDENTTEACHER_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Student.teacher</code> attribute. 
	 * @param value the teacher
	 */
	public void setTeacher(final Collection<Teacher> value)
	{
		setTeacher( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to teacher. 
	 * @param value the item to add to teacher
	 */
	public void addToTeacher(final SessionContext ctx, final Teacher value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STUDENTTEACHER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to teacher. 
	 * @param value the item to add to teacher
	 */
	public void addToTeacher(final Teacher value)
	{
		addToTeacher( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from teacher. 
	 * @param value the item to remove from teacher
	 */
	public void removeFromTeacher(final SessionContext ctx, final Teacher value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingSk277CoreConstants.Relations.STUDENTTEACHER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STUDENTTEACHER_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,TrainingSk277CoreConstants.Relations.STUDENTTEACHER,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from teacher. 
	 * @param value the item to remove from teacher
	 */
	public void removeFromTeacher(final Teacher value)
	{
		removeFromTeacher( getSession().getSessionContext(), value );
	}
	
}
