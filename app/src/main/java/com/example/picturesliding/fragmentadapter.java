package com.example.picturesliding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class fragmentadapter extends FragmentPagerAdapter {
    public fragmentadapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            return new one();
        }
        else if(position==1)
            return new two();

        else if(position==2)
            return new three();

        else if(position==3)
            return new four();

        else if(position==4)
            return new five();

        else if(position==5)
            return new six();

        else if(position==6)
            return new seven();

        else if(position==7)
            return new eight();

        else
            return new nine();
    }

    @Override
    public int getCount() {
        return 9;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return  "1";
            case 1:
                return  "2";
            case 2:return "3";
            case 3:
                return "4";
            case 4:
                return  "5";
            case 5:return "6";
            case 6:
                return "7";
            case 7:
                return  "8";
            case 8:return "9";

            default: return null;
        }
    }
}
