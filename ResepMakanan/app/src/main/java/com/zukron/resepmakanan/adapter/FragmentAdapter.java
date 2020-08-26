package com.zukron.resepmakanan.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

/**
 * Project name is Resep Makanan
 * Created by Zukron Alviandy R on 8/26/2020
 * Contact me if any issues on zukronalviandy@gmail.com
 */
public class FragmentAdapter extends FragmentStateAdapter {
    private ArrayList<Fragment> fragments;

    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);

        fragments = new ArrayList<>();
    }

    public void add(Fragment fragment) {
        fragments.add(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
