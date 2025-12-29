-- create database test_db; 

use test_db;

set auto_increment_offset = 1;

set auto_increment_increment = 1;

drop table if exists FORUM;
create table FORUM (
	FORUM_ID int auto_increment not null,
    FORUM_NAME varchar(50) not null,
    CREATED_AT datetime default current_timestamp not null,
    FORUM_PIC longblob,
    FORUM_STATUS TINYINT DEFAULT 1 not null COMMENT '0:停用, 1:啟用',
    primary key(FORUM_ID)
)engine InnoDB auto_increment = 1;

INSERT INTO FORUM (FORUM_NAME) VALUES
('狗狗飼養'),
('貓咪飼養'),
('寵物健康'),
('行為訓練'),
('寵物用品交流');

drop table if exists FORUMPOST;
create table FORUMPOST (
	POST_ID int auto_increment not null,
    MEM_ID int not null,	-- FK
    FORUM_ID int not null,	-- FK
    POST_TITLE varchar(50) not null,
    POST_CONTENT varchar(3000),
    POST_PIC longblob,
    CREATED_AT datetime default current_timestamp not null,
    LAST_EDITED_AT datetime default current_timestamp,
    POST_STATUS tinyint default 1 not null comment '0: 檢舉下架, 1: 正常顯示, 2: 作者刪除',
    primary key(POST_ID)
)engine InnoDB auto_increment = 11;
    
INSERT INTO FORUMPOST (MEM_ID, FORUM_ID, POST_TITLE, POST_CONTENT) VALUES
(1, 1, '柴犬一直掉毛正常嗎？','家裡柴犬一年四季都在掉毛，有沒有改善方法？'),
(2, 2, '新手養貓需要準備哪些東西？','第一次養貓，想請教必買清單'),
(3, 3, '狗狗一直抓耳朵是不是有問題？','最近發現牠常抓耳朵，有點擔心'),
(4, 4, '幼犬一直亂咬家具怎麼辦？','剛帶回家的幼犬會咬沙發'),
(5, 5, '推薦好用的貓砂品牌','希望是除臭效果好的貓砂'),
(6, 1, '黃金獵犬適合住公寓嗎？','家裡空間不大，適合養嗎？');
    
drop table if exists FORUMPOSTPICTURE;
create table FORUMPOSTPICTURE(
	PIC_ID int auto_increment not null,
	POST_ID int not null,	-- FK
	PIC longblob,
	primary key(PIC_ID)
)engine InnoDB auto_increment = 1;
    
INSERT INTO FORUMPOSTPICTURE (POST_ID, PIC) VALUES
(11, NULL),
(11, NULL),
(13, NULL),
(14, NULL);

drop table if exists FORUMPOSTCOLLECTION;
create table FORUMPOSTCOLLECTION(
	POST_ID int not null,	-- PK FK
    MEM_ID int not null,	-- PK FK
    primary key(POST_ID, MEM_ID)
)engine InnoDB;

INSERT INTO FORUMPOSTCOLLECTION (POST_ID, MEM_ID) VALUES
(11, 2),
(11, 3),
(12, 1),
(14, 5),
(15, 4);

drop table if exists FORUMPOSTCOMMENT;
create table FORUMPOSTCOMMENT(
	COMMENT_ID int auto_increment not null,
    MEM_ID int not null,	-- FK
    POST_ID int not null,	-- FK
    COMMENT_CONTENT varchar(1000) not null,
    COMMENT_PIC longblob,
    CREATED_AT datetime default current_timestamp not null,
    LAST_EDITED_AT datetime default current_timestamp,
    COMMENT_STATUS tinyint default 1 not null comment '0: 檢舉隱藏, 1: 正常顯示, 2: 作者刪除',
    primary key(COMMENT_ID)
)engine InnoDB auto_increment = 100;

INSERT INTO FORUMPOSTCOMMENT (MEM_ID, POST_ID, COMMENT_CONTENT) VALUES
(2, 11, '柴犬換毛季真的會掉很多毛'),
(3, 11, '勤梳毛會改善不少'),
(1, 12, '貓砂盆跟抓板一定要準備'),
(4, 12, '記得先帶去健康檢查'),
(5, 13, '可能是耳朵發炎，建議看獸醫'),
(6, 14, '可以買耐咬玩具轉移注意力');

drop table if exists FORUMCOMMENTREPORT;
create table FORUMCOMMENTREPORT(
	REPORT_ID int auto_increment not null,
	MEM_ID int not null,	-- FK
    COMMENT_ID int not null,	-- FK
    REPORT_TYPE tinyint not null comment '0: 騷擾, 1: 垃圾訊息, 2: 不當內容, 3: 詐騙, 4: 其他',
    REPORT_REASON varchar(1000) not null,
    REPORT_STATUS tinyint default 0 not null comment '0: 待處理, 1: 已處理, 2: 已駁回',
    REPORT_TIME datetime default current_timestamp not null,
    HANDLE_TIME datetime default current_timestamp,
    primary key(REPORT_ID)
)engine InnoDB auto_increment = 1000;

INSERT INTO FORUMCOMMENTREPORT (MEM_ID, COMMENT_ID, REPORT_TYPE, REPORT_REASON) VALUES
(1, 100, 4, '回覆內容過於簡略'),
(3, 101, 0, '語氣不太友善');

drop table if exists FORUMPOSTREPORT;
create table FORUMPOSTREPORT(
	REPORT_ID int auto_increment not null,
	MEM_ID int not null,	-- FK
    POST_ID int not null,	-- FK
    REPORT_TYPE tinyint not null comment '0: 騷擾, 1: 垃圾訊息, 2: 不當內容, 3: 詐騙, 4: 其他',
    REPORT_REASON varchar(1000) not null,
    REPORT_STATUS tinyint default 0 not null comment '0: 待處理, 1: 已處理, 2: 已駁回',
    REPORT_TIME datetime default current_timestamp not null,
    HANDLE_TIME datetime default current_timestamp,
    primary key(REPORT_ID)
)engine InnoDB auto_increment = 1000;

INSERT INTO FORUMPOSTREPORT (MEM_ID, POST_ID, REPORT_TYPE, REPORT_REASON) VALUES
(4, 15, 4, '內容描述不夠完整');
