public class Universite
{
    private String univercity;
    private String bolum;
    private int ogrenciSayisi;
    private int notOrtalamasi;

    public Universite()
    {

    }

    public Universite(String univercity, String bolum, int ogrenciSayisi, int notOrtalamasi)
    {
        this.univercity = univercity;
        this.bolum = bolum;
        this.ogrenciSayisi = ogrenciSayisi;
        this.notOrtalamasi = notOrtalamasi;
    }

    public String getUnivercity()
    {
        return univercity;
    }

    public void setUnivercity(String univercity)
    {
        this.univercity = univercity;
    }

    public String getBolum()
    {
        return bolum;
    }

    public void setBolum(String bolum)
    {
        this.bolum = bolum;
    }

    public int getOgrenciSayisi()
    {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi)
    {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getNotOrtalamasi()
    {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(int notOrtalamasi)
    {
        this.notOrtalamasi = notOrtalamasi;
    }

   @Override
    public String toString()
    {
        return "Universite{" +
                "univercity='" + univercity + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", notOrtalamasi=" + notOrtalamasi +
                '}';
    }
}
