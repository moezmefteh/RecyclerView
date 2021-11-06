package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class CountrieListAdapter extends RecyclerView.Adapter<CountrieListAdapter.CountrieViewHolder>{
    private final LinkedList<String> mCountrieList;
    private LayoutInflater mInflater;

    public CountrieListAdapter(Context context,LinkedList<String> wordList) {
        mInflater = LayoutInflater.from(context);
        this.mCountrieList = wordList;
    }

    @NonNull
    @Override
    public CountrieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.countrie_list_item,parent, false);
        return new CountrieViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull CountrieListAdapter.CountrieViewHolder holder, int position) {
        String mCurrent = mCountrieList.get(position);
        holder.countrieItemView.setText(mCurrent);
    }
    @Override
    public int getItemCount() {
        return mCountrieList.size();
    }

    class CountrieViewHolder extends RecyclerView.ViewHolder {
        public final TextView countrieItemView;
        final CountrieListAdapter mAdapter;

        CountrieViewHolder(View itemView, CountrieListAdapter mAdapter) {
            super(itemView);
            countrieItemView = itemView.findViewById(R.id.countrie);
            this.mAdapter = mAdapter;
        }
    }
}
