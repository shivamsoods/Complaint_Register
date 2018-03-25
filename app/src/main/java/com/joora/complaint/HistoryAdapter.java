package com.joora.complaint;

import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 24-03-2018.
 */


public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.viewholder> {


    private ArrayList<historyItem> historyList;

    public HistoryAdapter(ArrayList<historyItem> historyList) {
        this.historyList = historyList;

    }

    public static class viewholder extends RecyclerView.ViewHolder {
        public TextView heading;
        public TextView complaint;

        public viewholder(View itemView) {
            super(itemView);
            heading = (TextView) itemView.findViewById(R.id.heading);
            complaint = (TextView) itemView.findViewById(R.id.complaint);
        }
    }

    @Override
    public viewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.history_list, parent, false);

        return new viewholder(itemView);
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position) {
        historyItem item = historyList.get(position);

        holder.heading.setText(item.getHeading());
        holder.complaint.setText(item.getComplaint());

    }

    @Override
    public int getItemCount() {
        return historyList.size();
    }


}
