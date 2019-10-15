create table News_News (
	uuid_ VARCHAR(75) null,
	newsId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	urlTitle VARCHAR(75) null,
	description VARCHAR(75) null,
	content VARCHAR(75) null,
	displayDate DATE null
);