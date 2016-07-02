-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 2016-07-02 13:57:12
-- 服务器版本： 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `scutcmsdb`
--

-- --------------------------------------------------------

--
-- 表的结构 `employee`
--

CREATE TABLE `employee` (
  `EMPLOYEE_ID` char(12) NOT NULL,
  `EMPLOYEE_NAME` varchar(16) NOT NULL,
  `EMPLOYEE_SEX` char(2) NOT NULL,
  `EMPLOYEE_SFZH` char(18) NOT NULL,
  `EMPLOYEE_AGE` int(11) NOT NULL,
  `EMPLOYEE_ADDRESS` varchar(120) NOT NULL,
  `EMPLOYEE_TELPHONE` char(11) NOT NULL,
  `ENTER_TIME` date NOT NULL,
  `POSITION_NAME` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 表的结构 `position`
--

CREATE TABLE `position` (
  `POSITION_NAME` varchar(16) NOT NULL,
  `BASE_SALARY` int(11) NOT NULL,
  `WAGE_HOURLY` int(11) NOT NULL,
  `PUNISHMENT` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 表的结构 `procurement`
--

CREATE TABLE `procurement` (
  `PRODUCT_NAME` varchar(20) NOT NULL,
  `UNIT_PRICE` double NOT NULL,
  `AMOUT` double NOT NULL,
  `PROCURE_DATE` date NOT NULL,
  `USERNAME` varchar(18) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 表的结构 `salary`
--

CREATE TABLE `salary` (
  `EMPLOYEE_ID` char(12) NOT NULL,
  `SALARY_DATE` date NOT NULL,
  `SALARY` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE `user` (
  `USERNAME` varchar(18) NOT NULL,
  `PASSWORD_MD5` char(32) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `SALT` char(32) NOT NULL,
  `TOKEN` char(32) NOT NULL,
  `REAL_NAME` varchar(16) NOT NULL,
  `TELEPHONE` char(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EMPLOYEE_ID`);

--
-- Indexes for table `position`
--
ALTER TABLE `position`
  ADD PRIMARY KEY (`POSITION_NAME`);

--
-- Indexes for table `procurement`
--
ALTER TABLE `procurement`
  ADD PRIMARY KEY (`PRODUCT_NAME`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD PRIMARY KEY (`EMPLOYEE_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`USERNAME`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
