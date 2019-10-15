<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="javax.portlet.PortletURL" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>


<liferay-theme:defineObjects />

<portlet:defineObjects />

<liferay-portlet:renderURL varImpl="iteratorURL">
    <portlet:param name="mvcPath" value="/view.jsp" />
</liferay-portlet:renderURL>

<portlet:renderURL var="editPageRenderURL">
    <portlet:param name="mvcPath" value="/create-news.jsp" />
</portlet:renderURL>
