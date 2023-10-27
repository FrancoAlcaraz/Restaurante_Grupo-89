-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 17:46:03
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
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `idCategoria` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`idCategoria`, `nombre`) VALUES
(4, 'BEBIDA NA'),
(5, 'COMIDA'),
(6, 'BEBIDA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `idMesa` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL,
  `estado` tinyint(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`idMesa`, `numero`, `capacidad`, `estado`) VALUES
(1, 4, 3, 1),
(2, 5, 6, 0),
(3, 3, 4, 1),
(6, 9, 4, 1),
(7, 20, 6, 1),
(8, 21, 2, 1),
(9, 22, 5, 1),
(10, 30, 10, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `idMesero` int(11) NOT NULL,
  `dni` int(60) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`idMesero`, `dni`, `nombre`, `estado`) VALUES
(1, 3698741, 'Julian', 1),
(2, 1478963, 'Javier', 1),
(3, 112233, 'Jorgelina', 1),
(4, 668822, 'Julia', 1);

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
  `fecha` date NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `idProducto`, `idMesero`, `idMesa`, `estado`, `nroPedido`, `cantidadProducto`, `fecha`, `hora`) VALUES
(5, 7, 3, 1, 0, 0, 0, '2023-10-26', '13:00:00'),
(6, 6, 3, 1, 1, 1, 0, '2023-10-24', '14:00:00'),
(7, 6, 3, 1, 1, 2, 0, '2023-10-24', '15:00:00'),
(8, 7, 3, 1, 1, 2, 0, '2023-10-24', '15:00:00'),
(9, 7, 3, 1, 1, 2, 0, '2023-10-24', '15:00:00'),
(10, 7, 3, 7, 1, 3, 0, '2023-10-31', '14:00:00'),
(11, 7, 3, 7, 1, 3, 0, '2023-10-31', '14:00:00'),
(12, 7, 3, 1, 1, 4, 0, '2023-11-01', '18:00:00'),
(13, 6, 3, 1, 1, 4, 0, '2023-11-01', '18:00:00'),
(14, 7, 3, 1, 1, 4, 0, '2023-11-01', '18:00:00'),
(15, 7, 3, 1, 0, 5, 0, '2023-11-15', '20:00:00'),
(16, 7, 3, 1, 0, 5, 0, '2023-11-15', '20:00:00'),
(17, 6, 3, 1, 0, 5, 0, '2023-11-15', '20:00:00'),
(18, 7, 3, 1, 1, 6, 0, '2023-10-29', '20:00:00'),
(19, 8, 2, 1, 0, 7, 0, '2023-11-15', '22:00:00'),
(20, 8, 2, 1, 1, 8, 0, '2023-10-27', '10:00:00'),
(21, 10, 2, 1, 1, 8, 0, '2023-10-27', '10:00:00'),
(22, 8, 2, 8, 1, 9, 0, '2023-10-24', '22:00:00'),
(23, 6, 1, 8, 0, 10, 0, '2023-10-25', '10:00:00'),
(24, 8, 1, 8, 0, 10, 0, '2023-10-25', '10:00:00'),
(25, 8, 1, 8, 0, 10, 0, '2023-10-25', '10:00:00'),
(26, 6, 2, 1, 1, 11, 4, '2023-10-25', '14:00:00'),
(27, 10, 2, 1, 1, 11, 4, '2023-10-25', '14:00:00'),
(28, 8, 2, 1, 1, 11, 4, '2023-10-25', '14:00:00'),
(29, 6, 2, 1, 1, 12, 4, '2023-10-25', '14:00:00'),
(30, 10, 2, 1, 1, 12, 4, '2023-10-25', '14:00:00'),
(31, 8, 2, 1, 1, 12, 4, '2023-10-25', '14:00:00'),
(32, 9, 2, 1, 1, 13, 1, '2023-10-27', '10:00:00'),
(33, 8, 2, 1, 1, 13, 1, '2023-10-27', '10:00:00'),
(34, 6, 1, 7, 1, 14, 6, '2023-10-29', '17:00:00'),
(35, 9, 1, 7, 1, 14, 4, '2023-10-29', '17:00:00'),
(36, 6, 2, 1, 1, 15, 5, '2023-10-27', '10:00:00'),
(37, 6, 2, 1, 1, 16, 3, '2023-10-26', '10:00:00'),
(38, 6, 1, 1, 1, 17, 5, '2023-10-26', '10:00:00'),
(39, 6, 2, 1, 1, 18, 1, '2023-10-26', '10:00:00'),
(40, 6, 3, 1, 1, 19, 1, '2023-10-26', '10:00:00'),
(41, 6, 3, 1, 1, 20, 2, '2023-10-26', '10:00:00'),
(42, 6, 1, 1, 1, 21, 1, '2023-10-27', '10:00:00'),
(43, 6, 4, 1, 1, 22, 1, '2023-10-26', '17:00:00'),
(44, 9, 1, 1, 1, 22, 5, '2023-10-26', '17:00:00'),
(45, 9, 2, 1, 1, 23, 6, '2023-10-26', '17:00:00'),
(46, 10, 1, 10, 1, 24, 3, '2023-10-27', '10:00:00'),
(47, 10, 1, 10, 1, 25, 5, '2023-10-27', '10:00:00'),
(48, 9, 2, 10, 1, 26, 2, '2023-10-27', '10:00:00'),
(49, 9, 2, 10, 1, 27, 3, '2023-10-27', '10:00:00'),
(50, 9, 3, 10, 1, 28, 2, '2023-10-27', '10:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(60) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `cantidad`, `precio`, `idCategoria`, `estado`) VALUES
(6, 'Jugo', 1, 600, 4, 1),
(7, 'Vino', 15, 900, 6, 1),
(8, 'Pollo', 20, 900, 5, 1),
(9, 'Pollo', 20, 900, 5, 1),
(10, 'Hamburguesa', 7, 500, 5, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`idMesa`),
  ADD UNIQUE KEY `numero` (`numero`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`idMesero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idProducto` (`idProducto`,`idMesero`,`idMesa`),
  ADD KEY `idMesa` (`idMesa`),
  ADD KEY `idMesero` (`idMesero`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `idCategoria` (`idCategoria`),
  ADD KEY `idCategoria_2` (`idCategoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `idMesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `idMesero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

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

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
