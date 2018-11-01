package com.example.mbarrafirdaus.quiz;

import android.support.v7.app.AppCompatActivity;

public class Quize extends AppCompatActivity{



    private String textQuestions [] = {
            "1. Siapakah nama malaikat yang bertugas mencabut nyawa...?",
            "2. Apakah arti dari Al Falaq...?",
            "3. Ibadah mengelilingi Ka’bah dalam rangakaian ibadah haji disebut...? ",
            "4. Di antara sifat wajib bagi Allah ialah Iradat yang berarti...?",
            "5. Shalat sunnah yang dilakukan untuk meminta hujan dinamakan...?",
            "6. Di antara sikap terpuji ialah berani menanggung segala akibat atas apa yang dilakukannya yang biasa disebut...?",
            "7. Budak yang dimerdekakan Abu Bakar dan menjadi muazin pada zaman Rasulullah bernama...?",
            "8. Subhanallah sering disebut bacaan...?",
            "9. Di antara golongan yang berhak menerima zakat ialah orang yang banyak menanggung hutang atau disebut...?",
            "10. Allah memiliki asmaul husna Al Ghafir yang berarti? (Yang Maha Pengampun)",
    };

    private String multipleChoice [][] = {
            {"Izrail", "Israfil", "Ridwan", "Jibril"},
            {"Waktu Fajar", "Waktu", "Waktu Subuh", "Waktu Sore"},
            {"Berihram", "Thawaf", "Jumroh", "Bermalam di Arafah"},
            {"Berkehendak", "Adil", "Maha Pengasih", "Maha Penyayang"},
            {"Jama'", "Mukim", "Jama' Ta'khir", "Istisqa"},
            {"Bertanggung jawab", "Amanah", "Jujur", "Ikhlas"},
            {"Ali bin Abi Thalib", "Bilal bin Rabbah", "Abu Fukaihah", "Amir bin Fuhairoh RA"},
            {"Tasbih", "Hamdalah", "Taawuz", "Istigfar"},
            {"Ibnu Sabil", "fuqara’", "Gharim", "Masakin"},
            {"Yang Maha Pengasih", "Yang Maha Pengampun", "Yang Maha Penyayang", "Yang Maha Pemurah"},




    };

    private String mCorrectAnswer[] = {"Izrail", "Waktu Subuh", "Thawaf", "Berkehendak", "Istisqa", "Bertanggung jawab", "Bilal bin Rabbah", "Tasbih", "Gharim", "Yang Maha Pengampun", };

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
