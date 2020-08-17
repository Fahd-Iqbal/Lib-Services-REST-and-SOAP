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
public class Member {
    private int memberID; 
    private String first_name;
    private String last_name; 
    private String contact; 

    
    public Member(){
        this.memberID=0;
        this.first_name="default";
        this.last_name="default";
        this.contact="default";
    }
    public Member(String fname, String lname, String con){
        this.first_name=fname;
        this.last_name=lname;
        this.contact=con;
    }
    
    public Member(int id, String fn, String ln, String con){
        this.memberID=id;
        this.first_name=fn;
        this.last_name=ln;
        this.contact=con;
    }
    
    /**
     * @return the memberID
     */
    public int getMemberID() {
        return memberID;
    }

    /**
     * @return the first_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * @return the Last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param memberID the memberID to set
     */
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    /**
     * @param first_name the first_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * @param Last_name the Last_name to set
     */
    public void setLast_name(String Last_name) {
        this.last_name = Last_name;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public String print(){
        return this.memberID+" " +this.first_name+" "+ this.last_name;
    }
    
    
    
}
