package Facade;

public class BookList {

    public String searchBook(String bookName) {

        String location = null;
        
        //本の名前から探す
        //あればその場所を、なければnullを返す
        if(bookName == "昆虫図鑑"){
       location = "場所はI899.21です";
  //   location = "貸出中です";
   //     location = "その本は所蔵していません";
        }
        return location;
    }

}