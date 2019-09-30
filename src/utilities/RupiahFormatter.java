/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Ahmad Faiz Kamaludin
 */
public class RupiahFormatter {
    
    private static RupiahFormatter instance;
    private DecimalFormat uang = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    private DecimalFormatSymbols rp = new DecimalFormatSymbols();

    public RupiahFormatter() {
        rp.setCurrencySymbol("Rp. ");
        rp.setMonetaryDecimalSeparator(',');
        rp.setGroupingSeparator('.');
        uang.setDecimalFormatSymbols(rp);
    }
    
    public String format(double money) {
        return uang.format(money);
    }
    
    public static RupiahFormatter getInstance() {
        if (instance == null) {
            instance = new RupiahFormatter();
            return instance;
        }
        else {
            return instance;
        }
    }
}
