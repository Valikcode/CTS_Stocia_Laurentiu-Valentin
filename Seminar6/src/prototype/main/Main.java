package prototype.main;

import prototype.model.ContBancar;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> documente = new HashMap<>();
        documente.put("CI",2);
        documente.put("Adeverinta",3);
        documente.put("Certificat",8);

        ContBancar contBancar = new ContBancar("Andrei",documente,13);
        ContBancar contBancar1 = (ContBancar) contBancar.cloneaza();
        System.out.println(contBancar1);
    }
}
