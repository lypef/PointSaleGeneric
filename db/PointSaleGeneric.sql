-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 21-05-2020 a las 10:46:49
-- Versión del servidor: 10.3.22-MariaDB-1ubuntu1
-- Versión de PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `PointSaleGeneric`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(254) NOT NULL,
  `ApellidoPaterno` varchar(254) NOT NULL,
  `ApellidoMaterno` varchar(254) NOT NULL,
  `rfc` varchar(254) NOT NULL,
  `telefono` varchar(254) NOT NULL,
  `direccion` varchar(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `config`
--

CREATE TABLE `config` (
  `id` int(11) NOT NULL,
  `nombre` varchar(300) NOT NULL DEFAULT 'Ninguno',
  `rfc` varchar(300) NOT NULL DEFAULT 'Ninguno',
  `direccion` varchar(300) NOT NULL DEFAULT 'Ninguno',
  `telefono` int(11) NOT NULL DEFAULT 0,
  `desarrollador` varchar(300) NOT NULL DEFAULT 'Ninguno',
  `version` varchar(300) NOT NULL DEFAULT '2.0',
  `web` varchar(300) NOT NULL DEFAULT 'www.cyberchoapas.com',
  `ticket` tinyint(1) NOT NULL DEFAULT 1,
  `cajon` tinyint(1) NOT NULL DEFAULT 1,
  `ticketcajon` tinyint(1) NOT NULL DEFAULT 1,
  `nameprint` varchar(300) NOT NULL DEFAULT 'Ninguno',
  `msg1` varchar(300) NOT NULL DEFAULT 'Ninguno',
  `msg2` varchar(300) NOT NULL DEFAULT 'Ninguno',
  `msg3` varchar(300) NOT NULL DEFAULT 'Ninguno',
  `Productsfew` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `config`
--

INSERT INTO `config` (`id`, `nombre`, `rfc`, `direccion`, `telefono`, `desarrollador`, `version`, `web`, `ticket`, `cajon`, `ticketcajon`, `nameprint`, `msg1`, `msg2`, `msg3`, `Productsfew`) VALUES
(1, 'SISTEMA DE VENTA PRO', 'AEDF9201245F3', 'DIRECCION DE PRUEBA', 1800, 'Ninguno', '3.0', 'www.cyberchoapas.com', 0, 0, 0, 'NINGUNO', 'MENSAJE UNOD', 'MENSAJ NUMERO DOS', 'MENSAJE NUMERO TRES', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `creditos`
--

CREATE TABLE `creditos` (
  `id` int(11) NOT NULL,
  `cliente_id` int(11) NOT NULL,
  `producto` varchar(254) NOT NULL,
  `monto` double NOT NULL,
  `fechapago` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `familys`
--

CREATE TABLE `familys` (
  `id` int(11) NOT NULL,
  `nombre` varchar(254) NOT NULL,
  `descripcion` varchar(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `familys`
--

INSERT INTO `familys` (`id`, `nombre`, `descripcion`) VALUES
(8, 'ENLATADOS', 'PRODUCTOS ENLATADOS\r\n'),
(13, 'REFRESCOS', 'REFRESCOS Y DERIVADOS'),
(14, 'SEMILLAS', 'SEMILLAS Y DERIVADOS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `logs`
--

CREATE TABLE `logs` (
  `id` int(11) NOT NULL,
  `producto` varchar(254) NOT NULL,
  `codigo` varchar(254) NOT NULL,
  `precio` double NOT NULL,
  `piezas` int(11) NOT NULL,
  `hora` time NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `logs`
--

INSERT INTO `logs` (`id`, `producto`, `codigo`, `precio`, `piezas`, `hora`, `fecha`) VALUES
(1, 'COCACOLA 600 ML', '60788', 17, 1, '03:40:49', '2020-05-20'),
(2, 'WDWDWD', '99262', 1500, 1, '03:40:49', '2020-05-20'),
(3, 'AVENA MOLIDA', '111', 1500, 1, '03:40:49', '2020-05-20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(254) NOT NULL,
  `descripcion` varchar(254) NOT NULL,
  `codigo` varchar(254) NOT NULL,
  `precio` decimal(65,2) NOT NULL,
  `stock` int(11) NOT NULL,
  `vendidos` int(11) NOT NULL,
  `family` int(11) NOT NULL,
  `p_costo` decimal(65,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `descripcion`, `codigo`, `precio`, `stock`, `vendidos`, `family`, `p_costo`) VALUES
(1, 'AVENA MOLIDA', 'FEFEFE', '111', '1500.00', 0, 1, 14, '999.59'),
(2, 'WDWDWD', 'WDWDW', '99262', '1500.00', 21, 1, 14, '25.00'),
(3, 'COCACOLA 600 ML', 'DESCIPCION', '60788', '17.00', 0, 1, 13, '14.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provedores`
--

CREATE TABLE `provedores` (
  `idprovedor` int(11) NOT NULL,
  `empresa` varchar(254) NOT NULL,
  `direccion` varchar(254) NOT NULL,
  `email` varchar(254) NOT NULL,
  `telefono` varchar(254) NOT NULL,
  `rfc` varchar(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `provedores`
--

INSERT INTO `provedores` (`idprovedor`, `empresa`, `direccion`, `email`, `telefono`, `rfc`) VALUES
(1, 'QSQ', 'SQSQ', 'SQSQS', 'qsqsq', 'QSQS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Usuario` varchar(255) NOT NULL,
  `Contraseña` varchar(255) DEFAULT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `PrimerApellido` varchar(255) DEFAULT NULL,
  `SegundoApellido` varchar(255) DEFAULT NULL,
  `Direccion` varchar(255) DEFAULT NULL,
  `Telefono` varchar(255) DEFAULT NULL,
  `CorreoElectronico` varchar(255) DEFAULT NULL,
  `Nivel` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Usuario`, `Contraseña`, `Nombre`, `PrimerApellido`, `SegundoApellido`, `Direccion`, `Telefono`, `CorreoElectronico`, `Nivel`) VALUES
('root', 'root', 'root', '5', '5', '5', '5', '5', 'ROOT');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `config`
--
ALTER TABLE `config`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `creditos`
--
ALTER TABLE `creditos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `familys`
--
ALTER TABLE `familys`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `family_product` (`family`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `creditos`
--
ALTER TABLE `creditos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `familys`
--
ALTER TABLE `familys`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `logs`
--
ALTER TABLE `logs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
  ADD CONSTRAINT `family_product` FOREIGN KEY (`family`) REFERENCES `familys` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
