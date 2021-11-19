-- MySQL dump 10.17  Distrib 10.3.16-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: klaussbrass
-- ------------------------------------------------------
-- Server version	10.3.16-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombreCategoria` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'productos ferreteria'),(2,'armado de piezas'),(3,'soluciones metal mecanicas'),(4,'elementos contundentes');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cotdemandada`
--

DROP TABLE IF EXISTS `cotdemandada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cotdemandada` (
  `idcotDemandada` int(11) NOT NULL AUTO_INCREMENT,
  `nombreDemanda` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `productobuscado` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `cantidades` double NOT NULL,
  `detalles` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idcotDemandada`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cotdemandada`
--

LOCK TABLES `cotdemandada` WRITE;
/*!40000 ALTER TABLE `cotdemandada` DISABLE KEYS */;
/*!40000 ALTER TABLE `cotdemandada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cotofertada`
--

DROP TABLE IF EXISTS `cotofertada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cotofertada` (
  `idcotOfertada` int(11) NOT NULL AUTO_INCREMENT,
  `cotDemandada` int(11) NOT NULL,
  `prov_empresa_RUC` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idcotOfertada`),
  KEY `fk_cotOfertada_cotDemandada1` (`cotDemandada`),
  KEY `fk_cotOfertada_prov_empresa1` (`prov_empresa_RUC`),
  CONSTRAINT `fk_cotOfertada_cotDemandada1` FOREIGN KEY (`cotDemandada`) REFERENCES `cotdemandada` (`idcotDemandada`),
  CONSTRAINT `fk_cotOfertada_prov_empresa1` FOREIGN KEY (`prov_empresa_RUC`) REFERENCES `prov_empresa` (`RUC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cotofertada`
--

LOCK TABLES `cotofertada` WRITE;
/*!40000 ALTER TABLE `cotofertada` DISABLE KEYS */;
/*!40000 ALTER TABLE `cotofertada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criteriocalidad`
--

DROP TABLE IF EXISTS `criteriocalidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `criteriocalidad` (
  `idcriterioCalidad` int(11) NOT NULL AUTO_INCREMENT,
  `nombreCrit` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `esAceptable` tinyint(4) NOT NULL,
  `idProduccion` int(11) NOT NULL,
  `IDInspector` int(11) DEFAULT NULL,
  `observacion` varchar(70) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idcriterioCalidad`),
  KEY `fk_criterioCalidad_Produccion1` (`idProduccion`),
  KEY `fk_inspector_cc` (`IDInspector`),
  CONSTRAINT `fk_criterioCalidad_Produccion1` FOREIGN KEY (`idProduccion`) REFERENCES `produccion` (`idProduccion`),
  CONSTRAINT `fk_inspector_cc` FOREIGN KEY (`IDInspector`) REFERENCES `usuario` (`idUser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criteriocalidad`
--

LOCK TABLES `criteriocalidad` WRITE;
/*!40000 ALTER TABLE `criteriocalidad` DISABLE KEYS */;
INSERT INTO `criteriocalidad` VALUES (1,'la base debe estar lisa',0,1,7,'aun no es revizada por algun inspector'),(2,'la goma debe ser de alta calidad',0,1,NULL,'aun no es revizada por algun inspector'),(7,'crit 7',0,5,NULL,'aun no es revizada por algun inspector'),(8,'crit 8',0,5,NULL,'aun no es revizada por algun inspector'),(9,'crit 9',0,5,NULL,'aun no es revizada por algun inspector'),(10,'crit 10',0,5,NULL,'aun no es revizada por algun inspector'),(11,'cri 200',0,6,16,'aun no es revizada por algun inspector'),(12,'crit 201',0,6,16,'aun no es revizada por algun inspector'),(13,'crit 300',0,4,15,'aun no es revizada por algun inspector'),(14,'crit 301',0,4,15,'aun no es revizada por algun inspector'),(15,'crit 302',0,4,15,'aun no es revizada por algun inspector');
/*!40000 ALTER TABLE `criteriocalidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT,
  `costoUnit` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `unidades` double DEFAULT NULL,
  `descripcion` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `RUC` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `monto_total` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `registro_pagos_idregistro_pagos` int(11) NOT NULL,
  PRIMARY KEY (`idFactura`),
  KEY `fk_Factura_registro_pagos1` (`registro_pagos_idregistro_pagos`),
  CONSTRAINT `fk_Factura_registro_pagos1` FOREIGN KEY (`registro_pagos_idregistro_pagos`) REFERENCES `registro_pagos` (`idregistro_pagos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ganancia`
--

DROP TABLE IF EXISTS `ganancia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ganancia` (
  `idGanancia` int(11) NOT NULL AUTO_INCREMENT,
  `idProduccion` int(11) NOT NULL,
  `RUC_emp_pagadora` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `monto_final` double NOT NULL,
  `fecha_pago` date DEFAULT NULL,
  `detalles` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `registro_pagos_idregistro_pagos` int(11) DEFAULT NULL,
  `codOperacion` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idGanancia`),
  KEY `fk_Ganancia_Produccion1` (`idProduccion`),
  KEY `fk_Ganancia_registro_pagos1` (`registro_pagos_idregistro_pagos`),
  CONSTRAINT `fk_Ganancia_Produccion1` FOREIGN KEY (`idProduccion`) REFERENCES `produccion` (`idProduccion`),
  CONSTRAINT `fk_Ganancia_registro_pagos1` FOREIGN KEY (`registro_pagos_idregistro_pagos`) REFERENCES `registro_pagos` (`idregistro_pagos`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ganancia`
--

LOCK TABLES `ganancia` WRITE;
/*!40000 ALTER TABLE `ganancia` DISABLE KEYS */;
INSERT INTO `ganancia` VALUES (1,1,'',56633,'2021-02-03','pago hecho por atencion al cliente. no hay observaciones',NULL,'Scotiabank');
/*!40000 ALTER TABLE `ganancia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gastosfijos`
--

DROP TABLE IF EXISTS `gastosfijos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gastosfijos` (
  `idgastosFijos` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `monto` double NOT NULL,
  `ruc_gf` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `nombre_gf` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `raz_social_gf` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `registro_pagos_idregistro_pagos` int(11) NOT NULL,
  PRIMARY KEY (`idgastosFijos`),
  KEY `fk_gastosFijos_registro_pagos1` (`registro_pagos_idregistro_pagos`),
  CONSTRAINT `fk_gastosFijos_registro_pagos1` FOREIGN KEY (`registro_pagos_idregistro_pagos`) REFERENCES `registro_pagos` (`idregistro_pagos`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gastosfijos`
--

LOCK TABLES `gastosfijos` WRITE;
/*!40000 ALTER TABLE `gastosfijos` DISABLE KEYS */;
/*!40000 ALTER TABLE `gastosfijos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guiaremision`
--

DROP TABLE IF EXISTS `guiaremision`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guiaremision` (
  `idGuiaRemision` int(11) NOT NULL AUTO_INCREMENT,
  `tipoProducto` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `DescripcionProducto` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Cantidad` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Peso` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `prov_empresa_RUC` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idGuiaRemision`),
  KEY `fk_GuiaRemision_prov_empresa1` (`prov_empresa_RUC`),
  CONSTRAINT `fk_GuiaRemision_prov_empresa1` FOREIGN KEY (`prov_empresa_RUC`) REFERENCES `prov_empresa` (`RUC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guiaremision`
--

LOCK TABLES `guiaremision` WRITE;
/*!40000 ALTER TABLE `guiaremision` DISABLE KEYS */;
/*!40000 ALTER TABLE `guiaremision` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guiaremision_has_producto`
--

DROP TABLE IF EXISTS `guiaremision_has_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guiaremision_has_producto` (
  `id_gr_r` int(11) NOT NULL AUTO_INCREMENT,
  `GuiaRemision_idGuiaRemision` int(11) NOT NULL,
  `Producto_idProducto` int(11) NOT NULL,
  PRIMARY KEY (`id_gr_r`),
  KEY `fk_GuiaRemision_has_Producto_GuiaRemision1` (`GuiaRemision_idGuiaRemision`),
  KEY `fk_GuiaRemision_has_Producto_Producto1` (`Producto_idProducto`),
  CONSTRAINT `fk_GuiaRemision_has_Producto_GuiaRemision1` FOREIGN KEY (`GuiaRemision_idGuiaRemision`) REFERENCES `guiaremision` (`idGuiaRemision`),
  CONSTRAINT `fk_GuiaRemision_has_Producto_Producto1` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guiaremision_has_producto`
--

LOCK TABLES `guiaremision_has_producto` WRITE;
/*!40000 ALTER TABLE `guiaremision_has_producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `guiaremision_has_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kardex`
--

DROP TABLE IF EXISTS `kardex`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kardex` (
  `idkardex` int(11) NOT NULL AUTO_INCREMENT,
  `elem_totales` int(11) NOT NULL,
  PRIMARY KEY (`idkardex`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kardex`
--

LOCK TABLES `kardex` WRITE;
/*!40000 ALTER TABLE `kardex` DISABLE KEYS */;
INSERT INTO `kardex` VALUES (1,10),(2,15),(3,25);
/*!40000 ALTER TABLE `kardex` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operarioproduccion`
--

DROP TABLE IF EXISTS `operarioproduccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operarioproduccion` (
  `idOP` int(11) NOT NULL AUTO_INCREMENT,
  `iduser` int(11) NOT NULL,
  `idProduccion` int(11) NOT NULL,
  `rol` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idOP`),
  KEY `fk_operarioProduccion_usuario` (`iduser`),
  KEY `fk_operarioProduccion_produccion` (`idProduccion`),
  CONSTRAINT `fk_operarioProduccion_produccion` FOREIGN KEY (`idProduccion`) REFERENCES `produccion` (`idProduccion`),
  CONSTRAINT `fk_operarioProduccion_usuario` FOREIGN KEY (`iduser`) REFERENCES `usuario` (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operarioproduccion`
--

LOCK TABLES `operarioproduccion` WRITE;
/*!40000 ALTER TABLE `operarioproduccion` DISABLE KEYS */;
INSERT INTO `operarioproduccion` VALUES (1,1,1,'branding de marca'),(2,4,1,'gestion de aleatoriedad'),(3,5,1,'esculpir'),(8,2,4,'rol 1'),(9,5,5,'rol 12'),(10,1,5,'rol 15'),(11,3,6,'rol 100'),(12,4,6,'');
/*!40000 ALTER TABLE `operarioproduccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produccion`
--

DROP TABLE IF EXISTS `produccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produccion` (
  `idProduccion` int(11) NOT NULL AUTO_INCREMENT,
  `idCategoria` int(11) NOT NULL,
  `idrequerimiento` int(11) NOT NULL,
  `fechaProduccion` date NOT NULL,
  `urgencia` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `estadoProduccion` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idProduccion`),
  KEY `fk_Produccion_Categoria1` (`idCategoria`),
  KEY `fk_Produccion_requerimiento1` (`idrequerimiento`),
  CONSTRAINT `fk_Produccion_Categoria1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`),
  CONSTRAINT `fk_Produccion_requerimiento1` FOREIGN KEY (`idrequerimiento`) REFERENCES `requerimiento` (`idrequerimiento`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produccion`
--

LOCK TABLES `produccion` WRITE;
/*!40000 ALTER TABLE `produccion` DISABLE KEYS */;
INSERT INTO `produccion` VALUES (1,4,3,'2021-02-20','urgente','Pagado'),(4,4,8,'2021-12-07','urgente','en Produccion'),(5,4,1,'2021-12-12','urgente','en Produccion'),(6,3,4,'2021-10-31','Muy urgente','en Produccion');
/*!40000 ALTER TABLE `produccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `tipoProducto` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `descripcion` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `esAceptado` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `kardex` int(11) NOT NULL,
  `cotOfertada` int(11) NOT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `fk_Producto_kardex1` (`kardex`),
  KEY `fk_Producto_cotOfertada1` (`cotOfertada`),
  CONSTRAINT `fk_Producto_cotOfertada1` FOREIGN KEY (`cotOfertada`) REFERENCES `cotofertada` (`idcotOfertada`),
  CONSTRAINT `fk_Producto_kardex1` FOREIGN KEY (`kardex`) REFERENCES `kardex` (`idkardex`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto_has_produccion`
--

DROP TABLE IF EXISTS `producto_has_produccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto_has_produccion` (
  `id_pp` int(11) NOT NULL AUTO_INCREMENT,
  `Producto_idProducto` int(11) NOT NULL,
  `Produccion_idProduccion` int(11) NOT NULL,
  PRIMARY KEY (`id_pp`),
  KEY `fk_Producto_has_Produccion_Producto1` (`Producto_idProducto`),
  KEY `fk_Producto_has_Produccion_Produccion1` (`Produccion_idProduccion`),
  CONSTRAINT `fk_Producto_has_Produccion_Produccion1` FOREIGN KEY (`Produccion_idProduccion`) REFERENCES `produccion` (`idProduccion`),
  CONSTRAINT `fk_Producto_has_Produccion_Producto1` FOREIGN KEY (`Producto_idProducto`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto_has_produccion`
--

LOCK TABLES `producto_has_produccion` WRITE;
/*!40000 ALTER TABLE `producto_has_produccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto_has_produccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prov_empresa`
--

DROP TABLE IF EXISTS `prov_empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prov_empresa` (
  `RUC` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `idUser` int(11) NOT NULL,
  `Rubro` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `Razon_Social` varchar(40) COLLATE utf8_spanish_ci NOT NULL,
  `Telefono` int(11) NOT NULL,
  PRIMARY KEY (`RUC`),
  KEY `prov_empresa_ibfk_1` (`idUser`),
  CONSTRAINT `prov_empresa_ibfk_1` FOREIGN KEY (`idUser`) REFERENCES `usuario` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prov_empresa`
--

LOCK TABLES `prov_empresa` WRITE;
/*!40000 ALTER TABLE `prov_empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `prov_empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro_pagos`
--

DROP TABLE IF EXISTS `registro_pagos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registro_pagos` (
  `idregistro_pagos` int(11) NOT NULL AUTO_INCREMENT,
  `dia` date NOT NULL,
  `tipo_reg_pago` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `idacta_contable` int(11) NOT NULL,
  PRIMARY KEY (`idregistro_pagos`),
  KEY `fk_registro_pagos_acta_contable1` (`idacta_contable`),
  CONSTRAINT `fk_registro_pagos_acta_contable1` FOREIGN KEY (`idacta_contable`) REFERENCES `acta_contable` (`idacta_contable`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro_pagos`
--

LOCK TABLES `registro_pagos` WRITE;
/*!40000 ALTER TABLE `registro_pagos` DISABLE KEYS */;
/*!40000 ALTER TABLE `registro_pagos` ENABLE KEYS */;
UNLOCK TABLES;

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-30  9:50:23
