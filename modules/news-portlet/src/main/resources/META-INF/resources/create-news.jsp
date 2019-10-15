<%@ page import="news.portlet.NewsMVCPortletKeys" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<%@ include file="/init.jsp" %>

<%
    PortletURL backURL = renderResponse.createRenderURL();
    backURL.setParameter("mvcPath", "/view.jsp");

    PortletURL currentURL = renderResponse.createRenderURL();
    currentURL.setParameter("mvcPath", "/create-news.jsp");
%>

<portlet:actionURL name="<%=NewsMVCPortletKeys.ACTION_EDIT_EVENT%>" var="editEventUrl">
    <portlet:param name="backURL" value="<%= currentURL.toString() %>"/>
</portlet:actionURL>


<aui:form action="<%= editEventUrl %>" method="post">
    <aui:input name="title" type="text" />
    <aui:input name="description" type="text" />
    <aui:input name="content" type="textarea" />

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" href="<%=iteratorURL.toString()%>"></aui:button>
    </aui:button-row>
</aui:form>

