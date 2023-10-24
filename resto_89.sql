-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-10-2023 a las 15:45:04
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `resto_89`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `idProducto` int(60) NOT NULL,
  `idMesero` int(11) NOT NULL,
  `idMesa` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `nroPedido` int(60) NOT NULL,
  `cantidadProducto` int(60) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `idProducto`, `idMesero`, `idMesa`, `estado`, `nroPedido`, `cantidadProducto`, `fecha`, `hora`) VALUES
(5, 7, 3, 1, 0, 0, 0, NULL, NULL),
(6, 6, 3, 1, 1, 1, 0, NULL, NULL),
(7, 6, 3, 1, 1, 2, 0, NULL, NULL),
(8, 7, 3, 1, 1, 2, 0, NULL, NULL),
(9, 7, 3, 1, 1, 2, 0, NULL, NULL),
(10, 7, 3, 7, 1, 3, 0, NULL, NULL),
(11, 7, 3, 7, 1, 3, 0, NULL, NULL),
(12, 7, 3, 1, 1, 4, 0, NULL, NULL),
(13, 6, 3, 1, 1, 4, 0, NULL, NULL),
(14, 7, 3, 1, 1, 4, 0, NULL, NULL),
(15, 7, 3, 1, 0, 5, 0, NULL, NULL),
(16, 7, 3, 1, 0, 5, 0, NULL, NULL),
(17, 6, 3, 1, 0, 5, 0, NULL, NULL),
(18, 7, 3, 1, 1, 6, 0, NULL, NULL),
(19, 8, 2, 1, 0, 7, 0, NULL, NULL),
(20, 8, 2, 1, 1, 8, 0, NULL, NULL),
(21, 10, 2, 1, 1, 8, 0, NULL, NULL),
(22, 8, 2, 8, 1, 9, 0, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idProducto` (`idProducto`,`idMesero`,`idMesa`),
  ADD KEY `idMesa` (`idMesa`),
  ADD KEY `idMesero` (`idMesero`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`idMesero`) REFERENCES `mesero` (`idMesero`),
  ADD CONSTRAINT `pedido_ibfk_3` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
