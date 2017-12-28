/*
创建数据库
*/
create database db_exam;
--使用数据库
use db_exam;
GO

/*
创建数据表
*/
--教师表
create table t_teacher(
	tid VARCHAR(20) PRIMARY key,--编号
	tname varchar(20) not null,--姓名
	sex varchar(2) not null,--性别
	birthday VARCHAR(20),--生日
	education varchar(20),--学历
	tel varchar(11),--手机
	post varchar(10) not null,--岗位
	remarks varchar(100)--备注
);
--学生表
create table t_student(
	sid VARCHAR(20) PRIMARY key,--编号
	sname varchar(20) not null,--姓名
	sex varchar(2) not null,--性别
	enterSchool varchar(4) not null,--入学年份
	cid int not null,--所属班级
	photo VARCHAR(50),--头像
	birthday varchar(20),--生日
	IDCard VARCHAR(18),--身份证号
	pOutlook VARCHAR(10),--政治面貌
	province VARCHAR(20),--省份
	city VARCHAR(20),--城市
	tel VARCHAR(11),--联系电话
	address VARCHAR(40),--家庭住址
	ptel VARCHAR(11),--家长联系电话
	pRelation VARCHAR(10),--家长与学生关系
	hostelBuil VARCHAR(10),--宿舍楼
	hostelNo VARCHAR(10),--宿舍号
	baseInfo VARCHAR(50),--基本情况
	eduBg VARCHAR(20),--教育背景
	remarks VARCHAR(20)--备注
);
--账户表
create table t_user(
	name VARCHAR(20) PRIMARY key,--账户名
	pwd VARCHAR(20) not null,--账户密码
	role int not null--角色：1（学生）；2（教师）；4（管理员）
);

--添加管理员账户
insert into t_user values ('admin','123456',4);