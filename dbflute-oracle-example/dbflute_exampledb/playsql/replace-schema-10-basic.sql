
create table MEMBER(
    MEMBER_ID NUMBER(16) NOT NULL PRIMARY KEY,
    MEMBER_NAME VARCHAR(200) NOT NULL,
    MEMBER_ACCOUNT VARCHAR(50) NOT NULL,
    MEMBER_STATUS_CODE CHAR(3) NOT NULL,
    FORMALIZED_DATETIME TIMESTAMP(3),
    BIRTHDATE DATE,
    REGISTER_DATETIME DATE NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    REGISTER_PROCESS VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATE NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    UPDATE_PROCESS VARCHAR(200) NOT NULL,
    VERSION_NO NUMBER(16)  NOT NULL
);


create table MEMBER_ADDRESS(
    MEMBER_ADDRESS_ID NUMBER(16) NOT NULL PRIMARY KEY,
    MEMBER_ID NUMBER(16) NOT NULL,
    VALID_BEGIN_DATE DATE NOT NULL,
    VALID_END_DATE DATE NOT NULL,
    ADDRESS VARCHAR(200) NOT NULL,
    REGION_ID INTEGER NOT NULL,
    REGISTER_DATETIME DATE NOT NULL,
    REGISTER_PROCESS VARCHAR(200) NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATE NOT NULL,
    UPDATE_PROCESS VARCHAR(200) NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO NUMBER(16) NOT NULL
);


create table MEMBER_LOGIN(
    MEMBER_LOGIN_ID NUMBER(16) NOT NULL PRIMARY KEY,
    MEMBER_ID NUMBER(16) NOT NULL,
    LOGIN_DATETIME DATE NOT NULL,
    MOBILE_LOGIN_FLG NUMBER(1) NOT NULL,
    LOGIN_MEMBER_STATUS_CODE CHAR(3) NOT NULL
);


create table MEMBER_SERVICE(
    MEMBER_SERVICE_ID NUMBER(16) NOT NULL PRIMARY KEY,
    MEMBER_ID NUMBER(16) NOT NULL,
    SERVICE_POINT_COUNT NUMBER(8) NOT NULL,
    SERVICE_RANK_CODE CHAR(3) NOT NULL,
    REGISTER_DATETIME DATE NOT NULL,
    REGISTER_PROCESS VARCHAR(200) NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATE NOT NULL,
    UPDATE_PROCESS VARCHAR(200) NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO NUMBER(16) NOT NULL
);


create table MEMBER_SECURITY(
    MEMBER_ID NUMBER(16) NOT NULL PRIMARY KEY,
    LOGIN_PASSWORD VARCHAR(50) NOT NULL,
    REMINDER_QUESTION VARCHAR(50) NOT NULL,
    REMINDER_ANSWER VARCHAR(50) NOT NULL,
    REMINDER_USE_COUNT NUMBER(7) NOT NULL,
    REGISTER_DATETIME DATE NOT NULL,
    REGISTER_PROCESS VARCHAR(200) NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATE NOT NULL,
    UPDATE_PROCESS VARCHAR(200) NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO NUMBER(16) NOT NULL
);


create table MEMBER_WITHDRAWAL(
    MEMBER_ID NUMBER(16) NOT NULL PRIMARY KEY,
    WITHDRAWAL_REASON_CODE CHAR(3),
    WITHDRAWAL_REASON_INPUT_TEXT CLOB,
    WITHDRAWAL_DATETIME DATE NOT NULL,
    REGISTER_DATETIME DATE NOT NULL,
    REGISTER_PROCESS VARCHAR(200) NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATE NOT NULL,
    UPDATE_PROCESS VARCHAR(200) NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    VERSION_NO NUMBER(16) NOT NULL
);


create table PURCHASE(
    PURCHASE_ID NUMBER(16) NOT NULL PRIMARY KEY,
    MEMBER_ID NUMBER(16) NOT NULL,
    PRODUCT_ID NUMBER(16) NOT NULL,
    PURCHASE_DATETIME TIMESTAMP(3) NOT NULL,
    PURCHASE_COUNT NUMBER(16) NOT NULL,
    PURCHASE_PRICE NUMBER(16) NOT NULL,
    PAYMENT_COMPLETE_FLG NUMBER(1) NOT NULL,
    REGISTER_DATETIME DATE NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    REGISTER_PROCESS VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATE NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    UPDATE_PROCESS VARCHAR(200) NOT NULL,
    VERSION_NO NUMBER(16) NOT NULL
);


create table PRODUCT(
    PRODUCT_ID NUMBER(16) NOT NULL PRIMARY KEY,
    PRODUCT_NAME VARCHAR(50) NOT NULL,
    PRODUCT_HANDLE_CODE VARCHAR(100) NOT NULL,
    PRODUCT_CATEGORY_CODE CHAR(3) NOT NULL,
    PRODUCT_STATUS_CODE CHAR(3) NOT NULL,
    REGULAR_PRICE NUMBER(9) NOT NULL,
    REGISTER_DATETIME DATE NOT NULL,
    REGISTER_USER VARCHAR(200) NOT NULL,
    REGISTER_PROCESS VARCHAR(200) NOT NULL,
    UPDATE_DATETIME DATE NOT NULL,
    UPDATE_USER VARCHAR(200) NOT NULL,
    UPDATE_PROCESS VARCHAR(200) NOT NULL,
    VERSION_NO NUMBER(16) NOT NULL
);


create table PRODUCT_CATEGORY(
    PRODUCT_CATEGORY_CODE CHAR(3) NOT NULL PRIMARY KEY,
    PRODUCT_CATEGORY_NAME VARCHAR(50) NOT NULL,
    PARENT_CATEGORY_CODE CHAR(3)
);


create table PRODUCT_STATUS(
    PRODUCT_STATUS_CODE CHAR(3) NOT NULL PRIMARY KEY,
    PRODUCT_STATUS_NAME VARCHAR(50) NOT NULL,
    DISPLAY_ORDER INTEGER NOT NULL
);


create table REGION(
    REGION_ID INTEGER NOT NULL PRIMARY KEY,
    REGION_NAME VARCHAR(50) NOT NULL
);


create table SERVICE_RANK(
    SERVICE_RANK_CODE CHAR(3) NOT NULL PRIMARY KEY,
    SERVICE_RANK_NAME VARCHAR(50) NOT NULL,
    SERVICE_POINT_INCIDENCE NUMBER(5, 3) NOT NULL,
    NEW_ACCEPTABLE_FLG INTEGER NOT NULL,
    DESCRIPTION VARCHAR(200) NOT NULL,
    DISPLAY_ORDER INTEGER NOT NULL
);


create table MEMBER_STATUS(
    MEMBER_STATUS_CODE CHAR(3) NOT NULL PRIMARY KEY,
    MEMBER_STATUS_NAME VARCHAR(50) NOT NULL,
    DESCRIPTION VARCHAR(200) NOT NULL,
    DISPLAY_ORDER NUMBER(16) NOT NULL
);


create table WITHDRAWAL_REASON(
    WITHDRAWAL_REASON_CODE CHAR(3) NOT NULL PRIMARY KEY,
    WITHDRAWAL_REASON_TEXT CLOB NOT NULL,
    DISPLAY_ORDER NUMBER(16) NOT NULL
);


ALTER TABLE MEMBER ADD CONSTRAINT FK_MEMBER_MEMBER_STATUS 
    FOREIGN KEY (MEMBER_STATUS_CODE) REFERENCES MEMBER_STATUS (MEMBER_STATUS_CODE) ;

ALTER TABLE MEMBER_ADDRESS ADD CONSTRAINT FK_MEMBER_ADDRESS_MEMBER 
    FOREIGN KEY (MEMBER_ID) REFERENCES MEMBER (MEMBER_ID) ;

alter table MEMBER_ADDRESS add constraint FK_MEMBER_ADDRESS_REGION 
    FOREIGN KEY (REGION_ID) references REGION (REGION_ID);

ALTER TABLE MEMBER_LOGIN ADD CONSTRAINT FK_MEMBER_LOGIN_MEMBER_STATUS 
    FOREIGN KEY (LOGIN_MEMBER_STATUS_CODE) REFERENCES MEMBER_STATUS (MEMBER_STATUS_CODE) ;

ALTER TABLE MEMBER_LOGIN ADD CONSTRAINT FK_MEMBER_LOGIN_MEMBER 
    FOREIGN KEY (MEMBER_ID) REFERENCES MEMBER (MEMBER_ID) ;

ALTER TABLE MEMBER_SECURITY ADD CONSTRAINT FK_MEMBER_SECURITY_MEMBER 
    FOREIGN KEY (MEMBER_ID) REFERENCES MEMBER (MEMBER_ID) ;

alter table MEMBER_SERVICE add constraint FK_MEMBER_SERVICE_MEMBER 
    FOREIGN KEY (MEMBER_ID) references MEMBER (MEMBER_ID);

alter table MEMBER_SERVICE add constraint FK_MEMBER_SERVICE_RANK_CODE 
    FOREIGN KEY (SERVICE_RANK_CODE) references SERVICE_RANK (SERVICE_RANK_CODE);

ALTER TABLE MEMBER_WITHDRAWAL ADD CONSTRAINT FK_MEMBER_WITHDRAWAL_MEMBER 
    FOREIGN KEY (MEMBER_ID) REFERENCES MEMBER (MEMBER_ID) ;

ALTER TABLE MEMBER_WITHDRAWAL ADD CONSTRAINT FK_MEMBER_WITHDRAWAL_REASON 
    FOREIGN KEY (WITHDRAWAL_REASON_CODE) REFERENCES WITHDRAWAL_REASON (WITHDRAWAL_REASON_CODE) ;

ALTER TABLE PURCHASE ADD CONSTRAINT FK_PURCHASE_MEMBER 
    FOREIGN KEY (MEMBER_ID) REFERENCES MEMBER (MEMBER_ID) ;

ALTER TABLE PURCHASE ADD CONSTRAINT FK_PURCHASE_PRODUCT 
    FOREIGN KEY (PRODUCT_ID) REFERENCES PRODUCT (PRODUCT_ID) ;

ALTER TABLE PRODUCT ADD CONSTRAINT FK_PRODUCT_PRODUCT_STATUS 
    FOREIGN KEY (PRODUCT_STATUS_CODE) REFERENCES PRODUCT_STATUS (PRODUCT_STATUS_CODE) ;

alter table PRODUCT_CATEGORY add constraint FK_PRODUCT_CATEGORY_PARENT 
    FOREIGN KEY (PARENT_CATEGORY_CODE) references PRODUCT_CATEGORY (PRODUCT_CATEGORY_CODE);


ALTER TABLE MEMBER ADD CONSTRAINT UQ_MEMBER_MEMBER_ACCOUNT UNIQUE (MEMBER_ACCOUNT) ;
ALTER TABLE MEMBER_ADDRESS ADD CONSTRAINT UQ_MEMBER_ADDRESS UNIQUE (MEMBER_ID, VALID_BEGIN_DATE) ;
ALTER TABLE MEMBER_LOGIN ADD CONSTRAINT UQ_MEMBER_LOGIN UNIQUE (MEMBER_ID, LOGIN_DATETIME) ;
alter table MEMBER_SERVICE add constraint UQ_MEMBER_SERVICE UNIQUE (MEMBER_ID);
ALTER TABLE PURCHASE ADD CONSTRAINT UQ_PURCHASE UNIQUE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME) ;
ALTER TABLE PRODUCT ADD CONSTRAINT UQ_PRODUCT_PRODUCT_HANDLE_CODE UNIQUE (PRODUCT_HANDLE_CODE) ;
ALTER TABLE MEMBER_STATUS ADD CONSTRAINT UQ_MEMBER_STATUS_M_S_NAME UNIQUE (MEMBER_STATUS_NAME) ;
ALTER TABLE MEMBER_STATUS ADD CONSTRAINT UQ_MEMBER_STATUS_DISPLAY_ORDER UNIQUE (DISPLAY_ORDER) ;
ALTER TABLE PRODUCT_STATUS ADD CONSTRAINT UQ_PRODUCT_STATUS_P_S_NAME UNIQUE (PRODUCT_STATUS_NAME) ;
alter table SERVICE_RANK add constraint UQ_SERVICE_RANK_DISPLAY_ORDER UNIQUE (DISPLAY_ORDER);
ALTER TABLE WITHDRAWAL_REASON ADD CONSTRAINT UQ_WITHDRAWAL_R_D_ORDER UNIQUE (DISPLAY_ORDER) ;


CREATE INDEX IX_MEMBER_MEMBER_NAME ON MEMBER(MEMBER_NAME) ;
CREATE INDEX IX_MEMBER_FORMALIZED_DATETIME ON MEMBER(FORMALIZED_DATETIME) ;
CREATE INDEX IX_MEMBER_LOGIN_DATETIME ON MEMBER_LOGIN(LOGIN_DATETIME) ;
create index IX_MEMBER_SERVICE_POINT_COUNT on MEMBER_SERVICE(SERVICE_POINT_COUNT);
CREATE INDEX IX_PURCHASE_PRODUCT_DATETIME ON PURCHASE(PRODUCT_ID, PURCHASE_DATETIME) ;
CREATE INDEX IX_PURCHASE_DATETIME_MEMBER ON PURCHASE(PURCHASE_DATETIME, MEMBER_ID) ;
CREATE INDEX IX_PURCHASE_PRICE ON PURCHASE(PURCHASE_PRICE) ;
CREATE INDEX IX_PRODUCT_PRODUCT_NAME ON PRODUCT(PRODUCT_NAME) ;
