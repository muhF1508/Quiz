package com.example.mbarrafirdaus.quiz;

import android.support.v7.app.AppCompatActivity;

public class Quizc extends AppCompatActivity{


    private String textQuestions [] = {
            "1. Apa Bahasa Arabnya Pagi...?",
            "2. Apa jama'nya أَبْيَض...?",
            "3. Apa Bahasa Arabnya kelas...? ",
            "4. Apa arti dari  ٌسَيَّارَةٌ جـ سَيَّارَات...?",
            "5. Apa Bahasa Arabnya Buku...?",
            "6. Apa jama'nya غُرْفَةٌ...?",
            "7. Apa Bahasa Arabnya Pena...?",
            "8. Apa Bahasa Arabnya Abi...?",
            "9. Apa arti dari عَيْنٌ جـ أَعْيُن...?",
            "10. Apa arti dari نَافِذَةٌ جـ نَوَافِذُ",
    };

    private String multipleChoice [][] = {
            {"صَبَاحٌ", "مَسَاءٌ ", " لَيْلَةٌ ", "نَهَارٌ"},
            {" ُسَوْدَاء", " ُحَمْرَاء", "خَضْرَاء", "بَيْضَاء"},
            {"مَكْتَبَةٌ جـ مَكْتَبَاتٌ", "فَصْلٌ جـ فُصُوْلٌ", "مَلْعَبٌ جـ مَلَاعِبُ", "حَقِيْبَةٌ جـ حَقَائِبُ"},
            {"Meja", "Pulpen", "Mobil", "Kucing"},
            {"بَيْتٌ جـ بُيُوْتٌ'", "خِزَانَةٌ جـ خَزَائِنُ", "كِتَابٌ جـ كُتُبٌ", "مِصْبَاحٌ جـ مَصَابِيْحُ"},
            {"أَبْوَابٌ", "جُدُرٌ", "غُرَفٌ", "مَكَاتِبُ"},
            {"قَلَمٌ جـ أَقْلَامٌ", "مِسْطَرَةٌ جـ مَسَاطِرُ", "حَافِلَةٌ جـ حَافِلَات", "إِزَارٌ جـ آزِرَةٌ"},
            {"أَخْ جـ إِخْوَة", "عَمٌّ جـ أَعْمَامٌ", "أَبٌ جـ آبَاءٌ", "أُمٌّ جـ أُمَّهَاتٌ"},
            {"Mata", "Tangan’", "Telinga", "Hidung"},
            {"Kunci", "Jendela", "Galon", "Teras"},




    };

    private String mCorrectAnswer[] = {"صَبَاحٌ", "بَيْضَاء", "فَصْلٌ جـ فُصُوْلٌ", "Mobil", "كِتَابٌ جـ كُتُبٌ", "غُرَفٌ", "قَلَمٌ جـ أَقْلَامٌ", "أَبٌ جـ آبَاءٌ", "Mata", "Jendela", };

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
