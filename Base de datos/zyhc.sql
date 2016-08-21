-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 21-12-2014 a las 20:33:43
-- Versión del servidor: 5.5.39-MariaDB
-- Versión de PHP: 5.5.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `zyhc`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calzadoexistencia`
--

CREATE TABLE IF NOT EXISTS `calzadoexistencia` (
  `Cantidad` varchar(255) NOT NULL,
  `Modelo` varchar(255) NOT NULL,
  `Descripcion` varchar(255) NOT NULL,
  `Numeracion` varchar(255) NOT NULL,
  `Precio de venta` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `calzadoexistencia`
--

INSERT INTO `calzadoexistencia` (`Cantidad`, `Modelo`, `Descripcion`, `Numeracion`, `Precio de venta`) VALUES
('47', '88', 'editado', '8-9', 130.9),
('90', '7564', 'zapato de piiel ', '5-9', 204),
('8', '99', 'Piel negro', '99', 168.3),
('12', 'm45j', 'Zapato de niño ', '2-5', 170),
('20 ', 'm98j', 'Zapato de caballero ', '5-8', 340),
('6', '98786', 'Zapato de piel negro', '5-9', 170);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(254) NOT NULL,
  `ApellidoPaterno` varchar(254) NOT NULL,
  `ApellidoMaterno` varchar(254) NOT NULL,
  `rfc` varchar(254) NOT NULL,
  `telefono` varchar(254) NOT NULL,
  `direccion` varchar(254) NOT NULL,
  `numerodecompras` varchar(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `rfc`, `telefono`, `direccion`, `numerodecompras`) VALUES
(1, '0', 'a', 'a', 'a', 'a', 'a', 'a');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

CREATE TABLE IF NOT EXISTS `notas` (
  `NumeroDeNota` int(254) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `notas`
--

INSERT INTO `notas` (`NumeroDeNota`) VALUES
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10),
(11),
(12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registroadministradores`
--

CREATE TABLE IF NOT EXISTS `registroadministradores` (
  `Cantidad` int(11) NOT NULL,
  `Modelo` varchar(255) NOT NULL,
  `Descripcion` varchar(255) NOT NULL,
  `Numeracion` varchar(255) NOT NULL,
  `PrecioDeCompra` double NOT NULL,
  `PrecioDeVenta` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `registroadministradores`
--

INSERT INTO `registroadministradores` (`Cantidad`, `Modelo`, `Descripcion`, `Numeracion`, `PrecioDeCompra`, `PrecioDeVenta`) VALUES
(88, '999', 'Hola ', '6 - 9 ', 99, 168.3),
(6, 'sv3', 'dos por uno', '1423', 439, 746.3),
(6, '34rft', 'Zapato de niño ', '2 - 5', 100, 170),
(100, '', '8uh8h8', '2-9', 10, 17),
(1, '88', 'kiojoij', '8-9', 77, 130.9),
(100, '7564', 'zapato de piiel ', '5-9', 120, 204),
(10, '99', 'Piel negro', '99', 99, 168.3),
(15, 'm45j', 'Zapato de niño ', '2-5', 100, 170),
(20, 'm98j', 'Zapato de caballero ', '5-8', 200, 340),
(6, '98786', 'Zapato de piel negro', '5-9', 100, 170);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registroclientes`
--

CREATE TABLE IF NOT EXISTS `registroclientes` (
  `Cantidad` int(11) NOT NULL,
  `Modelo` varchar(255) NOT NULL,
  `Descripcion` varchar(255) NOT NULL,
  `Numeracion` varchar(255) NOT NULL,
  `Precio de venta` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `registroclientes`
--

INSERT INTO `registroclientes` (`Cantidad`, `Modelo`, `Descripcion`, `Numeracion`, `Precio de venta`) VALUES
(88, '999', 'Hola ', '6 - 9 ', 168.3),
(6, 'sv3', 'dos por uno', '1423', 746.3),
(6, '34rft', 'Zapato de niño ', '2 - 5', 170),
(100, '', '8uh8h8', '2-9', 17);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
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
  `Nivel` varchar(255) NOT NULL,
  `Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Usuario`, `Contraseña`, `Nombre`, `PrimerApellido`, `SegundoApellido`, `Direccion`, `Colonia`, `CodigoPostal`, `Telefono`, `CorreoElectronico`, `Nivel`, `Id`) VALUES
('root', 'root', 'Francisco Eduardo ', 'Ascencio ', 'Dominguez ', '20 de noviembre # 306 ', 'Centro ', '96980 ', '2373553', 'lypef@cyberchoapas.com', 'Root', 1),
('lalito', 'lalito', 'lalito', 'ascencio', 'garcia', 'barrio de las flores', 'centro', '96980', '2373553', 'bj22@hotmail.com', 'Administrador', 2),
('vende', 'vende', 'Pepito ', 'perez', 'martinez ', 'no sabe ', 'centro', '96980', 'no tiene ', 'tampoco', 'Vendedor', 3),
('vendes', 'j', 'kk', 'k', 'k', 'k', 'kk', 'k', 'k', 'kk', 'null', 5),
('vende1', 'vende', 'j', 'j', 'j', 'j', 'jj', 'j', 'j', 'j', 'Root', 6),
('hola', 'j', 'jj', 'j', 'j', 'jj', 'j', 'j', 'jj', 'j', 'null', 8),
('probando ', '9', 'k', 'k', 'k', 'kk', 'k', 'k', 'k', 'k', 'Root', 9),
('luis', 'luis', 'Luis antonio', 'maganda', 'patricio', 'rancho alegre 1 ', 'centro', '96980', '2377602', '@', 'Administrador', 11),
('miguel', 'miguel', 'pen', 'pene', 'pene', 'pene', 'pene', 'pene', 'pene', 'no tiene ', 'Vendedor', 4),
('agustin', 'agustin', 'ujgbuhhj', 'bbub', 'uybhb', 'ub', 'bb', 'jbjhb', 'jkbjk', 'bjkbk', 'Vendedor', 7);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
