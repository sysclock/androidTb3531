package com.example.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/3/16.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdapter(@NonNull Context context, int textViewResourceId,List<Fruit> objects) {
        super(context, textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       Fruit fruit = getItem(position);

       View view;
       ViewHolder viewHolder;

       if (convertView == null)
       {
           view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
           viewHolder = new ViewHolder();
           viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
           viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
           view.setTag(viewHolder);
       }
       else
       {
           view  = convertView;
           viewHolder = (ViewHolder)view.getTag();
       }

       //View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());

//       ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
//       TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
//       fruitImage.setImageResource(fruit.getImageId());
//       fruitName.setText(fruit.getName());

       return view;
        // return super.getView(position, convertView, parent);
    }

    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }

}











