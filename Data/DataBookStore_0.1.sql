USE [master]
GO
/****** Object:  Database [BookStore]    Script Date: 2/18/2020 3:50:45 PM ******/
CREATE DATABASE [BookStore]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'BookStore', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\BookStore.mdf' , SIZE = 4288KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'BookStore_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\BookStore_log.ldf' , SIZE = 1072KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [BookStore] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [BookStore].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [BookStore] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [BookStore] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [BookStore] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [BookStore] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [BookStore] SET ARITHABORT OFF 
GO
ALTER DATABASE [BookStore] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [BookStore] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [BookStore] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [BookStore] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [BookStore] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [BookStore] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [BookStore] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [BookStore] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [BookStore] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [BookStore] SET  ENABLE_BROKER 
GO
ALTER DATABASE [BookStore] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [BookStore] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [BookStore] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [BookStore] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [BookStore] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [BookStore] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [BookStore] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [BookStore] SET RECOVERY FULL 
GO
ALTER DATABASE [BookStore] SET  MULTI_USER 
GO
ALTER DATABASE [BookStore] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [BookStore] SET DB_CHAINING OFF 
GO
ALTER DATABASE [BookStore] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [BookStore] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [BookStore] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'BookStore', N'ON'
GO
USE [BookStore]
GO
/****** Object:  Table [dbo].[BookinBuild]    Script Date: 2/18/2020 3:50:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[BookinBuild](
	[bookID] [varchar](30) NOT NULL,
	[buildID] [varchar](30) NOT NULL,
	[quantity] [int] NOT NULL,
 CONSTRAINT [PK__BookinBu__60359EC69261D473] PRIMARY KEY CLUSTERED 
(
	[bookID] ASC,
	[buildID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Books]    Script Date: 2/18/2020 3:50:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Books](
	[bookID] [varchar](30) NOT NULL,
	[titleBook] [nvarchar](30) NOT NULL,
	[author] [nvarchar](30) NOT NULL,
	[descriptionBook] [nvarchar](50) NOT NULL,
	[imagerName] [varchar](30) NULL,
	[price] [varchar](30) NOT NULL,
	[quantityBook] [int] NOT NULL,
	[category] [varchar](30) NOT NULL,
	[statusBook] [varchar](10) NOT NULL,
	[dateCreate] [varchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[bookID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Builds]    Script Date: 2/18/2020 3:50:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Builds](
	[buildID] [varchar](30) NOT NULL,
	[dateBuild] [varchar](50) NOT NULL,
	[totalBuild] [varchar](30) NOT NULL,
	[payment] [varchar](20) NOT NULL,
	[statusBuild] [varchar](20) NOT NULL,
	[descriptionBuild] [varchar](50) NULL,
	[userID] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[buildID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Discount]    Script Date: 2/18/2020 3:50:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Discount](
	[discountID] [varchar](20) NOT NULL,
	[descriptionDiscount] [nvarchar](50) NOT NULL,
	[codeDiscount] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[discountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[UserHaveDiscount]    Script Date: 2/18/2020 3:50:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[UserHaveDiscount](
	[discountID] [varchar](20) NOT NULL,
	[userID] [varchar](20) NOT NULL,
	[statusDiscount] [nchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[discountID] ASC,
	[userID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Users]    Script Date: 2/18/2020 3:50:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Users](
	[userID] [varchar](20) NOT NULL,
	[pass] [varchar](20) NOT NULL,
	[roleUser] [varchar](20) NOT NULL,
	[phone] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Books] ([bookID], [titleBook], [author], [descriptionBook], [imagerName], [price], [quantityBook], [category], [statusBook], [dateCreate]) VALUES (N'BOOK1', N'Đắc Nhân Tâm', N'Nguyễn Văn A', N'Sách Văn học viết về văn học', N'bookImager1', N'20000', 10, N'AAA', N'ready', N'null')
INSERT [dbo].[Books] ([bookID], [titleBook], [author], [descriptionBook], [imagerName], [price], [quantityBook], [category], [statusBook], [dateCreate]) VALUES (N'BOOK2', N'Sống giản dị', N'Nguyễn Văn B', N'Sách đời sống văn học việt nam', N'bookImager2', N'25000', 10, N'BBB', N'ready', N'null')
INSERT [dbo].[Books] ([bookID], [titleBook], [author], [descriptionBook], [imagerName], [price], [quantityBook], [category], [statusBook], [dateCreate]) VALUES (N'BOOK3', N'Tôi và các bạn', N'Nguyễn Văn A', N'Sách đời Kinh tế ', N'bookImager3', N'15000', 10, N'AAA', N'ready', N'null')
INSERT [dbo].[Books] ([bookID], [titleBook], [author], [descriptionBook], [imagerName], [price], [quantityBook], [category], [statusBook], [dateCreate]) VALUES (N'BOOK4', N'Dế mèn phưu lưu ký ', N'Nguyễn Văn C', N'Sách văn học tuổi trẻ', N'bookImager4', N'12000', 10, N'AAA', N'ready', N'null')
INSERT [dbo].[Books] ([bookID], [titleBook], [author], [descriptionBook], [imagerName], [price], [quantityBook], [category], [statusBook], [dateCreate]) VALUES (N'BOOK5 ', N'Học lập trình căn bản', N'Nguyễn Văn T', N'Sách dạy học', N'bookImager5', N'18000', 10, N'CCC', N'ready', N'null')
INSERT [dbo].[Builds] ([buildID], [dateBuild], [totalBuild], [payment], [statusBuild], [descriptionBuild], [userID]) VALUES (N'BUILD1', N'null', N'20000', N'online', N'done', N'null', N'linhnd')
INSERT [dbo].[Discount] ([discountID], [descriptionDiscount], [codeDiscount]) VALUES (N'DISCOUNT', N'khuyến mãi giảm 20 %', N'20')
INSERT [dbo].[Discount] ([discountID], [descriptionDiscount], [codeDiscount]) VALUES (N'DISCOUNT1', N'khuyến mãi 50%', N'50')
INSERT [dbo].[Discount] ([discountID], [descriptionDiscount], [codeDiscount]) VALUES (N'DISCOUNT2', N'khuyến mãi 70%', N'70')
INSERT [dbo].[UserHaveDiscount] ([discountID], [userID], [statusDiscount]) VALUES (N'DISCOUNT', N'linhnd', N'1         ')
INSERT [dbo].[UserHaveDiscount] ([discountID], [userID], [statusDiscount]) VALUES (N'DISCOUNT', N'longnd', N'1         ')
INSERT [dbo].[Users] ([userID], [pass], [roleUser], [phone]) VALUES (N'admin', N'admin', N'admin', N'admin')
INSERT [dbo].[Users] ([userID], [pass], [roleUser], [phone]) VALUES (N'linhnd', N'123456', N'user', N'0822201930')
INSERT [dbo].[Users] ([userID], [pass], [roleUser], [phone]) VALUES (N'longnd', N'123456', N'user', N'0822201930')
ALTER TABLE [dbo].[BookinBuild]  WITH CHECK ADD  CONSTRAINT [FK__BookinBui__bookI__1920BF5C] FOREIGN KEY([bookID])
REFERENCES [dbo].[Books] ([bookID])
GO
ALTER TABLE [dbo].[BookinBuild] CHECK CONSTRAINT [FK__BookinBui__bookI__1920BF5C]
GO
ALTER TABLE [dbo].[BookinBuild]  WITH CHECK ADD  CONSTRAINT [FK__BookinBui__build__1A14E395] FOREIGN KEY([buildID])
REFERENCES [dbo].[Builds] ([buildID])
GO
ALTER TABLE [dbo].[BookinBuild] CHECK CONSTRAINT [FK__BookinBui__build__1A14E395]
GO
ALTER TABLE [dbo].[Builds]  WITH CHECK ADD FOREIGN KEY([userID])
REFERENCES [dbo].[Users] ([userID])
GO
ALTER TABLE [dbo].[UserHaveDiscount]  WITH CHECK ADD FOREIGN KEY([discountID])
REFERENCES [dbo].[Discount] ([discountID])
GO
ALTER TABLE [dbo].[UserHaveDiscount]  WITH CHECK ADD FOREIGN KEY([userID])
REFERENCES [dbo].[Users] ([userID])
GO
USE [master]
GO
ALTER DATABASE [BookStore] SET  READ_WRITE 
GO
