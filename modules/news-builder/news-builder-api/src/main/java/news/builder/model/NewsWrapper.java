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

package news.builder.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link News}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see News
 * @generated
 */
@ProviderType
public class NewsWrapper implements News, ModelWrapper<News> {

	public NewsWrapper(News news) {
		_news = news;
	}

	@Override
	public Class<?> getModelClass() {
		return News.class;
	}

	@Override
	public String getModelClassName() {
		return News.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("newsId", getNewsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("subtitle", getSubtitle());
		attributes.put("urlTitle", getUrlTitle());
		attributes.put("description", getDescription());
		attributes.put("content", getContent());
		attributes.put("displayDate", getDisplayDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long newsId = (Long)attributes.get("newsId");

		if (newsId != null) {
			setNewsId(newsId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String subtitle = (String)attributes.get("subtitle");

		if (subtitle != null) {
			setSubtitle(subtitle);
		}

		String urlTitle = (String)attributes.get("urlTitle");

		if (urlTitle != null) {
			setUrlTitle(urlTitle);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Date displayDate = (Date)attributes.get("displayDate");

		if (displayDate != null) {
			setDisplayDate(displayDate);
		}
	}

	@Override
	public Object clone() {
		return new NewsWrapper((News)_news.clone());
	}

	@Override
	public int compareTo(news.builder.model.News news) {
		return _news.compareTo(news);
	}

	/**
	 * Returns the company ID of this news.
	 *
	 * @return the company ID of this news
	 */
	@Override
	public long getCompanyId() {
		return _news.getCompanyId();
	}

	/**
	 * Returns the content of this news.
	 *
	 * @return the content of this news
	 */
	@Override
	public String getContent() {
		return _news.getContent();
	}

	/**
	 * Returns the create date of this news.
	 *
	 * @return the create date of this news
	 */
	@Override
	public Date getCreateDate() {
		return _news.getCreateDate();
	}

	/**
	 * Returns the description of this news.
	 *
	 * @return the description of this news
	 */
	@Override
	public String getDescription() {
		return _news.getDescription();
	}

	/**
	 * Returns the display date of this news.
	 *
	 * @return the display date of this news
	 */
	@Override
	public Date getDisplayDate() {
		return _news.getDisplayDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _news.getExpandoBridge();
	}

	/**
	 * Returns the group ID of this news.
	 *
	 * @return the group ID of this news
	 */
	@Override
	public long getGroupId() {
		return _news.getGroupId();
	}

	/**
	 * Returns the modified date of this news.
	 *
	 * @return the modified date of this news
	 */
	@Override
	public Date getModifiedDate() {
		return _news.getModifiedDate();
	}

	/**
	 * Returns the news ID of this news.
	 *
	 * @return the news ID of this news
	 */
	@Override
	public long getNewsId() {
		return _news.getNewsId();
	}

	/**
	 * Returns the primary key of this news.
	 *
	 * @return the primary key of this news
	 */
	@Override
	public long getPrimaryKey() {
		return _news.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _news.getPrimaryKeyObj();
	}

	/**
	 * Returns the subtitle of this news.
	 *
	 * @return the subtitle of this news
	 */
	@Override
	public String getSubtitle() {
		return _news.getSubtitle();
	}

	/**
	 * Returns the title of this news.
	 *
	 * @return the title of this news
	 */
	@Override
	public String getTitle() {
		return _news.getTitle();
	}

	/**
	 * Returns the url title of this news.
	 *
	 * @return the url title of this news
	 */
	@Override
	public String getUrlTitle() {
		return _news.getUrlTitle();
	}

	/**
	 * Returns the user ID of this news.
	 *
	 * @return the user ID of this news
	 */
	@Override
	public long getUserId() {
		return _news.getUserId();
	}

	/**
	 * Returns the user name of this news.
	 *
	 * @return the user name of this news
	 */
	@Override
	public String getUserName() {
		return _news.getUserName();
	}

	/**
	 * Returns the user uuid of this news.
	 *
	 * @return the user uuid of this news
	 */
	@Override
	public String getUserUuid() {
		return _news.getUserUuid();
	}

	/**
	 * Returns the uuid of this news.
	 *
	 * @return the uuid of this news
	 */
	@Override
	public String getUuid() {
		return _news.getUuid();
	}

	@Override
	public int hashCode() {
		return _news.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _news.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _news.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _news.isNew();
	}

	@Override
	public void persist() {
		_news.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_news.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this news.
	 *
	 * @param companyId the company ID of this news
	 */
	@Override
	public void setCompanyId(long companyId) {
		_news.setCompanyId(companyId);
	}

	/**
	 * Sets the content of this news.
	 *
	 * @param content the content of this news
	 */
	@Override
	public void setContent(String content) {
		_news.setContent(content);
	}

	/**
	 * Sets the create date of this news.
	 *
	 * @param createDate the create date of this news
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_news.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this news.
	 *
	 * @param description the description of this news
	 */
	@Override
	public void setDescription(String description) {
		_news.setDescription(description);
	}

	/**
	 * Sets the display date of this news.
	 *
	 * @param displayDate the display date of this news
	 */
	@Override
	public void setDisplayDate(Date displayDate) {
		_news.setDisplayDate(displayDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_news.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_news.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_news.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the group ID of this news.
	 *
	 * @param groupId the group ID of this news
	 */
	@Override
	public void setGroupId(long groupId) {
		_news.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this news.
	 *
	 * @param modifiedDate the modified date of this news
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_news.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_news.setNew(n);
	}

	/**
	 * Sets the news ID of this news.
	 *
	 * @param newsId the news ID of this news
	 */
	@Override
	public void setNewsId(long newsId) {
		_news.setNewsId(newsId);
	}

	/**
	 * Sets the primary key of this news.
	 *
	 * @param primaryKey the primary key of this news
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_news.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_news.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the subtitle of this news.
	 *
	 * @param subtitle the subtitle of this news
	 */
	@Override
	public void setSubtitle(String subtitle) {
		_news.setSubtitle(subtitle);
	}

	/**
	 * Sets the title of this news.
	 *
	 * @param title the title of this news
	 */
	@Override
	public void setTitle(String title) {
		_news.setTitle(title);
	}

	/**
	 * Sets the url title of this news.
	 *
	 * @param urlTitle the url title of this news
	 */
	@Override
	public void setUrlTitle(String urlTitle) {
		_news.setUrlTitle(urlTitle);
	}

	/**
	 * Sets the user ID of this news.
	 *
	 * @param userId the user ID of this news
	 */
	@Override
	public void setUserId(long userId) {
		_news.setUserId(userId);
	}

	/**
	 * Sets the user name of this news.
	 *
	 * @param userName the user name of this news
	 */
	@Override
	public void setUserName(String userName) {
		_news.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this news.
	 *
	 * @param userUuid the user uuid of this news
	 */
	@Override
	public void setUserUuid(String userUuid) {
		_news.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this news.
	 *
	 * @param uuid the uuid of this news
	 */
	@Override
	public void setUuid(String uuid) {
		_news.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<news.builder.model.News>
		toCacheModel() {

		return _news.toCacheModel();
	}

	@Override
	public news.builder.model.News toEscapedModel() {
		return new NewsWrapper(_news.toEscapedModel());
	}

	@Override
	public String toString() {
		return _news.toString();
	}

	@Override
	public news.builder.model.News toUnescapedModel() {
		return new NewsWrapper(_news.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _news.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsWrapper)) {
			return false;
		}

		NewsWrapper newsWrapper = (NewsWrapper)obj;

		if (Objects.equals(_news, newsWrapper._news)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _news.getStagedModelType();
	}

	@Override
	public News getWrappedModel() {
		return _news;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _news.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _news.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_news.resetOriginalValues();
	}

	private final News _news;

}