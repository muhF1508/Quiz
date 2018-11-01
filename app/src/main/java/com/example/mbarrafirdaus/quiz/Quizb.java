package com.example.mbarrafirdaus.quiz;

import android.support.v7.app.AppCompatActivity;

public class Quizb extends AppCompatActivity{


    private String textQuestions [] = {
            "1. Siapakah Penulis Buku The Canon of Medicine...?",
            "2. Siapakah yang menemukan konsep aljabar dan algoritma dan sistem penomoran 1 - 10...?",
            "3. Siapakah Jabir Ibn- Hayyan...? ",
            "4. Siapakah ilmuwan pertama yang mengungkapkan teori pembuluh darah kapiler...?",
            "5. Siapakah ilmuwan dari Tunisia yang dikenal sebagai bapak pendiri ilmu historiografi, sosiologi dan ekonomi...?",
            "6. Apakah yang ditemukan oleh Al Zahrawi...?",
            "7. Siapakah ilmuwan Irak yang ahli di bidang matematika...?",
            "8. Siapakah ilmuwan Iran yang berhasil mengkoreksi kalender Persia...?",
            "9. Siapakah yang mencatat penemuan dokter abad pertengahan secara sistematis...?",
            "10. Siapakah ilmuan Arab yang ahli di bidang matematika...?",
    };

    private String multipleChoice [][] = {
            {"Jabir Ibn Hayyan", "Ibnu Sina", "Ibnu Khaldun", "Ummar Khayyam"},
            {"Al-Khawarizmi", "Ibnu Al-Nafis", "Al-Zahrawi", "Musailamah"},
            {"pendiri ilmu historiografi dan sosiologi", "Ilmuwan yang ahli dalam biologi", "Ilmuwan Iran yang ahli dalam kimia", "ilmuwan Irak ahli di bidang matematika"},
            {"Ibnu Sina", "Ibnu Al-Baithar", "Ibnu Haitham", "Ibnu Al-Nafis"},
            {"Ummar Khayyam'", "Thbit ibn Qurra", "Ibnu Khaldun", "Jabir Ibn- Hayyan"},
            {"konsep operasi modern", "konsep statistika", "Asam sulfat, klorida dan nitrat", "konsep aljabar dan algoritma"},
            {"Thbit ibn Qurra", "Ibnu Haitham", "Ibnu Al-Nafis", "Jabir Ibn- Hayyan"},
            {"Jabir Ibn- Hayyan", "Ummar Khayyam", "Al-Zahrawi", "Ibnu Al-Baithar"},
            {"Ibnu Sabil", "Ibnu Haitham", "Ibnu Al-Baithar", "Al-Khawarizmi"},
            {"Thbit ibn Qurra", "Ibnu Haitham", "Ibnu Khaldun", "Ibnu Sina"},




    };

    private String mCorrectAnswer[] = {"Ibnu Sina", "Al-Khawarizmi", "Ilmuwan Iran yang ahli dalam kimia", "Ibnu Al-Nafis", "Jabir Ibn- Hayyan", "konsep operasi modern", "Ibnu Haitham", "Ummar Khayyam", "Ibnu Al-Baithar", "Thbit ibn Qurra", };

    public int getLenght() {
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index] [num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
