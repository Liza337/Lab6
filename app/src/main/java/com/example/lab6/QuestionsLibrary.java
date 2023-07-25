package com.example.lab6;

public class QuestionsLibrary {

    private  String mQuestions []={

            "Which bird of the plants holds in the soil?",
            "this part of the plant absorbs energy from the sun",
            "this part of the plant attracts bees,butterflies,birds",
            "the_holds the plant upright."

    };
    private  String mChoices [][]={

            {"Roots","Stem","Flower"},
            {"Fruits","Leaves","Seeds"},
            {"Bark","Flower","Roots"},
            {"Fruits","leaves","seeds"}

    };

    private  String mCorrectAnswers []={

            "Roots","Stem","Flower","Fruits","Leaves","Seeds","Bark"
    };

    public String getQuestion(int a){
        String question=mQuestions[a];
        return  question;
    }

    public String getChoice1(int a){
        String choice0 =mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 =mChoices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 =mChoices[a][2];
        return choice2;
    }
    public String getCorrectAnswer(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }

}
