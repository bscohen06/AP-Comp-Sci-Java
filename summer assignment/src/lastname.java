/* 
 @file lastname.java
 @author Ben Cohen (bscohen06@gmail.com)
 @brief seperates last name
 @version 1.0.0
 @date 2024-8-23
 
 This program takes a string with a first name and last name and takes the last name and puts it in a new string
 
 */
public class lastname {

    public static void main(String[] args) throws Exception {
        String fullName = "Ben Cohen";
        int k = fullName.indexOf(" ");
        String lastName = fullName.substring(k + 1);
        System.out.println(lastName);

    }
}
