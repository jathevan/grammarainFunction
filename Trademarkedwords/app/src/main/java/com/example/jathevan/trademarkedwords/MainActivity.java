package com.example.jathevan.trademarkedwords;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {


    public android.widget.EditText sentenceText;
    public android.widget.Button findButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findButton = (Button) findViewById(R.id.findButton);

        this.sentenceText = (EditText) findViewById(R.id.sentenceText);


        findButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String sen=sentenceText.getText().toString();

                WOD(sen);
            }
        });
    }


    public void WOD(String s){

        if(s==null){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("Warning message").setMessage("Enter the Sentence" ).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            }).show();

        }


        else {

            String st= s;
            String[] words= {"airmac","nike","airdrop","apple","ibook","ipod","macbook","macos","macos","icloud","pepsi","nike","adidas"};
            //String[] para= {"hi","hellow","lol","dddd"};

            String[] para = st.split(" ");

            Set<String> s1 = new HashSet<String>(Arrays.asList(words));
            Set<String> s2 = new HashSet<String>(Arrays.asList(para));
            s1.retainAll(s2);

            System.out.println(s1.size());



            //System.out.println(i); // Prints 2


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("Results").setMessage("Number of Trademarked words   "+s1.size() ).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            }).show();

        }



    }
}
