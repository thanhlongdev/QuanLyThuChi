USE [master]
GO
/****** Object:  Database [DuAn1]    Script Date: 22/03/2020 13:47:12 ******/
CREATE DATABASE [DuAn1]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'DuAn1', FILENAME = N'D:\Tai Lieu\Co so du lieu\SQLSever\DuAn1.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'DuAn1_log', FILENAME = N'D:\Tai Lieu\Co so du lieu\SQLSever\DuAn1_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [DuAn1] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [DuAn1].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [DuAn1] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [DuAn1] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [DuAn1] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [DuAn1] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [DuAn1] SET ARITHABORT OFF 
GO
ALTER DATABASE [DuAn1] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [DuAn1] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [DuAn1] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [DuAn1] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [DuAn1] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [DuAn1] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [DuAn1] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [DuAn1] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [DuAn1] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [DuAn1] SET  DISABLE_BROKER 
GO
ALTER DATABASE [DuAn1] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [DuAn1] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [DuAn1] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [DuAn1] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [DuAn1] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [DuAn1] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [DuAn1] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [DuAn1] SET RECOVERY FULL 
GO
ALTER DATABASE [DuAn1] SET  MULTI_USER 
GO
ALTER DATABASE [DuAn1] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [DuAn1] SET DB_CHAINING OFF 
GO
ALTER DATABASE [DuAn1] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [DuAn1] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [DuAn1] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'DuAn1', N'ON'
GO
USE [DuAn1]
GO
/****** Object:  Table [dbo].[ChiTietChi]    Script Date: 22/03/2020 13:47:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietChi](
	[mahdchi] [int] NOT NULL,
	[loaichi] [int] NOT NULL,
	[mota] [nvarchar](255) NULL,
	[sotien] [int] NULL,
 CONSTRAINT [PK__ChiTietC__DBCBA04410B55972] PRIMARY KEY CLUSTERED 
(
	[mahdchi] ASC,
	[loaichi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietThu]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietThu](
	[mahdthu] [int] NOT NULL,
	[loaithu] [int] NOT NULL,
	[mota] [nvarchar](255) NULL,
	[sotien] [int] NULL,
 CONSTRAINT [PK__ChiTietT__6B10329E571DAF06] PRIMARY KEY CLUSTERED 
(
	[mahdthu] ASC,
	[loaithu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDonChi]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[HoaDonChi](
	[idhdchi] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](10) NOT NULL,
	[ngaychi] [datetime] NULL,
 CONSTRAINT [PK__HoaDonCh__0D6892B79D5F96AB] PRIMARY KEY CLUSTERED 
(
	[idhdchi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[HoaDonThu]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[HoaDonThu](
	[mahdthu] [int] IDENTITY(1,1) NOT NULL,
	[username] [varchar](10) NOT NULL,
	[ngaythu] [datetime] NULL,
 CONSTRAINT [PK__HoaDonTh__1128A0E1A1CB7DAF] PRIMARY KEY CLUSTERED 
(
	[mahdthu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[LoaiChi]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiChi](
	[maloaichi] [int] IDENTITY(1,1) NOT NULL,
	[mota] [nvarchar](255) NULL,
	[tenloai] [nvarchar](50) NULL,
 CONSTRAINT [PK__LoaiChi__4D8B4A85AC509BC2] PRIMARY KEY CLUSTERED 
(
	[maloaichi] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiThu]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiThu](
	[maloaithu] [int] IDENTITY(1,1) NOT NULL,
	[mota] [nvarchar](255) NULL,
	[tenloaithu] [nvarchar](50) NULL,
 CONSTRAINT [PK__LoaiThu__30E325636EDF6F69] PRIMARY KEY CLUSTERED 
(
	[maloaithu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NguoiDung]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NguoiDung](
	[username] [varchar](10) NOT NULL,
	[gioitinh] [bit] NULL,
	[hoten] [nvarchar](50) NULL,
	[ngaysinh] [datetime] NULL,
	[password] [varchar](50) NULL,
	[sodienthoai] [varchar](10) NULL,
	[vaitro] [bit] NULL,
	[hinh] [varchar](100) NULL,
 CONSTRAINT [PK__NguoiDun__F3DBC57328713C9C] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (1, 1, N'haha', 3000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (1, 2, N'', 200000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (1, 3, N'', 100000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (4, 2, N'Ti?n Ði?n', 100000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (4, 3, N'Ti?n Nu?c', 300000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (5, 1, N'', 6000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (5, 2, N'', 3000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (5, 3, N'', 3000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (6, 1, N'asd', 6000000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (6, 2, N'asd', 9000000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (7, 2, N'', 300000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (7, 3, N'', 3000000)
INSERT [dbo].[ChiTietChi] ([mahdchi], [loaichi], [mota], [sotien]) VALUES (7, 4, N'', 5000000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (5, 0, N'30000', 3000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (5, 1, N'30000', 3000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (6, 1, N'asdqwe', 30000000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (7, 0, N'asd', 60000000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (7, 1, N'asd', 90000000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (8, 1, N'', 60000000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (9, 0, N'Luong', 15300000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (9, 1, N'Luong', 300000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (10, 1, N'', 300000000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (11, 1, N'', 300000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (11, 2, N'', 300000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (12, 1, N'', 300000)
INSERT [dbo].[ChiTietThu] ([mahdthu], [loaithu], [mota], [sotien]) VALUES (12, 2, N'', 600000)
SET IDENTITY_INSERT [dbo].[HoaDonChi] ON 

INSERT [dbo].[HoaDonChi] ([idhdchi], [username], [ngaychi]) VALUES (1, N'admin', CAST(N'2019-12-06 00:00:00.000' AS DateTime))
INSERT [dbo].[HoaDonChi] ([idhdchi], [username], [ngaychi]) VALUES (2, N'admin', CAST(N'2019-12-07 17:37:40.247' AS DateTime))
INSERT [dbo].[HoaDonChi] ([idhdchi], [username], [ngaychi]) VALUES (3, N'admin', CAST(N'2019-12-07 22:24:34.757' AS DateTime))
INSERT [dbo].[HoaDonChi] ([idhdchi], [username], [ngaychi]) VALUES (4, N'admin', CAST(N'2019-12-07 22:28:14.900' AS DateTime))
INSERT [dbo].[HoaDonChi] ([idhdchi], [username], [ngaychi]) VALUES (5, N'long', CAST(N'2019-12-07 22:33:42.050' AS DateTime))
INSERT [dbo].[HoaDonChi] ([idhdchi], [username], [ngaychi]) VALUES (6, N'long', CAST(N'2019-12-08 21:21:42.433' AS DateTime))
INSERT [dbo].[HoaDonChi] ([idhdchi], [username], [ngaychi]) VALUES (7, N'son', CAST(N'2019-12-17 21:13:55.693' AS DateTime))
SET IDENTITY_INSERT [dbo].[HoaDonChi] OFF
SET IDENTITY_INSERT [dbo].[HoaDonThu] ON 

INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (2, N'admin', CAST(N'2019-12-08 20:58:12.580' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (3, N'admin', CAST(N'2019-12-08 21:10:57.250' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (4, N'admin', CAST(N'2019-12-08 21:14:02.113' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (5, N'admin', CAST(N'2019-12-08 21:14:53.127' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (6, N'long', CAST(N'2019-12-08 21:17:04.040' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (7, N'long', CAST(N'2019-12-08 21:20:00.363' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (8, N'long', CAST(N'2019-12-08 21:22:15.937' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (9, N'son', CAST(N'2019-12-17 21:13:19.333' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (10, N'son', CAST(N'2019-12-17 21:28:28.957' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (11, N'admin', CAST(N'2019-12-18 19:57:15.667' AS DateTime))
INSERT [dbo].[HoaDonThu] ([mahdthu], [username], [ngaythu]) VALUES (12, N'admin', CAST(N'2019-12-19 08:04:07.947' AS DateTime))
SET IDENTITY_INSERT [dbo].[HoaDonThu] OFF
SET IDENTITY_INSERT [dbo].[LoaiChi] ON 

INSERT [dbo].[LoaiChi] ([maloaichi], [mota], [tenloai]) VALUES (1, N'Khong co loai nao', N'Khác')
INSERT [dbo].[LoaiChi] ([maloaichi], [mota], [tenloai]) VALUES (2, N'asdasdasdsa', N'Tiền Điện')
INSERT [dbo].[LoaiChi] ([maloaichi], [mota], [tenloai]) VALUES (3, N'asdasdasdsa', N'Tiền Nước')
INSERT [dbo].[LoaiChi] ([maloaichi], [mota], [tenloai]) VALUES (4, N'Tiền mạng', N'Tiền Internet')
INSERT [dbo].[LoaiChi] ([maloaichi], [mota], [tenloai]) VALUES (5, N'', N'tien nuoc')
INSERT [dbo].[LoaiChi] ([maloaichi], [mota], [tenloai]) VALUES (6, N'', N'Học Phí')
SET IDENTITY_INSERT [dbo].[LoaiChi] OFF
SET IDENTITY_INSERT [dbo].[LoaiThu] ON 

INSERT [dbo].[LoaiThu] ([maloaithu], [mota], [tenloaithu]) VALUES (0, N'Khong co loai nao', N'Khác')
INSERT [dbo].[LoaiThu] ([maloaithu], [mota], [tenloaithu]) VALUES (1, N'Tiền Lương Đoá', N'Lương')
INSERT [dbo].[LoaiThu] ([maloaithu], [mota], [tenloaithu]) VALUES (2, N'', N'Tiền Thưởng')
INSERT [dbo].[LoaiThu] ([maloaithu], [mota], [tenloaithu]) VALUES (3, N'', N'tien thuong')
SET IDENTITY_INSERT [dbo].[LoaiThu] OFF
INSERT [dbo].[NguoiDung] ([username], [gioitinh], [hoten], [ngaysinh], [password], [sodienthoai], [vaitro], [hinh]) VALUES (N'admin', 1, N'Admin', CAST(N'2000-01-01 00:00:00.000' AS DateTime), N'admin', N'0978387250', 1, N'unknown.jpg')
INSERT [dbo].[NguoiDung] ([username], [gioitinh], [hoten], [ngaysinh], [password], [sodienthoai], [vaitro], [hinh]) VALUES (N'khang', 1, N'khang hoang', CAST(N'2019-12-11 07:55:25.543' AS DateTime), N'123', N'1235647812', 0, N'avatar.png')
INSERT [dbo].[NguoiDung] ([username], [gioitinh], [hoten], [ngaysinh], [password], [sodienthoai], [vaitro], [hinh]) VALUES (N'long', 1, N'Long', CAST(N'2019-12-04 00:00:00.000' AS DateTime), N'123', N'0303030303', 0, N'unknown.jpg')
INSERT [dbo].[NguoiDung] ([username], [gioitinh], [hoten], [ngaysinh], [password], [sodienthoai], [vaitro], [hinh]) VALUES (N'son', 1, N'Sơn', CAST(N'2019-12-17 21:12:41.957' AS DateTime), N'123', N'0302010405', 0, N'avatar.png')
ALTER TABLE [dbo].[ChiTietChi]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietChi_HoaDonChi] FOREIGN KEY([mahdchi])
REFERENCES [dbo].[HoaDonChi] ([idhdchi])
GO
ALTER TABLE [dbo].[ChiTietChi] CHECK CONSTRAINT [FK_ChiTietChi_HoaDonChi]
GO
ALTER TABLE [dbo].[ChiTietChi]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietChi_LoaiChi] FOREIGN KEY([loaichi])
REFERENCES [dbo].[LoaiChi] ([maloaichi])
GO
ALTER TABLE [dbo].[ChiTietChi] CHECK CONSTRAINT [FK_ChiTietChi_LoaiChi]
GO
ALTER TABLE [dbo].[ChiTietThu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietThu_HoaDonThu] FOREIGN KEY([mahdthu])
REFERENCES [dbo].[HoaDonThu] ([mahdthu])
GO
ALTER TABLE [dbo].[ChiTietThu] CHECK CONSTRAINT [FK_ChiTietThu_HoaDonThu]
GO
ALTER TABLE [dbo].[ChiTietThu]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietThu_LoaiThu] FOREIGN KEY([loaithu])
REFERENCES [dbo].[LoaiThu] ([maloaithu])
GO
ALTER TABLE [dbo].[ChiTietThu] CHECK CONSTRAINT [FK_ChiTietThu_LoaiThu]
GO
ALTER TABLE [dbo].[HoaDonChi]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonChi_NguoiDung] FOREIGN KEY([username])
REFERENCES [dbo].[NguoiDung] ([username])
GO
ALTER TABLE [dbo].[HoaDonChi] CHECK CONSTRAINT [FK_HoaDonChi_NguoiDung]
GO
ALTER TABLE [dbo].[HoaDonThu]  WITH CHECK ADD  CONSTRAINT [FK_HoaDonThu_NguoiDung] FOREIGN KEY([username])
REFERENCES [dbo].[NguoiDung] ([username])
GO
ALTER TABLE [dbo].[HoaDonThu] CHECK CONSTRAINT [FK_HoaDonThu_NguoiDung]
GO
/****** Object:  StoredProcedure [dbo].[sp_getTotalChiByDay]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getTotalChiByDay]  @day int, @month int, @year int
as
	begin
		select SUM(sotien) from ChiTietChi where mahdchi in 
			(select idhdchi from HoaDonChi where DAY(ngaychi) = @day and MONTH(ngaychi) = @month and YEAR(ngaychi) = @year) 
				group by mahdchi order by sum(sotien) desc;
	end;

GO
/****** Object:  StoredProcedure [dbo].[sp_getTotalChiByMonth]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create Procedure [dbo].[sp_getTotalChiByMonth]  @month int, @year int
as
	begin
		select SUM(sotien) from ChiTietChi where mahdchi in 
			(select idhdchi from HoaDonChi where MONTH(ngaychi) = @month and YEAR(ngaychi) = @year) 
				group by mahdchi order by sum(sotien) desc;
	end;
GO
/****** Object:  StoredProcedure [dbo].[sp_getTotalChiByYear]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getTotalChiByYear]  @year int
as
	begin
		select SUM(sotien) from ChiTietChi where mahdchi in 
			(select idhdchi from HoaDonChi where YEAR(ngaychi) = @year) 
				group by mahdchi order by sum(sotien) desc;
	end;
GO
/****** Object:  StoredProcedure [dbo].[sp_getTotalThuByDay]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getTotalThuByDay]  @day int, @month int, @year int
as
	begin
		select SUM(sotien) from ChiTietThu where mahdthu in 
			(select mahdthu from HoaDonThu where DAY(ngaythu) = @day and MONTH(ngaythu) = @month and YEAR(ngaythu) = @year) 
				group by mahdthu order by sum(sotien) desc;
	end;
GO
/****** Object:  StoredProcedure [dbo].[sp_getTotalThuByMonth]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getTotalThuByMonth]  @month int, @year int
as
	begin
		select SUM(sotien) from ChiTietThu where mahdthu in 
			(select mahdthu from HoaDonThu where MONTH(ngaythu) = @month and YEAR(ngaythu) = @year) 
				group by mahdthu order by sum(sotien) desc;
	end;

GO
/****** Object:  StoredProcedure [dbo].[sp_getTotalThuByYear]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getTotalThuByYear]  @year int
as
	begin
		select SUM(sotien) from ChiTietThu where mahdthu in 
			(select mahdthu from HoaDonThu where YEAR(ngaythu) = @year) 
				group by mahdthu order by sum(sotien) desc;
	end;

GO
/****** Object:  StoredProcedure [dbo].[sp_getUserChiByDay]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getUserChiByDay]  @day int, @month int, @year int
as
	begin
		select  username from HoaDonChi 
			where idhdchi = (select top 1 mahdchi from ChiTietChi 
				where mahdchi in (select idhdchi from HoaDonChi 
					where DAY(ngaychi) = @day and MONTH(ngaychi) = @month and YEAR(ngaychi) = @year) 
						group by mahdchi order by sum(sotien) desc)
	end;
GO
/****** Object:  StoredProcedure [dbo].[sp_getUserChiByMonth]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getUserChiByMonth]  @month int, @year int
as
	begin
		select  username from HoaDonChi 
			where idhdchi = (select top 1 mahdchi from ChiTietChi 
				where mahdchi in (select idhdchi from HoaDonChi 
					where MONTH(ngaychi) = @month and YEAR(ngaychi) = @year) 
						group by mahdchi order by sum(sotien) desc)
	end;
GO
/****** Object:  StoredProcedure [dbo].[sp_getUserChiByYear]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getUserChiByYear]  @year int
as
	begin
		select  username from HoaDonChi 
			where idhdchi = (select top 1 mahdchi from ChiTietChi 
				where mahdchi in (select idhdchi from HoaDonChi 
					where YEAR(ngaychi) = @year) 
						group by mahdchi order by sum(sotien) desc)
	end;
GO
/****** Object:  StoredProcedure [dbo].[sp_getUserThuByDay]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getUserThuByDay]  @day int, @month int, @year int
as
	begin
		select  username from HoaDonThu 
			where mahdthu = (select top 1 mahdthu from ChiTietThu 
				where mahdthu in (select mahdthu from HoaDonThu 
					where DAY(ngaythu) = @day and MONTH(ngaythu) = @month and YEAR(ngaythu) = @year) 
						group by mahdthu order by sum(sotien) desc)
	end;
GO
/****** Object:  StoredProcedure [dbo].[sp_getUserThuByMonth]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getUserThuByMonth]  @month int, @year int
as
	begin
		select  username from HoaDonThu 
			where mahdthu = (select top 1 mahdthu from ChiTietThu 
				where mahdthu in (select mahdthu from HoaDonThu 
					where MONTH(ngaythu) = @month and YEAR(ngaythu) = @year) 
						group by mahdthu order by sum(sotien) desc)
	end;
GO
/****** Object:  StoredProcedure [dbo].[sp_getUserThuByYear]    Script Date: 22/03/2020 13:47:13 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE Procedure [dbo].[sp_getUserThuByYear] @year int
as
	begin
		select  username from HoaDonThu 
			where mahdthu = (select top 1 mahdthu from ChiTietThu 
				where mahdthu in (select mahdthu from HoaDonThu 
					where YEAR(ngaythu) = @year) 
						group by mahdthu order by sum(sotien) desc)
	end;
GO
USE [master]
GO
ALTER DATABASE [DuAn1] SET  READ_WRITE 
GO
