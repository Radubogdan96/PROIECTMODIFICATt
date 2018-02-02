/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll.system;

/**
 *
 * @author Bogdan
 */
public class progresbar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        interfatabar s = new interfatabar();
        s.setVisible(true);
        login L = new login();
        try{
            for(int i =0 ;i<=100;i++){
Thread.sleep(70);
s.loadingnum.setText(Integer.toString(i)+"%");
s.loading.setValue(i);
        if(i==100){
            s.setVisible(false);
            L.setVisible(true);
        }
            }
    
}catch(Exception e){
    
}
    }
}