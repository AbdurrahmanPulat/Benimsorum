
package ogrenciuygulamasi;

import java.util.ArrayList;
import java.util.List;


public class OgrenciUygulamasi {

    
    public static void main(String[] args) {
        
        Goster();
        
    }
    
    public static void Goster(){
        Ogrenci yeni = new Ogrenci("Ahmet", "Yılmaz", "170541000");
        YazilimOgrencileri yazOgr = new YazilimOgrencileri("Mehmet", "Yılmaz", "170541001");
        yeni.dersEkle("Fizik-I");
        yeni.dersEkle("Matematik-I");
        yazOgr.dersEkle("Nesne Tabanlı Programlama");
        yeni.ogrenciBilgileri(yeni.getOgrenciNo());
        yazOgr.ogrenciBilgileri(yazOgr.getOgrenciNo());
    }
    
}

class Ogrenci{
	public String ogrenciAd;
	public String ogrenciSoyad;
	private String ogrenciNo;
        
        public String getOgrenciNo(){
            return ogrenciNo;
        }
        
        public void setOgrenciNo(String x){
            this.ogrenciNo = x;
        }
	
	protected List ogrenciDersler = new ArrayList();
	
	public Ogrenci(String a, String b, String c){
		this.ogrenciAd = a;
		this.ogrenciSoyad = b;
		this.ogrenciNo = c;
	}
        
        public Ogrenci(){
            
        }
	
	public void dersEkle(String dersAdi){
		this.ogrenciDersler.add(dersAdi);
	}
        
        
	 
	public void dersSil(String dersAdi){
		try{
			this.ogrenciDersler.remove(dersAdi);
		}
		catch (Exception e){
			System.out.println("Böyle bir ders bulunamadı.");
		}
	}
	
	public void ogrenciBilgileri(String ogrenciNo){
		
		try{
			System.out.println("\n"+this.getOgrenciNo() + " numaralı öğrencinin\nAdı: " + this.ogrenciAd + "\nSoyadı: " + this.ogrenciSoyad + "\nÖğrenci toplam " + this.ogrenciDersler.size() + " ders alıyor.");
                        for (int i = 0; i < this.ogrenciDersler.size(); i++){
                            System.out.println((i+1) + ". ders adı: " + this.ogrenciDersler.get(i).toString());
                        }
		}
		catch (Exception e){
			System.out.println("Böyle bir öğrenci bulunamadı.");
		}
		
        }
}


class YazilimOgrencileri extends Ogrenci{
	
	public YazilimOgrencileri(String a, String b, String c){
                this.ogrenciAd = a;
                this.ogrenciSoyad = b;
                this.setOgrenciNo(c);
		this.ogrenciDersler.add("Algoritma ve Programlama - I");
		this.ogrenciDersler.add("Algoritma ve Programlama - II");
	}
	
}
