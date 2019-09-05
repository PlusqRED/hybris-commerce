<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${not empty productsWithQuestions}" >
   <c:forEach var="product" items="${productsWithQuestions}">
       <h2>${product.name}</h2>
       <c:if test="${not empty product.questions}">
           <c:forEach var="question" items="${product.questions}">
               <p>
                   <b>Question: </b><span>${question.question}</span>
               </p>
               <p>
                   <b>Answer: </b><span>${question.answer}</span>
               </p>
           </c:forEach>
       </c:if>
   </c:forEach>
</c:if>
