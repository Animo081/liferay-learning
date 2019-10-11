create index IX_705DA379 on News_News (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2DBAB43B on News_News (uuid_[$COLUMN_LENGTH:75$], groupId);