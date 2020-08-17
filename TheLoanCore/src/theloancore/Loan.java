/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package theloancore;

/**
 *
 * @author fahd_
 */
public class Loan {
    private int bookId;
    private int memberID;
    private String takeOutDate;
    private String returnDate;

    
   public  Loan(){
        this.bookId=0;
        this.memberID=0;
        this.takeOutDate="defualt";
        this.returnDate ="defualt";
    }
    
  public  Loan(int bID, int memId, String takeOut, String returnDate){
        this.bookId=bID;
        this.memberID=memId;
        this.takeOutDate=takeOut;
        this.returnDate = returnDate;
    }


    /**
     * @return the bookId
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * @return the memberID
     */
    public int getMemberID() {
        return memberID;
    }

    /**
     * @return the takeOutDate
     */
    public String getTakeOutDate() {
        return takeOutDate;
    }

    /**
     * @return the returnDate
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    /**
     * @param memberID the memberID to set
     */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    /**
     * @param takeOutDate the takeOutDate to set
     */
    public void setTakeOutDate(String takeOutDate) {
        this.takeOutDate = takeOutDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    
    
    public String print(){
      return this.bookId+" "+ this.memberID+" "+this.takeOutDate+" "+this.returnDate;
        
    }
    
    
}
