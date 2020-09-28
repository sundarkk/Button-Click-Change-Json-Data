package com.sundar.demo.Retrofit;

import com.sundar.demo.Model.DtaClass;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/gethomeData")
    Call<DtaClass> getData();


    /*Call<List<Banner>> geImgData();

    Call<List<Categroy>> getBannerData();

    Call<List<TopItem>>getTopItem();

    Call<List<TopSelling>>getTopSelling();
*/

}
