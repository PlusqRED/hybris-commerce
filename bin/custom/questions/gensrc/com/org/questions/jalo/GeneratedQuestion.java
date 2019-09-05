/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 05.09.2019 14:21:28                         ---
 * ----------------------------------------------------------------
 */
package com.org.questions.jalo;

import com.org.questions.constants.QuestionsConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Question}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedQuestion extends GenericItem
{
	/** Qualifier of the <code>Question.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Question.question</code> attribute **/
	public static final String QUESTION = "question";
	/** Qualifier of the <code>Question.questionCustomer</code> attribute **/
	public static final String QUESTIONCUSTOMER = "questionCustomer";
	/** Qualifier of the <code>Question.answer</code> attribute **/
	public static final String ANSWER = "answer";
	/** Qualifier of the <code>Question.answerCustomer</code> attribute **/
	public static final String ANSWERCUSTOMER = "answerCustomer";
	/** Qualifier of the <code>Question.productPOS</code> attribute **/
	public static final String PRODUCTPOS = "productPOS";
	/** Qualifier of the <code>Question.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedQuestion> PRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedQuestion>(
	QuestionsConstants.TC.QUESTION,
	false,
	"product",
	"productPOS",
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(QUESTION, AttributeMode.INITIAL);
		tmp.put(QUESTIONCUSTOMER, AttributeMode.INITIAL);
		tmp.put(ANSWER, AttributeMode.INITIAL);
		tmp.put(ANSWERCUSTOMER, AttributeMode.INITIAL);
		tmp.put(PRODUCTPOS, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.answer</code> attribute.
	 * @return the answer - answer
	 */
	public String getAnswer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ANSWER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.answer</code> attribute.
	 * @return the answer - answer
	 */
	public String getAnswer()
	{
		return getAnswer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.answer</code> attribute. 
	 * @param value the answer - answer
	 */
	public void setAnswer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ANSWER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.answer</code> attribute. 
	 * @param value the answer - answer
	 */
	public void setAnswer(final String value)
	{
		setAnswer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.answerCustomer</code> attribute.
	 * @return the answerCustomer - customer's answer
	 */
	public Customer getAnswerCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, ANSWERCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.answerCustomer</code> attribute.
	 * @return the answerCustomer - customer's answer
	 */
	public Customer getAnswerCustomer()
	{
		return getAnswerCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.answerCustomer</code> attribute. 
	 * @param value the answerCustomer - customer's answer
	 */
	public void setAnswerCustomer(final SessionContext ctx, final Customer value)
	{
		setProperty(ctx, ANSWERCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.answerCustomer</code> attribute. 
	 * @param value the answerCustomer - customer's answer
	 */
	public void setAnswerCustomer(final Customer value)
	{
		setAnswerCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.code</code> attribute.
	 * @return the code - code of question
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.code</code> attribute.
	 * @return the code - code of question
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.code</code> attribute. 
	 * @param value the code - code of question
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.code</code> attribute. 
	 * @param value the code - code of question
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.productPOS</code> attribute.
	 * @return the productPOS
	 */
	 Integer getProductPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PRODUCTPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.productPOS</code> attribute.
	 * @return the productPOS
	 */
	 Integer getProductPOS()
	{
		return getProductPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.productPOS</code> attribute. 
	 * @return the productPOS
	 */
	 int getProductPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getProductPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.productPOS</code> attribute. 
	 * @return the productPOS
	 */
	 int getProductPOSAsPrimitive()
	{
		return getProductPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.productPOS</code> attribute. 
	 * @param value the productPOS
	 */
	 void setProductPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PRODUCTPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.productPOS</code> attribute. 
	 * @param value the productPOS
	 */
	 void setProductPOS(final Integer value)
	{
		setProductPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.productPOS</code> attribute. 
	 * @param value the productPOS
	 */
	 void setProductPOS(final SessionContext ctx, final int value)
	{
		setProductPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.productPOS</code> attribute. 
	 * @param value the productPOS
	 */
	 void setProductPOS(final int value)
	{
		setProductPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.question</code> attribute.
	 * @return the question - question content
	 */
	public String getQuestion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QUESTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.question</code> attribute.
	 * @return the question - question content
	 */
	public String getQuestion()
	{
		return getQuestion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.question</code> attribute. 
	 * @param value the question - question content
	 */
	public void setQuestion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QUESTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.question</code> attribute. 
	 * @param value the question - question content
	 */
	public void setQuestion(final String value)
	{
		setQuestion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.questionCustomer</code> attribute.
	 * @return the questionCustomer - customer's question
	 */
	public Customer getQuestionCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, QUESTIONCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Question.questionCustomer</code> attribute.
	 * @return the questionCustomer - customer's question
	 */
	public Customer getQuestionCustomer()
	{
		return getQuestionCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.questionCustomer</code> attribute. 
	 * @param value the questionCustomer - customer's question
	 */
	public void setQuestionCustomer(final SessionContext ctx, final Customer value)
	{
		setProperty(ctx, QUESTIONCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Question.questionCustomer</code> attribute. 
	 * @param value the questionCustomer - customer's question
	 */
	public void setQuestionCustomer(final Customer value)
	{
		setQuestionCustomer( getSession().getSessionContext(), value );
	}
	
}
