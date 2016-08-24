-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 24-08-2016 a las 07:38:31
-- Versión del servidor: 10.1.13-MariaDB
-- Versión de PHP: 5.5.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `PointSaleGeneric`
--
CREATE DATABASE IF NOT EXISTS `PointSaleGeneric` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `PointSaleGeneric`;

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
  `direccion` varchar(254) NOT NULL,
  `numerodecompras` varchar(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `config`
--

CREATE TABLE `config` (
  `id` int(11) NOT NULL,
  `nombre` varchar(300) NOT NULL,
  `rfc` varchar(300) NOT NULL,
  `direccion` varchar(300) NOT NULL,
  `telefono` int(11) NOT NULL,
  `desarrollador` varchar(300) NOT NULL,
  `version` varchar(300) NOT NULL,
  `web` varchar(300) NOT NULL,
  `ticket` tinyint(1) NOT NULL,
  `cajon` tinyint(1) NOT NULL,
  `ticketcajon` tinyint(1) NOT NULL,
  `nameprint` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `config`
--

INSERT INTO `config` (`id`, `nombre`, `rfc`, `direccion`, `telefono`, `desarrollador`, `version`, `web`, `ticket`, `cajon`, `ticketcajon`, `nameprint`) VALUES
(1, 'SYSTEMA DEMO', 'ERWQ56568A', 'DIRECCION DEMO', 18009966, 'ISC. FRANCISCO EDUARDO ASCECNCIO DOMINGUEZ', '2.0', 'WWW.CYBERCHOAPAS.COM', 0, 0, 0, 'CUPS-PDF');

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
(1, 'sabritas', '75063638268', 12, 3, '05:13:14', '2015-07-03'),
(2, 'papas', '768768686', 99, 3, '03:12:23', '2015-07-03'),
(3, 'alguno', '87565676', 9, 9, '14:00:00', '2015-07-03'),
(4, 'AGUA CIEL 1LT', '8878788', 10, 1, '00:00:00', '2015-07-07'),
(5, 'kjhkjhjkhkjh', '67890', 8, 8, '05:00:00', '2015-07-03'),
(6, 'COCALA LATA', '7628827', 10, 10, '00:00:00', '2015-07-03'),
(7, 'COCALA LATA', '7628827', 10, 1, '00:00:00', '2015-07-03'),
(8, 'COCALA LATA', '7628827', 10, 1, '14:46:28', '2015-07-03'),
(9, 'NUEVO PRODUCTO', '750456789', 67.89, 1, '08:04:15', '2015-07-03'),
(10, 'PRODUCTO NUMRO 1', '848484848', 34.1, 2, '08:04:15', '2015-07-03'),
(11, 'HALLS', '898933888', 7, 4, '08:04:15', '2015-07-03'),
(12, 'NUTRIOLI', '98989989', 45, 4, '08:04:15', '2015-07-03'),
(13, 'FANTA LATA', '392888', 10, 4, '08:04:15', '2015-07-03'),
(14, 'COCALA LATA', '7628827', 10, 4, '08:04:15', '2015-07-03'),
(15, 'NUEVO PRODUCTO', '750456789', 67.89, 1, '08:46:30', '2015-07-03'),
(16, 'P3', '7508765432345678', 78.4, 1, '08:46:30', '2015-07-03'),
(17, 'MASECA 1KG', '9893388', 23, 1, '09:01:04', '2015-07-03'),
(18, 'NUTRIOLI', '98989989', 45, 1, '09:01:04', '2015-07-03'),
(19, 'P 1', '8983838', 90, 1, '09:03:15', '2015-07-03'),
(20, 'TEHUACAN', '898976545', 9, 1, '09:03:15', '2015-07-03'),
(21, 'MINSA 250 GR', '989833', 13, 1, '09:03:15', '2015-07-03'),
(22, 'PROBANDO PRODUCTO NUMERO DOS', '750000000000', 99.655, 1, '09:05:39', '2015-07-03'),
(23, 'PP', '89878', 8, 1, '09:05:39', '2015-07-03'),
(24, 'DORITOS HADCORE ANARANJADO', '7501011149809', 8, 1, '09:05:39', '2015-07-03'),
(25, 'NUTRIOLI', '98989989', 45, 1, '09:05:39', '2015-07-03'),
(26, '88888888888888888888', '88888888888888888', 8, 1, '09:06:41', '2015-07-03'),
(27, 'HALLS', '898933888', 7, 1, '09:06:41', '2015-07-03'),
(28, 'AGUA CIEL 1LT', '8878788', 10, 1, '09:06:41', '2015-07-03'),
(29, 'TEHUACAN', '898976545', 9, 1, '09:10:57', '2015-07-03'),
(30, 'AGUA CIEL 1LT', '8878788', 10, 1, '09:10:57', '2015-07-03'),
(31, 'MINSA 250 GR', '989833', 13, 1, '09:57:32', '2015-07-03'),
(32, 'AGUA CIEL 1LT', '8878788', 10, 1, '09:57:32', '2015-07-03'),
(33, 'NUTRIOLI', '98989989', 45, 1, '02:11:58', '2016-08-21'),
(34, 'PAPAS ADOBADAS', '38383888', 12, 1, '02:11:58', '2016-08-21'),
(35, 'COCACOLA 600 ML', '83838477', 13, 1, '02:12:20', '2016-08-21'),
(36, 'COCACOLA 600 ML', '83838477', 13, 1, '02:12:22', '2016-08-21'),
(37, 'COCACOLA 600 ML', '83838477', 13, 1, '02:12:23', '2016-08-21'),
(38, 'COCACOLA 600 ML', '83838477', 13, 1, '02:12:24', '2016-08-21'),
(39, 'NUTRIOLI', '98989989', 45, 1, '02:13:24', '2016-08-21'),
(40, 'PAPAS ADOBADAS', '38383888', 12, 1, '02:13:24', '2016-08-21'),
(41, 'NUTRIOLI', '98989989', 45, 1, '02:13:29', '2016-08-21'),
(42, 'COCACOLA 600 ML', '83838477', 13, 1, '02:13:29', '2016-08-21'),
(43, 'NUTRIOLI', '98989989', 45, 1, '02:13:32', '2016-08-21'),
(44, 'COCACOLA 600 ML', '83838477', 13, 1, '02:13:32', '2016-08-21'),
(45, 'NUTRIOLI', '98989989', 45, 1, '02:13:33', '2016-08-21'),
(46, 'COCACOLA 600 ML', '83838477', 13, 1, '02:13:33', '2016-08-21'),
(47, 'NUTRIOLI', '98989989', 45, 1, '02:13:35', '2016-08-21'),
(48, 'COCACOLA 600 ML', '83838477', 13, 1, '02:13:35', '2016-08-21'),
(49, 'NUTRIOLI', '98989989', 45, 1, '02:13:50', '2016-08-21'),
(50, 'COCACOLA 600 ML', '83838477', 13, 1, '02:13:50', '2016-08-21'),
(51, 'CLEARS', '45679544', 2, 1, '02:24:31', '2016-08-21'),
(52, 'AGUA CIEL 1LT', '8878788', 10, 1, '02:24:31', '2016-08-21'),
(53, 'FANTA LATA', '392888', 10, 1, '02:26:15', '2016-08-21'),
(54, 'AGUA CIEL 1LT', '8878788', 10, 1, '02:19:36', '2016-08-23'),
(55, 'COCACOLA 600 ML', '83838477', 13, 1, '02:28:44', '2016-08-23'),
(56, 'AGUA CIEL 1LT', '8878788', 10, 1, '02:29:04', '2016-08-23'),
(57, 'PAPAS ADOBADAS', '38383888', 12, 1, '02:29:04', '2016-08-23'),
(58, 'JABON DE TOCADOR', '3930348', 8, 1, '02:32:23', '2016-08-23'),
(59, 'PAPAS ADOBADAS', '83874', 10, 1, '02:32:23', '2016-08-23'),
(60, 'COCACOLA 600 ML', '83838477', 13, 1, '00:18:31', '2016-08-24'),
(61, 'COCACOLA 600 ML', '83838477', 13, 1, '00:18:33', '2016-08-24'),
(62, 'LAPICERO', '848483', 4, 1, '00:18:57', '2016-08-24'),
(63, 'CLEARS', '45679544', 2, 1, '00:18:57', '2016-08-24'),
(64, 'PAPAS ADOBADAS', '38383888', 12, 2, '00:21:08', '2016-08-24'),
(65, 'CACACOLA LATA', '7628827', 15, 5, '00:21:08', '2016-08-24'),
(66, 'PAPAS ADOBADAS', '38383888', 12, 2, '00:21:10', '2016-08-24'),
(67, 'CACACOLA LATA', '7628827', 15, 5, '00:21:11', '2016-08-24'),
(68, 'PAPAS ADOBADAS', '38383888', 12, 2, '00:21:12', '2016-08-24'),
(69, 'CACACOLA LATA', '7628827', 15, 5, '00:21:12', '2016-08-24'),
(70, 'PAPAS ADOBADAS', '38383888', 12, 1, '00:23:49', '2016-08-24'),
(71, 'P 1', '8983838', 90, 1, '00:24:43', '2016-08-24'),
(72, 'LAPICERO', '80809800', 9.7, 1, '00:24:43', '2016-08-24'),
(73, 'FANTA LATA', '392888', 10, 1, '00:26:09', '2016-08-24'),
(74, 'FANTA LATA', '392888', 10, 1, '00:26:12', '2016-08-24'),
(75, 'MINSA 250 GR', '989833', 13, 1, '00:27:12', '2016-08-24'),
(76, 'P3', '7508765432345678', 78.4, 1, '00:33:59', '2016-08-24'),
(77, 'IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII', '9999999999999999999999', 9999, 1, '00:33:59', '2016-08-24');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(254) NOT NULL,
  `descripcion` varchar(254) NOT NULL,
  `codigo` varchar(254) NOT NULL,
  `precio` float NOT NULL,
  `stock` int(11) NOT NULL,
  `vendidos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `descripcion`, `codigo`, `precio`, `stock`, `vendidos`) VALUES
(1, 'CACACOLA LATA', 'REFRESCO SABOR COCACOLA', '7628827', 15, 225, 81),
(2, 'FANTA LATA', 'REFRESCO SABOR NARANJA ', '392888', 10, 38, 36),
(3, 'PAPAS ADOBADAS', 'PAPAS ADOBADAS', '38383888', 12, 24, 8),
(4, 'COCACOLA 600 ML', 'REFRESCO CON AZUCAR SABOR COLA 600 ML ', '83838477', 13, 17, 3),
(5, 'AGUA CIEL 1LT', 'AGUA ENBOTELLADA 1LT', '8878788', 10, 0, 8),
(6, 'ACEITE PATRONA', 'ACEITE COMESTIBLE PATRONA', '989897', 28, 0, 0),
(7, 'ACEITE CAPULLO', 'ACEITE CAPUYO COMESTIBLE', '98989877', 33, 0, 0),
(8, 'NUTRIOLI', 'ACEITE NUTRIOLI', '98989989', 45, -4, 6),
(9, 'MINSA 250 GR', 'MINSA, ARINA', '989833', 13, 0, 5),
(10, 'MASECA 1KG', 'ARINA MASECA', '9893388', 23, 0, 1),
(11, 'HALLS', 'CARAMELO MASISO', '898933888', 7, 14, 5),
(12, 'TEHUACAN', 'TEHUACAN CANADA DRY', '898976545', 9, 31, 3),
(13, 'BROCHETA DE TEMARINDO', 'PULPA DE TAMARINDO', '4567898', 3, 35, 0),
(14, 'CLEARS', 'CARAMELO MASISO MARCA CLEARS', '45679544', 2, 32, 2),
(15, 'ALKA SELZER', 'POLVO PARA AGUA EFERVESENTE', '74392929', 16, 45, 0),
(16, 'LAPICERO', 'LAPICERO COLOR AZUL', '848483', 4, 33, 1),
(17, 'PAPAS ADOBADAS', 'PAPAS NATURALES ADOBADAS', '83874', 10, 1, 1),
(18, 'CHETOS TORCIDITOS', 'SABRITAS SABOR QUESO', '84848', 7, 23, 0),
(19, 'JABON DE TOCADOR', 'JABON DE TOCADOR OLOR A ROSAS', '3930348', 8, 2, 1),
(20, 'PRODUCTO 20', 'PRODUCTO NUMERO 20', '84848', 88, 20, 0),
(21, 'FRIJOLES LA SIERRA', 'FRIJOLES ENLATADOS EXPRESS', '79412477', 16, 5, 0),
(22, 'CLEARS', 'CARAMELO MAZIZO', '393080380', 3.5, 29, 0),
(23, 'LAPICERO', 'LAPIZERO COLO NEGRO', '80809800', 9.7, 29, 1),
(24, 'PRODUCTO NUMRO 1', 'JFOJFOJF', '848484848', 34.1, 32, 2),
(25, 'P 1', 'DIDID', '8983838', 90, 6, 2),
(26, 'DORITOS HADCORE ANARANJADO', 'DORITOS CHILE ACIDO ANARANJADO', '7501011149809', 8, 3, 1),
(27, 'JKJKJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ', 'IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII', '9999999999999999999999', 9, 8, 0),
(28, 'IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII', '999999999', '9999999999999999999999', 9999, 7, 1),
(29, '8888888888888888', '88888888888888888888888', '88888888888', 8, 8, 0),
(30, '88888888888888888888', '88888888888888888', '88888888888888888', 8, 7, 1),
(31, '888888888888888888888', '888888888888888', '888888888888', 4444, 43, 0),
(32, '444', '44444', '4444', 444444, 44444, 0),
(33, 'PRUEBA UNO', 'DESCRIPCION', '88787878787', 89.4, 43, 0),
(34, 'PRUEBA UNO', 'DESCRIPCION', '88787878787', 89.4, 42, 0),
(35, 'PROBANDO PRODUCTO NUMERO DOS', 'HJHHIOIH', '750000000000', 99.655, 87, 1),
(36, 'P1', 'KJDHCKJEHCK', '78987654', 45, 6, 0),
(37, 'P3', 'IID', '7508765432345678', 78.4, 5, 2),
(39, 'NUEVO PRODUCTO', 'PRODUCTO NUEVO Y CARO', '750456789', 67.89, 3, 2),
(41, 'PP', '8888', '89878', 8, 6, 1),
(42, '8', '8', '8', 8, 7, 0);

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
(1, 'SABRITAS', 'S/N', 'S/N', 'S/N', 'S/N'),
(2, 'COCACOLA FEMSA', 'TAMAULIPAS CENTRO 455', 'HOLA@HOTMAIL.COM', '2385558', 'AED4HHWJI'),
(3, 'MARINELA S.A DE C.V', 'TAMAULIPAS 204', 'MARINELA@HOTMAIL.COM', '235577', 'MARI4657587'),
(4, 'AA', 'AAA', 'AAA', 'aa', 'AAA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Id` int(11) NOT NULL,
  `Usuario` varchar(255) NOT NULL,
  `Contraseña` varchar(255) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `PrimerApellido` varchar(255) NOT NULL,
  `SegundoApellido` varchar(255) NOT NULL,
  `Direccion` varchar(255) NOT NULL,
  `Colonia` varchar(255) NOT NULL,
  `CodigoPostal` varchar(255) NOT NULL,
  `Telefono` varchar(255) NOT NULL,
  `CorreoElectronico` varchar(255) NOT NULL,
  `Nivel` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Id`, `Usuario`, `Contraseña`, `Nombre`, `PrimerApellido`, `SegundoApellido`, `Direccion`, `Colonia`, `CodigoPostal`, `Telefono`, `CorreoElectronico`, `Nivel`) VALUES
(1, 'root', 'root', 'USUARIO ADMINISTRADOR', '.', '.', 'DIRECCION', 'centro', '96980', '9231200505', 'lypef@live.com', 'root');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `config`
--
ALTER TABLE `config`
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
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `logs`
--
ALTER TABLE `logs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78;
--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
