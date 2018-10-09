CREATE DATABASE  IF NOT EXISTS `ipl` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ipl`;
-- MySQL dump 10.13  Distrib 5.6.13, for osx10.6 (i386)
--
-- Host: 127.0.0.1    Database: ipl
-- ------------------------------------------------------
-- Server version	5.7.9

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
-- Table structure for table `match_schedule`
--

DROP TABLE IF EXISTS `match_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `match_schedule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `against_team` varchar(255) DEFAULT NULL,
  `match_schedule_date` datetime DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `venue_team` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `match_schedule`
--

LOCK TABLES `match_schedule` WRITE;
/*!40000 ALTER TABLE `match_schedule` DISABLE KEYS */;
/*!40000 ALTER TABLE `match_schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teams`
--

DROP TABLE IF EXISTS `teams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teams` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `team_name` varchar(255) DEFAULT NULL,
  `team_venue` varchar(255) DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teams`
--

LOCK TABLES `teams` WRITE;
/*!40000 ALTER TABLE `teams` DISABLE KEYS */;
INSERT INTO `teams` VALUES (2,'jitendra','2018-10-09 17:39:59','India','India',NULL,NULL),(3,'jitendra','2018-10-09 17:40:25','Nez','Nez',NULL,NULL),(4,'jitendra','2018-10-09 17:40:33','Aus','Aus',NULL,NULL),(5,'jitendra','2018-10-09 17:40:41','Sa','Sa',NULL,NULL),(6,'jitendra','2018-10-09 17:40:48','Wes','Wes',NULL,NULL),(7,'jitendra','2018-10-09 17:41:00','Pak','Pak',NULL,NULL),(8,'jitendra','2018-10-09 17:41:12','zam','zam',NULL,NULL),(9,'jitendra','2018-10-09 17:41:53','Bang','Bang',NULL,NULL),(10,'jitendra','2018-10-09 17:42:01','AFG','AFG',NULL,NULL);
/*!40000 ALTER TABLE `teams` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-10-09 20:40:18
