package andrew.fraser.n01309442;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private final Context mContext;

    public PageAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Andrew();
            case 1:
                return new Fraser();
            case 2:
                return new N01309442();
            case 3:
                return new AF();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}

