package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.LetterData;

public class LetterListModel implements LetterListContract.Model {

    public static String TAG = LetterListModel.class.getSimpleName();

    private String data;

    private List<LetterData> letterDataList;

    public LetterListModel(String data) {
        this.data = data;
        letterDataList = new ArrayList<>();
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
    public void onClickLetterListButton(String data) {
        LetterData letter = new LetterData();
        if (data.equals("A")) {
            letter.letter = "B";
        } else if (data.equals("B")) {
            letter.letter = "C";
        } else if (data.equals("C")) {
            letter.letter = "D";
        } else if (data.equals("D")) {
            letter.letter = "E";
        } else if (data.equals("E")) {
            letter.letter = "F";
        } else {
            letter.letter = "A";
        }
        letterDataList.add(letter);
        setData(letter.letter);
    }

    @Override
    public List<LetterData> getLetterDataList() {
        return letterDataList;
    }

    @Override
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

