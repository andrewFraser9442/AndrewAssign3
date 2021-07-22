package andrew.fraser.n01309442;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import com.google.android.material.snackbar.Snackbar;

import java.util.Calendar;

public class Andrew extends Fragment {
    private DatePicker datePicker;
    private int year, month, day;
    private String text;

    public Andrew()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false);

       /* datePicker = (DatePicker) findViewById(R.id.datePicker);
        Calendar today = Calendar.getInstance();
        year = today.get(Calendar.YEAR);
        month = today.get(Calendar.MONTH);
        day = today.get(Calendar.DAY_OF_MONTH);

        datePicker.init(datePicker.getYear(), datePicker.getMonth(),
                datePicker.getDayOfMonth(),new DatePicker.OnDateChangedListener() {

                    @Override
                    public void onDateChanged(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                        // TODO Auto-generated method stub
                        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), R.string.app_name, Snackbar.LENGTH_LONG);
                        snackbar.setText(text = month+"/"+day+"/"+year);
                        snackbar.show();

                    }
                } );
        */
    }
}