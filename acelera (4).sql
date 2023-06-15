-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 15/06/2023 às 13:16
-- Versão do servidor: 10.4.28-MariaDB
-- Versão do PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `acelera`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `associados`
--

CREATE TABLE `associados` (
  `Nome` varchar(100) NOT NULL,
  `Endereco` varchar(150) NOT NULL,
  `Telefone` varchar(15) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `CEP` varchar(10) NOT NULL,
  `Nascimento` varchar(10) NOT NULL,
  `Cidade` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `associados`
--

INSERT INTO `associados` (`Nome`, `Endereco`, `Telefone`, `Email`, `CPF`, `CEP`, `Nascimento`, `Cidade`) VALUES
('matheus teste', 'alameda uiuiui', '(12) 99174-0155', 'teteussss', '123.456.786-66', '  .   -   ', '10/09/1994', ''),
('matheus teste', 'alameda uiuiui', '(12) 99174-0155', 'teteussss', '123.456.786-66', '12.710-147', '10/09/1994', 'crz');

-- --------------------------------------------------------

--
-- Estrutura para tabela `login`
--

CREATE TABLE `login` (
  `Usuario` varchar(100) NOT NULL,
  `Senha` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `login`
--

INSERT INTO `login` (`Usuario`, `Senha`) VALUES
('matheus', 'senha'),
('hissachi', 'senha');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
