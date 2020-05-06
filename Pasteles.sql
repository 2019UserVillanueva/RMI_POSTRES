-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         5.7.24 - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para pasteles
DROP DATABASE IF EXISTS `pasteles`;
CREATE DATABASE IF NOT EXISTS `pasteles` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `pasteles`;

-- Volcando estructura para tabla pasteles.carrito
DROP TABLE IF EXISTS `carrito`;
CREATE TABLE IF NOT EXISTS `carrito` (
  `idCarrito` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuario` int(11) DEFAULT NULL,
  `Pedidos` varchar(1500) DEFAULT NULL,
  PRIMARY KEY (`idCarrito`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla pasteles.carrito: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `carrito` DISABLE KEYS */;
INSERT INTO `carrito` (`idCarrito`, `idUsuario`, `Pedidos`) VALUES
	(1, 1, '6.10'),
	(2, 2, '6.2'),
	(3, 3, '1.2'),
	(4, 2, '2.5'),
	(5, 2, '3.6'),
	(6, 5, '4.5'),
	(7, 3, '4.2'),
	(8, 1, '1.3'),
	(9, 1, '1.2');
/*!40000 ALTER TABLE `carrito` ENABLE KEYS */;

-- Volcando estructura para tabla pasteles.productos
DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `idProductos` int(11) NOT NULL AUTO_INCREMENT,
  `IdSabor` varchar(50) NOT NULL DEFAULT '0',
  `Nombre` varchar(45) DEFAULT NULL,
  `IdTiend` int(11) DEFAULT NULL,
  `IdTipo` varchar(50) DEFAULT NULL,
  `Descripcion` varchar(200) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  `Precio` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idProductos`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla pasteles.productos: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` (`idProductos`, `IdSabor`, `Nombre`, `IdTiend`, `IdTipo`, `Descripcion`, `stock`, `Precio`) VALUES
	(1, 'Chocolate', 'Choclate en barra', 1, 'Helado', 'asdg', 4, '100'),
	(2, 'Chocolate', 'Chocoflan', 1, '3', 'un chocoflan del tamaño de un bolillo', 4, '15'),
	(3, 'Cafe', 'cup coffe', 1, 'CupCake', 'wqasdfr', 8, '78'),
	(4, 'Moca', 'PastelChocolate', 1, 'Pastel', 'fasdglhnjkfasdljkhsdflhjkfsdhjklfsdglh,jkbvfdzgjkb', 7, '150'),
	(5, 'Chocolate', 'Chocolate con piña', 1, 'Helado', 'es nun helado con chocolate y ytrozos de piñña para aunmentar la diabetes en campeche', 7, '98'),
	(6, 'Vainilla', 'asdasd', 1, 'CupCake', 'asdfgdfhgsfgn', 7, '8');
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;

-- Volcando estructura para tabla pasteles.sabor
DROP TABLE IF EXISTS `sabor`;
CREATE TABLE IF NOT EXISTS `sabor` (
  `idSabor` int(11) NOT NULL AUTO_INCREMENT,
  `Sabor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idSabor`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla pasteles.sabor: ~8 rows (aproximadamente)
/*!40000 ALTER TABLE `sabor` DISABLE KEYS */;
INSERT INTO `sabor` (`idSabor`, `Sabor`) VALUES
	(1, 'Chocolate'),
	(2, 'Tres Leche'),
	(3, 'Vainilla'),
	(4, 'Moca'),
	(5, 'Zanahoria'),
	(6, 'Piña'),
	(7, 'Cafe'),
	(8, 'Fresa');
/*!40000 ALTER TABLE `sabor` ENABLE KEYS */;

-- Volcando estructura para tabla pasteles.tienda
DROP TABLE IF EXISTS `tienda`;
CREATE TABLE IF NOT EXISTS `tienda` (
  `idTienda` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Correo` varchar(45) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idTienda`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla pasteles.tienda: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `tienda` DISABLE KEYS */;
INSERT INTO `tienda` (`idTienda`, `Nombre`, `Direccion`, `Telefono`, `Correo`, `Password`) VALUES
	(1, 'Heriel', 'Conocido Tenabo', '9818183676', 'minaám', 'hola'),
	(2, 'Store', 'Campeche', '9811590196', 'Campeche@hotmail.com', 'hello');
/*!40000 ALTER TABLE `tienda` ENABLE KEYS */;

-- Volcando estructura para tabla pasteles.tipo
DROP TABLE IF EXISTS `tipo`;
CREATE TABLE IF NOT EXISTS `tipo` (
  `idTipo` int(11) NOT NULL AUTO_INCREMENT,
  `tipodepostre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla pasteles.tipo: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `tipo` DISABLE KEYS */;
INSERT INTO `tipo` (`idTipo`, `tipodepostre`) VALUES
	(1, 'Pastel'),
	(2, 'CupCake'),
	(3, 'Pan');
/*!40000 ALTER TABLE `tipo` ENABLE KEYS */;

-- Volcando estructura para tabla pasteles.usuario
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `Nombres` varchar(45) DEFAULT NULL,
  `Apellidos` varchar(45) DEFAULT NULL,
  `Direccion` varchar(200) DEFAULT NULL,
  `Correo` varchar(100) DEFAULT NULL,
  `Password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla pasteles.usuario: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` (`idUsuario`, `Nombres`, `Apellidos`, `Direccion`, `Correo`, `Password`) VALUES
	(1, 'Oscar', 'De La Cruz', 'Connocido', 'p4s3or@gmail.com', 'Oscar'),
	(2, 'Jonathan', 'De La Cruz', 'Santa Rosa', 'gabrielito15@hotmail.com', 'Jonathan'),
	(3, 'Alma', 'Mex', 'Tinun', 'al053969@uacam.mx', 'Alma'),
	(4, 'Noemi', 'Zenith', 'Tenabo', NULL, 'Noemi'),
	(6, 'Aaron', 'Ek', 'Con sus padres', 'No tiene', 'Aaron');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
