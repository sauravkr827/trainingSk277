/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 12, 2021, 6:10:53 PM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingSk277.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.trainingSk277.core.constants.TrainingSk277CoreConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Computer}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedComputer extends GenericItem
{
	/** Qualifier of the <code>Computer.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Computer.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Computer.Model</code> attribute **/
	public static final String MODEL = "Model";
	/** Qualifier of the <code>Computer.bill</code> attribute **/
	public static final String BILL = "bill";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(MODEL, AttributeMode.INITIAL);
		tmp.put(BILL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.bill</code> attribute.
	 * @return the bill
	 */
	public Map<String,String> getAllBill(final SessionContext ctx)
	{
		Map<String,String> map = (Map<String,String>)getProperty( ctx, BILL);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.bill</code> attribute.
	 * @return the bill
	 */
	public Map<String,String> getAllBill()
	{
		return getAllBill( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.bill</code> attribute. 
	 * @param value the bill
	 */
	public void setAllBill(final SessionContext ctx, final Map<String,String> value)
	{
		setProperty(ctx, BILL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.bill</code> attribute. 
	 * @param value the bill
	 */
	public void setAllBill(final Map<String,String> value)
	{
		setAllBill( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.id</code> attribute.
	 * @return the id
	 */
	public Integer getId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.id</code> attribute.
	 * @return the id
	 */
	public Integer getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.id</code> attribute. 
	 * @return the id
	 */
	public int getIdAsPrimitive()
	{
		return getIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final Integer value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final int value)
	{
		setId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final int value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.Model</code> attribute.
	 * @return the Model
	 */
	public Collection<String> getModel(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, MODEL);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.Model</code> attribute.
	 * @return the Model
	 */
	public Collection<String> getModel()
	{
		return getModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.Model</code> attribute. 
	 * @param value the Model
	 */
	public void setModel(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, MODEL,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.Model</code> attribute. 
	 * @param value the Model
	 */
	public void setModel(final Collection<String> value)
	{
		setModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Computer.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Computer.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
