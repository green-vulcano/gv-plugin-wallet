package it.greenvulcano.gvesb.plugin.wallet;

import java.util.*;

import it.greenvulcano.util.metadata.PropertyHandler;
import it.greenvulcano.util.metadata.PropertiesHandlerException;

/**
 * @author Domenico Barra - eisenach@gmail.com
 */
public class WalletPropertyHandler implements PropertyHandler {

    private static Set<String> MANAGED_TYPES;
    static {
        Set<String> mt = new HashSet<>();
        mt.add("wlt");
        MANAGED_TYPES = Collections.unmodifiableSet(mt);
    }


    public String expand(String type, String str, Map<String, Object> inProperties, Object object,
                         Object extra) throws PropertiesHandlerException
    {
        return "EXPANDED(" + str + ")";
    }

    public Set<String> getManagedTypes() {
        return MANAGED_TYPES;
    }

}
