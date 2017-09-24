package com.example.jathevan.wordoftheday;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    public android.widget.TextView textView3;
    public android.widget.TextView textView2;
    public android.widget.EditText sentenceText;
    public android.widget.EditText wodText;
    public android.widget.Button findButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findButton = (Button) findViewById(R.id.findButton);
        this.wodText = (EditText) findViewById(R.id.wodText);
        this.sentenceText = (EditText) findViewById(R.id.sentenceText);





    findButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            String sen=sentenceText.getText().toString();
            String wod=wodText.getText().toString();
        WOD(sen,wod);
        }
    });

    }
public void WOD(String s,String w){

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
    else if(w==null){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Warning message").setMessage("Enter the Word Of the day" ).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).show();

    }

    else {

       // String in = "i have a male cat. the color of male cat is Black";
        int i = 0;
        Pattern p = Pattern.compile(w);
        Matcher m = p.matcher( s );
        while (m.find()) {
            i++;
        }
        //System.out.println(i); // Prints 2


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Results").setMessage("Number of WOD : "+i ).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).show();

    }



}

}
