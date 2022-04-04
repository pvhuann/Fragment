package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {
    private ImageView imageView;
    private int idImage;
    private TextView tvPrice, tvName;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailFragment newInstance(String param1, String param2) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_detail, container, false);
        imageView=(ImageView) view.findViewById(R.id.imageView_frag2);
        tvPrice=(TextView) view.findViewById(R.id.textView_price);
        tvName=(TextView) view.findViewById(R.id.textView_nameFrag2);
        return view;
    }

    public void loadData(Product product) {
        tvPrice.setText(product.getPrice()+"");
        tvName.setText(product.getName());
        idImage= product.getId();
        switch (idImage){
            case 1:imageView.setImageResource(R.drawable.img);
                break;
            case 2:imageView.setImageResource(R.drawable.img_1);
                break;
            case 3:imageView.setImageResource(R.drawable.img_2);
                break;
            case 4:imageView.setImageResource(R.drawable.img_3);
                break;
            case 5:imageView.setImageResource(R.drawable.img_4);
                break;
            case 6:imageView.setImageResource(R.drawable.img_5);
                break;
            case 7:imageView.setImageResource(R.drawable.img_6);
                break;
            case 8:imageView.setImageResource(R.drawable.img);
                break;
            case 9:imageView.setImageResource(R.drawable.img_1);
                break;
            case 10:imageView.setImageResource(R.drawable.img_2);
                break;
            case 11:imageView.setImageResource(R.drawable.img_3);
                break;
            case 12:imageView.setImageResource(R.drawable.img_4);
                break;
            default: break;

        }


    }
}