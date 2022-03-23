package com.example.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contact> arrContacts= new ArrayList<>();

    RecyclerView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        r1=(RecyclerView) findViewById(R.id.Recycle);
        r1.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new Contact(R.drawable.img1,"Fatima","03130533183"));
        arrContacts.add(new Contact(R.drawable.img2,"Emaan","03125193614"));
        arrContacts.add(new Contact(R.drawable.img3,"Hamna","03203142315"));
        arrContacts.add(new Contact(R.drawable.img4,"Arhum","03212217575"));
        arrContacts.add(new Contact(R.drawable.img5,"Mohsin","03115292072"));
        arrContacts.add(new Contact(R.drawable.img6,"Amna","03021817149"));
        arrContacts.add(new Contact(R.drawable.img7,"Rubab","03205658064"));
        arrContacts.add(new Contact(R.drawable.img8,"Asim","03016322525"));
        arrContacts.add(new Contact(R.drawable.img9,"Abdullah","03105540597"));
        arrContacts.add(new Contact(R.drawable.img10,"Hafsa","03069275082"));
        arrContacts.add(new Contact(R.drawable.img11,"Saba","03160588607"));
        arrContacts.add(new Contact(R.drawable.img12,"Bilal","03065479260"));
        arrContacts.add(new Contact(R.drawable.img13,"Bhai","03055022087"));
        arrContacts.add(new Contact(R.drawable.img14,"Farwa","03150590240"));
        arrContacts.add(new Contact(R.drawable.img15,"Sahar","03449337293"));

        Recycler adapter=new Recycler(this,arrContacts);
        r1.setAdapter(adapter);
    }
}