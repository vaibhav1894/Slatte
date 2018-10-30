package com.slatte.vaibhav.slatte.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.slatte.vaibhav.slatte.R;

import java.util.ArrayList;

public class AdapterSelectExpertise extends RecyclerView.Adapter<AdapterSelectExpertise.MyViewHolder> {

    private Context context;
    private ArrayList<String> arr = new ArrayList<>();
    private ArrayList<String> arr_1 = new ArrayList<>();

    private Interface_AdapterSelectExpertise click;

    public AdapterSelectExpertise(Context context, ArrayList<String> arr, ArrayList<String> arr_1, Interface_AdapterSelectExpertise click){
        this.context = context;
        this.arr = arr;
        this.arr_1 = arr_1;
        this.click = click;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView tv;
        public MyViewHolder(View view) {
            super(view);

            tv = view.findViewById(R.id.item_select_expertise_text);
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    click.method_AdapterSelectExpertise(getAdapterPosition());
                }
            });
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_select_expertise, parent, false);

        return new MyViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.tv.setText(arr.get(position));
        if(arr_1.get(position).equals("0")){
            holder.tv.setBackgroundResource(R.drawable.shape_border_button_2);
            holder.tv.setTextColor(context.getResources().getColor(R.color.white_40));
        } else {
            holder.tv.setBackgroundResource(R.drawable.shape_background_button_2);
            holder.tv.setTextColor(context.getResources().getColor(R.color.colorWhite));
        }
    }

    @Override
    public int getItemCount() {
        return arr.size();
    }

    public interface Interface_AdapterSelectExpertise{
        void method_AdapterSelectExpertise(int position);
    }
}