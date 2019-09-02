/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 02.09.2019 13:41:21                         ---
 * ----------------------------------------------------------------
 */
package com.org.questions.jalo;

import com.org.questions.constants.QuestionsConstants;
import com.org.questions.jalo.Question;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>QuestionsManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedQuestionsManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n QUESTION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Question> PRODUCT2QUESTIONQUESTIONHANDLER = new OneToManyHandler<Question>(
	QuestionsConstants.TC.QUESTION,
	false,
	"product",
	"productPOS",
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Question createQuestion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( QuestionsConstants.TC.QUESTION );
			return (Question)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Question : "+e.getMessage(), 0 );
		}
	}
	
	public Question createQuestion(final Map attributeValues)
	{
		return createQuestion( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return QuestionsConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.question</code> attribute.
	 * @return the question
	 */
	public Collection<Question> getQuestion(final SessionContext ctx, final Product item)
	{
		return PRODUCT2QUESTIONQUESTIONHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.question</code> attribute.
	 * @return the question
	 */
	public Collection<Question> getQuestion(final Product item)
	{
		return getQuestion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.question</code> attribute. 
	 * @param value the question
	 */
	public void setQuestion(final SessionContext ctx, final Product item, final Collection<Question> value)
	{
		PRODUCT2QUESTIONQUESTIONHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.question</code> attribute. 
	 * @param value the question
	 */
	public void setQuestion(final Product item, final Collection<Question> value)
	{
		setQuestion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to question. 
	 * @param value the item to add to question
	 */
	public void addToQuestion(final SessionContext ctx, final Product item, final Question value)
	{
		PRODUCT2QUESTIONQUESTIONHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to question. 
	 * @param value the item to add to question
	 */
	public void addToQuestion(final Product item, final Question value)
	{
		addToQuestion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from question. 
	 * @param value the item to remove from question
	 */
	public void removeFromQuestion(final SessionContext ctx, final Product item, final Question value)
	{
		PRODUCT2QUESTIONQUESTIONHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from question. 
	 * @param value the item to remove from question
	 */
	public void removeFromQuestion(final Product item, final Question value)
	{
		removeFromQuestion( getSession().getSessionContext(), item, value );
	}
	
}
