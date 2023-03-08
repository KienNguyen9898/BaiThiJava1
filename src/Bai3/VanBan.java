package Bai3;

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
        int demVb = 0;
        char ch[] = new char[chuoiKiTu.length()];
        for (int i=0; i< chuoiKiTu.length();i++ ){
            ch[i] = chuoiKiTu.charAt(i);
            if (((i>0) && (ch[i] !=' ')) && (ch[i-1] ==' ')){
                demVb++;
            }
            return demVb;
        }
    }

    @Override
    public String toString() {
        return "VanBan[" +
                "chuoiKiTu='" + chuoiKiTu + '\'' +
                ']';
    }
}
