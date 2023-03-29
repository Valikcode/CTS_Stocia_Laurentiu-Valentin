package prototype.model;

import java.util.HashMap;
import java.util.Map;

public class ContBancar implements IContCloneable{
    private String name;
    private Map<String,Integer> documente;
    private int numarFileDosar;

    public ContBancar(String name, Map<String, Integer> documente, int numarFileDosar) {
        int sum = 0;
        for(Integer file : documente.values()){
            sum+=file;
        }
        if(sum == numarFileDosar){
            this.name = name;
            this.documente = documente;
            this.numarFileDosar = numarFileDosar;
        } else{
            throw new IllegalArgumentException("Numar incorect de file");
        }
    }

    private ContBancar(){
        this.documente = null;
    }
    @Override
    public IContCloneable cloneaza() {
        ContBancar contCopie = new ContBancar();
        contCopie.name = this.name;
        contCopie.numarFileDosar = this.numarFileDosar;

        contCopie.documente = new HashMap<>();
        for(String key:this.documente.keySet()){
            contCopie.documente.put(key,this.documente.get(key));
        }
        return contCopie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("name='").append(name).append('\'');
        sb.append(", documente=").append(documente);
        sb.append(", numarFileDosar=").append(numarFileDosar);
        sb.append('}');
        return sb.toString();
    }
}
