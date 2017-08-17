package com.example.user.spuhome;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OfficeFragment extends Fragment {

    private String LocationMenu[] = {"กลุ่มงานกิจการนักศึกษา","งานวิชาการศึกษาทั่วไป", "โรงยิม","โรงอาหาร(เย็น)","โรงอาหารร้อน(ร้อน)",
            "ศูนย์รับสมัครนักศึกษา","ศูนย์สุขภาพ(Fitness)","สำนักงานการคลัง","สำนักงานทะเบียน","สำนักงานทุนการศึกษา","สำนักงานวิชาการ",
            "สำนักงานอาคารสถานที่","ห้องบัวหลวง","ห้องพยาบาล","ห้องสมุด"};

    private int MapImage[] = {R.drawable.map_stu_activity, R.drawable.map_office_k_genernal, R.drawable.office_map_gym,
            R.drawable.map_cool, R.drawable.map_cool, R.drawable.office_map_regoster_point, R.drawable.office_map_fitness,
            R.drawable.map_office_money, R.drawable.map_office_register, R.drawable.map_office_scolrship, R.drawable.map_office_academic,
            R.drawable.map_office_academic,R.drawable.map_office_lotus_room,R.drawable.map_office_hospital,R.drawable.map_office_lirbly};


    public OfficeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_office,container,false);
        ListView listView = (ListView) viewGroup.findViewById(R.id.OfficeList);
        Listadpter listadpter = new Listadpter(getActivity(), LocationMenu);
        listView.setAdapter(listadpter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(getActivity(), MapDisplayActivity.class);
                i.putExtra("MapImage", MapImage[position]);

                startActivity(i);
            }
        });
        return viewGroup;
    }

}
