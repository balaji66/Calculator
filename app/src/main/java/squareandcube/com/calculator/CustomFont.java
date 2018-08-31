package squareandcube.com.calculator;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.zip.Inflater;

public class CustomFont extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_font);

        TextView one=(TextView)findViewById(R.id.textViewOne);
        TextView two= (TextView)findViewById(R.id.textViewTwo);
        TextView three =(TextView)findViewById(R.id.textViewThree);
        one.setText(R.string.first_textview);
        two.setText(R.string.second_textview);
        three.setText(R.string.third_textview);
        Typeface face=Typeface.createFromAsset(getAssets(),"font/font_krushal.otf");
        one.setTypeface(face);

        Typeface face2=Typeface.createFromAsset(getAssets(),"font/Capture_it.ttf");
        two.setTypeface(face2);
/*
        Typeface face3=Typeface.createFromAsset(getAssets(),"font/KaushanScript-Regular.otf");
        three.setTypeface(face3);*/
    }
}
