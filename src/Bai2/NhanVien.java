package Bai2;

public abstract class NhanVien {
    private String id;
    private String hoTen;
    private String namSinh;
    private String diaChi;

    public NhanVien() {
    }

    public NhanVien(String id, String hoTen, String namSinh, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NhanVien[" +
                "id='" + id + '\'' +
                ",hoTen='" + hoTen + '\'' +
                ",namSinh='" + namSinh + '\'' +
                ",diaChi='" + diaChi + '\'' +
                ']';
    }
    public abstract String moTaCongViec();
}
