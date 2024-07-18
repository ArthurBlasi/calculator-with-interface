package aplicacao;

import java.util.ArrayList;

public class ACMECalculator {

    private ArrayList<String> calculos;

    public ACMECalculator() {
        calculos = new ArrayList();
    }

    public void limparLista() {
        calculos.clear();
    }

    public void apagar() {
        calculos.removeLast();
    }

    public void addNum(String n) {
        calculos.add(n);
    }





    public ArrayList<String> getCalculos() {
        return calculos;
    }
    
}
