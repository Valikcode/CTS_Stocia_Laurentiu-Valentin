package builder.main;

import builder.model.BuilderInterface;
import builder.model.ContBancar;
import builder.model.ContBancarBuilder;
import builder.model.ContBuilder;

public class Main {
    public static void main(String[] args) {
        BuilderInterface builder = new ContBuilder();
        ContBancar cont = builder.setNume("Vali").build();
        ContBancar cont_1 = builder.setNume("Indigo").build();
        System.out.println(cont.toString());
        System.out.println(cont_1.toString());

        BuilderInterface contBancarBuilder = new ContBancarBuilder();
        ContBancar cont2 = contBancarBuilder.setInternetBanking(true).setPrimesteSalariu(true).setCardAtasat(true).setNume("Cata").build();
        ContBancar cont3 = contBancarBuilder.setNume("Luca").build();
        System.out.println(cont2.toString());
        System.out.println(cont3.toString());
    }
}