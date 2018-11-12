/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan Rivera Villaseñor 18550367
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones oObj = new Operaciones();
        System.out.println("La suma de 5 + 7 = " + oObj.suma(5, 7));
        System.out.println("La suma de Juan Perez es: " +oObj.suma("Juan", "Perez"));
        System.out.println("true AND false ES: " +oObj.suma(true, false));
    }
    
}
class Operaciones{
    public int suma(int iVall, int iVal2){
        return iVall + iVal2;
    }
    public String suma(String sVall, String sVal2){
        return sVall + sVal2;//CONCATENADO
    }
    public boolean suma(boolean bVal1, boolean bVal2){
        return bVal1 && bVal2; //AND
    }
}