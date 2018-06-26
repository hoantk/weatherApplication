-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: weather
-- ------------------------------------------------------
-- Server version	5.6.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `city` (
  `id` varchar(10) NOT NULL,
  `city_name` varchar(255) NOT NULL,
  `country_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES ('1581130','Ha Noi','VN'),('1880252','Singapore','MY'),('2643743','London','GB'),('6058560','London','CA');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weather_city`
--

DROP TABLE IF EXISTS `weather_city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weather_city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city_id` varchar(10) NOT NULL,
  `city_icon` varchar(45) DEFAULT NULL,
  `city_temperature` varchar(45) DEFAULT NULL,
  `city_pressure` varchar(45) DEFAULT NULL,
  `city_wind` varchar(45) DEFAULT NULL,
  `city_cloud` varchar(45) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `city_status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weather_city`
--

LOCK TABLES `weather_city` WRITE;
/*!40000 ALTER TABLE `weather_city` DISABLE KEYS */;
INSERT INTO `weather_city` VALUES (14,'1880252','09d','301.11','1008','2.1','75','2018-06-26 00:00:00',NULL),(32,'1581130','03d','303.15','1005','3.6','40','2018-06-26 00:00:00',NULL),(35,'2643743','01d','296.65','1027','3.1','0','2018-06-26 00:00:00',NULL),(36,'6058560','04d','284.15','1023','1.5','75','2018-06-26 00:00:00',NULL);
/*!40000 ALTER TABLE `weather_city` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-26 17:53:36
