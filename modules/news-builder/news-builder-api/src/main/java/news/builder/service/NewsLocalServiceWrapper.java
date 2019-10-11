/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package news.builder.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsLocalService
 * @generated
 */
@ProviderType
public class NewsLocalServiceWrapper
	implements NewsLocalService, ServiceWrapper<NewsLocalService> {

	public NewsLocalServiceWrapper(NewsLocalService newsLocalService) {
		_newsLocalService = newsLocalService;
	}

	/**
	 * Adds the news to the database. Also notifies the appropriate model listeners.
	 *
	 * @param news the news
	 * @return the news that was added
	 */
	@Override
	public news.builder.model.News addNews(news.builder.model.News news) {
		return _newsLocalService.addNews(news);
	}

	/**
	 * Creates a new news with the primary key. Does not add the news to the database.
	 *
	 * @param newsId the primary key for the new news
	 * @return the new news
	 */
	@Override
	public news.builder.model.News createNews(long newsId) {
		return _newsLocalService.createNews(newsId);
	}

	/**
	 * Deletes the news with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsId the primary key of the news
	 * @return the news that was removed
	 * @throws PortalException if a news with the primary key could not be found
	 */
	@Override
	public news.builder.model.News deleteNews(long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLocalService.deleteNews(newsId);
	}

	/**
	 * Deletes the news from the database. Also notifies the appropriate model listeners.
	 *
	 * @param news the news
	 * @return the news that was removed
	 */
	@Override
	public news.builder.model.News deleteNews(news.builder.model.News news) {
		return _newsLocalService.deleteNews(news);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newsLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _newsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>news.builder.model.impl.NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _newsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>news.builder.model.impl.NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _newsLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _newsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _newsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public news.builder.model.News fetchNews(long newsId) {
		return _newsLocalService.fetchNews(newsId);
	}

	/**
	 * Returns the news matching the UUID and group.
	 *
	 * @param uuid the news's UUID
	 * @param groupId the primary key of the group
	 * @return the matching news, or <code>null</code> if a matching news could not be found
	 */
	@Override
	public news.builder.model.News fetchNewsByUuidAndGroupId(
		String uuid, long groupId) {

		return _newsLocalService.fetchNewsByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _newsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _newsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _newsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the news with the primary key.
	 *
	 * @param newsId the primary key of the news
	 * @return the news
	 * @throws PortalException if a news with the primary key could not be found
	 */
	@Override
	public news.builder.model.News getNews(long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLocalService.getNews(newsId);
	}

	/**
	 * Returns the news matching the UUID and group.
	 *
	 * @param uuid the news's UUID
	 * @param groupId the primary key of the group
	 * @return the matching news
	 * @throws PortalException if a matching news could not be found
	 */
	@Override
	public news.builder.model.News getNewsByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLocalService.getNewsByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>news.builder.model.impl.NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @return the range of newses
	 */
	@Override
	public java.util.List<news.builder.model.News> getNewses(
		int start, int end) {

		return _newsLocalService.getNewses(start, end);
	}

	/**
	 * Returns all the newses matching the UUID and company.
	 *
	 * @param uuid the UUID of the newses
	 * @param companyId the primary key of the company
	 * @return the matching newses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<news.builder.model.News> getNewsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return _newsLocalService.getNewsesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of newses matching the UUID and company.
	 *
	 * @param uuid the UUID of the newses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching newses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<news.builder.model.News> getNewsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<news.builder.model.News> orderByComparator) {

		return _newsLocalService.getNewsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of newses.
	 *
	 * @return the number of newses
	 */
	@Override
	public int getNewsesCount() {
		return _newsLocalService.getNewsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _newsLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _newsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the news in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param news the news
	 * @return the news that was updated
	 */
	@Override
	public news.builder.model.News updateNews(news.builder.model.News news) {
		return _newsLocalService.updateNews(news);
	}

	@Override
	public NewsLocalService getWrappedService() {
		return _newsLocalService;
	}

	@Override
	public void setWrappedService(NewsLocalService newsLocalService) {
		_newsLocalService = newsLocalService;
	}

	private NewsLocalService _newsLocalService;

}