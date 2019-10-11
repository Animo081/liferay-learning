<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="newsmvc.caption"/></b>
	Raborayet
</p>


<c:otherwise>
	<aui:input name="birthdayMonth" type="hidden" value="<%= Calendar.JANUARY %>" />
	<aui:input name="birthdayDay" type="hidden" value="1" />
	<aui:input name="birthdayYear" type="hidden" value="1970" />
</c:otherwise>