# Generic_Class
Java Generic Sınıflar.

Generic ismiyle adlandırdığımız yapılar, bir method ya da bir classın, yazılımcının türden bağımsız olarak oluşturduğu,
kullanıldığı yere göre türlerinin belirlenip bu tür üzerinden işlem yapılmasını sağlayan yapılardır.En yaygın örneği 
ArrayList<>'tir. ArrayList'in <>'leri içine farklı türler yazabiliyoruz ve artık listemiz bizim belirttiğimiz türlerden oluyor.
 
      public static void main(String[] args) {
            ArrayList<String> isimler = new ArrayList<String>();
            ArrayList<Integer> notlar = new ArrayList<Integer>();
      }
 
Yukarıdaki örneğimizde, isimler ArrayList'inin String, notlar ArrayList'inin türü Integer'dır fakat sonuçta ikisi de ArrayList 
sınıfından türemiştir. Generic bizi her nesne türü için benzer işlemleri tekrar tekrar yaptırma zorunluluğnudan kurtarmaktadır.
