package member;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String eMail;

    Member(){

    }
    Member(String name, int age, String phoneNumber, String eMail){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public  String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String geteMail(){
        return this.eMail;
    }
    public void seteMail(String eMail){
        this.eMail = eMail;
    }

    public double calcAverageAge(Member[] memberArray){

        int sum = 0;
        for(Member e: memberArray) {
            sum += e.age;
        }

        return sum / (double)memberArray.length;

    }

    public int howManyMembersWithLastName(Member[] memberArray, String lastName){

        int manyMember = 0;

        for(Member e: memberArray){
            if(lastName.equals(e.name.substring(0,1))){
                manyMember++;
            }
        }

        return manyMember;
    }


    public double calcAverageIdChar(Member[] memberArray){

        int sum = 0;

        for(Member e: memberArray){
            String[] eMailSplit = e.eMail.split("@");

            sum += eMailSplit[0].length();
        }

        return sum / (double)memberArray.length;
    }
}
