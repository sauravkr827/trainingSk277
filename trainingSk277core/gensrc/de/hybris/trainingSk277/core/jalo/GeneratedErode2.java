/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 24, 2021, 1:14:58 PM                    ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Erode2}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedErode2 extends GenericItem
{
	/** Qualifier of the <code>Erode2.salem</code> attribute **/
	public static final String SALEM = "salem";
	/** Qualifier of the <code>Erode2.chennai</code> attribute **/
	public static final String CHENNAI = "chennai";
	/** Qualifier of the <code>Erode2.tirupur</code> attribute **/
	public static final String TIRUPUR = "tirupur";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALEM, AttributeMode.INITIAL);
		tmp.put(CHENNAI, AttributeMode.INITIAL);
		tmp.put(TIRUPUR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Erode2.chennai</code> attribute.
	 * @return the chennai
	 */
	public String getChennai(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHENNAI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Erode2.chennai</code> attribute.
	 * @return the chennai
	 */
	public String getChennai()
	{
		return getChennai( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Erode2.chennai</code> attribute. 
	 * @param value the chennai
	 */
	public void setChennai(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHENNAI,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Erode2.chennai</code> attribute. 
	 * @param value the chennai
	 */
	public void setChennai(final String value)
	{
		setChennai( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Erode2.salem</code> attribute.
	 * @return the salem
	 */
	 String getSalem(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALEM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Erode2.salem</code> attribute.
	 * @return the salem
	 */
	 String getSalem()
	{
		return getSalem( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Erode2.salem</code> attribute. 
	 * @param value the salem
	 */
	 void setSalem(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALEM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Erode2.salem</code> attribute. 
	 * @param value the salem
	 */
	 void setSalem(final String value)
	{
		setSalem( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Erode2.tirupur</code> attribute.
	 * @return the tirupur
	 */
	public String getTirupur(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIRUPUR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Erode2.tirupur</code> attribute.
	 * @return the tirupur
	 */
	public String getTirupur()
	{
		return getTirupur( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Erode2.tirupur</code> attribute. 
	 * @param value the tirupur
	 */
	public void setTirupur(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIRUPUR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Erode2.tirupur</code> attribute. 
	 * @param value the tirupur
	 */
	public void setTirupur(final String value)
	{
		setTirupur( getSession().getSessionContext(), value );
	}
	
}
