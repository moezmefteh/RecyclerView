package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class CountrieListAdapter extends RecyclerView.Adapter<CountrieListAdapter.CountrieViewHolder>{
    private final LinkedList<Countrie> mCountrieList;
    private LayoutInflater mInflater;

    public CountrieListAdapter(Context context,LinkedList<Countrie> countrieList) {
        mInflater = LayoutInflater.from(context);
        this.mCountrieList = countrieList;

    }

    @NonNull
    @Override
    public CountrieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.countrie_list_item,parent, false);
        return new CountrieViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(CountrieViewHolder holder, int position) {
        Countrie mCurrent = mCountrieList.get(position);
        holder.countrieItem1View.setText(mCurrent.getNom());
        holder.countrieItem2View.setImageResource(mCurrent.getIconID());

    }
    @Override
    public int getItemCount() {
        return mCountrieList.size();
    }

    class CountrieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView countrieItem1View;
        public final ImageView countrieItem2View;

        final CountrieListAdapter mAdapter;

        CountrieViewHolder(View itemView, CountrieListAdapter adapter) {
            super(itemView);
            countrieItem1View = itemView.findViewById(R.id.countrie);
            countrieItem2View = itemView.findViewById(R.id.img);

            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            Countrie element = mCountrieList.get(mPosition);
            Toast.makeText(view.getContext(), element.getNom(),Toast.LENGTH_SHORT).show();
            /*
            if (element.getNom().equals("Tunisia")) {
                String url = "https://www.google.com/search?q=Tunisia";
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
            */
            mAdapter.notifyDataSetChanged();
        }
    }
}
