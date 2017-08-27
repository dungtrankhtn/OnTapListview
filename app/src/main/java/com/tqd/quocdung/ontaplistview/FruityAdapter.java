package com.tqd.quocdung.ontaplistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Lep on 8/16/2017.
 */

public class FruityAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Fruity> fruityList;

    public FruityAdapter(Context context, int layout, List<Fruity> fruityList) {
        this.context = context;
        this.layout = layout;
        this.fruityList = fruityList;
    }

    @Override
    public int getCount() {
        return fruityList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class viewHolder
    {
        TextView txtName,txtDecriptions;
        ImageView imgPicture;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        viewHolder Holder = new viewHolder();

        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            Holder.txtName = (TextView) convertView.findViewById(R.id.textviewName);
            Holder.txtDecriptions = (TextView) convertView.findViewById(R.id.textviewDecriptions);
            Holder.imgPicture= (ImageView) convertView.findViewById(R.id.imageviewPicture);

            Fruity fruity = fruityList.get(position);

            Holder.txtName.setText(fruity.getName());
            Holder.txtDecriptions.setText(fruity.getDecription());
            Holder.imgPicture.setImageResource(fruity.getPostition());
            convertView.setTag(Holder);
        }else{
            convertView.getTag();
        }
        return convertView;
    }
}
