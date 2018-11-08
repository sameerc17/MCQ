package com.example.sameer17.mcq;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private void updateQuestion(int s) {
        t2.setText(nQuestion.getQuestion(s));
        b1.setText(nQuestion.getChoice1(s));
        b2.setText(nQuestion.getChoice2(s));
        b3.setText(nQuestion.getChoice3(s));
        b4.setText(nQuestion.getChoice4(s));

        answer=nQuestion.getCorrect(s);

    }

    private void gameOver()
    {
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("GAME OVER !!! Your Score is "+score+" points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));

                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog= alertDialogBuilder.create();
        alertDialog.show();
    }

    Button b1,b2,b3,b4;
    TextView t1,t2;
    int r=0;


    private Questions nQuestion=new Questions();
    private String answer;
    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        t1=(TextView) findViewById(R.id.score);
        t2=(TextView) findViewById(R.id.question);

        t1.setText("Score is: "+score);

        updateQuestion(r);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b1.getText().toString().equals(answer))
                {
                    score++;
                    t1.setText("Score is: "+score);
                    updateQuestion(++r);
                }
                else
                {
                    gameOver();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals(answer))
                {
                    score++;
                    t1.setText("Score is: "+score);
                    updateQuestion(++r);
                }
                else
                {
                    gameOver();
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals(answer))
                {
                    score++;
                    t1.setText("Score is: "+score);
                    updateQuestion(++r);
                }
                else
                {
                    gameOver();
                }

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals(answer))
                {
                    score++;
                    t1.setText("Score is: "+score);
                    updateQuestion(++r);
                }
                else
                {
                    gameOver();
                }

            }
        });
    }

}
