package ca.yorku.eecs.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi_layout);
    }
    public void buttonClicked(View v){

        //get input and convertions of data types
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String weight = weightView.getText().toString();
        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String height = heightView.getText().toString();

        //calculate
        BMIModel myModel = new BMIModel(weight, height);
        String myBMI = myModel.getBMI();

        //display BMI
        ((TextView) findViewById(R.id.answer)).setText(myBMI);
    }
}
