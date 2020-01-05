-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Jan 2020 pada 06.50
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bloodcare`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `jenis_donor`
--

CREATE TABLE `jenis_donor` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `jenis_donor`
--

INSERT INTO `jenis_donor` (`id`, `nama`) VALUES
(1, 'biasa'),
(2, 'rutin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pendonoran`
--

CREATE TABLE `pendonoran` (
  `id` int(11) NOT NULL,
  `jenis_id` varchar(50) NOT NULL,
  `user_id` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pendonoran`
--

INSERT INTO `pendonoran` (`id`, `jenis_id`, `user_id`, `status`) VALUES
(1, 'biasa', 'prastyo18ti@mahasiswa.pcr.ac.id', 'direquest'),
(2, 'biasa', 'ardy18ti@mahasiswa.pcr.ac.id', 'direquest'),
(3, 'biasa', 'prastyo18ti@mahasiswa.pcr.ac.id', 'biasa'),
(4, 'biasa', 'ardy18ti@mahasiswa.pcr.ac.id', 'biasa'),
(5, 'biasa', 'prastyo18ti@mahasiswa.pcr.ac.id', 'biasa'),
(6, 'biasa', 'ardy18ti@mahasiswa.pcr.ac.id', 'biasa'),
(7, 'biasa', 'prastyo18ti@mahasiswa.pcr.ac.id', 'biasa'),
(8, 'biasa', 'ardy18ti@mahasiswa.pcr.ac.id', 'biasa'),
(9, 'biasa', 'ardy18ti@mahasiswa.pcr.ac.id', 'biasa'),
(11, 'biasa', 'prastyo18ti@mahasiswa.pcr.ac.id', 'dibatalkan'),
(12, 'biasa', 'jody18ti@mahasiswa.pcr.ac.id', 'direquest'),
(13, 'biasa', 'jody18ti@mahasiswa.pcr.ac.id', 'direquest'),
(14, 'biasa', 'rahmatul18ti@mahasiswa.pcr.ac.id', 'direquest'),
(15, 'biasa', 'ridho18ti@mahasiswa.pcr.ac.id', 'direquest'),
(16, 'biasa', 'ardy@a.com', 'direquest'),
(17, 'biasa', 'ardyjunata53@gmail.com', 'direquest'),
(18, 'biasa', 'ardyjunata68@gmail.com', 'direquest'),
(19, 'biasa', 'ardyjunata68@gmail.com', 'direquest'),
(20, 'biasa', 'ardyjunata68@gmail.com', 'direquest'),
(21, 'biasa', 'ardyjunata68@gmail.com', 'direquest'),
(22, 'biasa', 'ardyjunata68@gmail.com', 'direquest'),
(23, 'biasa', 'ardyjunata68@gmail.com', 'direquest'),
(24, 'biasa', 'ardyjunata68@gmail.com', 'direquest'),
(25, 'biasa', 'ardyjunata68@gmail.com', 'direquest'),
(26, 'biasa', 'riska@gmail.com', 'direquest'),
(30, 'rutin', 'ardy18ti@mahasiswa.pcr.ac.id', 'direquest'),
(31, 'rutin', 'fahturrahman18ti@mahasiswa.pcr.ac.id', 'direquest'),
(32, 'rutin', 'fahturrahman18ti@mahasiswa.pcr.ac.id', 'direquest'),
(33, 'rutin', 'fahturrahman18ti@mahasiswa.pcr.ac.id', 'menjalani'),
(34, 'rutin', 'fahturrahman18ti@mahasiswa.pcr.ac.id', 'menjalani'),
(35, 'rutin', 'ardy18ti@mahasiswa.pcr.ac.id', 'menjalani'),
(39, 'biasa', 'prastyo18ti@mahasiswa.pcr.ac.id', 'dibatalkan'),
(40, 'rutin', 'jody18ti@mahasiswa.pcr.ac.id', 'menjalani'),
(43, 'rutin', 'prastyo18ti@mahasiswa.pcr.ac.id', 'menjalani');

-- --------------------------------------------------------

--
-- Struktur dari tabel `postingan`
--

CREATE TABLE `postingan` (
  `id` int(11) NOT NULL,
  `nama_penerima` varchar(50) NOT NULL,
  `no_hp` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `goldar` varchar(10) NOT NULL,
  `rh` varchar(10) NOT NULL,
  `jml_kantong` int(11) NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  `user_id` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `postingan`
--

INSERT INTO `postingan` (`id`, `nama_penerima`, `no_hp`, `alamat`, `goldar`, `rh`, `jml_kantong`, `keterangan`, `user_id`, `status`) VALUES
(1, 'Prastyo Nugroho', '082388085962', 'asd', 'AB', '-', 2, 'asd', 'ardy18ti@mahasiswa.pcr.ac.id', 'direquest'),
(2, 'asdf', 'asdf', 'asdf', 'AB', '+', 2, 'adsf', 'prastyo18ti@mahasiswa.pcr.ac.id', 'direquest'),
(3, 'DF', 'asdf', 'asdf', 'B', '+', 2, '2w', 'ardy18ti@mahasiswa.pcr.ac.id', 'direquest'),
(4, 'a', 's', 's', 'AB', '+', 2, 'a', 'prastyo18ti@mahasiswa.pcr.ac.id', 'direquest'),
(5, 'c', 'as', 'c', 'null', '+', 2, 'asd', 'ardy18ti@mahasiswa.pcr.ac.id', 'direquest'),
(6, 'asd', 'asdf', 'asdf', 'AB', '+', 2, 'afd', 'prastyo18ti@mahasiswa.pcr.ac.id', 'direquest'),
(7, 'asdf', '123', 'asdf', 'O', '-', 2, 'd', 'ardy18ti@mahasiswa.pcr.ac.id', 'direquest'),
(8, 'sdf', 'asdf', 'asdf', 'B', '+', 2, 'asdf', 'prastyo18ti@mahasiswa.pcr.ac.id', 'direquest'),
(10, 'ardy', 'dsad', 'asd', 'AB', '-', 2, 'asd', 'ardy18ti@mahasiswa.pcr.ac.id', 'direquest'),
(12, 'asdf', 'asdf', 'adsf', 'AB', '+', 2, 'asdf', 'ardy18ti@mahasiswa.pcr.ac.id', 'tersedia'),
(13, 'a', 'b', 'd', 'AB', '+', 2, 'asdf', 'ardy18ti@mahasiswa.pcr.ac.id', 'direquest'),
(14, 'asdf', 'asdf', 'asdf', 'AB', '+', 2, 'asdf', 'jody18ti@mahasiswa.pcr.ac.id', 'direquest'),
(15, 'asdf', 'asdf', 'asdf', 'AB', '+', 23, 'sadf', 'jody18ti@mahasiswa.pcr.ac.id', 'direquest'),
(16, 'asdf', 'asdf', 'asdf', 'AB', '+', 2, 'asdf', 'jody18ti@mahasiswa.pcr.ac.id', 'direquest'),
(17, 'asdf', 'asdf', 'asdf', 'AB', '+', 2, 'asdf', 'jody18ti@mahasiswa.pcr.ac.id', 'direquest'),
(18, 'asdf', 'asdf', 'asdf', 'null', '+', 2, 'asdf', 'rahmatul18ti@mahasiswa.pcr.ac.id', 'direquest'),
(19, 'asdf', 'asasdf', 'adsf', 'AB', '+', 23, '', 'ridho18ti@mahasiswa.pcr.ac.id', 'menunggu'),
(20, 'asdf', 'asasdf', 'adsf', 'AB', '+', 23, '', 'ridho18ti@mahasiswa.pcr.ac.id', 'menunggu'),
(21, 'asdf', 'asasdf', 'adsf', 'AB', '+', 23, '', 'ridho18ti@mahasiswa.pcr.ac.id', 'menunggu'),
(22, 'asdf', 'asdf', 'adsf', 'A', '+', 2, 'asdf', 'ardy@a.com', 'menunggu'),
(23, 'asdf', 'asdf', 'asdf', 'B', '+', 2, 'asdf', 'ardyjunata53@gmail.com', 'menunggu'),
(24, 'asdf', 'asdf', '2', 'AB', '-', 2, 'a', 'riska@gmail.com', 'menunggu'),
(25, 'Jody Alief', '081266876804', 'Rumah Sakit Awal Bros', 'AB', '+', 4, 'kurang darah', 'ardy18ti@mahasiswa.pcr.ac.id', 'tersedia');

-- --------------------------------------------------------

--
-- Struktur dari tabel `restok`
--

CREATE TABLE `restok` (
  `id` int(11) NOT NULL,
  `tanggal` varchar(50) NOT NULL,
  `perequest` varchar(50) NOT NULL,
  `pemberi` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `qty` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `restok`
--

INSERT INTO `restok` (`id`, `tanggal`, `perequest`, `pemberi`, `status`, `qty`) VALUES
(1, '2020-01-05', 'awalbros@gmail.com', 'utdpku@gmail.com', 'direquest', 2),
(2, '2020-01-05', 'ibnu@gmail.com', 'awalbros@gmail.com', 'diterima', 2),
(3, '2020-01-05', 'awalbros@gmail.com', 'ibnu@gmail.com', 'diterima', 3);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `id` int(11) NOT NULL,
  `tanggal_transaksi` date NOT NULL,
  `post_id` int(11) NOT NULL,
  `donor_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`id`, `tanggal_transaksi`, `post_id`, `donor_id`) VALUES
(1, '2020-01-01', 1, 1),
(2, '2020-01-01', 2, 2),
(3, '2020-01-02', 3, 3),
(4, '2020-01-02', 4, 4),
(5, '2020-01-02', 5, 5),
(6, '2020-01-02', 6, 6),
(7, '2020-01-02', 7, 7),
(8, '2020-01-02', 8, 8),
(10, '2020-01-02', 10, 13),
(12, '2020-01-02', 12, 11),
(13, '2020-01-02', 13, 12),
(14, '2020-01-03', 14, 15),
(15, '2020-01-03', 15, 17),
(16, '2020-01-03', 16, 16),
(17, '2020-01-03', 17, 26),
(18, '2020-01-03', 18, 25),
(19, '2020-01-03', 19, 0),
(20, '2020-01-03', 20, 0),
(21, '2020-01-03', 21, 0),
(22, '2020-01-03', 22, 0),
(23, '2020-01-03', 23, 0),
(24, '2020-01-03', 24, 0),
(25, '2020-01-03', 29, 0),
(26, '2020-01-03', 30, 0),
(27, '2020-01-03', 31, 0),
(28, '2020-01-03', 32, 0),
(29, '2020-01-03', 33, 0),
(30, '2020-01-03', 34, 0),
(34, '2020-01-03', 25, 39),
(35, '2020-01-03', 0, 40),
(38, '2020-01-04', 0, 43);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `image` varchar(50) DEFAULT NULL,
  `tanggal_lahir` varchar(50) DEFAULT NULL,
  `berat_badan` int(11) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `stok` int(11) DEFAULT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `nama`, `email`, `password`, `image`, `tanggal_lahir`, `berat_badan`, `jenis_kelamin`, `stok`, `role_id`) VALUES
(1, 'Ardy Junata', 'ardy18ti@mahasiswa.pcr.ac.id', '123', 'not set', '2000-06-24', 57, 'Laki-laki', 57, 2),
(3, 'Prastyo Nugroho', 'prastyo18ti@mahasiswa.pcr.ac.id', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(4, 'Jody Alief', 'jody18ti@mahasiswa.pcr.ac.id', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(5, 'Rahmatul Laila', 'rahmatul18ti@mahasiswa.pcr.ac.id', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(6, 'Ridho Abdillah', 'ridho18ti@mahasiswa.pcr.ac.id', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(7, 'ar', 'ardy@a.com', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(8, 'junata', 'ardyjunata53@gmail.com', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(9, 'ard', 'ardyjunata68@gmail.com', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(10, 'riska', 'riska@gmail.com', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(11, 'Fahtur', 'fahturrahman18ti@mahasiswa.pcr.ac.id', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(12, '', '', '', NULL, '0000-00-00', NULL, NULL, NULL, 0),
(14, '', 'sdf', '', NULL, '0000-00-00', NULL, NULL, NULL, 0),
(15, 'UTD Pekanbaru', 'utdpku@gmail.com', '123', NULL, NULL, NULL, NULL, 2, 4),
(16, 'Rumah Sakit Awal Bros', 'awalbros@gmail.com', '123', NULL, 'null', 0, 'null', 7, 3),
(17, 'UTD Kampar', 'utdkampar@gmail.com', '123', NULL, NULL, NULL, NULL, 4, 4),
(18, 'Rumah Sakit Ibnu Sina', 'ibnu@gmail.com', '123', NULL, NULL, NULL, NULL, 15, 3),
(20, 'siapa', 'siapa@gmail.com', '123', 'not set', '0000-00-00', 0, 'not set', 0, 2),
(22, 'Rumah Sakit Puri Husada', 'puri@gmail.com', '123', 'not set', '0000-00-00', 0, 'not set', 0, 3),
(23, 'UTD Tembilahan', 'utdtbh@gmail.com', '123', 'not set', '0000-00-00', 0, 'not set', 0, 4),
(24, 'ardy', 'ar@gmail.com', '123', 'not set', '0000-00-00', 0, 'not set', 0, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user_role`
--

CREATE TABLE `user_role` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user_role`
--

INSERT INTO `user_role` (`id`, `nama`) VALUES
(1, 'Admin'),
(2, 'User'),
(3, 'Rumah Sakit'),
(4, 'UTD');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `jenis_donor`
--
ALTER TABLE `jenis_donor`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pendonoran`
--
ALTER TABLE `pendonoran`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `postingan`
--
ALTER TABLE `postingan`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `restok`
--
ALTER TABLE `restok`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indeks untuk tabel `user_role`
--
ALTER TABLE `user_role`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `jenis_donor`
--
ALTER TABLE `jenis_donor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `pendonoran`
--
ALTER TABLE `pendonoran`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT untuk tabel `postingan`
--
ALTER TABLE `postingan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT untuk tabel `restok`
--
ALTER TABLE `restok`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT untuk tabel `user_role`
--
ALTER TABLE `user_role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
