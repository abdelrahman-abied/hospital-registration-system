-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 13, 2018 at 08:56 PM
-- Server version: 5.5.60-0ubuntu0.14.04.1
-- PHP Version: 5.5.9-1ubuntu4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `hospital_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `MESSAGES`
--

CREATE TABLE IF NOT EXISTS `MESSAGES` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MESSAGE_BODY` varchar(150) NOT NULL,
  `MESSAGE_DATE` date NOT NULL,
  `FROM_USER` int(11) NOT NULL,
  `TO_USER` int(11) NOT NULL,
  `PATIENT_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `PATIENT_ID` (`PATIENT_ID`),
  KEY `FROM_USER` (`FROM_USER`),
  KEY `TO_USER` (`TO_USER`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `PATIENT_INFO`
--

CREATE TABLE IF NOT EXISTS `PATIENT_INFO` (
  `ID` int(11) NOT NULL,
  `FIRST_NAME` varchar(80) NOT NULL,
  `FATHER_NAME` varchar(80) NOT NULL,
  `MOBILE` varchar(80) NOT NULL,
  `EMAIL` varchar(80) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `USERS`
--

CREATE TABLE IF NOT EXISTS `USERS` (
  `ID` int(11) NOT NULL,
  `USER_NAME` varchar(80) NOT NULL,
  `PASSWORD` varchar(80) NOT NULL,
  `USER_TYPE` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `USER_TYPE` (`USER_TYPE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `USERS`
--

INSERT INTO `USERS` (`ID`, `USER_NAME`, `PASSWORD`, `USER_TYPE`) VALUES
(1, 'admin', 'admin', 1);

-- --------------------------------------------------------

--
-- Table structure for table `USERS_TYPE`
--

CREATE TABLE IF NOT EXISTS `USERS_TYPE` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TYPE` varchar(80) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `USERS_TYPE`
--

INSERT INTO `USERS_TYPE` (`ID`, `TYPE`) VALUES
(1, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `USER_DETAILS`
--

CREATE TABLE IF NOT EXISTS `USER_DETAILS` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `FIRST_NAME` varchar(80) NOT NULL,
  `FATHER_NAME` varchar(80) NOT NULL,
  `MOBILE` varchar(80) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `USER_ID` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `MESSAGES`
--
ALTER TABLE `MESSAGES`
  ADD CONSTRAINT `MESSAGES_ibfk_1` FOREIGN KEY (`PATIENT_ID`) REFERENCES `PATIENT_INFO` (`ID`),
  ADD CONSTRAINT `MESSAGES_ibfk_2` FOREIGN KEY (`FROM_USER`) REFERENCES `USERS` (`ID`),
  ADD CONSTRAINT `MESSAGES_ibfk_3` FOREIGN KEY (`TO_USER`) REFERENCES `USERS` (`ID`);

--
-- Constraints for table `USERS`
--
ALTER TABLE `USERS`
  ADD CONSTRAINT `USERS_ibfk_1` FOREIGN KEY (`USER_TYPE`) REFERENCES `USERS_TYPE` (`ID`);

--
-- Constraints for table `USER_DETAILS`
--
ALTER TABLE `USER_DETAILS`
  ADD CONSTRAINT `USER_DETAILS_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `USERS` (`ID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
