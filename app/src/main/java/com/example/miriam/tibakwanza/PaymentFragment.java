package com.example.miriam.tibakwanza;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PaymentFragment extends Fragment {

    String[] mobile = {"Tigopesa","AirtelMoney","MPesa","Halopesa","ZPesa","TTCL-Pesa"};
    Integer[] imgid = {R.drawable.tigopesa,R.drawable.airtelmoney,R.drawable.halopesa};

    public PaymentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_payment, container, false);
        View view = inflater.inflate(R.layout.fragment_payment, container, false);
        ListView listView =  view.findViewById(R.id.listview2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                mobile
        );
        listView.setAdapter(arrayAdapter);

        return view;
    }

}
