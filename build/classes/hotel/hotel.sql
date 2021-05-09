-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 29, 2019 at 06:00 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `akunclient`
--

CREATE TABLE `akunclient` (
  `nama` varchar(25) NOT NULL,
  `username` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(15) NOT NULL,
  `konfirmasi_pass` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `akunclient`
--

INSERT INTO `akunclient` (`nama`, `username`, `email`, `password`, `konfirmasi_pass`) VALUES
('danti', 'danti', 'danti@gmail.com', 'danti', 'danti'),
('fhrezha', 'fhrezha', 'fhrezha@gmail.com', 'fhrezha', 'fhrezha'),
('murah', 'murah', 'murah@mail.com', '123456', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `username` varchar(25) NOT NULL,
  `no_ktp` varchar(16) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_hp` varchar(12) NOT NULL,
  `jenis_kamar` varchar(20) NOT NULL,
  `tgl_masuk` varchar(20) NOT NULL,
  `tgl_keluar` varchar(20) NOT NULL,
  `total` int(11) NOT NULL,
  `status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`username`, `no_ktp`, `nama`, `alamat`, `no_hp`, `jenis_kamar`, `tgl_masuk`, `tgl_keluar`, `total`, `status`) VALUES
('murah', '123170046', 'muhammad ravi', 'tangerang', '087837123865', 'Family Room', '2019-04-01', '2019-04-06', 2500000, 'Check In'),
('danti', '123170048', 'judanti cahyaningtyas', 'depok', '087654326789', 'Family Room', '2019-05-01', '2019-05-10', 4500000, '-'),
('murah', '123170001', 'gina', 'palembang', '088888', 'Double Room', '2019-04-29', '2019-04-30', 400000, '-'),
('fhrezha', '123170044', 'fhrezha', 'magelang', '08999999', 'Single Room', '2019-04-16', '2019-04-30', 3500000, '-'),
('fhrezha', '123170013', 'silmi', 'banjarnegara', '087898088', 'Single Room', '2019-04-28', '2019-04-30', 500000, '-'),
('fhrezha', '123170005', 'habib', 'depok', '08765436', 'Single Room', '2019-04-10', '2019-04-30', 5000000, '-'),
('danti', '123170014', 'danti', 'depok', '08759485948', 'Double Room', '2019-04-27', '2019-04-30', 1200000, '-'),
('danti', '123170067', 'anggita', 'tegal', '088796867', 'Double Room', '2019-04-24', '2019-04-28', 1600000, '-'),
('danti', '123170059', 'azam', 'solo', '9876867855', 'Double Room', '2019-04-29', '2019-04-30', 400000, '-'),
('danti', '123170061', 'cempe', 'yogyakarta', '08765876', 'Family Room', '2019-04-29', '2019-04-30', 500000, '-');

-- --------------------------------------------------------

--
-- Table structure for table `check_kamar`
--

CREATE TABLE `check_kamar` (
  `jenis_kamar` varchar(20) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `check_kamar`
--

INSERT INTO `check_kamar` (`jenis_kamar`, `stok`) VALUES
('Double Room', 47),
('Family Room ', 50),
('Single Room', 55);

-- --------------------------------------------------------

--
-- Table structure for table `loginadmin`
--

CREATE TABLE `loginadmin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `loginadmin`
--

INSERT INTO `loginadmin` (`username`, `password`) VALUES
('upnhomestay', 'upnhomestay');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `akunclient`
--
ALTER TABLE `akunclient`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD KEY `fkusername` (`username`),
  ADD KEY `fkjenis_kamar` (`jenis_kamar`);

--
-- Indexes for table `check_kamar`
--
ALTER TABLE `check_kamar`
  ADD PRIMARY KEY (`jenis_kamar`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `fkjenis_kamar` FOREIGN KEY (`jenis_kamar`) REFERENCES `check_kamar` (`jenis_kamar`),
  ADD CONSTRAINT `fkusername` FOREIGN KEY (`username`) REFERENCES `akunclient` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
