//Generic sınıf oluşturma !!!
public class YazdirmaSinifi<E> { //sana farklı türlerden veriler göndereceğim sende bu E yi kullanan yerlere yaz. 
    
    
    public void yazdir(E[] dizi){
        
        for (E e : dizi){
            
            System.out.println(e);
        }
        
    }
}
