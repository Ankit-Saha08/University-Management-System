-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 06, 2023 at 07:05 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ums_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(20) CHARACTER SET utf8 NOT NULL,
  `name` varchar(40) CHARACTER SET utf8 NOT NULL,
  `password` varchar(30) CHARACTER SET utf8 NOT NULL,
  `sec_ques` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `sec_ans` varchar(50) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `attendance_stud`
--

CREATE TABLE `attendance_stud` (
  `first` varchar(20) DEFAULT NULL,
  `second` varchar(20) DEFAULT NULL,
  `roll` varchar(10) NOT NULL,
  `date` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendance_stud`
--

INSERT INTO `attendance_stud` (`first`, `second`, `roll`, `date`) VALUES
('Present', 'Present', '11', 'Thu Jan 05 08:33:45 IST 2023'),
('Absent', 'Absent', '06', 'Thu Jan 05 08:37:21 IST 2023'),
('Present', 'Absent', '09', 'Thu Jan 05 08:37:28 IST 2023'),
('Absent', 'Absent', '15', 'Thu Jan 05 08:37:37 IST 2023'),
('Present', 'Present', '06', 'Thu Jan 12 17:57:19 IST 2023'),
('Present', 'Absent', '09', 'Thu Jan 12 17:57:28 IST 2023'),
('Absent', 'Absent', '17', 'Thu Jan 12 17:57:36 IST 2023'),
('Absent', 'Present', '15', 'Thu Jan 12 17:57:45 IST 2023'),
('Absent', 'Present', '09', 'Thu Jan 12 17:57:50 IST 2023'),
('Present', 'Present', '11', 'Thu Jan 12 17:58:00 IST 2023'),
('Absent', 'Absent', '06', 'Wed Jan 04 09:12:46 IST 2023'),
('Present', 'Absent', '09', 'Wed Jan 04 09:13:09 IST 2023'),
('Present', 'Present', '15', 'Wed Jan 04 09:13:18 IST 2023'),
('Present', 'Present', '16', 'Wed Jan 04 09:13:23 IST 2023'),
('Absent', 'Present', '06', 'Wed Jan 04 09:16:07 IST 2023'),
('Present', 'Absent', '09', 'Wed Jan 04 09:16:39 IST 2023'),
('Absent', 'Absent', '15', 'Wed Jan 04 09:16:48 IST 2023'),
('Present', 'Present', '16', 'Wed Jan 04 09:16:59 IST 2023');

-- --------------------------------------------------------

--
-- Table structure for table `attendance_teacher`
--

CREATE TABLE `attendance_teacher` (
  `emp_id` varchar(20) NOT NULL,
  `date` varchar(40) NOT NULL,
  `first` varchar(20) DEFAULT NULL,
  `second` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendance_teacher`
--

INSERT INTO `attendance_teacher` (`emp_id`, `date`, `first`, `second`) VALUES
('30211001', 'Thu Jan 05 08:35:31 IST 2023', 'Present', 'Absent'),
('30205002', 'Wed Jan 04 09:15:34 IST 2023', 'Present', 'Present'),
('30208011', 'Wed Jan 04 09:15:42 IST 2023', 'Absent', 'Present'),
('30209004', 'Wed Jan 04 09:15:49 IST 2023', 'Absent', 'Absent'),
('30205002', 'Wed Jan 04 09:17:08 IST 2023', 'Present', 'Present'),
('30208011', 'Wed Jan 04 09:17:17 IST 2023', 'Absent', 'Absent'),
('30209004', 'Wed Jan 04 09:17:29 IST 2023', 'Present', 'Present');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `roll` varchar(20) NOT NULL,
  `marks1` varchar(3) DEFAULT NULL,
  `marks2` varchar(3) DEFAULT NULL,
  `marks3` varchar(3) DEFAULT NULL,
  `marks4` varchar(3) DEFAULT NULL,
  `marks5` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`roll`, `marks1`, `marks2`, `marks3`, `marks4`, `marks5`) VALUES
('06', '92', '95', '85', '82', '84'),
('09', '89', '77', '96', '93', '86'),
('11', '85', '94', '90', '96', '82'),
('15', '83', '93', '82', '89', '96'),
('17', '89', '92', '84', '90', '88');

-- --------------------------------------------------------

--
-- Table structure for table `sign_up`
--

CREATE TABLE `sign_up` (
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sign_up`
--

INSERT INTO `sign_up` (`username`, `password`) VALUES
('admin', 'Ankit@SPEC22'),
('AnkitHR', 'ankitHR.123'),
('HR', 'Ad.1234');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `name` varchar(50) NOT NULL,
  `fathers_name` varchar(50) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `age` varchar(5) NOT NULL,
  `aadhar` varchar(12) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `class_x` varchar(10) NOT NULL,
  `class_xii` varchar(10) NOT NULL,
  `phone` varchar(14) NOT NULL,
  `roll` varchar(20) NOT NULL,
  `course` varchar(10) DEFAULT NULL,
  `branch` varchar(30) DEFAULT NULL,
  `address` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`name`, `fathers_name`, `dob`, `age`, `aadhar`, `email`, `class_x`, `class_xii`, `phone`, `roll`, `course`, `branch`, `address`) VALUES
('Amiyendra Sarkar', 'Abhimanyu Sarkar', '19/07/2002', '20', '987612634781', 'amiyendra1907@gmail.com', '88', '84', '9977663245', '06', '---', '---', 'Tikarhat,  Ambagan, Burdwan-713102'),
('Atrij Saha', 'Arpan Saha', '19/10/2005', '17', '898921125364', 'atrij2017@gmail.com', '87', '90', '9233266144', '09', 'M. Tech', 'CSE', 'Tikarhat, Burdwan - 713102'),
('Ankit Saha', 'Dilip Kumar Saha', '28/01/2002', '21', '430620751443', 'ankit.saha2020@uem.edu.in', '95', '96.4', '8371923516', '11', 'B. Tech', 'CSE', 'ChotoNilpur, Burdwan - 713103'),
('Atanu Sana', 'Mrinal Kanti Sana', '02/03/2001', '21', '888871812903', 'a_sana@uem.edu.in', '94', '92', '8714070765', '15', 'B. Tech', 'EEE', 'Goshpara, Tarakeshwar-712103');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `roll` varchar(20) NOT NULL,
  `sub1` varchar(30) NOT NULL,
  `sub2` varchar(30) NOT NULL,
  `sub3` varchar(30) NOT NULL,
  `sub4` varchar(30) NOT NULL,
  `sub5` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`roll`, `sub1`, `sub2`, `sub3`, `sub4`, `sub5`) VALUES
('06', 'DSA', 'Engineering Maths', 'IT Workshop', 'UHV', 'LaTeX'),
('09', 'DSA', 'DAA', 'AIML', 'OS', 'UHV'),
('11', 'Computer Networks', 'DBMS', 'Automata', 'OOPs using Java', 'UHV'),
('15', 'DSA', 'Engineering Maths', 'Analog Electronics', 'UHV', 'Digital Electronics'),
('17', 'DSA', 'Maths', 'AIML', 'Cloud', 'UHV');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `name` varchar(50) NOT NULL,
  `fathers_name` varchar(50) NOT NULL,
  `age` varchar(3) NOT NULL,
  `dob` varchar(20) NOT NULL,
  `address` varchar(60) DEFAULT NULL,
  `phone` varchar(14) NOT NULL,
  `email` varchar(40) NOT NULL,
  `class_x` varchar(5) DEFAULT NULL,
  `class_xii` varchar(5) DEFAULT NULL,
  `emp_id` varchar(20) NOT NULL,
  `aadhar` varchar(13) DEFAULT NULL,
  `dept` varchar(20) NOT NULL,
  `course` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`name`, `fathers_name`, `age`, `dob`, `address`, `phone`, `email`, `class_x`, `class_xii`, `emp_id`, `aadhar`, `dept`, `course`) VALUES
('Avijit Nemu', 'Darakewar Nemu', '45', '09/08/1987', 'Shyambazar, Kolkata-700005', '9229911144', 'an.1987@uem.edu.in', '93', '91', '30205002', '607410732324', 'BCA-CS', 'BCA'),
('Varsha Poddar', 'Varun Poddar', '38', '06/07/1993', 'Sector III, Salt Lake, Kolkata', '7856341982', 'vp@uem.edu.in', '90', '82', '30208011', '181800019909', 'CSE', 'M. Tech'),
('Kaushik Roy', 'Nilikanto Roy', '47', '04/12/1985', 'Burirbagan, Burdwan', '8765230912', 'kaushik1985@gmail.com', '92', '89', '30209004', '223344887766', 'CSE', 'B. Tech'),
('Monalisa Dawn', 'Rajesh Dawn', '46', '14/06/1986', 'Bhangakuthir, Burdwan - 713101', '7811016698', 'mona.dawn1986@gmail.com', '89', '92', '30211001', '234598214576', 'BCA-CS', 'BCA');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `attendance_stud`
--
ALTER TABLE `attendance_stud`
  ADD PRIMARY KEY (`date`);

--
-- Indexes for table `attendance_teacher`
--
ALTER TABLE `attendance_teacher`
  ADD PRIMARY KEY (`date`);

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `sign_up`
--
ALTER TABLE `sign_up`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`roll`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`emp_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
