package helper;

public class Restok {

    int id, qty;
    String tanggal, perequest, pemberi, nama, status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public String getPerequest() {
        return perequest;
    }

    public void setPerequest(String perequest) {
        this.perequest = perequest;
    }

    public String getPemberi() {
        return pemberi;
    }

    public void setPemberi(String pemberi) {
        this.pemberi = pemberi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

}
