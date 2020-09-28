package com.sundar.demo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.sundar.demo.Model.Banner;
import com.sundar.demo.Model.Data;
import com.sundar.demo.Model.TopItem;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.MyViewHolder> {

    private ArrayList<TopItem> dataModelList;
   // private List<TopItem> dataModelList = new ArrayList<>();
    private Context context;
    int counter = 0;

    public DataAdapter(ArrayList<TopItem> dataModelList, Context context) {
        this.dataModelList = dataModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {

        /*Picasso.with(context).load(dataModelList.get(position).getImage())
                .error(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.Image_Product);
*/
        if(!dataModelList.get(position).getImage().isEmpty()){
            Picasso.with(context)
                    .load(dataModelList.get(position).getImage())
                    .placeholder(R.drawable.ic_launcher_background) //this is optional the image to display while the url image is downloading
                    .error(R.drawable.ic_launcher_background)         //this is also optional if some error has occurred in downloading the image this image would be displayed
                    .into(holder.Image_Product);
        }


    //   holder.Tv_ID.setText(dataModelList.get(position).getId());

      //  Log.d(TAG, "AdapteData" + DataAdapter.class.toString());

        holder.Tv_Name.setText(dataModelList.get(position).getName());

        //   holder.Tv_Quantity.setText(dataModelList.get(position).getQuantity());
        holder.Tv_Unit.setText(dataModelList.get(position).getUnit());
    //    holder.Tv_Price.setText(dataModelList.get(position).getPrice());
    ///    holder.Tv_Sale.setText(dataModelList.get(position).getSalePrice());
    //    holder.Tv_Sale_Price.setText(dataModelList.get(position).getSalePrice());
        holder.Tv_Product_Categrory_ID.setText(dataModelList.get(position).getProduct_category_id());
     //   holder.Tv_ProductBrand_ID.setText(dataModelList.get(position).getProduct_brand_id());

//        holder.Tv_Prices.setText(dataModelList.get(position).getPrice_off());


        holder.tv_Product_Quantity.setText(counter+"");
        holder.Btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                holder.tv_Product_Quantity.setText(counter+"");

            }
        });

        holder.Btn_Remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counter!=0){
                    counter--;
                }
                holder.tv_Product_Quantity.setText(counter+"");

            }
        });


    }


    @Override
    public int getItemCount() {
        return dataModelList.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView Image_Product;
        TextView Tv_ID,Tv_Name,Tv_Quantity,Tv_Unit,Tv_Sale,Tv_Sale_Price,Tv_Product_Categrory_ID,
                Tv_ProductBrand_ID,Tv_Prices,Tv_Price,  tv_Product_Quantity;
        Button Btn_Add, Btn_Remove;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Image_Product = (ImageView) itemView.findViewById(R.id.Image_Product);

            Tv_ID =(TextView) itemView.findViewById(R.id.Tv_ID);
            Tv_Name =(TextView) itemView.findViewById(R.id.Tv_Name);

            Tv_Quantity = (TextView) itemView.findViewById(R.id.Tv_Quantity);

            Tv_Unit = (TextView) itemView.findViewById(R.id.Tv_Unit);

            Tv_Sale = (TextView) itemView.findViewById(R.id.Tv_Sale);

            Tv_Sale_Price = (TextView) itemView.findViewById(R.id.Tv_Sale_Price);

            Tv_Product_Categrory_ID = (TextView) itemView.findViewById(R.id.Tv_Product_Categrory_ID);

            Tv_ProductBrand_ID = (TextView) itemView.findViewById(R.id.Tv_ProductBrand_ID);

            Tv_Prices = (TextView) itemView.findViewById(R.id.Tv_Prices);

            Tv_Price = (TextView) itemView.findViewById(R.id.Tv_Price);


            //Button Action in Display Data in text view
            tv_Product_Quantity = (TextView) itemView.findViewById(R.id.tv_Product_Quantity);
            Btn_Add = (Button) itemView.findViewById(R.id.Btn_Add);
            Btn_Remove = (Button) itemView.findViewById(R.id.Btn_Remove);



        }
    }
}
