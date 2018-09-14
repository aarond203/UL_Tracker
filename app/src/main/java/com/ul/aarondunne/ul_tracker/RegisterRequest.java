package com.ul.aarondunne.ul_tracker;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "https://ul-tracker.000webhostapp.com/register.php";
    private Map<String, String> params;

    public RegisterRequest(String newStudName, int newStudID, String newStudPassword, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("student_name", newStudName);
        params.put("student_ID", newStudID + "");
        params.put("student_password", newStudPassword);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
