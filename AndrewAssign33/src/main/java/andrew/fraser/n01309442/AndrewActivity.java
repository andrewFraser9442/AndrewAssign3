package andrew.fraser.n01309442;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class AndrewActivity extends AppCompatActivity {

   private TabLayout tabLayout;
   private ViewPager viewPager;
   private TabItem tab1, tab2, tab3, tab4;
   public PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //PageAdapter tabsPagerAdapter = new PageAdapter(this, getSupportFragmentManager());

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tab1 = (TabItem) findViewById(R.id.tab1);
        tab2 = (TabItem) findViewById(R.id.tab2);
        tab3 = (TabItem) findViewById(R.id.tab3);
        tab4 = (TabItem) findViewById(R.id.tab4);

        //final ViewPager viewPager = findViewById(R.id.viewPager);
        //viewPager.setAdapter(tabsPagerAdapter);



       /* tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 0)
                {
                    pageAdapter.notifyDataSetChanged();
                }
                else if (tab.getPosition() == 1)
                {
                    pageAdapter.notifyDataSetChanged();
                }
                else if (tab.getPosition() == 2)
                {
                    pageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/


            //viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        }


    public void onBackPressed()
    {
        AlertDialog.Builder alert = new AlertDialog.Builder(AndrewActivity.this);
        alert.setTitle(R.string.alert);
        alert.setMessage(R.string.exit);
        alert.setIcon(R.drawable.alert);
        alert.setPositiveButton(R.string.yes, (dialogInterface, i) ->
        {
            System.exit(0);
        });
        alert.setNegativeButton(R.string.no, (dialogInterface, i) ->
        {
            dialogInterface.cancel();
        });
        alert.show();
    }


    }
