-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 26 Bulan Mei 2023 pada 16.54
-- Versi server: 10.4.21-MariaDB
-- Versi PHP: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `maresho`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dtnasabah`
--

CREATE TABLE `dtnasabah` (
  `id_nasabah` int(11) NOT NULL,
  `nama_nasabah` varchar(50) NOT NULL,
  `no_kartu` varchar(16) NOT NULL,
  `validthru` int(4) NOT NULL,
  `no_hp` varchar(12) NOT NULL,
  `pin` int(6) NOT NULL,
  `info_saldo` int(11) NOT NULL,
  `no_rek` int(10) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dtnasabah`
--

INSERT INTO `dtnasabah` (`id_nasabah`, `nama_nasabah`, `no_kartu`, `validthru`, `no_hp`, `pin`, `info_saldo`, `no_rek`, `username`, `password`) VALUES
(1, 'Hermione Granger', '2147483647867425', 2345, '085726970970', 7658, 1547000, 1321897537, 'oui', '123'),
(2, 'Draco Malfoy', '123210050349024', 3456, '087654321823', 3344, 32620000, 1324567689, 'draco9', '9090'),
(3, 'Ronald Weasley', '1232100578969351', 5641, '087435267894', 7890, 550000, 1456284628, 'ronwe', '7777'),
(5, 'Harry Potter', '1678954397805218', 3046, '085432789655', 3445, 55575000, 1238765127, 'potter8', '1234'),
(6, 'Oliver Wood', '2367901367942908', 3087, '087346789002', 2345, 3275000, 1678902345, 'oliver', '123');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dtnasabah`
--
ALTER TABLE `dtnasabah`
  ADD PRIMARY KEY (`id_nasabah`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `dtnasabah`
--
ALTER TABLE `dtnasabah`
  MODIFY `id_nasabah` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
