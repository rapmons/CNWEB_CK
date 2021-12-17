-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2021 at 09:34 AM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test999`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(100) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `password`) VALUES
('123', '123');

-- --------------------------------------------------------

--
-- Table structure for table `benh`
--

CREATE TABLE `benh` (
  `MaBenh` int(11) NOT NULL,
  `TenBenh` text NOT NULL,
  `Mota` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE `khachhang` (
  `MaKH` int(11) NOT NULL,
  `HoTenKH` text NOT NULL,
  `SoDienThoai` text NOT NULL,
  `DiaChiKH` text NOT NULL,
  `NgaySinh` date NOT NULL,
  `GioiTinh` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `lichsutiemphong`
--

CREATE TABLE `lichsutiemphong` (
  `MaKH` int(11) NOT NULL,
  `MaVacXin` int(11) NOT NULL,
  `STTMui` int(11) NOT NULL,
  `Ngaytiemphong` date NOT NULL,
  `Ngayhentieptiep` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `phongbenh`
--

CREATE TABLE `phongbenh` (
  `MaVacXin` int(11) NOT NULL,
  `MaBenh` int(11) NOT NULL,
  `ghichu` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `vacxin`
--

CREATE TABLE `vacxin` (
  `MaVacXin` int(11) NOT NULL,
  `TenVacXin` text NOT NULL,
  `Mota` text NOT NULL,
  `GiaVacXin` float NOT NULL,
  `TenHangSX` text NOT NULL,
  `SoMui` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `benh`
--
ALTER TABLE `benh`
  ADD KEY `MaBenh` (`MaBenh`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`MaKH`);

--
-- Indexes for table `lichsutiemphong`
--
ALTER TABLE `lichsutiemphong`
  ADD KEY `MaKH` (`MaKH`),
  ADD KEY `MaVacXin` (`MaVacXin`);

--
-- Indexes for table `phongbenh`
--
ALTER TABLE `phongbenh`
  ADD PRIMARY KEY (`MaBenh`),
  ADD KEY `MaVacXin` (`MaVacXin`);

--
-- Indexes for table `vacxin`
--
ALTER TABLE `vacxin`
  ADD PRIMARY KEY (`MaVacXin`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `benh`
--
ALTER TABLE `benh`
  ADD CONSTRAINT `benh_ibfk_1` FOREIGN KEY (`MaBenh`) REFERENCES `phongbenh` (`MaBenh`);

--
-- Constraints for table `lichsutiemphong`
--
ALTER TABLE `lichsutiemphong`
  ADD CONSTRAINT `lichsutiemphong_ibfk_1` FOREIGN KEY (`MaKH`) REFERENCES `khachhang` (`MaKH`),
  ADD CONSTRAINT `lichsutiemphong_ibfk_2` FOREIGN KEY (`MaVacXin`) REFERENCES `vacxin` (`MaVacXin`);

--
-- Constraints for table `phongbenh`
--
ALTER TABLE `phongbenh`
  ADD CONSTRAINT `phongbenh_ibfk_1` FOREIGN KEY (`MaVacXin`) REFERENCES `vacxin` (`MaVacXin`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
