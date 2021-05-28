package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;

public class NumberListModel implements NumberListContract.Model {

    public static String TAG = NumberListModel.class.getSimpleName();

    private String data;

    private int number;
    private List<NumberData> numberDataList;


    public NumberListModel(String data) {
        this.data = data;
        numberDataList = new ArrayList<NumberData>();
    }

    @Override
    public String getStoredData() {
        // Log.e(TAG, "getStoredData()");
        return data;
    }

    @Override
    public void onRestartScreen(String data) {
        // Log.e(TAG, "onRestartScreen()");
    }

    @Override
    public void onDataFromNextScreen(String data) {
        // Log.e(TAG, "onDataFromNextScreen()");
    }

    @Override
    public void onDataFromPreviousScreen(String data) {
        // Log.e(TAG, "onDataFromPreviousScreen()");
    }

    @Override
    public void onClickNumberListButton(int numeroVista) {
        NumberData numero = new NumberData();

        numeroVista++;

        numero.number = numeroVista;

        numberDataList.add(numero);
        setNumber(numero.number);

    }

    @Override
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public List<NumberData> getNumberDataList() {
        return numberDataList;
    }
}
