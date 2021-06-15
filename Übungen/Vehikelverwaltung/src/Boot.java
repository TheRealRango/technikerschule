/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorenz
 */
public class Boot extends Vehikel{
    
    private int passagieranzahl;

    public Boot() {
        passagieranzahl=0;
    }

    public void setPassagieranzahl(int passagieranzahl) {
        this.passagieranzahl = passagieranzahl;
    }

    @Override
    public String getNachricht() {
        return super.getNachricht(); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
