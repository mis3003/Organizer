package com.example.organizer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class calendarOperation1 extends RecyclerView.Adapter<calendarOperation2>
{
    private final ArrayList<String> daysOfMonth;
    private final OnItemListener onItemListener;

    public calendarOperation1(ArrayList<String> daysOfMonth, OnItemListener onItemListener)
    {
        this.daysOfMonth = daysOfMonth;
        this.onItemListener = onItemListener;
    }

    @NonNull
    @Override
    public calendarOperation2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.calendar_cell,parent,false);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) (parent.getHeight() * 0.166666666);
        return new calendarOperation2(view, onItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull calendarOperation2 holder, int position)
    {
        holder.dayOfMonth.setText(daysOfMonth.get(position));
    }

    @Override
    public int getItemCount()
    {
        return daysOfMonth.size();
    }
    public interface OnItemListener
    {
        void onItemClick(int position, String dayText);
    }
}
