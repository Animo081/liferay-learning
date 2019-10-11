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

package news.builder.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

import news.builder.exception.NoSuchNewsException;
import news.builder.model.News;

/**
 * The persistence interface for the news service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsUtil
 * @generated
 */
@ProviderType
public interface NewsPersistence extends BasePersistence<News> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewsUtil} to access the news persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, News> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the newses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching newses
	 */
	public java.util.List<News> findByUuid(String uuid);

	/**
	 * Returns a range of all the newses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @return the range of matching newses
	 */
	public java.util.List<News> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the newses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching newses
	 */
	public java.util.List<News> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator);

	/**
	 * Returns an ordered range of all the newses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching newses
	 */
	public java.util.List<News> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first news in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news
	 * @throws NoSuchNewsException if a matching news could not be found
	 */
	public News findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<News>
				orderByComparator)
		throws NoSuchNewsException;

	/**
	 * Returns the first news in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news, or <code>null</code> if a matching news could not be found
	 */
	public News fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator);

	/**
	 * Returns the last news in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news
	 * @throws NoSuchNewsException if a matching news could not be found
	 */
	public News findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<News>
				orderByComparator)
		throws NoSuchNewsException;

	/**
	 * Returns the last news in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news, or <code>null</code> if a matching news could not be found
	 */
	public News fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator);

	/**
	 * Returns the newses before and after the current news in the ordered set where uuid = &#63;.
	 *
	 * @param newsId the primary key of the current news
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next news
	 * @throws NoSuchNewsException if a news with the primary key could not be found
	 */
	public News[] findByUuid_PrevAndNext(
			long newsId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<News>
				orderByComparator)
		throws NoSuchNewsException;

	/**
	 * Removes all the newses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of newses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching newses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the news where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNewsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching news
	 * @throws NoSuchNewsException if a matching news could not be found
	 */
	public News findByUUID_G(String uuid, long groupId)
		throws NoSuchNewsException;

	/**
	 * Returns the news where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching news, or <code>null</code> if a matching news could not be found
	 */
	public News fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the news where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching news, or <code>null</code> if a matching news could not be found
	 */
	public News fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the news where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the news that was removed
	 */
	public News removeByUUID_G(String uuid, long groupId)
		throws NoSuchNewsException;

	/**
	 * Returns the number of newses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching newses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the newses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching newses
	 */
	public java.util.List<News> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the newses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @return the range of matching newses
	 */
	public java.util.List<News> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the newses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching newses
	 */
	public java.util.List<News> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator);

	/**
	 * Returns an ordered range of all the newses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching newses
	 */
	public java.util.List<News> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first news in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news
	 * @throws NoSuchNewsException if a matching news could not be found
	 */
	public News findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<News>
				orderByComparator)
		throws NoSuchNewsException;

	/**
	 * Returns the first news in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching news, or <code>null</code> if a matching news could not be found
	 */
	public News fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator);

	/**
	 * Returns the last news in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news
	 * @throws NoSuchNewsException if a matching news could not be found
	 */
	public News findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<News>
				orderByComparator)
		throws NoSuchNewsException;

	/**
	 * Returns the last news in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching news, or <code>null</code> if a matching news could not be found
	 */
	public News fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator);

	/**
	 * Returns the newses before and after the current news in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param newsId the primary key of the current news
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next news
	 * @throws NoSuchNewsException if a news with the primary key could not be found
	 */
	public News[] findByUuid_C_PrevAndNext(
			long newsId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<News>
				orderByComparator)
		throws NoSuchNewsException;

	/**
	 * Removes all the newses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of newses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching newses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the news in the entity cache if it is enabled.
	 *
	 * @param news the news
	 */
	public void cacheResult(News news);

	/**
	 * Caches the newses in the entity cache if it is enabled.
	 *
	 * @param newses the newses
	 */
	public void cacheResult(java.util.List<News> newses);

	/**
	 * Creates a new news with the primary key. Does not add the news to the database.
	 *
	 * @param newsId the primary key for the new news
	 * @return the new news
	 */
	public News create(long newsId);

	/**
	 * Removes the news with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsId the primary key of the news
	 * @return the news that was removed
	 * @throws NoSuchNewsException if a news with the primary key could not be found
	 */
	public News remove(long newsId) throws NoSuchNewsException;

	public News updateImpl(News news);

	/**
	 * Returns the news with the primary key or throws a <code>NoSuchNewsException</code> if it could not be found.
	 *
	 * @param newsId the primary key of the news
	 * @return the news
	 * @throws NoSuchNewsException if a news with the primary key could not be found
	 */
	public News findByPrimaryKey(long newsId) throws NoSuchNewsException;

	/**
	 * Returns the news with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsId the primary key of the news
	 * @return the news, or <code>null</code> if a news with the primary key could not be found
	 */
	public News fetchByPrimaryKey(long newsId);

	/**
	 * Returns all the newses.
	 *
	 * @return the newses
	 */
	public java.util.List<News> findAll();

	/**
	 * Returns a range of all the newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @return the range of newses
	 */
	public java.util.List<News> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of newses
	 */
	public java.util.List<News> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator);

	/**
	 * Returns an ordered range of all the newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>NewsModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of newses
	 * @param end the upper bound of the range of newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of newses
	 */
	public java.util.List<News> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<News>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the newses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of newses.
	 *
	 * @return the number of newses
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}