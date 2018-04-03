package com.ablo;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sudhams on 20/02/18.
 */

public class LoginRequest extends StringRequest {

    private static  final String LOGIN_REQUEST_URL = "https://ablo.000webhostapp.com/AbloLogin.php";
    private Map<String,String> params;

    public LoginRequest( String username, String password, Response.Listener<String> listener){
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null );
        params= new HashMap<>();

        params.put("username",username);

        params.put("password",password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}