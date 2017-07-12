package com.example.mohan.appp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mohan on 5/7/2017.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://dsce.000webhostapp.com/Register1.php";
    private Map<String, String> params;

    public RegisterRequest(String username,String password, Response.Listener<String> listener){

        super(Method.POST, REGISTER_REQUEST_URL, listener, null);

        params = new HashMap<>();


        params.put("username", username);
        params.put("password", password);




    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

