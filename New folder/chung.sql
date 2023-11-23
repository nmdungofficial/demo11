USE master
GO
-- +++++++++++++++++++++++++++++++ CREATE DATABASE +++++++++++++++++++++++++++++++ --
-- Drop database
IF EXISTS (SELECT name FROM sys.databases WHERE name = N'DB_NHOM_6_DUAN1')
   DROP DATABASE DB_NHOM_6_DUAN_1
GO
-- Create database
CREATE DATABASE DB_NHOM_6_DUAN_1
GO

-- +++++++++++++++++++++++++++++++ CREATE TABLES +++++++++++++++++++++++++++++++ --
USE DB_NHOM_6_DUAN_1
GO

CREATE TABLE MauSac (
	ID_MauSac INT IDENTITY PRIMARY KEY NOT NULL,
	Ten_MauSac NVARCHAR(256) NOT NULL,

)
--drop table MauSac
insert into MauSac
values (N'Đen'),
		(N'Xám'),
		(N'Ghi'),
		(N'Nâu'),
		(N'Xanh dương')
CREATE TABLE DanhMuc (
	ID_DanhMuc INT IDENTITY PRIMARY KEY NOT NULL,
	Ten_DanhMuc NVARCHAR(256) NOT NULL,

)
insert into DanhMuc
values (N'Bộ sưu tập mùa hè'),
		(N'Bộ sưu tập mùa đông'),
		(N'mẫu hot 2023'),
		(N'Bán chạy nhất'),
		(N'Hàng mới về')

CREATE TABLE KichThuoc (
	ID_KichThuoc INT IDENTITY PRIMARY KEY NOT NULL,
	Ten_KichThuoc INT NOT NULL,

)
insert into KichThuoc
values (37),
		(38),
		(39),
		(40),
		(41)

CREATE TABLE XuatXu (
	ID_XuatXu INT IDENTITY PRIMARY KEY NOT NULL,
	Ten_XuatXu NVARCHAR(256) NOT NULL
)
insert into XuatXu
values (N'Việt Nam'),
		(N'Đức'),
		(N'Mỹ'),
		(N'Hàn Quốc'),
		(N'Nga') 

CREATE TABLE ChatLieu (
	ID_ChatLieu INT IDENTITY PRIMARY KEY NOT NULL,
	Ten_ChatLieu NVARCHAR(256) NOT NULL
) 

insert into ChatLieu
values (N'Da bò nhập khẩu'),
		(N'Da PU'),
		(N'Cao su'),
		(N'Tổng hợp'),
		(N'Lưới') 
CREATE TABLE KieuDe (
	ID_KieuDe INT IDENTITY PRIMARY KEY NOT NULL,
	Ten_KieuDe NVARCHAR(256) NOT NULL
)
insert into KieuDe
values (N'Cork Nitrile'),
		(N'Rubber'),
		(N'Crepe'),
		(N'Wedge'),
		(N'Leather') 
CREATE TABLE LopLot (
	ID_LopLot INT IDENTITY PRIMARY KEY NOT NULL,
	Ten_LopLot NVARCHAR(256) NOT NULL
)
insert into LopLot
values (N'Adapt Run Max'),
		(N'Da'),
		(N'Superfeet Carbon'),
		(N' Powerstep Pinnacle'),
		(N'Leather') 
CREATE TABLE KieuMui (
	ID_KieuMui INT IDENTITY PRIMARY KEY NOT NULL,
	Ten_KieuMui NVARCHAR(256) NOT NULL
)

insert into KieuMui
values (N'Mũi nhọn'),
		(N'Mũi vuông'),
		(N'Mũi tròn'),
		(N'Mũi thon'),
		(N'Mũi dục') 

CREATE TABLE HinhAnh (
	ID_HinhAnh INT IDENTITY PRIMARY KEY NOT NULL,
	IMG NVARCHAR(256) NOT NULL
)

select * from HinhAnh
insert into HinhAnh
values (N'giay1.jpg'),
		(N'giay2.jpg'),
		(N'giay3.jpg'),
		(N'giay4.jpg'),
		(N'giay5.jpg') 

CREATE TABLE Giay (
	ID_Giay INT IDENTITY PRIMARY KEY NOT NULL,
	Ma_Giay NVARCHAR(256) NOT NULL,
	Ten_Giay NVARCHAR(256) NOT NULL,
	ID_XuatXu INT FOREIGN KEY REFERENCES XuatXu(ID_XuatXu),
	ID_DanhMuc INT FOREIGN KEY REFERENCES DanhMuc(ID_DanhMuc),
	TrangThai_Giay NVARCHAR(100) NOT NULL
)

insert into Giay
values ('SP001',N'Giày Nike',2, 3, N'Đang hoạt động'),
	 ('SP002',N'Giày abc',1, 4, N'Đang hoạt động'),
	  ('SP003',N'Giày xyz',3, 1, N'Ngừng hoạt động'),
	   ('SP004',N'Giày JOdan',4, 1, N'Ngừng hoạt động'),
	    ('SP005',N'Giày hihi',2, 3, N'Ngừng hoạt động'),
		('SP006',N'Giày 6',1, 1, N'Ngừng hoạt động'),
	    ('SP007',N'Giày 7',4, 3, N'Ngừng hoạt động')
	
select ID_DanhMuc, Ten_Giay from Giay

CREATE TABLE Giay_ChiTiet (
	ID_GiayChiTiet INT IDENTITY PRIMARY KEY NOT NULL,
	Ma_GiayChiTiet NVARCHAR(256) NOT NULL,
	Ten_GiayChiTiet NVARCHAR(256) NOT NULL,
	ID_Giay INT FOREIGN KEY REFERENCES Giay(ID_Giay),
	SoLuong INT NOT NULL,
	GiaBan FLOAT NOT NULL,
	ID_HinhAnh INT FOREIGN KEY REFERENCES HinhAnh(ID_HinhAnh),
	ID_MauSac INT FOREIGN KEY REFERENCES MauSac(ID_MauSac),
	ID_KichThuoc INT FOREIGN KEY REFERENCES KichThuoc(ID_KichThuoc),

	ID_ChatLieu INT FOREIGN KEY REFERENCES ChatLieu(ID_ChatLieu),
	ID_KieuDe INT FOREIGN KEY REFERENCES KieuDe(ID_KieuDe),
	ID_LopLot INT FOREIGN KEY REFERENCES LopLot(ID_LopLot),
	ID_KieuMui INT FOREIGN KEY REFERENCES KieuMui(ID_KieuMui),
	
	--MoTa_Giay NVARCHAR(MAX),

)
insert into Giay_ChiTiet
values	('SPCT-01-A','AB-CC-01', 1, 66, 300000,1,1,1,5,2,1,1),
		('SPCT-02-A','HH-CD-01', 2, 66, 4577888,2,2,4,4,3,2,2),
		('SPCT-03-A', 'MM-CC-01',3, 33, 366767,3,4,5,3,4,2,2),
		('SPCT-04-A','FF-CC-01', 4, 87, 900000,4,3,2,2,2,1,1),
		('SPCT-05-A','Đ-CC-01', 2, 363, 35666,5,2,1,1,1,2,1),
		('SPCT-06-A','Đ-CC-01', 6, 99, 35666,5,2,1,1,1,2,1),
		('SPCT-07-A','Đ-CC-01', 7, 335, 35666,5,2,1,1,1,2,1),
		('SPCT-05-A','Đ-CC-01', 5, 532, 35666,5,2,1,1,1,2,1)



CREATE TABLE KHACHHANG(
ID_KhachHang  INT identity ,
TenKH NVARCHAR(30),
GioiTinh BIT ,
NgaySinh date,
SoDT nvarchar(13) ,
Email NVARCHAR(30),
DiaChi NVARCHAR(50),
NgayTao DATE,
NgayCapNhat DATE,
TrangThai NVARCHAR(50),
PRIMARY KEY (ID_KhachHang)
)
GO


CREATE TABLE DIACHI(
ID_DiaChi INT NOT NULL  ,
ID_ThanhPho INT,
Ten_ThanhPho NVARCHAR(30),
Ten_Quan_Huyen NVARCHAR(30),
Ten_Duong_SoNha NVARCHAR(30),
ID_KhachHang INT ,
PRIMARY KEY (ID_DiaChi),
FOREIGN KEY (ID_KhachHang)  REFERENCES KHACHHANG(ID_KhachHang)

)
GO

CREATE TABLE TICHDIEM(
ID_TichDiem INT identity  PRIMARY KEY,
So_DiemTichLuy int ,
So_DiemDaDung int,
So_DiemConLai int,
ID_KhachHang INT ,
FOREIGN KEY (ID_KhachHang)  REFERENCES KHACHHANG(ID_KhachHang)
)
GO

CREATE TABLE ThongTin_LienHeKhac(
ID_LienHe INT identity PRIMARY KEY,
NenTangXH NVARCHAR(30),
Ten_MXH NVARCHAR(30),
ID_KhachHang INT,
FOREIGN KEY (ID_KhachHang)  REFERENCES KHACHHANG(ID_KhachHang)
)
GO

CREATE TABLE Feedback(
ID_Feedback INT NOT NULL PRIMARY KEY ,
feedBack NVARCHAR(100),
NgayViet DATE ,
ID_KhachHang INT,
FOREIGN KEY (ID_KhachHang)  REFERENCES KHACHHANG(ID_KhachHang)
)
GO

CREATE TABLE LichSuMuaHang1(
ID_LichSuMua INT identity PRIMARY KEY,
SanPham_DaMua NVARCHAR(50),
NgayMua DATE ,
SoLuong INT ,
SoTiem_Mua float ,
ThanhToan BIT,
ID_KhachHang INT,
FOREIGN KEY (ID_KhachHang)  REFERENCES KHACHHANG(ID_KhachHang)
)
GO

SELECT * FROM KHACHHANG
SELECT * FROM DIACHI
SELECT * FROM TICHDIEM
SELECT * FROM Feedback
SELECT * FROM LichSuMuaHang1
SELECT * FROM ThongTin_LienHeKhac
-------------------------------------------------------------------------------------
insert into KHACHHANG(TenKH, GioiTinh, NgaySinh, SoDT, Email, DiaChi, NgayTao, NgayCapNhat, TrangThai)
values  (N'Nguyễn Thu Hằng',0,'2004-07-30','0344691228','HangThu307@gmail.com',N'Hải Dương','2023-07-22', '',''),
		(N'Phạm Thái Sơn',1,'2004-04-30','0975921234','ThaiSon2004@gmail.com',N'Điện Biên','2023-05-22','',''),
		(N'Lê Thu Trang',0,'2000-11-12','0975921989','TrangLe2000@gmail.com',N'Hà Nội ','2023-07-09','2023-07-13',N'đã sửa'),
		(N'Nguyễn Ngọc Phương',0,'2001-05-10','0972222905','NgocPhuong2001@gmail.com',N'Hưng Yên ','2303-07-24','',''),
		(N'Trần Việt Cường',0,'2003-02-24','0975944445','CuongTran242@gmail.com',N'Thái Bình','2023-06-23','','')

INSERT INTO DIACHI (ID_DiaChi, ID_ThanhPho, Ten_ThanhPho, Ten_Quan_Huyen, Ten_Duong_SoNha, ID_KhachHang)
VALUES 
(1, 1, 'Hanoi', 'Cau Giay', '123 ABC Street', 1),
(2, 2, 'Ho Chi Minh City', 'District 1', '456 XYZ Street', 2),
(3, 3, 'Da Nang', 'Hai Chau', '789 QWE Street', 3),
(4, 4, 'Can Tho', 'Ninh Kieu', '101 PQR Street', 4),
(5, 5, 'Hai Phong', 'Duong Kinh', '202 LMN Street', 5);

INSERT INTO TICHDIEM (So_DiemTichLuy, So_DiemDaDung, So_DiemConLai, ID_KhachHang)
VALUES 
(150, 50, 100, 1),
(200, 100, 100, 2),
(100, 20, 80, 3),
(300, 200, 100, 4),
(250, 150, 100, 5);
INSERT INTO ThongTin_LienHeKhac (NenTangXH, Ten_MXH, ID_KhachHang)
VALUES 
('Facebook', 'fb_nguyenvana', 1),
('Instagram', 'ig_tranthib', 2),
('Twitter', 'tw_levanc', 3),
('LinkedIn', 'li_phamthid', 4),
('Snapchat', 'sc_hoangvane', 5);

INSERT INTO Feedback (ID_Feedback, feedBack, NgayViet, ID_KhachHang)
VALUES 
(1, 'Great service!', '2023-11-15', 1),
(2, 'Product quality is excellent.', '2023-11-16', 2),
(3, 'Could improve delivery speed.', '2023-11-14', 3),
(4, 'Responsive customer support.', '2023-11-13', 4),
(5, 'Satisfied with the purchase.', '2023-11-12', 5);

INSERT INTO LichSuMuaHang1 (SanPham_DaMua, NgayMua, SoLuong, SoTiem_Mua, ThanhToan, ID_KhachHang)
VALUES 
('Product A', '2023-11-15', 2, 1.5, 1, 1),
('Product B', '2023-11-16', 1, 2, 0, 2),
('Product C', '2023-11-14', 3, 1, 1, 3),
('Product D', '2023-11-13', 1, 3, 0, 4),
('Product E', '2023-11-12', 2, 1.75, 1, 5);

--Hải

CREATE TABLE TaiKhoan(
	ID_TaiKhoan INT  PRIMARY KEY NOT NULL,
	ID_NhanVien INT NOT NULL,
	TenTK NVARCHAR(256) NOT NULL,
	MatKhau NVARCHAR(100) NOT NULL,
	
)
GO

INSERT INTO TaiKhoan (ID_TaiKhoan,ID_NhanVien, TenTK, MatKhau) VALUES
(1, 1, 'nv001', '123456'),
(2, 2,'nv002', 'password123'),
(3, 3,'nv003', 'abc123'),
(4, 4,'nv004', 'qwerty123'),
(5, 5,'nv005', 'ilovecoding');

CREATE TABLE ChamSocKhachHang(
	ID_ChamSocKhachHang INT  PRIMARY KEY NOT NULL,
	PhanHoiKhachHang NVARCHAR(256) NOT NULL,
	ID_KhachHang int NOT NULL,
	FOREIGN KEY(ID_KhachHang) REFERENCES KHACHHANG(ID_KhachHang)
)
GO

INSERT INTO ChamSocKhachHang (ID_ChamSocKhachHang, PhanHoiKhachHang, ID_KhachHang) VALUES
(1,'Khách hàng hài lòng với sản phẩm đã mua.', 1),
(2,'Khách hàng có thắc mắc về sản phẩm mới.', 2),
(3,'Khách hàng khiếu nại về dịch vụ giao hàng.', 3),
(4,'Khách hàng muốn đổi trả sản phẩm.', 4),
(5,'Khách hàng cần tư vấn về sản phẩm phù hợp.', 5);

Create table ChucVu(
ID_ChucVu INT IDENTITY(1,1) PRIMARY KEY,
TENCHUCVU NVARCHAR(255)
)

DROP TABLE NhanVien
CREATE TABLE NhanVien (
	ID_NhanVien INT  PRIMARY KEY NOT NULL,
	TenNhanVien NVARCHAR(256) NOT NULL,
	GioiTinh NVARCHAR(3) NOT NULL,
	NgaySinh NVARCHAR(20) NOT NULL,
	SDT NVARCHAR(13) NOT NULL,
	Email NVARCHAR(256) NOT NULL,
	NgayTao NVARCHAR(100) NOT NULL,
	NgayCapNhat NVARCHAR(100) NOT NULL,
	TrangThai NVARCHAR(100) NOT NULL,
	ID_TaiKhoan INT FOREIGN KEY REFERENCES TaiKhoan(ID_TaiKhoan),
	ID_KhachHang INT FOREIGN KEY REFERENCES KhachHang(ID_KhachHang),
	ID_ChamSocKhachHang INT FOREIGN KEY REFERENCES ChamSocKhachHang(ID_ChamSocKhachHang),
	ID_ChucVu INT FOREIGN KEY REFERENCES Chucvu(ID_ChucVu)
)
GO

insert into chucvu values (N'Nhân viên'),(N'Quản lý');
INSERT INTO NhanVien ( ID_NhanVien, TenNhanVien, GioiTinh, NgaySinh, SDT, Email, NgayTao, NgayCapNhat, TrangThai, ID_TaiKhoan, ID_KhachHang, ID_ChamSocKhachHang, ID_ChucVu) VALUES
(1,'Nguyễn Văn An', 'Nam', '1990-10-01', '0901234567', 'anv@gmail.com', '2023-11-13', '2023-11-13', 'Hoạt động', 1, 1, 5,1),
(2,'Trần Thị Bích', 'Nữ', '1991-05-05', '0987654321', 'bicht@gmail.com', '2023-11-13', '2023-11-13', 'Hoạt động', 2, 2, 4,2),
(3,'Lê Văn Cường', 'Nam', '1992-02-02', '0123456789', 'cuonglv@gmail.com', '2023-11-13', '2023-11-13', 'Hoạt động', 3, 3, 3,2),
(4,'Đặng Thị Dịu', 'Nữ', '1993-08-08', '0912345678', 'diudt@gmail.com', '2023-11-13', '2023-11-13', 'Hoạt động', 4, 4, 2,1),
(5,'Nguyễn Đình Em', 'Nam', '1994-11-11', '0898765432', 'emnd@gmail.com', '2023-11-13', '2023-11-13', 'Hoạt động', 5, 5, 1,2);

--Quang

CREATE TABLE LOAIGIAMGIA(
ID INT IDENTITY(1,1) PRIMARY KEY,
TENLOAIGIAMGIA NVARCHAR(50)
)
INSERT INTO LOAIGIAMGIA (TENLOAIGIAMGIA)
VALUES
(N'Giảm giá theo tiền'),
(N'Giảm giá theo %');

CREATE TABLE PHIEUGIAMGIA (
  ID_PGG INT IDENTITY(1,1) PRIMARY KEY,
  MAGIAMGIA INT,
  TENGIAMGIA varchar(255),
  PHANTRANGIAM INT,
  NGAYTAO DATE,
  THOIGIANBATDAU DATE,
  THOIGIANKETTHUC DATE,
  IDNHANVIEN INT,
  IDLOAIGIAMGIA INT,
  FOREIGN KEY(IDNHANVIEN) REFERENCES NHANVIEN(ID_NHANVIEN),
  FOREIGN KEY(IDLOAIGIAMGIA) REFERENCES LOAIGIAMGIA(ID),

)
INSERT INTO PHIEUGIAMGIA (MAGIAMGIA, TENGIAMGIA, PHANTRANGIAM, NGAYTAO, THOIGIANBATDAU, THOIGIANKETTHUC, IDNHANVIEN, IDLOAIGIAMGIA)
VALUES
  (123456, 'Giảm giá 10000', 10000, '2023-11-01', '2023-11-05', '2023-11-15', 1, 1),
  (789012, 'Giảm giá 20%', 20, '2023-11-02', '2023-11-06', '2023-11-16', 2, 2);

--SƠN

CREATE TABLE PhieuDoiTra (
  ID_Phieu INT IDENTITY PRIMARY KEY NOT NULL ,
  ID_KhachHang INT ,
  ID_NhanVien INT ,
  ID_HoaDon INT,
  Ngay_Doi DATE,
  FOREIGN KEY (ID_HoaDon) REFERENCES HOADON(ID),
  FOREIGN KEY (ID_KhachHang) REFERENCES KhachHang (ID_KhachHang),
  FOREIGN KEY (ID_NhanVien) REFERENCES NhanVien (ID_NhanVien)
)
GO

INSERT INTO PhieuDoiTra (ID_KhachHang, ID_NhanVien, Ngay_Đoi) VALUES
(1, 1, '2023-11-14'),
(2, 2, '2023-11-15'),
(3, 3, '2023-11-16'),
(4, 4, '2023-11-17'),
(5, 5, '2023-11-18');

select * from phieudoitra

CREATE TABLE TrangThaiPhieu (
    ID_TrangThai INT PRIMARY KEY,
    TrangThai NVARCHAR(50),
    
)
GO

INSERT INTO TrangThaiPhieu (ID_TrangThai, TrangThai) VALUES
(1, N'Chờ xử lý'),
(2, N'Đã tiếp nhận'),
(3, N'Đã kiểm tra'),
(4, N'Đã đổi hàng'),
(5, N'Đã hủy');


CREATE TABLE LyDoDoiTra (
    ID_LyDo INT PRIMARY KEY,
    LyDo NVARCHAR(255)
)
GO

INSERT INTO LyDoDoiTra (ID_LyDo, LyDo) VALUES
(1, N'Sản phẩm bị lỗi'),
(2, N'Sản phẩm không đúng mô tả'),
(3, N'Sản phẩm bị hư hỏng trong quá trình vận chuyển'),
(4, N'Khách hàng đổi ý'),
(5, N'Khách hàng không hài lòng với sản phẩm');

drop table khohangdoitra
CREATE TABLE KhoHangDoiTra (
    ID_KhoHang INT IDENTITY PRIMARY KEY,
	Ma_Kho NVARCHAR(10),
    DiaChi NVARCHAR(255),
    TenKho NVARCHAR(255),
    NgayTao NVARCHAR(15),
    LienHe VARCHAR (20),
    SLHangTrongkho INT,
    GhiChu NVARCHAR(MAX),

)
GO

INSERT INTO KhoHangDoiTra ( DiaChi, TenKho, NgayTao, LienHe, GhiChu, SLHangTrongkho) VALUES
(N'Số 100, Đường Nguyễn Trãi, Hà Nội', N'Kho hàng chính', '10-10-2023', '0123456789', N'Kho hàng chính của công ty', 1000),
(N'Số 50, Đường Điện Biên Phủ, Hà Nội', N'Kho hàng phụ', '10-10-2023', '0234567891', N'Kho hàng phụ của công ty', 2000),
(N'Số 100, Đường Lê Văn Lương, Hà Nội', N'Kho hàng miền Bắc', '10-10-2023', '0345678912', N'Kho hàng miền Bắc của công ty', 3000),
(N'Số 100, Đường Nguyễn Chí Thanh, Đà Nẵng', N'Kho hàng miền Trung', '10-10-2023', '0456789123', N'Kho hàng miền Trung của công ty', 1500),
(N'Số 100, Đường Cách Mạng Tháng Tám, Thành phố Hồ Chí Minh', N'Kho hàng miền Nam', '10-10-2023', '0567891234', N'Kho hàng miền Nam của công ty', 2400);

SELECT * FROM KhoHangDoiTra
drop table ChiTietPhieu_ĐoiTra
CREATE TABLE ChiTietPhieu_ĐoiTra (
  ID_Phieu_ChiTiet INT IDENTITY PRIMARY KEY NOT NULL,
  Ma_PCT NVARCHAR(15),
  ID_Phieu INT,
  ID_KhoHang INT,
  ID_TrangThai INT,
  ID_LyDo INT,
  SoLuongDoi_Tra INT,
  GhiChu NVARCHAR(MAX)

  FOREIGN KEY (ID_Phieu) REFERENCES PhieuDoiTra (ID_Phieu),
  FOREIGN KEY (ID_TrangThai) REFERENCES TrangThaiPhieu (ID_TrangThai),
  FOREIGN KEY (ID_LyDo) REFERENCES LyDoDoiTra (ID_LyDo),
--   FOREIGN KEY (ID_Giay) REFERENCES Giay (ID_Giay),
  FOREIGN KEY (ID_KhoHang) REFERENCES KhoHangDoiTra (ID_KhoHang)
);

INSERT INTO ChiTietPhieu_ĐoiTra (ID_Phieu, ID_KhoHang, ID_TrangThai, ID_LyDo, SoLuongDoi_Tra, GhiChu) 
VALUES  ( 1, 1, 2, 1, 5, N'ok'),
        ( 2, 2, 1, 5, 4, N'not ok'),
        ( 3, 3, 3, 3, 3, N'no ok'),
        ( 4, 4, 2, 4, 2, N'super ok'),
        ( 5, 5, 1, 2, 1, N'yes');

--ĐĂNG

CREATE TABLE DotGiamGia(
    ID_DotGiamGia INT PRIMARY KEY NOT NULL,
    TenDotGiamGia NVARCHAR(256) NOT NULL,
    HinhAnh VARCHAR(256)  NULL,
    NgayBatDau DATE NOT NULL,
    NgayKetThuc DATE NOT NULL ,
    Giam FLOAT NOT NULL CHECK(Giam>0),
    TrangThai BIT,
    MoTa TEXT,
    ID_PTTT INT,
    GiaMin Money,
    GiaMax Money,
    --FOREIGN KEY (ID_PTTT) REFERENCES PhuongThucThanhToan(ID_PTTT)
    
)

CREATE TABLE ChiTietDotGiamGia(
    ID_DotGiamGia INT NOT NULL,
    ID_Giay INT NOT NULL,
    PRIMARY KEY (ID_DotGiamGia,ID_Giay),
    FOREIGN KEY (ID_Giay) REFERENCES Giay(ID_Giay),
    FOREIGN KEY (ID_DotGiamGia) REFERENCES DotGiamGia(ID_DotGiamGia)
    
)

INSERT INTO DotGiamGia VALUES 
(1,'CTKM xxxx xxxx','','2023/10/10','2023/10/15',88,0,'',1,0,9999),
(2,'CTKM yyyy yyyy','','2023/9/10','2023/9/15',77,0,'',2,0,9999),
(3,'CTKM zzzz zzzz','','2023/8/10','2023/8/15',66,1,'',3,0,9999),
(4,'CTKM oooo oooo','','2023/7/10','2023/7/15',55,0,'',2,0,9999),
(5,'CTKM eeee eeee','','2023/6/10','2023/6/15',44,1,'',2,0,9999),
(6,'CTKM wwww wwww','','2023/5/10','2023/5/15',33,0,'',1,0,9999),
(7,'CTKM ssss ssss','','2023/4/10','2023/4/15',22,1,'',3,0,9999);



--HOÁ ĐƠN

CREATE TABLE HOADON(
ID INT IDENTITY(1,1) PRIMARY KEY,
ID_KhachHang INT,
ID_NhanVien INT,
ID_GiayChiTiet INT,
ID_PhieuGiamGia INT,
SoLuongSanPham INT,
GhiChu NVARCHAR(255),
TongTien decimal(13),
FOREIGN KEY(ID_KhachHang) REFERENCES KhachHang(ID_KhachHang),
FOREIGN KEY(ID_NhanVien) REFERENCES NhanVien(ID_NhanVien),
FOREIGN KEY(ID_GiayChiTiet) REFERENCES Giay_ChiTiet(ID_GiayChiTiet),
FOREIGN KEY(ID_PhieuGiamGia) REFERENCES PHIEUGIAMGIA(ID_PGG)
)
