<%@ page import="com.liferay.portal.kernel.portlet.PortletURLUtil" %>
<%@ page import="news.builder.model.News" %>
<%@ page import="news.builder.service.NewsLocalService" %>
<%@ page import="java.util.List" %>
<%@ include file="/init.jsp" %>

<%
	PortletURL addPageURL = renderResponse.createRenderURL();
	addPageURL.setParameter("mvcPath", "/create-news.jsp");

	NewsLocalService newsLocalService = (NewsLocalService)request.getAttribute("newsLocalService");

	PortletURL currentURLObj = PortletURLUtil.getCurrent(liferayPortletRequest, liferayPortletResponse);
%>

<liferay-ui:icon
		iconCssClass="icon-plus"
		label="<%= true %>"
		url="<%= editPageRenderURL %>"
/>

<%
	List<News> attachments;
	attachments = newsLocalService.getNewses(0,newsLocalService.getNewsesCount());
%>

<liferay-ui:search-container
		emptyResultsMessage="events.attachments-empty-results-message"
		headerNames="title, description, content"
		iteratorURL="<%=currentURLObj%>"
		total="<%=attachments.size()%>">

	<liferay-ui:search-container-results
			results="<%=attachments%>"
	/>
	<liferay-ui:search-container-row
			className="news.builder.model.News"
			modelVar="newsEntry"
	>
		<liferay-ui:search-container-column-text
				name="title"
		>
			<%=newsEntry.getTitle()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text
				name="description"
		>
			<%=newsEntry.getDescription()%>
		</liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text
				name="content"
		>
			<%=newsEntry.getContent()%>
		</liferay-ui:search-container-column-text>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator markupView="lexicon" paginate="<%=false%>" />
</liferay-ui:search-container>

