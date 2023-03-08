package Bai3;

import java.util.StringTokenizer;

public class VanBan {
    private String chuoiKiTu;

    public VanBan() {
    }

    public VanBan(String chuoiKiTu) {
        this.chuoiKiTu = chuoiKiTu;
    }

    public String getChuoiKiTu() {
        return chuoiKiTu;
    }

    public void setChuoiKiTu(String chuoiKiTu) {
        this.chuoiKiTu = chuoiKiTu;
    }

    public int demVb(){
        return chuoiKiTu.length();
        }

    public String vietHoa(){
        return chuoiKiTu.toUpperCase();
    }

    public String vietThuong(){
        return chuoiKiTu.toLowerCase();
    }
    @Override
    public String toString() {
        return "VanBan[" +
                "chuoiKiTu='" + chuoiKiTu + '\'' +
                ']';
    }
}
