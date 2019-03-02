/**
 * @author Ibrahim Ali Metin
 */
public class Main {
    public static void main(String[] args) {
         //Generic classlar türen bağımsız olarak çalışan sınıflardır. Gönderilen değere göre işlem yapar.
         //Aynı işlemleri yapıyoruz fakat veri tipleri değişiyor. Ceneric sınıf yazarak türden ağımzız işlem sağlıyor olacaktık.
         Character[] char_dizi = {'A', 'L', 'I'};
         Integer [] integer_dizi = {1,2,3,4,5};
         String[] string_dizi = {"Ali", "Metin", "İbrahim"};
    
         Ogrenci [] ogrenci_dizi = { new Ogrenci("Ali"), new Ogrenci("Selim"), new Ogrenci("Merve")};

    System.out.println("**********************");
    YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
    yazdir_char.yazdir(char_dizi);
    System.out.println("**********************");
    YazdirmaSinifi<String> yazdir_string = new YazdirmaSinifi<String>();
    yazdir_string.yazdir(string_dizi);
    System.out.println("**********************");
    YazdirmaSinifi<Integer> yazdir_integer = new YazdirmaSinifi<Integer>();
    yazdir_integer.yazdir(integer_dizi);
    System.out.println("**********************");
    YazdirmaSinifi<Ogrenci> yazdir_ogrenci = new YazdirmaSinifi<Ogrenci>();
    yazdir_ogrenci.yazdir(ogrenci_dizi);
    System.out.println("**********************");
    
        /*
    System.out.println("**********************");
    CharYazdir.yazdir(char_dizi);
    System.out.println("**********************");
    StringYazdir.yazdir(string_dizi);
    System.out.println("**********************");
    IntegerYazdir.yazdir(integer_dizi);
    System.out.println("**********************");
    StringYazdir.yazdir(string_dizi);
    System.out.println("**********************");
    OgrenciYazdir.yazdir(ogrenci_dizi);
    System.out.println("**********************");
    */ 
    }
}
