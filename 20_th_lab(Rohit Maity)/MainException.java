//write a program to create custom exception in java
package Testprogram;
class CustomException extends Exception {
    String message;
    CustomException(String str) {
        message = str;}
    public String toString() {
        return ("Custom Exception  : " + message);}}
public class MainException {
    public static void main(String args[]) {
        try {
            throw new CustomException("This is a custom Exception");
        } catch(CustomException e) {
            System.out.println(e);}}}




