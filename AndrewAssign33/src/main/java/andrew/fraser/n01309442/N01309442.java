package andrew.fraser.n01309442;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.Toast;

public class N01309442 extends Fragment {

    public N01309442()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab3, container, false);

        Switch switch = (Switch) findViewById(R.id.switch1);

        switch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            public void onCheckedChanged(Switch v, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(),R.string.switchOn, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),R.string.switchOff, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}