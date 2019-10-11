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

package news.builder.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import news.builder.model.News;

/**
 * The cache model class for representing News in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class NewsCacheModel implements CacheModel<News>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsCacheModel)) {
			return false;
		}

		NewsCacheModel newsCacheModel = (NewsCacheModel)obj;

		if (newsId == newsCacheModel.newsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, newsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", newsId=");
		sb.append(newsId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", subtitle=");
		sb.append(subtitle);
		sb.append(", urlTitle=");
		sb.append(urlTitle);
		sb.append(", description=");
		sb.append(description);
		sb.append(", content=");
		sb.append(content);
		sb.append(", displayDate=");
		sb.append(displayDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public News toEntityModel() {
		NewsImpl newsImpl = new NewsImpl();

		if (uuid == null) {
			newsImpl.setUuid("");
		}
		else {
			newsImpl.setUuid(uuid);
		}

		newsImpl.setNewsId(newsId);
		newsImpl.setGroupId(groupId);
		newsImpl.setCompanyId(companyId);
		newsImpl.setUserId(userId);

		if (userName == null) {
			newsImpl.setUserName("");
		}
		else {
			newsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			newsImpl.setCreateDate(null);
		}
		else {
			newsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			newsImpl.setModifiedDate(null);
		}
		else {
			newsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			newsImpl.setTitle("");
		}
		else {
			newsImpl.setTitle(title);
		}

		if (subtitle == null) {
			newsImpl.setSubtitle("");
		}
		else {
			newsImpl.setSubtitle(subtitle);
		}

		if (urlTitle == null) {
			newsImpl.setUrlTitle("");
		}
		else {
			newsImpl.setUrlTitle(urlTitle);
		}

		if (description == null) {
			newsImpl.setDescription("");
		}
		else {
			newsImpl.setDescription(description);
		}

		if (content == null) {
			newsImpl.setContent("");
		}
		else {
			newsImpl.setContent(content);
		}

		if (displayDate == Long.MIN_VALUE) {
			newsImpl.setDisplayDate(null);
		}
		else {
			newsImpl.setDisplayDate(new Date(displayDate));
		}

		newsImpl.resetOriginalValues();

		return newsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		newsId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		subtitle = objectInput.readUTF();
		urlTitle = objectInput.readUTF();
		description = objectInput.readUTF();
		content = objectInput.readUTF();
		displayDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(newsId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (subtitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subtitle);
		}

		if (urlTitle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(urlTitle);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (content == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeLong(displayDate);
	}

	public String uuid;
	public long newsId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String subtitle;
	public String urlTitle;
	public String description;
	public String content;
	public long displayDate;

}