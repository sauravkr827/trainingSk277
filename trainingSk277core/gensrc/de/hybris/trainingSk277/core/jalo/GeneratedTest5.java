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
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingSk277.core.constants.TrainingSk277CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Test5}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTest5 extends GenericItem
{
	/** Qualifier of the <code>Test5.id1</code> attribute **/
	public static final String ID1 = "id1";
	/** Qualifier of the <code>Test5.name1</code> attribute **/
	public static final String NAME1 = "name1";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID1, AttributeMode.INITIAL);
		tmp.put(NAME1, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Test5.id1</code> attribute.
	 * @return the id1
	 */
	public Integer getId1(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Test5.id1</code> attribute.
	 * @return the id1
	 */
	public Integer getId1()
	{
		return getId1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Test5.id1</code> attribute. 
	 * @return the id1
	 */
	public int getId1AsPrimitive(final SessionContext ctx)
	{
		Integer value = getId1( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Test5.id1</code> attribute. 
	 * @return the id1
	 */
	public int getId1AsPrimitive()
	{
		return getId1AsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Test5.id1</code> attribute. 
	 * @param value the id1
	 */
	public void setId1(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Test5.id1</code> attribute. 
	 * @param value the id1
	 */
	public void setId1(final Integer value)
	{
		setId1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Test5.id1</code> attribute. 
	 * @param value the id1
	 */
	public void setId1(final SessionContext ctx, final int value)
	{
		setId1( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Test5.id1</code> attribute. 
	 * @param value the id1
	 */
	public void setId1(final int value)
	{
		setId1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Test5.name1</code> attribute.
	 * @return the name1
	 */
	public String getName1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Test5.name1</code> attribute.
	 * @return the name1
	 */
	public String getName1()
	{
		return getName1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Test5.name1</code> attribute. 
	 * @param value the name1
	 */
	public void setName1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Test5.name1</code> attribute. 
	 * @param value the name1
	 */
	public void setName1(final String value)
	{
		setName1( getSession().getSessionContext(), value );
	}
	
}
