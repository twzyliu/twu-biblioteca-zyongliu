package com.twu.biblioteca.Domain;

import com.twu.biblioteca.MessageDialog;

import javax.swing.*;
import java.util.List;
import java.util.Map;

/**
 * Created by zyongliu on 16/8/11.
 */
public class ProductionList <T extends ProductionList>{
    private static Map<String, Production> productions;
    private static List<String> availableProductions;

    public static int checkoutProduction(String productionID ) {
        if( !availableProductions.contains(productionID) ){
            MessageDialog.showMessageDialog("That production is not available.", JOptionPane.ERROR_MESSAGE);
            return -1;
        }

        productions.get(productionID).setState(1);
        availableProductions.remove(productionID);
        MessageDialog.showMessageDialog("Thank you! Enjoy the production.", JOptionPane.INFORMATION_MESSAGE);
        return 1;
    }

    public static int returnProduction(String productionID ) {
        if( !productions.containsKey(productionID) ) {
            MessageDialog.showMessageDialog("That is not a valid production to return.", JOptionPane.ERROR_MESSAGE);
            return -1;
        }

        availableProductions.add( productionID );
        productions.get(productionID).setState(0);
        MessageDialog.showMessageDialog("Thank you for returning the book.", JOptionPane.INFORMATION_MESSAGE);
        return 1;
    }

    public static List<String> getAvailableProductions() {
        return availableProductions;
    }

    public static Map<String, Production> getAllProductions() {
        return productions;
    }

    public static String createProductionID(){
        return String.valueOf( productions.size() + 1 );
    }

    public static Production getProduction(String id) {
        return productions.get(id);
    }

    public static int getTotalCount() {
        return productions.size();
    }
}
