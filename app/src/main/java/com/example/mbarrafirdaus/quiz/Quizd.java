package com.example.mbarrafirdaus.quiz;

import android.support.v7.app.AppCompatActivity;

public class Quizd extends AppCompatActivity{


    private String textQuestions [] = {
            "1. Apa itu Tajwid...?",
            "2. Apa hukum mengamalkan Tajwid...?",
            "3. Apa itu Izhar(إظهار)...? ",
            "4. Dibagi berapakah hukum Idgham(إدغام)...?",
            "5. Hukum apakah yang artinya menukar atau mengganti...?",
            "6. Apa hukum mempelajari Tajwid...?",
            "7. Yang termasuk huruf halqi...?",
            "8. Mad terbagi menjadi berapa macam...?",
            "9. salah satu contoh Ra dibaca tarqiq (tipis) atau Tarkik apabila...?",
            "10. Berapakah jenis Mad Far'i...?",
    };

    private String multipleChoice [][] = {
            {"tata cara membaca al-quran dengan baik dan benar", "Membaca al-quran dengan tenang", "Membaca al-quran denagn cepat", "Memahami arti dari al-quran"},
            {"Sunnah Muakkadah", "Mubah", "Wajib", "Sunnah"},
            {"jelas atau terang", "dilebur dengan disertai dengung", "dilebur tanpa dengung", "menukar atau mengganti"},
            {"2", "1", "4", "13"},
            {"Ikhfa (إخفاء)'", "Iqlab (إقلاب)", "Idgham (إدغام)", "Izhar (إظهار)"},
            {"Wajib", "Sunnah Muakkadah", "fardhu 'ain", "fardhu kifayah"},
            {"ق ص ض ظ ط غ خ", "ت ث ج د ذ س ش ص ض ط ظ ف ق ك", "ا ح خ ع غ ه", "ن م و ي"},
            {"2", "1", "13", "4"},
            {"Ra berharkat fathah", "Ra berharkat kasrah", "Ra berharakat dhummah", "Bila ra terletak sesudah Hamzah Washal اُرْكُضْ- اِرْحَمْنَا"},
            {"10", "6", "12", "13"},




    };

    private String mCorrectAnswer[] = {"tata cara membaca al-quran dengan baik dan benar", "Wajib", "jelas atau terang", "2", "Iqlab (إقلاب)", "fardhu kifayah", "ا ح خ ع غ ه", "2", "Ra berharkat kasrah", "13", };

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

