-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.17-log - MySQL Community Server (GPL)
-- Server OS:                    Win32
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping data for table loginpage.userdetails: ~4 rows (approximately)
DELETE FROM `userdetails`;
/*!40000 ALTER TABLE `userdetails` DISABLE KEYS */;
INSERT INTO `userdetails` (`name`, `email`, `username`, `password`) VALUES
	('Aladin', 'ali.000000786@gmail.com', 'user1', 'u@111'),
	('Manisha', 'manisha.avula@gmail.com', 'user2', 'u@222'),
	('Shasiraj', 'shasiraj@gmail.com', 'user3', 'u@333'),
	('Devan', 'Devan@gmail.com', 'user4', 'u@444');
/*!40000 ALTER TABLE `userdetails` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
