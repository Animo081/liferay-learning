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
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the News service. Represents a row in the &quot;News_News&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>news.builder.model.impl.NewsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>news.builder.model.impl.NewsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see News
 * @generated
 */
@ProviderType
public interface NewsModel
	extends BaseModel<News>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a news model instance should use the {@link News} interface instead.
	 */

	/**
	 * Returns the primary key of this news.
	 *
	 * @return the primary key of this news
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this news.
	 *
	 * @param primaryKey the primary key of this news
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this news.
	 *
	 * @return the uuid of this news
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this news.
	 *
	 * @param uuid the uuid of this news
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the news ID of this news.
	 *
	 * @return the news ID of this news
	 */
	public long getNewsId();

	/**
	 * Sets the news ID of this news.
	 *
	 * @param newsId the news ID of this news
	 */
	public void setNewsId(long newsId);

	/**
	 * Returns the group ID of this news.
	 *
	 * @return the group ID of this news
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this news.
	 *
	 * @param groupId the group ID of this news
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this news.
	 *
	 * @return the company ID of this news
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this news.
	 *
	 * @param companyId the company ID of this news
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this news.
	 *
	 * @return the user ID of this news
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this news.
	 *
	 * @param userId the user ID of this news
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this news.
	 *
	 * @return the user uuid of this news
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this news.
	 *
	 * @param userUuid the user uuid of this news
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this news.
	 *
	 * @return the user name of this news
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this news.
	 *
	 * @param userName the user name of this news
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this news.
	 *
	 * @return the create date of this news
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this news.
	 *
	 * @param createDate the create date of this news
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this news.
	 *
	 * @return the modified date of this news
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this news.
	 *
	 * @param modifiedDate the modified date of this news
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the title of this news.
	 *
	 * @return the title of this news
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this news.
	 *
	 * @param title the title of this news
	 */
	public void setTitle(String title);

	/**
	 * Returns the url title of this news.
	 *
	 * @return the url title of this news
	 */
	@AutoEscape
	public String getUrlTitle();

	/**
	 * Sets the url title of this news.
	 *
	 * @param urlTitle the url title of this news
	 */
	public void setUrlTitle(String urlTitle);

	/**
	 * Returns the description of this news.
	 *
	 * @return the description of this news
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this news.
	 *
	 * @param description the description of this news
	 */
	public void setDescription(String description);

	/**
	 * Returns the content of this news.
	 *
	 * @return the content of this news
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this news.
	 *
	 * @param content the content of this news
	 */
	public void setContent(String content);

	/**
	 * Returns the display date of this news.
	 *
	 * @return the display date of this news
	 */
	public Date getDisplayDate();

	/**
	 * Sets the display date of this news.
	 *
	 * @param displayDate the display date of this news
	 */
	public void setDisplayDate(Date displayDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(news.builder.model.News news);

	@Override
	public int hashCode();

	@Override
	public CacheModel<news.builder.model.News> toCacheModel();

	@Override
	public news.builder.model.News toEscapedModel();

	@Override
	public news.builder.model.News toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}