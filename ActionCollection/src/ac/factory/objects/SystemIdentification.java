/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.factory.objects;

import ac.core.*;
import elsu.common.StatusType;
import elsu.database.*;
import elsu.support.*;
import java.util.EventObject;

public class SystemIdentification extends ActionObject {

    public SystemIdentification(ConfigLoader config, DatabaseManager dbManager) throws Exception {
        // retrieve the action configuration from the actionobject config for
        // the class name
        super(config, dbManager);
    }

    @Override
    public void EventHandler(EventObject e, StatusType s, String message, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
