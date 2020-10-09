package Facade;

public class LendingList {

    public boolean check(String bookName) {

        //貸出帳をチェックする

        //貸出中ならtrue、そうでなければfalseを返す
        if(bookName == "昆虫図鑑"){
        	
        	return false;
        }else{
        	 return true;
        }
    }

}
