package com.example.magshimim.ex8;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends Activity {
    RadioButton rad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
/*
<RadioButton
            android:id="@+id/rbCheck"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignParentStart="true"
            android:layout_below="@+id/tvIntro"
            android:layout_marginStart="41dp"
            android:layout_marginTop="61dp"
            android:text="@string/radioButtonCheck" />

        <RadioButton
            android:id="@+id/rbCalculate"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignBaseline="@+id/rbCheck"
            android:layout_alignBottom="@+id/rbCheck"
            android:layout_centerHorizontal="true"
            android:text="@string/radioButtonCalculate" />

            <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/"
            android:text="@string/Farenheit"/>
 */

/*
<EditText
            android:id="@+id/etFarenheit"
            android:layout_width="112dp"
            android:layout_height="wrap_content"

            android:layout_weight="1"
            android:ems="10"
            android:inputType="number" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:id="@+id/tvFarenheit"
            android:text="@string/Farenheit" />

        <Button
            android:id="@+id/btGo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"

            android:layout_weight="1"
            android:text="@string/goButton" />


        <EditText
            android:id="@+id/etCelcius"
            android:layout_width="118dp"
            android:layout_height="wrap_content"

            android:layout_weight="1"
            android:ems="10"
            android:inputType="numberDecimal" />
 */