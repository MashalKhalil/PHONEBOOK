package com.example.recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycler extends RecyclerView.Adapter<Recycler.viewHolder> {
    ArrayList<Contact> arrContact;
    Context context;
    Recycler(Context context, ArrayList<Contact> arrContact){
        this.context=context;
        this.arrContact=arrContact;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vi=LayoutInflater.from(context).inflate(R.layout.contact,parent,false);
    viewHolder view=new viewHolder(vi);
        return view;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
    holder.img.setImageResource(arrContact.get(position).img);
    holder.t1.setText(arrContact.get(position).name);
    holder.t2.setText(arrContact.get(position).num);
    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        TextView t1,t2;
        ImageView img;
        public viewHolder(View itemView){
            super(itemView);
            t1=(TextView) itemView.findViewById(R.id.text1);
            t2=(TextView) itemView.findViewById(R.id.text2);
            img=(ImageView) itemView.findViewById(R.id.i1);
        }

    }

}
