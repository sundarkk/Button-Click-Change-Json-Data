package com.sundar.demo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.sundar.demo.Model.Banner;
import com.sundar.demo.Model.Categroy;
import com.sundar.demo.Model.Data;
import com.sundar.demo.Model.DtaClass;
import com.sundar.demo.Model.Root;
import com.sundar.demo.Model.TopItem;
import com.sundar.demo.Model.TopSelling;
import com.sundar.demo.Retrofit.ApiClient;
import com.sundar.demo.Retrofit.ApiInterface;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainActivity extends AppCompatActivity {

    DtaClass dtaClass = new DtaClass();

    private ProgressDialog progressDialog;
    private DataAdapter adapter;

    //All list available
    private ApiInterface apiInterface;
    private ArrayList<Banner> banners;
    private ArrayList<TopItem> topItems;
    private List<Categroy> categroy;
    private List<TopSelling> topSelling;
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // recyclerview = findViewById(R.id.recyclerview);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait ....");
        progressDialog.setCancelable(false);
        progressDialog.show();

        generateData();
    }

    private void generateData() {
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerview.setLayoutManager(layoutManager);

        loadJson();

    }

    private void loadJson() {

        ApiInterface apiInterface = ApiClient.getRetrofit().create(ApiInterface.class);

        Call<DtaClass> call = apiInterface.getData();

        call.enqueue(new Callback<DtaClass>() {
            @Override
            public void onResponse(Call<DtaClass> call, Response<DtaClass> response) {
                progressDialog.dismiss();
                if (response.isSuccessful()){
                    Log.e("TAG", "==success==>" + response.body());
                    dtaClass = response.body();

                    List<TopItem> topItems =  new ArrayList<>();
                    topItems = dtaClass.getData().getTopItems();
                   // dtaClass = response.body();

                    Log.d("Sunder",  topItems.toString());

                    adapter = new DataAdapter((ArrayList<TopItem>) topItems, MainActivity.this);
                    recyclerview.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<DtaClass> call, Throwable t) {
                Log.e("TAG", "==failure==>" + t.getMessage());
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "went wrong !", Toast.LENGTH_SHORT).show();

            }
        });

    }
}