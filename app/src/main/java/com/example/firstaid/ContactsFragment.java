package com.example.firstaid;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.PackageManagerCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.security.Permission;

public class ContactsFragment extends Fragment {

    private int STORAGE_PERMISSION_CODE = 1;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contacts, container, false);
        if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){

            requestCallPermision();
        }


        button = view.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override

                public void onClick(View view){
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:1111"));
                    startActivity(intent);
                }

        });

        button = view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view){
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:333"));
                startActivity(intent);
            }

        });

        button = view.findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view){


                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:1234"));
                startActivity(intent);


            }

        });
        return view;
    }
    private void requestCallPermision(){


            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE}, STORAGE_PERMISSION_CODE);


    }


}