package com.example.mb7.sportappbp.Adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mb7.sportappbp.Objects.DiaryEntry;
import com.example.mb7.sportappbp.Objects.Exercise;
import com.example.mb7.sportappbp.R;

import java.util.ArrayList;

/**
 * Created by Basti on 21.03.2017.
 */

public class DiaryAdapter extends BaseAdapter {

    private Activity _context;
    private ArrayList<DiaryEntry> _diaryEntries;

    public DiaryAdapter (Activity context, ArrayList<DiaryEntry> diaryEntries)
    {
        _diaryEntries = diaryEntries;
        _context = context;
    }

    @Override
    public Object getItem(int position) {
        return _diaryEntries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        DiaryEntry diaryEntry = _diaryEntries.get(position);
        if (view == null)
            view = _context.getLayoutInflater().inflate(R.layout.lst_exercisecell, null);

        TextView txtTitle =(TextView) view.findViewById(R.id.txtExercise);
        txtTitle.setText(diaryEntry.getDate());

        TextView txtText = (TextView) view.findViewById(R.id.txtDuration);
        txtText.setText(diaryEntry.getTime() + " Uhr");
        return view;
    }

    @Override
    public int getCount() {
        return _diaryEntries.size();
    }
}
