package com.example.jathevan.checkgrammar;

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


    public void WOD(String s) {

        if (s == null) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("Warning message").setMessage("Enter the Sentence").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            }).show();

        } else {

            String st = s;
            int count = 0;
   /*         JLanguageTool langTool = new JLanguageTool(new BritishEnglish());

            // String input = "Hello every one, I have the same issue with my iphone 5c with ios 8.2, I tried everything listed above and no improvement at all. does anyone found the solution? I'm going crazy too! it was a gift for my wife and now i feel so bad everyday knowing that she can't go out from the house and come back with battery.";

            String input="I is came tomorrow";
            List<RuleMatch> result = langTool.check(input);

            for (RuleMatch ruleMatch : result)
            {
                System.out.println("Checking '" + input + ":");
                System.out.println("    " + ruleMatch);

                count ++;
            }

            System.out.println("Numbr of Grammar mistakes:"+count);
*/


            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("Results").setMessage("Number of grammar errors :"+count).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                }
            }).show();

        }

    }

}
