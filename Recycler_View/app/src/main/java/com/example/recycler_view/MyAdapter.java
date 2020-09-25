package com.example.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    String myNames[], myVersions[], myAPI[], myReleasedate[];
    int myImages[];
    Context ct ;

    public MyAdapter(MainActivity mainActivity, int[] images, String[] names, String[] versions, String[] api, String[] releasedate){
        myImages=images;
        myNames=names;
        myVersions=versions;
        myAPI=api;
        myReleasedate=releasedate;
        ct = mainActivity;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v=LayoutInflater.from(ct).inflate(R.layout.myitem,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.iv.setImageResource(myImages[position]);
        holder.tv1.setText("Code Name: "+ myNames[position]);
        holder.tv2.setText("Version: "+ myVersions[position]);
        holder.tv3.setText("API level: "+myAPI[position]);
        holder.tv4.setText(myReleasedate[position]);
    }

    @Override
    public int getItemCount() {
        return myImages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView iv;
        TextView tv1, tv2, tv3, tv4;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            iv=itemView.findViewById(R.id.poster);
            tv1=itemView.findViewById(R.id.name);
            tv2=itemView.findViewById(R.id.version);
            tv3=itemView.findViewById(R.id.api_level);
            tv4=itemView.findViewById(R.id.release_date );

        }
    }
}

