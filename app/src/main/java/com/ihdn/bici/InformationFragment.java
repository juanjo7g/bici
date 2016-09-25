package com.ihdn.bici;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ihdn.bici.rest.ArticuloService;
import com.ihdn.bici.rest.ServiceGenerator;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.mime.TypedByteArray;

public class InformationFragment extends Fragment {

    private Button buttonActivar;

    public InformationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_information, container, false);

        final ArticuloService as = ServiceGenerator.getArticuloService();
        final String[] bodyString = new String[1];

        buttonActivar = (Button) rootView.findViewById(R.id.button_activar);

        buttonActivar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                as.monitorearArticulo("bicicare@gmail.com", "1", false, new Callback<Response>() {
                    @Override
                    public void success(Response response, Response response2) {
                        bodyString[0] = new String(((TypedByteArray) response.getBody()).getBytes());
                        Toast.makeText(getActivity(), bodyString[0], Toast.LENGTH_SHORT).show();
                        try {
                            JSONObject resJson = new JSONObject(bodyString[0]);
                            if ((Boolean) resJson.get("success")) {
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void failure(RetrofitError error) {

                    }
                });
            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
