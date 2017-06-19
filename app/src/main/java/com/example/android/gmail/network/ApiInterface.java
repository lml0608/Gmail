package com.example.android.gmail.network;

import com.example.android.gmail.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by zengzhi on 2017/6/19.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
