-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Des 2022 pada 06.27
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perkebunan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id_admin` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `nama_admin` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_admin`, `username`, `password`, `nama_admin`) VALUES
('A1', 'admin', '123', 'Rayhan');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` char(30) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `no_handphone` char(15) DEFAULT NULL,
  `alamat` char(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama`, `no_handphone`, `alamat`) VALUES
('01', 'Matheus Pato', '082251993878', 'Jl Vorvo, Samar'),
('02', 'Jordi Alba', '085240450112', 'Jl Damanhuri, J'),
('03', 'Salahudin ', '082251993898', 'Jl Karya Etam,'),
('04', 'Stefano Lilipali ', '085238279321', 'Jl Juanda, Palu'),
('05', 'Alfiyah Rifda ', '082267320186', 'Jl Kapasan, Sur'),
('07', 'Gustaf R', '086729380218', 'Jl Raya Labang,'),
('08', 'Rahmaisya ', '082267391738', 'Jl Dayung, Sang'),
('09', 'Bagus Kahfi ', '082267396946', 'Jl Mayjen, Mage'),
('10', 'Iksan Maulana ', '0822672936', 'Jl Lambung Mang'),
('11', 'Rizky Kusuma ', '082256379765', 'Jl Vorvo, Samar'),
('12', 'La Damla ', '085256379765', 'Jl Geriliya, Sa'),
('13', 'Wilda Sapurti ', '082264379765', 'Jl Pramuka, Sam'),
('14', 'Akmad Husain ', '082364379765', 'Jl belimbing, B'),
('15', 'Yaya', '082379208222', 'Jl Sentosa, Ten'),
('16', 'Kahirul', '085542897257', 'Jl Eksternal, Bima'),
('17', 'Sarifatul', '092246049358', 'Jl Kemakmuran, Sempaja');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE `pemesanan` (
  `id_pemesanan` char(10) NOT NULL,
  `id_pelanggan` char(10) DEFAULT NULL,
  `nama` varchar(30) NOT NULL,
  `id_produk` char(10) DEFAULT NULL,
  `produk` char(30) DEFAULT NULL,
  `jumlah` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemesanan`
--

INSERT INTO `pemesanan` (`id_pemesanan`, `id_pelanggan`, `nama`, `id_produk`, `produk`, `jumlah`) VALUES
('P0001', '01', 'Matheus Pato', 'b0003', 'Teh Putih Fujing', 100),
('P0002', '09', 'Bagus Kahfi ', 'b0007', 'Cabai', 500),
('P0003', '12', 'La Damla ', 'b0011', 'Kangkung', 50),
('P0004', '15', 'Yaya', 'b0016', 'Sawi', 20),
('P0005', '05', 'Alfiyah Rifda ', 'b0005', 'Tomat', 500),
('P0006', '04', 'Stefano Lilipali ', 'b0007', 'Cabai', 670),
('P0007', '07', 'Gustaf R', 'b0020', 'Tebu', 15),
('P0008', '10', 'Iksan Maulana ', 'b0021', 'Jagung', 400),
('P0009', '05', 'Alfiyah Rifda ', 'b0015', 'Kentang', 10),
('P0010', '11', 'Rizky Kusuma ', 'b0019', 'Kapas', 200),
('P0011', '04', 'Stefano Lilipali ', 'b0018', 'Tembakau', 90),
('P0012', '07', 'Gustaf R', 'b0017', 'Lidah Buaya', 30),
('P0013', '13', 'Wilda Sapurti ', 'b0005', 'Tomat', 150),
('P0014', '12', 'La Damla ', 'b0010', 'Jeruk', 145),
('P0015', '03', 'Salahudin ', 'b0021', 'Jagung', 20),
('P0016', '09', 'Bagus Kahfi ', 'b0012', 'Rambutan', 40);

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `id_produk` char(10) NOT NULL,
  `produk` char(40) DEFAULT NULL,
  `petani` char(20) DEFAULT NULL,
  `tgl_panen` char(20) DEFAULT NULL,
  `kategori` varchar(30) NOT NULL,
  `deskripsi` text NOT NULL,
  `stok` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`id_produk`, `produk`, `petani`, `tgl_panen`, `kategori`, `deskripsi`, `stok`) VALUES
('B0001', 'Sayur Bayam', 'Candra', '09 May 2022', 'Sayur sayuran', 'Bayam Berkualitas Tinggi dan hanya terdapat di pegununggan ', 58),
('B0002', 'Apel', 'Jordi Alba', '01 Januari 2022', 'Buah Buahan', 'Apel hijau yang sehat dan bergiji', 500),
('B0003', 'Teh Putih Fujing', 'Jordi Alba', '02 Maret 2021', 'Produk Mentah', 'Teh Terbaik di Dunia', 0),
('B0004', 'Sawit', 'Jamal', '05 Desember 2021', 'Produk Mentah', 'Sawit Kalimantan ', 900),
('B0005', 'Tomat', 'Marko Simic', '01 Juli 2022', 'Sayur sayuran', 'Tomat berkualitas Internasional', 1350),
('B0006', 'Coklat', 'Matheus Pato', '09 Desember 2022', 'Buah Buahan', 'Buah Coklat', 750),
('B0007', 'Cabai', 'Randi Orten', '12 Oktober 2022', 'Sayur Sayuran', 'Cabai merah dan besar', 3530),
('B0009', 'Padi', 'Fadlur Rahman', '02 February 2022', 'Produk Mentah', 'Padi Asli Dari Kalimantan', 700),
('B0010', 'Jeruk', 'Melinda', '05 May 2021', 'Buah Buahan', 'Jeruk Besar dan Manis', 105),
('B0011', 'Kangkung', 'Ehsan', '03 Juni 2022', 'Sayur sayuran', 'Kangkung yang berkualitas', 30),
('B0012', 'Rambutan', 'Dani', '08 Oktober 2022', 'Buah Buahan', 'Manis Dan Besar', 310),
('B0013', 'Popaya', 'Darwis', '20 Maret 2021', 'Buah Buahan', 'Popaya Besar Dan Panjang', 20),
('B0014', 'Selada', 'Sari', '1 January 2022', 'Sayur sayuran', 'Selada Pink', 45),
('B0015', 'Kentang', 'farhan', '18 April 2021', 'Sayur Sayuran', 'Kentang La Bonnotte dari italia', 5),
('B0016', 'Sawi', 'Zahra', '29 September 2021', 'Sayur sayuran', 'Sayur herbal', 50),
('B0017', 'Lidah Buaya', 'Mikel', '10 Januari 2022', 'Sayur sayuran', 'Manfaat Lidah buaya', 70),
('B0018', 'Tembakau', 'Wahyu', '02 Februari 2022', 'Produk Mentah', 'Tembakau Yang higenis', 110),
('B0019', 'Kapas', 'Dea nur', '08 Mey 2022', 'Produk Mentah', 'Kapas Terbaik Di Indonesia', 100),
('B0020', 'Tebu', 'Yandi', '19 Agustus 2921', 'Produk Mentah', 'Tebu manis dan higenis', 135),
('B0021', 'Jagung', 'Haikal', '17 Agustus 2022', 'Produk Mentah', 'Jagung untuk lebaran', 580),
('B0022', 'Ubi Jalar', 'Raya', '11 Desember 2022', 'Sayur Sayuran', 'Ubi Dari Bawah Tanah', 70),
('B0023', 'Langsat', 'Bima', '17 Agustus 2022', 'Buah Buahan', 'langsat termanis', 120);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indeks untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`id_pemesanan`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`id_produk`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
