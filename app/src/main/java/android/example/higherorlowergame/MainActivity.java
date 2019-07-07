package android.example.higherorlowergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText guessNumber;
    Button guessBtn;
    public Random mRandom;

    public Integer userAnswer;



    //Obtain a number between [0 - 20]
    //int answer = mRandom.nextInt(20);

    int answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = (int)(Math.random() * 20 + 1);

        guessBtn = findViewById(R.id.guess_btn);
        guessNumber = findViewById(R.id.numberGuess_text);

    }

    public void guessNum(View view) {

        userAnswer =  Integer.parseInt(guessNumber.getText().toString());

        if (userAnswer > answer){
            makeToast("Lower!");
        }
        else if(userAnswer < answer){
            makeToast("Higher!");
        }
        else{
            makeToast("You go it! Try again!");
            answer = (int)(Math.random() * 20 + 1);
        }
    }

    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();

    }
}
