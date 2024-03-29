/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 23.09.2019 13:45:44                         ---
 * ----------------------------------------------------------------
 */
package com.org.questions.jalo;

import com.org.questions.constants.QuestionsConstants;
import com.org.questions.jalo.Question;
import com.org.questions.jalo.QuestionsCMSComponent;
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
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.OneToManyHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>QuestionsManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedQuestionsManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n QUESTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Question> PRODUCT2QUESTIONQUESTIONSHANDLER = new OneToManyHandler<Question>(
	QuestionsConstants.TC.QUESTION,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.LIST
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
	
	public QuestionsCMSComponent createQuestionsCMSComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( QuestionsConstants.TC.QUESTIONSCMSCOMPONENT );
			return (QuestionsCMSComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating QuestionsCMSComponent : "+e.getMessage(), 0 );
		}
	}
	
	public QuestionsCMSComponent createQuestionsCMSComponent(final Map attributeValues)
	{
		return createQuestionsCMSComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return QuestionsConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.questions</code> attribute.
	 * @return the questions
	 */
	public List<Question> getQuestions(final SessionContext ctx, final Product item)
	{
		return (List<Question>)PRODUCT2QUESTIONQUESTIONSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.questions</code> attribute.
	 * @return the questions
	 */
	public List<Question> getQuestions(final Product item)
	{
		return getQuestions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.questions</code> attribute. 
	 * @param value the questions
	 */
	public void setQuestions(final SessionContext ctx, final Product item, final List<Question> value)
	{
		PRODUCT2QUESTIONQUESTIONSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.questions</code> attribute. 
	 * @param value the questions
	 */
	public void setQuestions(final Product item, final List<Question> value)
	{
		setQuestions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to questions. 
	 * @param value the item to add to questions
	 */
	public void addToQuestions(final SessionContext ctx, final Product item, final Question value)
	{
		PRODUCT2QUESTIONQUESTIONSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to questions. 
	 * @param value the item to add to questions
	 */
	public void addToQuestions(final Product item, final Question value)
	{
		addToQuestions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from questions. 
	 * @param value the item to remove from questions
	 */
	public void removeFromQuestions(final SessionContext ctx, final Product item, final Question value)
	{
		PRODUCT2QUESTIONQUESTIONSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from questions. 
	 * @param value the item to remove from questions
	 */
	public void removeFromQuestions(final Product item, final Question value)
	{
		removeFromQuestions( getSession().getSessionContext(), item, value );
	}
	
}
