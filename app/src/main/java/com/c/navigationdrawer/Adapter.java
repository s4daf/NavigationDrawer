package com.c.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ItemHolder> {

    Context context;

    public Adapter(Context context, List<Model> models) {
        this.context = context;
    }
        @NonNull
        @Override
        public ItemHolder onCreateViewHolder (@NonNull ViewGroup parent,int viewType){

            View view = LayoutInflater.from(context).inflate(R.layout.activity_drawer_item, parent, false);
            return new ItemHolder(view);
        }

        @Override
        public void onBindViewHolder (@NonNull ItemHolder holder,int position){

            holder.btn_task1.setText("Go to Task 1 - Home");
            holder.btn_task2.setText("Go to Task 2 - Dialer");
            holder.btn_task3.setText("Go to Task 2 - Profile");

            holder.btn_task1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, activityTask1.class);
                    context.startActivity(intent);
                }
            });

            holder.btn_task2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent21 = new Intent(context, ActivityTask2.class);
                    context.startActivity(intent21);
                }
            });

            holder.btn_task3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent22 = new Intent(context, ActivityTask3.class);
                    context.startActivity(intent22);
                }
            });
        }

        @Override
        public int getItemCount () {
            return 3;
        }

        class ItemHolder extends RecyclerView.ViewHolder {

            TextView btn_task1, btn_task2, btn_task3;

            public ItemHolder(@NonNull View itemView) {
                super(itemView);

                btn_task1 = itemView.findViewById(R.id.btn_task1);
                btn_task2 = itemView.findViewById(R.id.btn_task2);
                btn_task3 = itemView.findViewById(R.id.btn_task3);
            }
        }
    }
